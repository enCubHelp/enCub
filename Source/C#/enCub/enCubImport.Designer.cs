namespace Salt.enCub
{
    partial class enCubImport
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
            this._source = new System.Windows.Forms.TextBox();
            this._sourceLabel = new System.Windows.Forms.Label();
            this._overwriteLabel = new System.Windows.Forms.Label();
            this._overwriteN = new System.Windows.Forms.RadioButton();
            this._overwriteY = new System.Windows.Forms.RadioButton();
            this._log = new System.Windows.Forms.TextBox();
            this._logLabel = new System.Windows.Forms.Label();
            this._progress = new System.Windows.Forms.ProgressBar();
            this._progressLabel = new System.Windows.Forms.Label();
            this._serachButton = new System.Windows.Forms.Button();
            this._status = new System.Windows.Forms.StatusStrip();
            this._progressStatus = new System.Windows.Forms.ToolStripStatusLabel();
            this._status.SuspendLayout();
            this.SuspendLayout();
            // 
            // _projectLabel
            // 
            this._projectLabel.AutoSize = true;
            this._projectLabel.Location = new System.Drawing.Point(12, 17);
            this._projectLabel.Name = "_projectLabel";
            this._projectLabel.Size = new System.Drawing.Size(53, 12);
            this._projectLabel.TabIndex = 0;
            this._projectLabel.Text = "프로젝트";
            // 
            // _project
            // 
            this._project.Enabled = false;
            this._project.Location = new System.Drawing.Point(109, 11);
            this._project.Name = "_project";
            this._project.Size = new System.Drawing.Size(406, 21);
            this._project.TabIndex = 1;
            // 
            // _source
            // 
            this._source.Location = new System.Drawing.Point(109, 38);
            this._source.Name = "_source";
            this._source.Size = new System.Drawing.Size(406, 21);
            this._source.TabIndex = 2;
            // 
            // _sourceLabel
            // 
            this._sourceLabel.AutoSize = true;
            this._sourceLabel.Location = new System.Drawing.Point(12, 44);
            this._sourceLabel.Name = "_sourceLabel";
            this._sourceLabel.Size = new System.Drawing.Size(71, 12);
            this._sourceLabel.TabIndex = 2;
            this._sourceLabel.Text = "PL/SQL 소스";
            // 
            // _overwriteLabel
            // 
            this._overwriteLabel.AutoSize = true;
            this._overwriteLabel.Location = new System.Drawing.Point(12, 70);
            this._overwriteLabel.Name = "_overwriteLabel";
            this._overwriteLabel.Size = new System.Drawing.Size(53, 12);
            this._overwriteLabel.TabIndex = 4;
            this._overwriteLabel.Text = "겹쳐쓰기";
            // 
            // _overwriteN
            // 
            this._overwriteN.AutoSize = true;
            this._overwriteN.Location = new System.Drawing.Point(109, 68);
            this._overwriteN.Name = "_overwriteN";
            this._overwriteN.Size = new System.Drawing.Size(35, 16);
            this._overwriteN.TabIndex = 4;
            this._overwriteN.TabStop = true;
            this._overwriteN.Text = "No";
            this._overwriteN.UseVisualStyleBackColor = true;
            // 
            // _overwriteY
            // 
            this._overwriteY.AutoSize = true;
            this._overwriteY.Location = new System.Drawing.Point(150, 68);
            this._overwriteY.Name = "_overwriteY";
            this._overwriteY.Size = new System.Drawing.Size(41, 16);
            this._overwriteY.TabIndex = 5;
            this._overwriteY.TabStop = true;
            this._overwriteY.Text = "Yew";
            this._overwriteY.UseVisualStyleBackColor = true;
            // 
            // _log
            // 
            this._log.Enabled = false;
            this._log.Location = new System.Drawing.Point(109, 90);
            this._log.Multiline = true;
            this._log.Name = "_log";
            this._log.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this._log.Size = new System.Drawing.Size(491, 128);
            this._log.TabIndex = 5;
            // 
            // _logLabel
            // 
            this._logLabel.AutoSize = true;
            this._logLabel.Location = new System.Drawing.Point(12, 96);
            this._logLabel.Name = "_logLabel";
            this._logLabel.Size = new System.Drawing.Size(29, 12);
            this._logLabel.TabIndex = 7;
            this._logLabel.Text = "로그";
            // 
            // _progress
            // 
            this._progress.Location = new System.Drawing.Point(109, 224);
            this._progress.Name = "_progress";
            this._progress.Size = new System.Drawing.Size(491, 23);
            this._progress.TabIndex = 9;
            // 
            // _progressLabel
            // 
            this._progressLabel.AutoSize = true;
            this._progressLabel.Location = new System.Drawing.Point(12, 228);
            this._progressLabel.Name = "_progressLabel";
            this._progressLabel.Size = new System.Drawing.Size(53, 12);
            this._progressLabel.TabIndex = 10;
            this._progressLabel.Text = "진행상태";
            // 
            // _serachButton
            // 
            this._serachButton.Location = new System.Drawing.Point(525, 38);
            this._serachButton.Name = "_serachButton";
            this._serachButton.Size = new System.Drawing.Size(75, 23);
            this._serachButton.TabIndex = 3;
            this._serachButton.Text = "검색";
            this._serachButton.UseVisualStyleBackColor = true;
            this._serachButton.Click += new System.EventHandler(this._serachButton_Click);
            // 
            // _status
            // 
            this._status.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this._progressStatus});
            this._status.Location = new System.Drawing.Point(0, 263);
            this._status.Name = "_status";
            this._status.Size = new System.Drawing.Size(616, 22);
            this._status.TabIndex = 11;
            // 
            // _progressStatus
            // 
            this._progressStatus.Name = "_progressStatus";
            this._progressStatus.Size = new System.Drawing.Size(0, 17);
            // 
            // enCubImport
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(616, 285);
            this.Controls.Add(this._status);
            this.Controls.Add(this._serachButton);
            this.Controls.Add(this._progressLabel);
            this.Controls.Add(this._progress);
            this.Controls.Add(this._log);
            this.Controls.Add(this._logLabel);
            this.Controls.Add(this._overwriteY);
            this.Controls.Add(this._overwriteN);
            this.Controls.Add(this._overwriteLabel);
            this.Controls.Add(this._source);
            this.Controls.Add(this._sourceLabel);
            this.Controls.Add(this._project);
            this.Controls.Add(this._projectLabel);
            this.Font = new System.Drawing.Font("굴림체", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "enCubImport";
            this.Text = "PL/SQL 수집";
            this._status.ResumeLayout(false);
            this._status.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label _projectLabel;
        private System.Windows.Forms.TextBox _project;
        private System.Windows.Forms.TextBox _source;
        private System.Windows.Forms.Label _sourceLabel;
        private System.Windows.Forms.Label _overwriteLabel;
        private System.Windows.Forms.RadioButton _overwriteN;
        private System.Windows.Forms.RadioButton _overwriteY;
        private System.Windows.Forms.TextBox _log;
        private System.Windows.Forms.Label _logLabel;
        private System.Windows.Forms.ProgressBar _progress;
        private System.Windows.Forms.Label _progressLabel;
        private System.Windows.Forms.Button _serachButton;
        private System.Windows.Forms.StatusStrip _status;
        private System.Windows.Forms.ToolStripStatusLabel _progressStatus;
    }
}