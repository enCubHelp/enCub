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
    public partial class enCubConfigForm : Form
    {
        public enCubConfigForm()
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
                //////this._project.Text = Common.Config.Config.GetProjectName();
                this._oracleVersion.SelectedIndex = this._oracleVersion.Items.IndexOf(Common.Config.Config.GetOracleVersion());
                this._oracleUser.Text = Common.Config.Config.GetOracleUser();
                this._oraclePassword.Text = Common.Config.Config.GetOraclePassword();
                this._oracleClass.Text = Common.Config.Config.GetOracleClass();
                this._oracleConnection.Text = Common.Config.Config.GetOracleConnection();
            }
            catch (Exception e)
            {
                Common.Util.LOG.WriteLOG(e.ToString());
                this._oracleVersion.SelectedIndex = 0;
            }
        }

        private void _cancelButton_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void _confirmButton_Click(object sender, EventArgs e)
        {
            ////////////if (this._project.Text.Equals(""))
            ////////////{
            ////////////    MessageBox.Show("Project명을 입력하십시오.");
            ////////////}
            if (this._oracleUser.Text.Equals(""))
            {
                MessageBox.Show("User명을 입력하십시오.");
            }
            else if (this._oraclePassword.Text.Equals(""))
            {
                MessageBox.Show("Password를 입력하십시오.");

            }
            else if (this._oracleClass.Text.Equals(""))
            {
                MessageBox.Show("Oracle Connection String을 입력하십시오.");
            }
            else if (this._oracleConnection.Text.Equals(""))
            {
                MessageBox.Show("Oracle Connection String을 입력하십시오.");
            }
            else
            {
                //////Common.Config.Config.SetProjectName(this._project.Text);
                Common.Config.Config.SetProjectName("TEST");
                Common.Config.Config.SetOracleVersion(this._oracleVersion.Items[this._oracleVersion.SelectedIndex].ToString());
                Common.Config.Config.SetOracleUser(this._oracleUser.Text);
                Common.Config.Config.SetOraclePassword(this._oraclePassword.Text);
                Common.Config.Config.SetOracleClass(this._oracleClass.Text);
                Common.Config.Config.SetOracleConnection(this._oracleConnection.Text);
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
            _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.Database TRY \"" + this._oracleClass.Text + "\" \"" + this._oracleConnection.Text + "\" " + this._oracleUser.Text + " " + this._oraclePassword.Text;
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
