namespace Salt.enCub
{
    partial class enCubProject
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
            this._projectLabel = new System.Windows.Forms.Label();
            this._project = new System.Windows.Forms.TextBox();
            this._cancelButton = new System.Windows.Forms.Button();
            this._confirmButton = new System.Windows.Forms.Button();
            this._comment = new System.Windows.Forms.TextBox();
            this._commentLabel = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // _projectLabel
            // 
            this._projectLabel.AutoSize = true;
            this._projectLabel.Location = new System.Drawing.Point(21, 22);
            this._projectLabel.Name = "_projectLabel";
            this._projectLabel.Size = new System.Drawing.Size(47, 12);
            this._projectLabel.TabIndex = 0;
            this._projectLabel.Text = "Project";
            // 
            // _project
            // 
            this._project.Location = new System.Drawing.Point(103, 17);
            this._project.Name = "_project";
            this._project.Size = new System.Drawing.Size(323, 21);
            this._project.TabIndex = 1;
            // 
            // _cancelButton
            // 
            this._cancelButton.Location = new System.Drawing.Point(351, 194);
            this._cancelButton.Name = "_cancelButton";
            this._cancelButton.Size = new System.Drawing.Size(75, 23);
            this._cancelButton.TabIndex = 6;
            this._cancelButton.Text = "취소";
            this._cancelButton.UseVisualStyleBackColor = true;
            this._cancelButton.Click += new System.EventHandler(this._cancelButton_Click);
            // 
            // _confirmButton
            // 
            this._confirmButton.Location = new System.Drawing.Point(270, 194);
            this._confirmButton.Name = "_confirmButton";
            this._confirmButton.Size = new System.Drawing.Size(75, 23);
            this._confirmButton.TabIndex = 5;
            this._confirmButton.Text = "확인";
            this._confirmButton.UseVisualStyleBackColor = true;
            this._confirmButton.Click += new System.EventHandler(this._confirmButton_Click);
            // 
            // _comment
            // 
            this._comment.Location = new System.Drawing.Point(103, 48);
            this._comment.Multiline = true;
            this._comment.Name = "_comment";
            this._comment.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this._comment.Size = new System.Drawing.Size(323, 140);
            this._comment.TabIndex = 4;
            // 
            // _commentLabel
            // 
            this._commentLabel.AutoSize = true;
            this._commentLabel.Location = new System.Drawing.Point(21, 53);
            this._commentLabel.Name = "_commentLabel";
            this._commentLabel.Size = new System.Drawing.Size(47, 12);
            this._commentLabel.TabIndex = 7;
            this._commentLabel.Text = "Comment";
            // 
            // enCubProject
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(441, 230);
            this.Controls.Add(this._commentLabel);
            this.Controls.Add(this._comment);
            this.Controls.Add(this._confirmButton);
            this.Controls.Add(this._cancelButton);
            this.Controls.Add(this._project);
            this.Controls.Add(this._projectLabel);
            this.Font = new System.Drawing.Font("굴림체", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.Name = "enCubProject";
            this.Text = "Project";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label _projectLabel;
        private System.Windows.Forms.TextBox _project;
        private System.Windows.Forms.Button _cancelButton;
        private System.Windows.Forms.Button _confirmButton;
        private System.Windows.Forms.TextBox _comment;
        private System.Windows.Forms.Label _commentLabel;
    }
}