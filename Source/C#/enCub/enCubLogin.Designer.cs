namespace Salt.enCub
{
    partial class enCubLogin
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(enCubLogin));
            this._logo = new System.Windows.Forms.PictureBox();
            this._userLabel = new System.Windows.Forms.Label();
            this._userID = new System.Windows.Forms.TextBox();
            this._password = new System.Windows.Forms.TextBox();
            this._passwordLabel = new System.Windows.Forms.Label();
            this._cancelButton = new System.Windows.Forms.Button();
            this._confirmButton = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this._logo)).BeginInit();
            this.SuspendLayout();
            // 
            // _logo
            // 
            this._logo.ErrorImage = global::Salt.enCub.Properties.Resources.Saltware_logo;
            this._logo.Image = global::Salt.enCub.Properties.Resources.Saltware_logo;
            this._logo.Location = new System.Drawing.Point(308, -1);
            this._logo.Name = "_logo";
            this._logo.Size = new System.Drawing.Size(120, 50);
            this._logo.TabIndex = 0;
            this._logo.TabStop = false;
            // 
            // _userLabel
            // 
            this._userLabel.AutoSize = true;
            this._userLabel.Location = new System.Drawing.Point(12, 14);
            this._userLabel.Name = "_userLabel";
            this._userLabel.Size = new System.Drawing.Size(47, 12);
            this._userLabel.TabIndex = 1;
            this._userLabel.Text = "User ID";
            // 
            // _userID
            // 
            this._userID.Location = new System.Drawing.Point(86, 9);
            this._userID.Name = "_userID";
            this._userID.Size = new System.Drawing.Size(216, 21);
            this._userID.TabIndex = 1;
            // 
            // _password
            // 
            this._password.Location = new System.Drawing.Point(86, 36);
            this._password.Name = "_password";
            this._password.PasswordChar = '*';
            this._password.Size = new System.Drawing.Size(216, 21);
            this._password.TabIndex = 2;
            // 
            // _passwordLabel
            // 
            this._passwordLabel.AutoSize = true;
            this._passwordLabel.Location = new System.Drawing.Point(12, 41);
            this._passwordLabel.Name = "_passwordLabel";
            this._passwordLabel.Size = new System.Drawing.Size(53, 12);
            this._passwordLabel.TabIndex = 3;
            this._passwordLabel.Text = "Password";
            // 
            // _cancelButton
            // 
            this._cancelButton.Location = new System.Drawing.Point(342, 64);
            this._cancelButton.Name = "_cancelButton";
            this._cancelButton.Size = new System.Drawing.Size(75, 23);
            this._cancelButton.TabIndex = 4;
            this._cancelButton.Text = "취소";
            this._cancelButton.UseVisualStyleBackColor = true;
            this._cancelButton.Click += new System.EventHandler(this._cancelButton_Click);
            // 
            // _confirmButton
            // 
            this._confirmButton.Location = new System.Drawing.Point(261, 64);
            this._confirmButton.Name = "_confirmButton";
            this._confirmButton.Size = new System.Drawing.Size(75, 23);
            this._confirmButton.TabIndex = 3;
            this._confirmButton.Text = "확인";
            this._confirmButton.UseVisualStyleBackColor = true;
            this._confirmButton.Click += new System.EventHandler(this._confirmButton_Click);
            // 
            // enCubLogin
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.None;
            this.ClientSize = new System.Drawing.Size(429, 99);
            this.Controls.Add(this._confirmButton);
            this.Controls.Add(this._cancelButton);
            this.Controls.Add(this._password);
            this.Controls.Add(this._passwordLabel);
            this.Controls.Add(this._userID);
            this.Controls.Add(this._userLabel);
            this.Controls.Add(this._logo);
            this.Font = new System.Drawing.Font("굴림체", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "enCubLogin";
            this.Text = "Login";
            ((System.ComponentModel.ISupportInitialize)(this._logo)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.PictureBox _logo;
        private System.Windows.Forms.Label _userLabel;
        private System.Windows.Forms.TextBox _userID;
        private System.Windows.Forms.TextBox _password;
        private System.Windows.Forms.Label _passwordLabel;
        private System.Windows.Forms.Button _cancelButton;
        private System.Windows.Forms.Button _confirmButton;
    }
}