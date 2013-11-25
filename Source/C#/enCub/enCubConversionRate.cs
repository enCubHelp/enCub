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
    public partial class enCubConversionRate : Form
    {
        public enCubConversionRate()
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
            _listTable.Columns.Add("SEQ");
            _listTable.Columns.Add("PROJECT");
            _listTable.Columns.Add("PL/SQL");
            _listTable.Columns.Add("전체라인");
            _listTable.Columns.Add("코멘트라인");
            _listTable.Columns.Add("미변환라인");
            _listTable.Columns.Add("삭제라인");
            _listTable.Columns.Add("변환율");

            ProcessStartInfo _start = new ProcessStartInfo();
            _start.FileName = "java";
            _start.UseShellExecute = false;
            _start.RedirectStandardOutput = true;
            _start.RedirectStandardError = true;
            _start.WindowStyle = ProcessWindowStyle.Hidden;
            _start.CreateNoWindow = true;
            _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.PLSQL SELECT DISTINCT \"" + this._project.Text + "\" \"\"";
            using (Process _process = Process.Start(_start))
            {
                int _seq = 0;
                using (StreamReader reader = _process.StandardOutput)
                {
                    String _result = reader.ReadLine();
                    while (_result != null)
                    {
                        String[] _readColumn = _result.Split('=');
                        if (_readColumn[0].Equals("Project"))
                        {
                            _seq++;
                            _listTable.Rows.Add(new Object[] { _seq.ToString(), _readColumn[1] });
                        }
                        else if (_readColumn[0].Equals("PLSQL"))
                        {
                            _listTable.Rows[_listTable.Rows.Count - 1][2] = _readColumn[1];
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
            this._listView.Columns[0].AutoSizeMode = DataGridViewAutoSizeColumnMode.DisplayedCells;
            this._listView.Columns[1].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            this._listView.Columns[2].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            this._listView.Columns[3].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            this._listView.Columns[4].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            this._listView.Columns[5].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            this._listView.Columns[6].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            this._listView.Columns[7].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
        }
        private void _closeButton_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}