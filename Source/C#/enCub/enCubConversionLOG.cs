﻿using System;
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
    public partial class enCubConversionLog : Form
    {
        public enCubConversionLog()
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
            _listTable.Columns.Add("Line");
            _listTable.Columns.Add("Column");
            _listTable.Columns.Add("Content");

            ProcessStartInfo _start = new ProcessStartInfo();
            _start.FileName = "java";
            _start.UseShellExecute = false;
            _start.RedirectStandardOutput = true;
            _start.RedirectStandardError = true;
            _start.WindowStyle = ProcessWindowStyle.Hidden;
            _start.CreateNoWindow = true;
            _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.Target SELECT DISTINCT \"" + this._project.Text + "\" \"\"";
            using (Process _process = Process.Start(_start))
            {
                using (StreamReader reader = _process.StandardOutput)
                {
                    int _seq = 0;
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
                        else if (_readColumn[0].Equals("Content"))
                        {
                            _listTable.Rows[_listTable.Rows.Count - 1][5] = _readColumn[1].Trim();
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
            for (int _loopTable = 0; _loopTable < _listTable.Rows.Count; _loopTable++)
            {
                if (_listTable.Rows[_loopTable][2].ToString().Equals(""))
                {
                    _listTable.Rows.RemoveAt(_loopTable);
                    _loopTable--;
                }
            }
            this._listView.DataSource = _listTable;
            this._listView.Columns[0].AutoSizeMode = DataGridViewAutoSizeColumnMode.DisplayedCells;
            this._listView.Columns[1].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            this._listView.Columns[2].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            this._listView.Columns[3].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            this._listView.Columns[4].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
        }

        private void _selectAll_CheckedChanged(object sender, EventArgs e)
        {
            if (((CheckBox)sender).Checked)
            {
                for (int _rowIndex = 0; _rowIndex < this._listView.Rows.Count; _rowIndex++)
                {
                    this._listView.Rows[_rowIndex].Cells[0].Value = true;
                }
            }
            else
            {
                for (int _rowIndex = 0; _rowIndex < this._listView.Rows.Count; _rowIndex++)
                {
                    this._listView.Rows[_rowIndex].Cells[0].Value = false;
                }
            }
        }
        private void _closeButton_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
