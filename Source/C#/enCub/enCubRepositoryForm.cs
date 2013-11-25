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
    public partial class enCubRepositoryForm : Form
    {
        public enCubRepositoryForm()
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
                if (this._repository.Items.IndexOf(Common.Config.Config.GetRepository()) < 0)
                {
                    this._repository.SelectedIndex = 0;
                }
                else
                {
                    this._repository.SelectedIndex = this._repository.Items.IndexOf(Common.Config.Config.GetRepository());
                }
                this._repositoryUser.Text = Common.Config.Config.GetRepositoryUser();
                this._repositoryPassword.Text = Common.Config.Config.GetRepositoryPassword();
                this._repositoryClass.Text = Common.Config.Config.GetRepositoryClass();
                this._repositoryConnection.Text = Common.Config.Config.GetRepositoryConnection();
            }
            catch (Exception e)
            {
                Common.Util.LOG.WriteLOG(e.ToString());
                this._repository.SelectedIndex = 0;
            }
        }

        private void _cancelButton_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void _confirmButton_Click(object sender, EventArgs e)
        {
            if (this._repositoryUser.Text.Equals(""))
            {
                MessageBox.Show("User명을 입력하십시오.");
            }
            else if (this._repositoryPassword.Text.Equals(""))
            {
                MessageBox.Show("Password를 입력하십시오.");

            }
            else if (this._repositoryClass.Text.Equals(""))
            {
                MessageBox.Show("Class를 입력하십시오.");
            }
            else if (this._repositoryConnection.Text.Equals(""))
            {
                MessageBox.Show("Connection String을 입력하십시오.");
            }
            else
            {
                Common.Config.Config.SetRepository(this._repository.Items[this._repository.SelectedIndex].ToString());
                Common.Config.Config.SetRepositoryUser(this._repositoryUser.Text);
                Common.Config.Config.SetRepositoryPassword(this._repositoryPassword.Text);
                Common.Config.Config.SetRepositoryClass(this._repositoryClass.Text);
                Common.Config.Config.SetRepositoryConnection(this._repositoryConnection.Text);
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
            _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.Database TRY \"" + this._repositoryClass.Text + "\" \"" + this._repositoryConnection.Text + "\" " + this._repositoryUser.Text + " " + this._repositoryPassword.Text;
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
