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
    public partial class enCubDisplayParsing : Form
    {
        public enCubDisplayParsing()
        {
            InitializeComponent();
            InitializeMenu();
        }
        private void InitializeMenu()
        {
            this.StartPosition = FormStartPosition.CenterScreen;
            this.AcceptButton = this._closeButton;
        }
        public void ReadProject(String parmProject, String parmPLSQL)
        {
            this._project.Text = parmProject;
            this._plsql.Text = parmPLSQL;
            DataTable _listTable = new DataTable();
            _listTable.Columns.Add("SEQ");
            _listTable.Columns.Add("Type");
            _listTable.Columns.Add("Rule");
            _listTable.Columns.Add("Line");
            _listTable.Columns.Add("Column");
            _listTable.Columns.Add("Token");

            ProcessStartInfo _start = new ProcessStartInfo();
            _start.FileName = "java";
            _start.UseShellExecute = false;
            _start.RedirectStandardOutput = true;
            _start.RedirectStandardError = true;
            _start.WindowStyle = ProcessWindowStyle.Hidden;
            _start.CreateNoWindow = true;
            _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.ParsingTable SELECT \"" + this._project.Text + "\" \"" + this._plsql.Text + "\"";
            using (Process _process = Process.Start(_start))
            {
                int _seq = 0;
                using (StreamReader reader = _process.StandardOutput)
                {
                    String _result = reader.ReadLine();
                    while (_result != null)
                    {
                        String[] _readColumn = _result.Split('=');
                        if (_readColumn[0].Equals("Type"))
                        {
                            _seq++;
                            _listTable.Rows.Add(new Object[] { _seq.ToString(), _readColumn[1] });
                        }
                        else if (_readColumn[0].Equals("Rule"))
                        {
                            _listTable.Rows[_listTable.Rows.Count - 1][2] = _readColumn[1].Trim();
                        }
                        else if (_readColumn[0].Equals("Line"))
                        {
                            _listTable.Rows[_listTable.Rows.Count - 1][3] = _readColumn[1].Trim();
                        }
                        else if (_readColumn[0].Equals("Column"))
                        {
                            _listTable.Rows[_listTable.Rows.Count - 1][4] = _readColumn[1].Trim();
                        }
                        else if (_readColumn[0].Equals("Token"))
                        {
                            _listTable.Rows[_listTable.Rows.Count - 1][5] = _readColumn[1].Trim();
                        }
                        _result = reader.ReadLine();
                    }
                }
                using (StreamReader reader = _process.StandardError)
                {
                    String _result = reader.ReadLine();
                    while (_result != null &&
                          !_result.ToLower().Equals("null"))
                    {
                        MessageBox.Show(_result);
                        _result = reader.ReadLine();
                    }
                }
            }
            this._listView.DataSource = _listTable;
            this._listView.Columns[0].AutoSizeMode = DataGridViewAutoSizeColumnMode.DisplayedCells;
            this._listView.Columns[1].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            this._listView.Columns[2].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            this._listView.Columns[3].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            this._listView.Columns[4].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            this._listView.Columns[5].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
        }
        private void _closeButton_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}