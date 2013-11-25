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
    public partial class enCubDoc : DockContent
    {
        public  String _project = null;
        private String _SQLName = null;
        public enCubDoc()
        {
            InitializeComponent();
            InitializeMenu();
        }
        public void InitializeMenu()
        {
        }
        protected override string GetPersistString()
        {
            return GetType().ToString() + "," + _project + "," + _SQLName;
        }
        public void SetDocument(String parmProject, String parmSQL)
        {
            _project = parmProject;
            _SQLName = parmSQL;
            this.Text = _SQLName;
            DataTable _sourceTable = new DataTable();
            _sourceTable.Columns.Add("SEQ");
            _sourceTable.Columns.Add("PL/SQL");
            ProcessStartInfo _start = new ProcessStartInfo();
            _start.FileName = "java";
            _start.UseShellExecute = false;
            _start.RedirectStandardOutput = true;
            _start.RedirectStandardError = true;
            _start.WindowStyle = ProcessWindowStyle.Hidden;
            _start.CreateNoWindow = true;
            _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.PLSQL SELECT \" \" \"" + parmProject + "\" \"" + parmSQL + "\"";
            using (Process _process = Process.Start(_start))
            {
                using (StreamReader reader = _process.StandardOutput)
                {
                    String _result = reader.ReadLine();
                    int _seq = 0;
                    while (_result != null)
                    {
                        String[] _readColumn = _result.Split('=');
                        if (_readColumn[0].Equals("Text"))
                        {
                            _seq++;
                            if (_readColumn.Length > 2)
                            {
                                for (int _loop = 2; _loop < _readColumn.Length; _loop++)
                                {
                                    _readColumn[1] += "=" + _readColumn[_loop];
                                }
                            }
                            _sourceTable.Rows.Add(new Object[] { _seq.ToString(), _readColumn[1] });
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
            this._source.DataSource = _sourceTable;
            this._source.Columns[0].AutoSizeMode = DataGridViewAutoSizeColumnMode.DisplayedCells;
            this._source.Columns[1].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            DataTable _targetTable = new DataTable();
            _targetTable.Columns.Add("SEQ");
            _targetTable.Columns.Add("JAVA");
            _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.Target SELECT \" \" \"" + parmProject + "\" \"" + parmSQL + "\"";
            using (Process _process = Process.Start(_start))
            {
                using (StreamReader reader = _process.StandardOutput)
                {
                    String _result = reader.ReadLine();
                    int _seq = 0;
                    while (_result != null)
                    {
                        String[] _readColumn = _result.Split('=');
                        if (_readColumn[0].Equals("Text"))
                        {
                            _seq++;
                            if (_readColumn.Length > 2)
                            {
                                for (int _loop = 2; _loop < _readColumn.Length; _loop++)
                                {
                                    _readColumn[1] += "=" + _readColumn[_loop];
                                }
                            }
                            _targetTable.Rows.Add(new Object[] { _seq.ToString(), _readColumn[1] });
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

            this._target.DataSource = _targetTable;
            this._target.Columns[0].AutoSizeMode = DataGridViewAutoSizeColumnMode.DisplayedCells;
            this._target.Columns[1].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
        }
    }
}
