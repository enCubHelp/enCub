using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Salt.enCub
{
    public partial class enCubLogin : Form
    {
        public enCubLogin()
        {
            InitializeComponent();
            InitializeMenu();
        }
        public void InitializeMenu()
        {
            this.StartPosition = FormStartPosition.CenterScreen;
            this.AcceptButton = this._confirmButton;
        }

        private void _cancelButton_Click(object sender, EventArgs e)
        {
            this.DialogResult = DialogResult.Cancel;
            this.Close();
        }

        private void _confirmButton_Click(object sender, EventArgs e)
        {
            if (this._userID.Text.Equals(""))
            {
                MessageBox.Show("UserID를 입력 하십시오.");
            }
            else if (this._password.Text.Equals(""))
            {
                MessageBox.Show("Password를 입력 하십시오.");
            }
            else if (Common.Config.User.CheckUser(this._userID.Text, this._password.Text))
            {
                this.DialogResult = DialogResult.OK;
            }
            else
            {
                MessageBox.Show("UserID/Password를 확인 하십시오.");
            }
        }
    }
}
