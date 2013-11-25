namespace Salt.enCub
{
    partial class enCubUserForm
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
            this.splitContainer1 = new System.Windows.Forms.SplitContainer();
            this._userView = new System.Windows.Forms.DataGridView();
            this._deleteButton = new System.Windows.Forms.Button();
            this._password = new System.Windows.Forms.TextBox();
            this._passwordLabel = new System.Windows.Forms.Label();
            this._cancelButton = new System.Windows.Forms.Button();
            this._confirmButton = new System.Windows.Forms.Button();
            this._comment = new System.Windows.Forms.TextBox();
            this._commentLabel = new System.Windows.Forms.Label();
            this._authorityCombo = new System.Windows.Forms.ComboBox();
            this._authorityLabel = new System.Windows.Forms.Label();
            this._userName = new System.Windows.Forms.TextBox();
            this._userNameLabel = new System.Windows.Forms.Label();
            this._userID = new System.Windows.Forms.TextBox();
            this._userLabel = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer1)).BeginInit();
            this.splitContainer1.Panel1.SuspendLayout();
            this.splitContainer1.Panel2.SuspendLayout();
            this.splitContainer1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this._userView)).BeginInit();
            this.SuspendLayout();
            // 
            // splitContainer1
            // 
            this.splitContainer1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer1.Location = new System.Drawing.Point(0, 0);
            this.splitContainer1.Name = "splitContainer1";
            // 
            // splitContainer1.Panel1
            // 
            this.splitContainer1.Panel1.Controls.Add(this._userView);
            // 
            // splitContainer1.Panel2
            // 
            this.splitContainer1.Panel2.Controls.Add(this._deleteButton);
            this.splitContainer1.Panel2.Controls.Add(this._password);
            this.splitContainer1.Panel2.Controls.Add(this._passwordLabel);
            this.splitContainer1.Panel2.Controls.Add(this._cancelButton);
            this.splitContainer1.Panel2.Controls.Add(this._confirmButton);
            this.splitContainer1.Panel2.Controls.Add(this._comment);
            this.splitContainer1.Panel2.Controls.Add(this._commentLabel);
            this.splitContainer1.Panel2.Controls.Add(this._authorityCombo);
            this.splitContainer1.Panel2.Controls.Add(this._authorityLabel);
            this.splitContainer1.Panel2.Controls.Add(this._userName);
            this.splitContainer1.Panel2.Controls.Add(this._userNameLabel);
            this.splitContainer1.Panel2.Controls.Add(this._userID);
            this.splitContainer1.Panel2.Controls.Add(this._userLabel);
            this.splitContainer1.Size = new System.Drawing.Size(759, 238);
            this.splitContainer1.SplitterDistance = 319;
            this.splitContainer1.SplitterWidth = 3;
            this.splitContainer1.TabIndex = 0;
            // 
            // _userView
            // 
            this._userView.AllowUserToAddRows = false;
            this._userView.AllowUserToDeleteRows = false;
            this._userView.AllowUserToResizeRows = false;
            this._userView.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this._userView.BackgroundColor = System.Drawing.SystemColors.Control;
            this._userView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this._userView.Dock = System.Windows.Forms.DockStyle.Fill;
            this._userView.Location = new System.Drawing.Point(0, 0);
            this._userView.Name = "_userView";
            this._userView.ReadOnly = true;
            this._userView.RowTemplate.Height = 23;
            this._userView.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this._userView.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this._userView.Size = new System.Drawing.Size(319, 238);
            this._userView.TabIndex = 9;
            this._userView.CellClick += new System.Windows.Forms.DataGridViewCellEventHandler(this._userView_CellClick);
            // 
            // _deleteButton
            // 
            this._deleteButton.Location = new System.Drawing.Point(266, 198);
            this._deleteButton.Name = "_deleteButton";
            this._deleteButton.Size = new System.Drawing.Size(75, 23);
            this._deleteButton.TabIndex = 8;
            this._deleteButton.Text = "삭제";
            this._deleteButton.UseVisualStyleBackColor = true;
            this._deleteButton.Click += new System.EventHandler(this._deleteButton_Click);
            // 
            // _password
            // 
            this._password.Location = new System.Drawing.Point(82, 68);
            this._password.Name = "_password";
            this._password.PasswordChar = '*';
            this._password.Size = new System.Drawing.Size(338, 21);
            this._password.TabIndex = 3;
            // 
            // _passwordLabel
            // 
            this._passwordLabel.AutoSize = true;
            this._passwordLabel.Location = new System.Drawing.Point(14, 73);
            this._passwordLabel.Name = "_passwordLabel";
            this._passwordLabel.Size = new System.Drawing.Size(53, 12);
            this._passwordLabel.TabIndex = 7;
            this._passwordLabel.Text = "Password";
            // 
            // _cancelButton
            // 
            this._cancelButton.Location = new System.Drawing.Point(345, 198);
            this._cancelButton.Name = "_cancelButton";
            this._cancelButton.Size = new System.Drawing.Size(75, 23);
            this._cancelButton.TabIndex = 7;
            this._cancelButton.Text = "취소";
            this._cancelButton.UseVisualStyleBackColor = true;
            this._cancelButton.Click += new System.EventHandler(this._cancelButton_Click);
            // 
            // _confirmButton
            // 
            this._confirmButton.Location = new System.Drawing.Point(183, 198);
            this._confirmButton.Name = "_confirmButton";
            this._confirmButton.Size = new System.Drawing.Size(75, 23);
            this._confirmButton.TabIndex = 6;
            this._confirmButton.Text = "확인";
            this._confirmButton.UseVisualStyleBackColor = true;
            this._confirmButton.Click += new System.EventHandler(this._confirmButton_Click);
            // 
            // _comment
            // 
            this._comment.Location = new System.Drawing.Point(82, 124);
            this._comment.Multiline = true;
            this._comment.Name = "_comment";
            this._comment.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this._comment.Size = new System.Drawing.Size(338, 65);
            this._comment.TabIndex = 5;
            // 
            // _commentLabel
            // 
            this._commentLabel.AutoSize = true;
            this._commentLabel.Location = new System.Drawing.Point(14, 128);
            this._commentLabel.Name = "_commentLabel";
            this._commentLabel.Size = new System.Drawing.Size(47, 12);
            this._commentLabel.TabIndex = 6;
            this._commentLabel.Text = "Comment";
            // 
            // _authorityCombo
            // 
            this._authorityCombo.FormattingEnabled = true;
            this._authorityCombo.Items.AddRange(new object[] {
            "Administrator",
            "Developer",
            "User"});
            this._authorityCombo.Location = new System.Drawing.Point(82, 96);
            this._authorityCombo.Name = "_authorityCombo";
            this._authorityCombo.Size = new System.Drawing.Size(121, 20);
            this._authorityCombo.TabIndex = 4;
            // 
            // _authorityLabel
            // 
            this._authorityLabel.AutoSize = true;
            this._authorityLabel.Location = new System.Drawing.Point(14, 101);
            this._authorityLabel.Name = "_authorityLabel";
            this._authorityLabel.Size = new System.Drawing.Size(59, 12);
            this._authorityLabel.TabIndex = 4;
            this._authorityLabel.Text = "Authority";
            // 
            // _userName
            // 
            this._userName.Location = new System.Drawing.Point(82, 41);
            this._userName.Name = "_userName";
            this._userName.Size = new System.Drawing.Size(338, 21);
            this._userName.TabIndex = 2;
            // 
            // _userNameLabel
            // 
            this._userNameLabel.AutoSize = true;
            this._userNameLabel.Location = new System.Drawing.Point(14, 47);
            this._userNameLabel.Name = "_userNameLabel";
            this._userNameLabel.Size = new System.Drawing.Size(59, 12);
            this._userNameLabel.TabIndex = 2;
            this._userNameLabel.Text = "User Name";
            // 
            // _userID
            // 
            this._userID.Location = new System.Drawing.Point(82, 14);
            this._userID.Name = "_userID";
            this._userID.Size = new System.Drawing.Size(338, 21);
            this._userID.TabIndex = 1;
            // 
            // _userLabel
            // 
            this._userLabel.AutoSize = true;
            this._userLabel.Location = new System.Drawing.Point(14, 20);
            this._userLabel.Name = "_userLabel";
            this._userLabel.Size = new System.Drawing.Size(47, 12);
            this._userLabel.TabIndex = 0;
            this._userLabel.Text = "User ID";
            // 
            // enCubUserForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(759, 238);
            this.Controls.Add(this.splitContainer1);
            this.Font = new System.Drawing.Font("굴림체", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "enCubUserForm";
            this.Text = "사용자관리";
            this.splitContainer1.Panel1.ResumeLayout(false);
            this.splitContainer1.Panel2.ResumeLayout(false);
            this.splitContainer1.Panel2.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer1)).EndInit();
            this.splitContainer1.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this._userView)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.SplitContainer splitContainer1;
        private System.Windows.Forms.TextBox _userID;
        private System.Windows.Forms.Label _userLabel;
        private System.Windows.Forms.TextBox _userName;
        private System.Windows.Forms.Label _userNameLabel;
        private System.Windows.Forms.ComboBox _authorityCombo;
        private System.Windows.Forms.Label _authorityLabel;
        private System.Windows.Forms.Label _commentLabel;
        private System.Windows.Forms.TextBox _comment;
        private System.Windows.Forms.Button _confirmButton;
        private System.Windows.Forms.Button _cancelButton;
        private System.Windows.Forms.TextBox _password;
        private System.Windows.Forms.Label _passwordLabel;
        private System.Windows.Forms.Button _deleteButton;
        private System.Windows.Forms.DataGridView _userView;
    }
}