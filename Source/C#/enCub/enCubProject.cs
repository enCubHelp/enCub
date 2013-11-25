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
    public partial class enCubProject : Form
    {
        private String _executeType = "INSERT";
        public enCubProject()
        {
            InitializeComponent();
            InitializeMenu();
        }
        public void InitializeMenu()
        {
            this.StartPosition = FormStartPosition.CenterScreen;
            this.AcceptButton = this._confirmButton;
        }
        public void SetExecuteType(String parmType)
        {
            _executeType = parmType;
            if (_executeType.Equals("DELETE"))
            {
                this._confirmButton.Text = "삭제";
            }
            else
            {
                this._confirmButton.Text = "확인";
            }
        }
        public void SetProject(String parmProject)
        {
            this._project.Text = parmProject.Trim();
            ProcessStartInfo _start = new ProcessStartInfo();
            _start.FileName = "java";
            _start.UseShellExecute = false;
            _start.RedirectStandardOutput = true;
            _start.RedirectStandardError = true;
            _start.WindowStyle = ProcessWindowStyle.Hidden;
            _start.CreateNoWindow = true;
            _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.Project SELECT \"" + parmProject + "\"";
            using (Process _process = Process.Start(_start))
            {
                using (StreamReader reader = _process.StandardOutput)
                {
                    String _result = reader.ReadLine();
                    while (_result != null)
                    {
                        String[] _readColumn = _result.Split('=');
                        if (_readColumn[0].Equals("Comment"))
                        {
                            this._comment.Text = _readColumn[1].Trim();
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
        }
        private void _cancelButton_Click(object sender, EventArgs e)
        {
            MessageBox.Show("취소하셨습니다.");
            this.Close();
        }
        private void _confirmButton_Click(object sender, EventArgs e)
        {
            if (this._project.Text.Trim().Equals(""))
            {
                MessageBox.Show("Project를 입력하십시오.");
                this._project.Focus();
            }
            else
            {
                bool _success = true;
                ProcessStartInfo _start = new ProcessStartInfo();
                _start.FileName = "java";
                _start.UseShellExecute = false;
                _start.RedirectStandardOutput = true;
                _start.RedirectStandardError = true;
                _start.WindowStyle = ProcessWindowStyle.Hidden;
                _start.CreateNoWindow = true;
                if (_executeType.Equals("INSERT"))
                {
                    _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.Project INSERT";
                    _start.Arguments += " \"" + this._project.Text + "\"";
                    _start.Arguments += " \"" + this._comment.Text + "\"";
                }
                else if (_executeType.Equals("DELETE"))
                {
                    _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.Project DELETE";
                    _start.Arguments += " \"" + this._project.Text + "\"";
                }
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
                        if (_result != null)
                        {
                            _success = false;
                        }
                        while (_result != null)
                        {
                            MessageBox.Show(_result);
                            _result = reader.ReadLine();
                        }
                    }
                }
                if (_success)
                {
                    Common.Delegate.Delegate.ReadProject();
                    this.Close();
                }
            }
        }
    }
}
