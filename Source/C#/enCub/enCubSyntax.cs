using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Diagnostics;
using System.IO;

namespace Salt.enCub
{
    public partial class enCubSyntax : Form
    {
        public enCubSyntax()
        {
            InitializeComponent();
            InitializeMenu();
        }
        private void InitializeMenu()
        {
            this.StartPosition = FormStartPosition.CenterScreen;
            this.AcceptButton = this._closeButton;
        }
        public void SetProject(String parmProject)
        {
            this._project.Text = parmProject;
            ReadProject();
        }
        public void ReadProject()
        {
            DataTable _listTable = new DataTable();
            _listTable.Columns.Add("PROJECT");
            _listTable.Columns.Add("PL/SQL");
            _listTable.Columns.Add("성공/실패");

            ProcessStartInfo _start = new ProcessStartInfo();
            _start.FileName = "java";
            _start.UseShellExecute = false;
            _start.RedirectStandardOutput = true;
            _start.RedirectStandardError = true;
            _start.WindowStyle = ProcessWindowStyle.Hidden;
            _start.CreateNoWindow = true;
            _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.ParsingErrLogTable JOIN \"" + this._project.Text + "\" \"\"";
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
                            _listTable.Rows.Add(_readColumn[1]);
                        }
                        else if (_readColumn[0].Equals("PLSQL"))
                        {
                            _listTable.Rows[_listTable.Rows.Count - 1][1] = _readColumn[1];
                        }
                        else if (_readColumn[0].Equals("Content"))
                        {
                            if (_readColumn[1].Trim().Equals(""))
                            {
                                _listTable.Rows[_listTable.Rows.Count - 1][2] = "성공";
                            }
                            else
                            {
                                _listTable.Rows[_listTable.Rows.Count - 1][2] = "실패";
                            }
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
            this._listView.DataSource = _listTable;
            this._listView.Columns[0].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            this._listView.Columns[1].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            this._listView.Columns[2].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
        }

        private void _parseButton_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
