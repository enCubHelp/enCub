namespace Salt.enCub
{
    partial class enCubConfigForm
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(enCubConfigForm));
            this._oracleVersionLabel = new System.Windows.Forms.Label();
            this._oracleVersion = new System.Windows.Forms.ComboBox();
            this._oracleUserLabel = new System.Windows.Forms.Label();
            this._oracleUser = new System.Windows.Forms.TextBox();
            this._oraclePassword = new System.Windows.Forms.TextBox();
            this._oracleConnestionLabel = new System.Windows.Forms.Label();
            this._oracleConnection = new System.Windows.Forms.TextBox();
            this._cancelButton = new System.Windows.Forms.Button();
            this._confirmButton = new System.Windows.Forms.Button();
            this._oracleClass = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this._connectionButton = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // _oracleVersionLabel
            // 
            this._oracleVersionLabel.AutoSize = true;
            this._oracleVersionLabel.Location = new System.Drawing.Point(12, 16);
            this._oracleVersionLabel.Name = "_oracleVersionLabel";
            this._oracleVersionLabel.Size = new System.Drawing.Size(89, 12);
            this._oracleVersionLabel.TabIndex = 3;
            this._oracleVersionLabel.Text = "Oracle Version";
            // 
            // _oracleVersion
            // 
            this._oracleVersion.FormattingEnabled = true;
            this._oracleVersion.Items.AddRange(new object[] {
            "Oracle 12CR1",
            "Oracle 11GR2",
            "Oracle 11GR1",
            "Oracle 10G"});
            this._oracleVersion.Location = new System.Drawing.Point(168, 12);
            this._oracleVersion.Name = "_oracleVersion";
            this._oracleVersion.Size = new System.Drawing.Size(104, 20);
            this._oracleVersion.TabIndex = 2;
            // 
            // _oracleUserLabel
            // 
            this._oracleUserLabel.AutoSize = true;
            this._oracleUserLabel.Location = new System.Drawing.Point(12, 38);
            this._oracleUserLabel.Name = "_oracleUserLabel";
            this._oracleUserLabel.Size = new System.Drawing.Size(71, 12);
            this._oracleUserLabel.TabIndex = 8;
            this._oracleUserLabel.Text = "Oracle User";
            // 
            // _oracleUser
            // 
            this._oracleUser.Location = new System.Drawing.Point(168, 34);
            this._oracleUser.Name = "_oracleUser";
            this._oracleUser.Size = new System.Drawing.Size(128, 21);
            this._oracleUser.TabIndex = 3;
            this._oracleUser.WordWrap = false;
            // 
            // _oraclePassword
            // 
            this._oraclePassword.Location = new System.Drawing.Point(301, 34);
            this._oraclePassword.Name = "_oraclePassword";
            this._oraclePassword.PasswordChar = '*';
            this._oraclePassword.Size = new System.Drawing.Size(182, 21);
            this._oraclePassword.TabIndex = 4;
            this._oraclePassword.WordWrap = false;
            // 
            // _oracleConnestionLabel
            // 
            this._oracleConnestionLabel.AutoSize = true;
            this._oracleConnestionLabel.Location = new System.Drawing.Point(12, 92);
            this._oracleConnestionLabel.Name = "_oracleConnestionLabel";
            this._oracleConnestionLabel.Size = new System.Drawing.Size(149, 12);
            this._oracleConnestionLabel.TabIndex = 11;
            this._oracleConnestionLabel.Text = "Oracle Connection String";
            // 
            // _oracleConnection
            // 
            this._oracleConnection.Location = new System.Drawing.Point(168, 88);
            this._oracleConnection.Multiline = true;
            this._oracleConnection.Name = "_oracleConnection";
            this._oracleConnection.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this._oracleConnection.Size = new System.Drawing.Size(315, 57);
            this._oracleConnection.TabIndex = 6;
            // 
            // _cancelButton
            // 
            this._cancelButton.Location = new System.Drawing.Point(410, 155);
            this._cancelButton.Name = "_cancelButton";
            this._cancelButton.Size = new System.Drawing.Size(75, 23);
            this._cancelButton.TabIndex = 9;
            this._cancelButton.Text = "취소";
            this._cancelButton.UseVisualStyleBackColor = true;
            this._cancelButton.Click += new System.EventHandler(this._cancelButton_Click);
            // 
            // _confirmButton
            // 
            this._confirmButton.Location = new System.Drawing.Point(250, 155);
            this._confirmButton.Name = "_confirmButton";
            this._confirmButton.Size = new System.Drawing.Size(75, 23);
            this._confirmButton.TabIndex = 8;
            this._confirmButton.Text = "확인";
            this._confirmButton.UseVisualStyleBackColor = true;
            this._confirmButton.Click += new System.EventHandler(this._confirmButton_Click);
            // 
            // _oracleClass
            // 
            this._oracleClass.Location = new System.Drawing.Point(168, 61);
            this._oracleClass.Name = "_oracleClass";
            this._oracleClass.Size = new System.Drawing.Size(315, 21);
            this._oracleClass.TabIndex = 31;
            this._oracleClass.WordWrap = false;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 64);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(65, 12);
            this.label1.TabIndex = 30;
            this.label1.Text = "JDBC Class";
            // 
            // _connectionButton
            // 
            this._connectionButton.Location = new System.Drawing.Point(331, 155);
            this._connectionButton.Name = "_connectionButton";
            this._connectionButton.Size = new System.Drawing.Size(75, 23);
            this._connectionButton.TabIndex = 32;
            this._connectionButton.Text = "연결";
            this._connectionButton.UseVisualStyleBackColor = true;
            this._connectionButton.Click += new System.EventHandler(this._connectionButton_Click);
            // 
            // enCubConfigForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(502, 191);
            this.Controls.Add(this._connectionButton);
            this.Controls.Add(this._oracleClass);
            this.Controls.Add(this.label1);
            this.Controls.Add(this._confirmButton);
            this.Controls.Add(this._cancelButton);
            this.Controls.Add(this._oracleConnestionLabel);
            this.Controls.Add(this._oracleConnection);
            this.Controls.Add(this._oraclePassword);
            this.Controls.Add(this._oracleUserLabel);
            this.Controls.Add(this._oracleUser);
            this.Controls.Add(this._oracleVersion);
            this.Controls.Add(this._oracleVersionLabel);
            this.Font = new System.Drawing.Font("굴림체", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "enCubConfigForm";
            this.Text = "Source DBMS 설정";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label _oracleVersionLabel;
        private System.Windows.Forms.ComboBox _oracleVersion;
        private System.Windows.Forms.Label _oracleUserLabel;
        private System.Windows.Forms.TextBox _oracleUser;
        private System.Windows.Forms.TextBox _oraclePassword;
        private System.Windows.Forms.Label _oracleConnestionLabel;
        private System.Windows.Forms.TextBox _oracleConnection;
        private System.Windows.Forms.Button _cancelButton;
        private System.Windows.Forms.Button _confirmButton;
        private System.Windows.Forms.TextBox _oracleClass;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button _connectionButton;
    }
}