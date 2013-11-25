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
    public partial class enCubCompareCRUD : Form
    {
        public enCubCompareCRUD()
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
            _listTable.Columns.Add("Name");
            _listTable.Columns.Add("PL/SQL" + Environment.NewLine + "Java");
            _listTable.Columns.Add("Create");
            _listTable.Columns.Add("Read");
            _listTable.Columns.Add("Update");
            _listTable.Columns.Add("Delete");

            ProcessStartInfo _start = new ProcessStartInfo();
            _start.FileName = "java";
            _start.UseShellExecute = false;
            _start.RedirectStandardOutput = true;
            _start.RedirectStandardError = true;
            _start.WindowStyle = ProcessWindowStyle.Hidden;
            _start.CreateNoWindow = true;
            _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.PLSQLCRUDTable SELECT DISPLAY \"" + this._project.Text + "\" \"\"";
            using (Process _process = Process.Start(_start))
            {
                int _seq = 0;
                String _crudType = "";
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
                        else if (_readColumn[0].Equals("Type"))
                        {
                            _crudType = _readColumn[1];
                        }
                        else if (_readColumn[0].Equals("Table"))
                        {
                            _listTable.Rows[_listTable.Rows.Count - 1][3] = "PL/SQL";
                            if (_crudType.Equals("C"))
                            {
                                _listTable.Rows[_listTable.Rows.Count - 1][4] = _readColumn[1];
                            }
                            else if (_crudType.Equals("R"))
                            {
                                _listTable.Rows[_listTable.Rows.Count - 1][5] = _readColumn[1];
                            }
                            else if (_crudType.Equals("U"))
                            {
                                _listTable.Rows[_listTable.Rows.Count - 1][6] = _readColumn[1];
                            }
                            else if (_crudType.Equals("D"))
                            {
                                _listTable.Rows[_listTable.Rows.Count - 1][7] = _readColumn[1];
                            }
                            _listTable.Rows.Add(new Object[] { "" });
                            _listTable.Rows[_listTable.Rows.Count - 1][3] = "Java";
                            if (_crudType.Equals("C"))
                            {
                                _listTable.Rows[_listTable.Rows.Count - 1][4] = _readColumn[1];
                            }
                            else if (_crudType.Equals("R"))
                            {
                                _listTable.Rows[_listTable.Rows.Count - 1][5] = _readColumn[1];
                            }
                            else if (_crudType.Equals("U"))
                            {
                                _listTable.Rows[_listTable.Rows.Count - 1][6] = _readColumn[1];
                            }
                            else if (_crudType.Equals("D"))
                            {
                                _listTable.Rows[_listTable.Rows.Count - 1][7] = _readColumn[1];
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
            this._listView.Columns[0].AutoSizeMode = DataGridViewAutoSizeColumnMode.DisplayedCells;
            this._listView.Columns[1].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            this._listView.Columns[2].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            this._listView.Columns[3].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            this._listView.Columns[4].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            this._listView.Columns[5].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            this._listView.Columns[6].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;

            ////////for (int rowIndex = this._listView.Rows.Count - 2; rowIndex >= 0; rowIndex--)
            ////////{
            ////////    ListViewItem gvRow = this._listView.Rows[rowIndex];
            ////////    GridViewRow gvRow = this._listView.Rows[rowIndex];
            ////////    GridViewRow gvPreviousRow = this._listView.Rows[rowIndex + 1];
            ////////    for (int cellCount = 0; cellCount < gvRow.Cells.Count; cellCount++)
            ////////    {
            ////////        if (gvRow.Cells[cellCount].Text == gvPreviousRow.Cells[cellCount].Text)
            ////////        {
            ////////            if (gvPreviousRow.Cells[cellCount].RowSpan < 2)
            ////////            {
            ////////                gvRow.Cells[cellCount].RowSpan = 2;
            ////////            }
            ////////            else
            ////////            {
            ////////                gvRow.Cells[cellCount].RowSpan =
            ////////                    gvPreviousRow.Cells[cellCount].RowSpan + 1;
            ////////            }
            ////////            gvPreviousRow.Cells[cellCount].Visible = false;
            ////////        }
            ////////    }
            ////////}
        }
        private void _closeButton_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}