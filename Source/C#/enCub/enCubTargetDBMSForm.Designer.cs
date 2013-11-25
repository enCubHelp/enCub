namespace Salt.enCub
{
    partial class enCubTargetDBMSForm
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
            this._confirmButton = new System.Windows.Forms.Button();
            this._cancelButton = new System.Windows.Forms.Button();
            this._repositoryConnestionLabel = new System.Windows.Forms.Label();
            this._targetDBMSConnection = new System.Windows.Forms.TextBox();
            this._targetDBMSPassword = new System.Windows.Forms.TextBox();
            this._repositoryUserLabel = new System.Windows.Forms.Label();
            this._targetDBMSUser = new System.Windows.Forms.TextBox();
            this._targetDBMS = new System.Windows.Forms.ComboBox();
            this._RepositoryLabel = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this._targetDBMSClass = new System.Windows.Forms.TextBox();
            this._targetDBMSLoadJavaPath = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this._targetDBMSJDKPath = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this._connectionButton = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // _confirmButton
            // 
            this._confirmButton.Location = new System.Drawing.Point(213, 201);
            this._confirmButton.Name = "_confirmButton";
            this._confirmButton.Size = new System.Drawing.Size(64, 23);
            this._confirmButton.TabIndex = 6;
            this._confirmButton.Text = "확인";
            this._confirmButton.UseVisualStyleBackColor = true;
            this._confirmButton.Click += new System.EventHandler(this._confirmButton_Click);
            // 
            // _cancelButton
            // 
            this._cancelButton.Location = new System.Drawing.Point(353, 201);
            this._cancelButton.Name = "_cancelButton";
            this._cancelButton.Size = new System.Drawing.Size(64, 23);
            this._cancelButton.TabIndex = 7;
            this._cancelButton.Text = "취소";
            this._cancelButton.UseVisualStyleBackColor = true;
            this._cancelButton.Click += new System.EventHandler(this._cancelButton_Click);
            // 
            // _repositoryConnestionLabel
            // 
            this._repositoryConnestionLabel.AutoSize = true;
            this._repositoryConnestionLabel.Location = new System.Drawing.Point(12, 139);
            this._repositoryConnestionLabel.Name = "_repositoryConnestionLabel";
            this._repositoryConnestionLabel.Size = new System.Drawing.Size(107, 12);
            this._repositoryConnestionLabel.TabIndex = 26;
            this._repositoryConnestionLabel.Text = "Connection String";
            // 
            // _targetDBMSConnection
            // 
            this._targetDBMSConnection.Location = new System.Drawing.Point(145, 135);
            this._targetDBMSConnection.Multiline = true;
            this._targetDBMSConnection.Name = "_targetDBMSConnection";
            this._targetDBMSConnection.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this._targetDBMSConnection.Size = new System.Drawing.Size(271, 57);
            this._targetDBMSConnection.TabIndex = 5;
            // 
            // _targetDBMSPassword
            // 
            this._targetDBMSPassword.Location = new System.Drawing.Point(259, 27);
            this._targetDBMSPassword.Name = "_targetDBMSPassword";
            this._targetDBMSPassword.PasswordChar = '*';
            this._targetDBMSPassword.Size = new System.Drawing.Size(157, 21);
            this._targetDBMSPassword.TabIndex = 3;
            this._targetDBMSPassword.WordWrap = false;
            // 
            // _repositoryUserLabel
            // 
            this._repositoryUserLabel.AutoSize = true;
            this._repositoryUserLabel.Location = new System.Drawing.Point(12, 31);
            this._repositoryUserLabel.Name = "_repositoryUserLabel";
            this._repositoryUserLabel.Size = new System.Drawing.Size(29, 12);
            this._repositoryUserLabel.TabIndex = 24;
            this._repositoryUserLabel.Text = "User";
            // 
            // _targetDBMSUser
            // 
            this._targetDBMSUser.Location = new System.Drawing.Point(145, 27);
            this._targetDBMSUser.Name = "_targetDBMSUser";
            this._targetDBMSUser.Size = new System.Drawing.Size(110, 21);
            this._targetDBMSUser.TabIndex = 2;
            this._targetDBMSUser.WordWrap = false;
            // 
            // _targetDBMS
            // 
            this._targetDBMS.FormattingEnabled = true;
            this._targetDBMS.Items.AddRange(new object[] {
            "Cubrid 9.1.0",
            "Oracle 12CR1",
            "Oracle 11GR2",
            "Oracle 11GR1",
            "Oracle 10G"});
            this._targetDBMS.Location = new System.Drawing.Point(145, 5);
            this._targetDBMS.Name = "_targetDBMS";
            this._targetDBMS.Size = new System.Drawing.Size(271, 20);
            this._targetDBMS.TabIndex = 1;
            // 
            // _RepositoryLabel
            // 
            this._RepositoryLabel.AutoSize = true;
            this._RepositoryLabel.Location = new System.Drawing.Point(12, 9);
            this._RepositoryLabel.Name = "_RepositoryLabel";
            this._RepositoryLabel.Size = new System.Drawing.Size(71, 12);
            this._RepositoryLabel.TabIndex = 16;
            this._RepositoryLabel.Text = "Target DBMS";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 58);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(65, 12);
            this.label1.TabIndex = 28;
            this.label1.Text = "JDBC Class";
            // 
            // _targetDBMSClass
            // 
            this._targetDBMSClass.Location = new System.Drawing.Point(145, 54);
            this._targetDBMSClass.Name = "_targetDBMSClass";
            this._targetDBMSClass.Size = new System.Drawing.Size(269, 21);
            this._targetDBMSClass.TabIndex = 29;
            this._targetDBMSClass.WordWrap = false;
            // 
            // _targetDBMSLoadJavaPath
            // 
            this._targetDBMSLoadJavaPath.Location = new System.Drawing.Point(145, 109);
            this._targetDBMSLoadJavaPath.Name = "_targetDBMSLoadJavaPath";
            this._targetDBMSLoadJavaPath.Size = new System.Drawing.Size(269, 21);
            this._targetDBMSLoadJavaPath.TabIndex = 31;
            this._targetDBMSLoadJavaPath.WordWrap = false;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(12, 112);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(83, 12);
            this.label2.TabIndex = 30;
            this.label2.Text = "loadjava Path";
            // 
            // _targetDBMSJDKPath
            // 
            this._targetDBMSJDKPath.Location = new System.Drawing.Point(145, 81);
            this._targetDBMSJDKPath.Name = "_targetDBMSJDKPath";
            this._targetDBMSJDKPath.Size = new System.Drawing.Size(269, 21);
            this._targetDBMSJDKPath.TabIndex = 33;
            this._targetDBMSJDKPath.WordWrap = false;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(12, 84);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(53, 12);
            this.label3.TabIndex = 32;
            this.label3.Text = "JDK Path";
            // 
            // _connectionButton
            // 
            this._connectionButton.Location = new System.Drawing.Point(283, 201);
            this._connectionButton.Name = "_connectionButton";
            this._connectionButton.Size = new System.Drawing.Size(64, 23);
            this._connectionButton.TabIndex = 34;
            this._connectionButton.Text = "연결";
            this._connectionButton.UseVisualStyleBackColor = true;
            this._connectionButton.Click += new System.EventHandler(this._connectionButton_Click);
            // 
            // enCubTargetDBMSForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(426, 236);
            this.Controls.Add(this._connectionButton);
            this.Controls.Add(this._targetDBMSJDKPath);
            this.Controls.Add(this.label3);
            this.Controls.Add(this._targetDBMSLoadJavaPath);
            this.Controls.Add(this.label2);
            this.Controls.Add(this._targetDBMSClass);
            this.Controls.Add(this.label1);
            this.Controls.Add(this._confirmButton);
            this.Controls.Add(this._cancelButton);
            this.Controls.Add(this._repositoryConnestionLabel);
            this.Controls.Add(this._targetDBMSConnection);
            this.Controls.Add(this._targetDBMSPassword);
            this.Controls.Add(this._repositoryUserLabel);
            this.Controls.Add(this._targetDBMSUser);
            this.Controls.Add(this._targetDBMS);
            this.Controls.Add(this._RepositoryLabel);
            this.Font = new System.Drawing.Font("굴림체", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "enCubTargetDBMSForm";
            this.Text = "Target DBMS";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button _confirmButton;
        private System.Windows.Forms.Button _cancelButton;
        private System.Windows.Forms.Label _repositoryConnestionLabel;
        private System.Windows.Forms.TextBox _targetDBMSConnection;
        private System.Windows.Forms.TextBox _targetDBMSPassword;
        private System.Windows.Forms.Label _repositoryUserLabel;
        private System.Windows.Forms.TextBox _targetDBMSUser;
        private System.Windows.Forms.ComboBox _targetDBMS;
        private System.Windows.Forms.Label _RepositoryLabel;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox _targetDBMSClass;
        private System.Windows.Forms.TextBox _targetDBMSLoadJavaPath;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox _targetDBMSJDKPath;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button _connectionButton;
    }
}