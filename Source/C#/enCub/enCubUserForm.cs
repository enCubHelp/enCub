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
    public partial class enCubUserForm : Form
    {
        private String _saveUserID = "";
        public enCubUserForm()
        {
            InitializeComponent();
            InitializeMenu();
        }
        public void InitializeMenu()
        {
            this.StartPosition = FormStartPosition.CenterScreen;
            this.AcceptButton = this._confirmButton;
            this._deleteButton.Enabled = false;
            this._userView.ColumnCount = 5;
            this._userView.Columns[0].Name = "ID";
            this._userView.Columns[1].Name = "Name";
            this._userView.Columns[2].Name = "PSWD";
            this._userView.Columns[3].Name = "Authority";
            this._userView.Columns[4].Name = "Comment";
            this._userView.Columns[2].Visible = false;
            this._userView.Columns[3].Visible = false;
            this._userView.Columns[4].Visible = false;
            this._userView.AllowUserToAddRows = false;
            ReadUsers();
        }

        public void ReadUsers()
        {
            this._userView.Rows.Clear();

            ProcessStartInfo _start = new ProcessStartInfo();
            _start.FileName = "java";
            _start.UseShellExecute = false;
            _start.RedirectStandardOutput = true;
            _start.RedirectStandardError = true;
            _start.WindowStyle = ProcessWindowStyle.Hidden;
            _start.CreateNoWindow = true;
            _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.User SELECT ALL";
            using (Process _process = Process.Start(_start))
            {
                using (StreamReader reader = _process.StandardOutput)
                {
                    String _result = reader.ReadLine();
                    while (_result != null)
                    {
                        String[] _readColumn = _result.Split('=');
                        if (_readColumn[0].Equals("UserID"))
                        {
                            this._userView.Rows.Add(_readColumn[1]);
                        }
                        else if (_readColumn[0].Equals("UserName"))
                        {
                            this._userView.Rows[this._userView.Rows.Count - 1].Cells[1].Value = _readColumn[1];
                        }
                        else if (_readColumn[0].Equals("Password"))
                        {
                            this._userView.Rows[this._userView.Rows.Count - 1].Cells[2].Value = _readColumn[1];
                        }
                        else if (_readColumn[0].Equals("Authority"))
                        {
                            this._userView.Rows[this._userView.Rows.Count - 1].Cells[3].Value = _readColumn[1];
                        }
                        else if (_readColumn[0].Equals("Comment"))
                        {
                            this._userView.Rows[this._userView.Rows.Count - 1].Cells[4].Value = _readColumn[1];
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
            this._saveUserID = "";
            this._userID.Text = "";
            this._userName.Text = "";
            this._password.Text = "";
            this._authorityCombo.SelectedIndex = -1;
            this._comment.Text = "";
            this._deleteButton.Enabled = false;
        }

        private void _cancelButton_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void _confirmButton_Click(object sender, EventArgs e)
        {
            if (this._userID.Text == "")
            {
                MessageBox.Show("UserID를 입력하십시오.");
            }
            else if (this._userName.Text == "")
            {
                MessageBox.Show("UserName을 입력하십시오.");
            }
            else if (this._password.Text == "")
            {
                MessageBox.Show("Password를 입력하십시오.");
            }
            else if (this._authorityCombo.SelectedIndex < 0)
            {
                MessageBox.Show("Authority를 선택하십시오.");
            }
            else
            {
                ProcessStartInfo _start = new ProcessStartInfo();
                _start.FileName = "java";
                _start.UseShellExecute = false;
                _start.RedirectStandardOutput = true;
                _start.RedirectStandardError = true;
                _start.WindowStyle = ProcessWindowStyle.Hidden;
                _start.CreateNoWindow = true;
                _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.User";
                if (_saveUserID.Equals(this._userID.Text))
                {
                    _start.Arguments += " UPDATE";
                }
                else
                {
                    _start.Arguments += " INSERT";
                }
                _start.Arguments += " \"" + this._userID.Text + "\"";
                _start.Arguments += " \"" + this._userName.Text + "\"";
                _start.Arguments += " \"" + this._password.Text + "\"";
                _start.Arguments += " \"" + this._authorityCombo.Items[this._authorityCombo.SelectedIndex].ToString() + "\"";
                _start.Arguments += " \"" + this._comment.Text + "\"";
                using (Process _process = Process.Start(_start))
                {
                    using (StreamReader reader = _process.StandardOutput)
                    {
                        String _result = reader.ReadLine();
                        while (_result != null)
                        {
                            MessageBox.Show(_result);
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
            }
            ReadUsers();
        }

        private void _deleteButton_Click(object sender, EventArgs e)
        {
            ProcessStartInfo _start = new ProcessStartInfo();
            _start.FileName = "java";
            _start.UseShellExecute = false;
            _start.RedirectStandardOutput = true;
            _start.RedirectStandardError = true;
            _start.WindowStyle = ProcessWindowStyle.Hidden;
            _start.CreateNoWindow = true;
            _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.User DELETE";
            _start.Arguments += " \"" + this._userID.Text + "\"";
            using (Process _process = Process.Start(_start))
            {
                using (StreamReader reader = _process.StandardOutput)
                {
                    String _result = reader.ReadLine();
                    while (_result != null)
                    {
                        MessageBox.Show(_result);
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
            ReadUsers();
        }
        private void _userView_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            if (e.RowIndex > -1)
            {
                this._saveUserID = this._userView.Rows[e.RowIndex].Cells[0].Value.ToString();
                this._userID.Text = this._userView.Rows[e.RowIndex].Cells[0].Value.ToString();
                this._userName.Text = this._userView.Rows[e.RowIndex].Cells[1].Value.ToString();
                this._password.Text = this._userView.Rows[e.RowIndex].Cells[2].Value.ToString();
                this._authorityCombo.SelectedIndex = this._authorityCombo.Items.IndexOf(this._userView.Rows[e.RowIndex].Cells[3].Value.ToString());
                this._comment.Text = this._userView.Rows[e.RowIndex].Cells[4].Value.ToString();
                this._deleteButton.Enabled = true;
            }
        }
    }
}