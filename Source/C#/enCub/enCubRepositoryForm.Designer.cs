namespace Salt.enCub
{
    partial class enCubRepositoryForm
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
            this._repositoryConnection = new System.Windows.Forms.TextBox();
            this._repositoryPassword = new System.Windows.Forms.TextBox();
            this._repositoryUserLabel = new System.Windows.Forms.Label();
            this._repositoryUser = new System.Windows.Forms.TextBox();
            this._repository = new System.Windows.Forms.ComboBox();
            this._RepositoryLabel = new System.Windows.Forms.Label();
            this._repositoryClass = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this._connectionButton = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // _confirmButton
            // 
            this._confirmButton.Location = new System.Drawing.Point(213, 147);
            this._confirmButton.Name = "_confirmButton";
            this._confirmButton.Size = new System.Drawing.Size(64, 23);
            this._confirmButton.TabIndex = 6;
            this._confirmButton.Text = "확인";
            this._confirmButton.UseVisualStyleBackColor = true;
            this._confirmButton.Click += new System.EventHandler(this._confirmButton_Click);
            // 
            // _cancelButton
            // 
            this._cancelButton.Location = new System.Drawing.Point(353, 147);
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
            this._repositoryConnestionLabel.Location = new System.Drawing.Point(12, 85);
            this._repositoryConnestionLabel.Name = "_repositoryConnestionLabel";
            this._repositoryConnestionLabel.Size = new System.Drawing.Size(107, 12);
            this._repositoryConnestionLabel.TabIndex = 26;
            this._repositoryConnestionLabel.Text = "Connection String";
            // 
            // _repositoryConnection
            // 
            this._repositoryConnection.Location = new System.Drawing.Point(145, 81);
            this._repositoryConnection.Multiline = true;
            this._repositoryConnection.Name = "_repositoryConnection";
            this._repositoryConnection.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this._repositoryConnection.Size = new System.Drawing.Size(271, 57);
            this._repositoryConnection.TabIndex = 5;
            // 
            // _repositoryPassword
            // 
            this._repositoryPassword.Location = new System.Drawing.Point(259, 27);
            this._repositoryPassword.Name = "_repositoryPassword";
            this._repositoryPassword.PasswordChar = '*';
            this._repositoryPassword.Size = new System.Drawing.Size(157, 21);
            this._repositoryPassword.TabIndex = 3;
            this._repositoryPassword.WordWrap = false;
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
            // _repositoryUser
            // 
            this._repositoryUser.Location = new System.Drawing.Point(145, 27);
            this._repositoryUser.Name = "_repositoryUser";
            this._repositoryUser.Size = new System.Drawing.Size(110, 21);
            this._repositoryUser.TabIndex = 2;
            this._repositoryUser.WordWrap = false;
            // 
            // _repository
            // 
            this._repository.FormattingEnabled = true;
            this._repository.Items.AddRange(new object[] {
            "Cubrid 9.1.0"});
            this._repository.Location = new System.Drawing.Point(145, 5);
            this._repository.Name = "_repository";
            this._repository.Size = new System.Drawing.Size(271, 20);
            this._repository.TabIndex = 1;
            // 
            // _RepositoryLabel
            // 
            this._RepositoryLabel.AutoSize = true;
            this._RepositoryLabel.Location = new System.Drawing.Point(12, 9);
            this._RepositoryLabel.Name = "_RepositoryLabel";
            this._RepositoryLabel.Size = new System.Drawing.Size(65, 12);
            this._RepositoryLabel.TabIndex = 16;
            this._RepositoryLabel.Text = "Repository";
            // 
            // _repositoryClass
            // 
            this._repositoryClass.Location = new System.Drawing.Point(145, 54);
            this._repositoryClass.Name = "_repositoryClass";
            this._repositoryClass.Size = new System.Drawing.Size(269, 21);
            this._repositoryClass.TabIndex = 31;
            this._repositoryClass.WordWrap = false;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 58);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(65, 12);
            this.label1.TabIndex = 30;
            this.label1.Text = "JDBC Class";
            // 
            // _connectionButton
            // 
            this._connectionButton.Location = new System.Drawing.Point(283, 147);
            this._connectionButton.Name = "_connectionButton";
            this._connectionButton.Size = new System.Drawing.Size(64, 23);
            this._connectionButton.TabIndex = 32;
            this._connectionButton.Text = "연결";
            this._connectionButton.UseVisualStyleBackColor = true;
            this._connectionButton.Click += new System.EventHandler(this._connectionButton_Click);
            // 
            // enCubRepositoryForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(426, 180);
            this.Controls.Add(this._connectionButton);
            this.Controls.Add(this._repositoryClass);
            this.Controls.Add(this.label1);
            this.Controls.Add(this._confirmButton);
            this.Controls.Add(this._cancelButton);
            this.Controls.Add(this._repositoryConnestionLabel);
            this.Controls.Add(this._repositoryConnection);
            this.Controls.Add(this._repositoryPassword);
            this.Controls.Add(this._repositoryUserLabel);
            this.Controls.Add(this._repositoryUser);
            this.Controls.Add(this._repository);
            this.Controls.Add(this._RepositoryLabel);
            this.Font = new System.Drawing.Font("굴림체", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "enCubRepositoryForm";
            this.Text = "Repository";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button _confirmButton;
        private System.Windows.Forms.Button _cancelButton;
        private System.Windows.Forms.Label _repositoryConnestionLabel;
        private System.Windows.Forms.TextBox _repositoryConnection;
        private System.Windows.Forms.TextBox _repositoryPassword;
        private System.Windows.Forms.Label _repositoryUserLabel;
        private System.Windows.Forms.TextBox _repositoryUser;
        private System.Windows.Forms.ComboBox _repository;
        private System.Windows.Forms.Label _RepositoryLabel;
        private System.Windows.Forms.TextBox _repositoryClass;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button _connectionButton;
    }
}