using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using WeifenLuo.WinFormsUI.Docking;
using System.Diagnostics;
using System.IO;

namespace Salt.enCub
{
    public partial class enCubSolution : DockContent
    {
        private String _project = null;
        private String _plsql = null;
        public enCubSolution()
        {
            InitializeComponent();
            InitializeMenu();
        }
        public void InitializeMenu()
        {
            this.ContextMenuStrip = _popupMenu;
            ReadProject();
        }
        public String GetProject()
        {
            return _project;
        }
        public String GetPLSQL()
        {
            return _plsql;
        }
        public void ReadProject()
        {
            this._listView.Nodes.Clear();

            DataTable _dataTable = new DataTable();
            _dataTable.Columns.Add();

            ProcessStartInfo _start = new ProcessStartInfo();
            _start.FileName = "java";
            _start.UseShellExecute = false;
            _start.RedirectStandardOutput = true;
            _start.RedirectStandardError = true;
            _start.WindowStyle = ProcessWindowStyle.Hidden;
            _start.CreateNoWindow = true;
            _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.Project SELECT ALL";
            using (Process _process = Process.Start(_start))
            {
                using (StreamReader reader = _process.StandardOutput)
                {
                    String _result = reader.ReadLine();
                    while (_result != null)
                    {
                        String[] _readColumn = _result.Split('=');
                        if (_readColumn[0].Equals("Project"))
                        {
                            _dataTable.Rows.Add(_readColumn[1]);
                        }
                        _result = reader.ReadLine();
                    }
                }
                using (StreamReader reader = _process.StandardError)
                {
                    String _result = reader.ReadLine();
                    while (_result != null)
                    {
                        MessageBox.Show(_result);
                        _result = reader.ReadLine();
                    }
                }
            }
            for (int _rowIndex = 0; _rowIndex < _dataTable.Rows.Count; _rowIndex++)
            {
                TreeNode _treeNode = new TreeNode(_dataTable.Rows[_rowIndex][0].ToString());
                _start.FileName = "java";
                _start.UseShellExecute = false;
                _start.RedirectStandardOutput = true;
                _start.RedirectStandardError = true;
                _start.WindowStyle = ProcessWindowStyle.Hidden;
                _start.CreateNoWindow = true;
                _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.PLSQL SELECT DISTINCT \"" + _dataTable.Rows[_rowIndex][0].ToString() + "\" \"\"";
                using (Process _process = Process.Start(_start))
                {
                    using (StreamReader reader = _process.StandardOutput)
                    {
                        String _result = reader.ReadLine();
                        while (_result != null)
                        {
                            String[] _readColumn = _result.Split('=');
                            if (_readColumn[0].Equals("PLSQL"))
                            {
                                _treeNode.Nodes.Add(_readColumn[1]);
                            }
                            _result = reader.ReadLine();
                        }
                    }
                    using (StreamReader reader = _process.StandardError)
                    {
                        String _result = reader.ReadLine();
                        while (_result != null)
                        {
                            MessageBox.Show(_result);
                            _result = reader.ReadLine();
                        }
                    }
                }
                this._listView.Nodes.Add(_treeNode);
            }
            this._listView.ExpandAll();
        }
        public void ImportSource()
        {
            if (this._project == null ||
                this._project.Equals(""))
            {
                MessageBox.Show("Project를 선택하십시오.");
            }
            else
            {
                enCubImport _import = new enCubImport();
                _import.SetProject(_project);
                _import.ShowDialog();
            }
        }
        public void DeleteSource()
        {
            if (this._plsql == null ||
                this._plsql.Equals(""))
            {
                MessageBox.Show("SQL을 선택하십시오.");
            }
            else
            {
                bool _success = true;
                ProcessStartInfo _start = new ProcessStartInfo();
                _start.FileName = "java";
                _start.UseShellExecute = false;
                _start.RedirectStandardOutput = true;
                _start.RedirectStandardError = true;
                _start.WindowStyle = ProcessWindowStyle.Hidden;
                _start.CreateNoWindow = true;
                _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.PLSQL DELETE";
                _start.Arguments += " \"" + this._project + "\"";
                _start.Arguments += " \"" + this._plsql + "\"";
                using (Process _process = Process.Start(_start))
                {
                    using (StreamReader reader = _process.StandardError)
                    {
                        String _result = reader.ReadLine();
                        if (_result != null)
                        {
                            _success = false;
                        }
                    }
                }
                if (_success)
                {
                    MessageBox.Show(this._plsql + " is deleted.");
                }
                else
                {
                    MessageBox.Show(this._plsql + " is not deleted.");
                }
                ReadProject();
            }
        }
        private void createProjectToolStripMenuItem_Click(object sender, EventArgs e)
        {
            enCubProject _project = new enCubProject();
            _project.ShowDialog();
        }
        private void deleteProjectToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (this._listView.SelectedNode.Text.Equals("") ||
                this._listView.SelectedNode.Level != 0)
            {
                MessageBox.Show("Project를 선택하십시오.");
            }
            else
            {
                enCubProject _project = new enCubProject();
                _project.SetExecuteType("DELETE");
                _project.SetProject(this._listView.SelectedNode.Text);
                _project.ShowDialog();
            }
        }
        private void importSourceToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (this._listView.SelectedNode.Text.Equals("") ||
                this._listView.SelectedNode.Level != 0)
            {
                MessageBox.Show("Project를 선택하십시오.");
            }
            else
            {
                this._project = this._listView.SelectedNode.Text;
                ImportSource();
            }
        }
        private void browseSourceToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (this._listView.SelectedNode.Text.Equals("") ||
                this._listView.SelectedNode.Level != 1)
            {
                MessageBox.Show("Project를 선택하십시오.");
            }
            else
            {
                this._project = this._listView.SelectedNode.Text;
                Common.Delegate.Delegate.NewDocument(this._listView.SelectedNode.Parent.Text, this._listView.SelectedNode.Text);
            }
        }
        private void deleteSourceToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (this._listView.SelectedNode.Text.Equals("") ||
                this._listView.SelectedNode.Level != 1)
            {
                MessageBox.Show("SQL을 선택하십시오.");
            }
            else
            {
                this._project = this._listView.SelectedNode.Parent.Text;
                this._plsql = this._listView.SelectedNode.Text;
                DeleteSource();
            }
        }
        private void _listView_AfterSelect(object sender, TreeViewEventArgs e)
        {
            if (this._listView.SelectedNode.Level == 0)
            {
                this._project = this._listView.SelectedNode.Text;
                this._plsql = null;
            }
            else
            {
                this._project = this._listView.SelectedNode.Parent.Text;
                this._plsql = this._listView.SelectedNode.Text;
            }
        }
        private void _listView_DoubleClick(object sender, EventArgs e)
        {
            if (this._listView.SelectedNode.Text.Equals("") ||
                this._listView.SelectedNode.Level != 1)
            {
                MessageBox.Show("SQL을 선택하십시오.");
            }
            else
            {
                Common.Delegate.Delegate.NewDocument(this._listView.SelectedNode.Parent.Text, this._listView.SelectedNode.Text);
            }
        }
    }
}
