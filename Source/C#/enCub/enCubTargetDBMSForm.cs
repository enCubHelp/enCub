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
    public partial class enCubTargetDBMSForm : Form
    {
        public enCubTargetDBMSForm()
        {
            InitializeComponent();
            InitializeMenu();
        }
        public void InitializeMenu()
        {
            this.StartPosition = FormStartPosition.CenterScreen;
            this.AcceptButton = this._confirmButton;
            try
            {
                Common.Config.Config.ReadConfig();
                if (this._targetDBMS.Items.IndexOf(Common.Config.Config.GetTargetDBMS()) < 0)
                {
                    this._targetDBMS.SelectedIndex = 0;
                }
                else
                {
                    this._targetDBMS.SelectedIndex = this._targetDBMS.Items.IndexOf(Common.Config.Config.GetTargetDBMS());
                }
                this._targetDBMSUser.Text = Common.Config.Config.GetTargetDBMSUser();
                this._targetDBMSPassword.Text = Common.Config.Config.GetTargetDBMSPassword();
                this._targetDBMSClass.Text = Common.Config.Config.GetTargetDBMSClass();
                this._targetDBMSJDKPath.Text = Common.Config.Config.GetTargetDBMSJDKPath();
                this._targetDBMSLoadJavaPath.Text = Common.Config.Config.GetTargetDBMSLoadJavaPath();
                this._targetDBMSConnection.Text = Common.Config.Config.GetTargetDBMSConnection();
            }
            catch (Exception e)
            {
                Common.Util.LOG.WriteLOG(e.ToString());
                this._targetDBMS.SelectedIndex = 0;
            }
        }

        private void _cancelButton_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void _confirmButton_Click(object sender, EventArgs e)
        {
            if (this._targetDBMSUser.Text.Equals(""))
            {
                MessageBox.Show("User명을 입력하십시오.");
            }
            else if (this._targetDBMSPassword.Text.Equals(""))
            {
                MessageBox.Show("Password를 입력하십시오.");

            }
            else if (this._targetDBMSConnection.Text.Equals(""))
            {
                MessageBox.Show("Class를 입력하십시오.");
            }
            else if (this._targetDBMSJDKPath.Text.Equals(""))
            {
                MessageBox.Show("JDK Path를 입력하십시오.");
            }
            else if (this._targetDBMSLoadJavaPath.Text.Equals(""))
            {
                MessageBox.Show("loadjava Path를 입력하십시오.");
            }
            else if (this._targetDBMSConnection.Text.Equals(""))
            {
                MessageBox.Show("Connection String을 입력하십시오.");
            }
            else
            {
                Common.Config.Config.SetTargetDBMS(this._targetDBMS.Items[this._targetDBMS.SelectedIndex].ToString());
                Common.Config.Config.SetTargetDBMSUser(this._targetDBMSUser.Text);
                Common.Config.Config.SetTargetDBMSPassword(this._targetDBMSPassword.Text);
                Common.Config.Config.SetTargetDBMSClass(this._targetDBMSClass.Text);
                Common.Config.Config.SetTargetDBMSJDKPath(this._targetDBMSJDKPath.Text);
                Common.Config.Config.SetTargetDBMSLoadJavaPath(this._targetDBMSLoadJavaPath.Text);
                Common.Config.Config.SetTargetDBMSConnection(this._targetDBMSConnection.Text);
                Common.Config.Config.SaveConfig();
                MessageBox.Show("저장되었습니다.");
                this.Close();
            }
        }

        private void _connectionButton_Click(object sender, EventArgs e)
        {
            ProcessStartInfo _start = new ProcessStartInfo();
            _start.FileName = "java";
            _start.UseShellExecute = false;
            _start.RedirectStandardOutput = true;
            _start.RedirectStandardError = true;
            _start.WindowStyle = ProcessWindowStyle.Hidden;
            _start.CreateNoWindow = true;
            _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.Database TRY \"" + this._targetDBMSClass.Text + "\" \"" + this._targetDBMSConnection.Text + "\" " + this._targetDBMSUser.Text + " " + this._targetDBMSPassword.Text;
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
    }
}
