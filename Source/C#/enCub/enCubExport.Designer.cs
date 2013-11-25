namespace Salt.enCub
{
    partial class enCubExport
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
            System.Windows.Forms.DataGridViewCellStyle dataGridViewCellStyle1 = new System.Windows.Forms.DataGridViewCellStyle();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(enCubExport));
            this._projectLabel = new System.Windows.Forms.Label();
            this._project = new System.Windows.Forms.TextBox();
            this._listView = new System.Windows.Forms.DataGridView();
            this._selectAll = new System.Windows.Forms.CheckBox();
            this._exportButton = new System.Windows.Forms.Button();
            this._log = new System.Windows.Forms.TextBox();
            this._progressLabel = new System.Windows.Forms.Label();
            this._progress = new System.Windows.Forms.ProgressBar();
            this._status = new System.Windows.Forms.StatusStrip();
            this._progressStatus = new System.Windows.Forms.ToolStripStatusLabel();
            this._directoryLabel = new System.Windows.Forms.Label();
            this._directory = new System.Windows.Forms.TextBox();
            this._serachButton = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this._listView)).BeginInit();
            this._status.SuspendLayout();
            this.SuspendLayout();
            // 
            // _projectLabel
            // 
            this._projectLabel.AutoSize = true;
            this._projectLabel.Location = new System.Drawing.Point(10, 9);
            this._projectLabel.Name = "_projectLabel";
            this._projectLabel.Size = new System.Drawing.Size(47, 12);
            this._projectLabel.TabIndex = 0;
            this._projectLabel.Text = "Project";
            // 
            // _project
            // 
            this._project.Location = new System.Drawing.Point(66, 4);
            this._project.Name = "_project";
            this._project.ReadOnly = true;
            this._project.Size = new System.Drawing.Size(334, 21);
            this._project.TabIndex = 1;
            // 
            // _listView
            // 
            this._listView.AllowUserToAddRows = false;
            this._listView.AllowUserToDeleteRows = false;
            this._listView.AllowUserToResizeRows = false;
            this._listView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this._listView.Location = new System.Drawing.Point(12, 60);
            this._listView.Name = "_listView";
            dataGridViewCellStyle1.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter;
            dataGridViewCellStyle1.BackColor = System.Drawing.SystemColors.Control;
            dataGridViewCellStyle1.Font = new System.Drawing.Font("굴림체", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            dataGridViewCellStyle1.ForeColor = System.Drawing.SystemColors.WindowText;
            dataGridViewCellStyle1.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle1.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle1.WrapMode = System.Windows.Forms.DataGridViewTriState.True;
            this._listView.RowHeadersDefaultCellStyle = dataGridViewCellStyle1;
            this._listView.RowHeadersVisible = false;
            this._listView.RowTemplate.Height = 23;
            this._listView.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this._listView.Size = new System.Drawing.Size(388, 330);
            this._listView.TabIndex = 2;
            // 
            // _selectAll
            // 
            this._selectAll.AutoSize = true;
            this._selectAll.Location = new System.Drawing.Point(12, 396);
            this._selectAll.Name = "_selectAll";
            this._selectAll.Size = new System.Drawing.Size(84, 16);
            this._selectAll.TabIndex = 3;
            this._selectAll.Text = "Select All";
            this._selectAll.UseVisualStyleBackColor = true;
            this._selectAll.CheckedChanged += new System.EventHandler(this._selectAll_CheckedChanged);
            // 
            // _exportButton
            // 
            this._exportButton.Location = new System.Drawing.Point(325, 396);
            this._exportButton.Name = "_exportButton";
            this._exportButton.Size = new System.Drawing.Size(75, 23);
            this._exportButton.TabIndex = 4;
            this._exportButton.Text = "배포";
            this._exportButton.UseVisualStyleBackColor = true;
            this._exportButton.Click += new System.EventHandler(this._exportButton_Click);
            // 
            // _log
            // 
            this._log.Location = new System.Drawing.Point(12, 459);
            this._log.Multiline = true;
            this._log.Name = "_log";
            this._log.ReadOnly = true;
            this._log.ScrollBars = System.Windows.Forms.ScrollBars.Both;
            this._log.Size = new System.Drawing.Size(388, 130);
            this._log.TabIndex = 5;
            this._log.WordWrap = false;
            // 
            // _progressLabel
            // 
            this._progressLabel.AutoSize = true;
            this._progressLabel.Location = new System.Drawing.Point(13, 429);
            this._progressLabel.Name = "_progressLabel";
            this._progressLabel.Size = new System.Drawing.Size(53, 12);
            this._progressLabel.TabIndex = 12;
            this._progressLabel.Text = "진행상태";
            // 
            // _progress
            // 
            this._progress.Location = new System.Drawing.Point(72, 425);
            this._progress.Name = "_progress";
            this._progress.Size = new System.Drawing.Size(328, 23);
            this._progress.TabIndex = 11;
            // 
            // _status
            // 
            this._status.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this._progressStatus});
            this._status.Location = new System.Drawing.Point(0, 616);
            this._status.Name = "_status";
            this._status.Size = new System.Drawing.Size(412, 22);
            this._status.TabIndex = 13;
            this._status.Text = "statusStrip1";
            // 
            // _progressStatus
            // 
            this._progressStatus.Name = "_progressStatus";
            this._progressStatus.Size = new System.Drawing.Size(0, 17);
            // 
            // _directoryLabel
            // 
            this._directoryLabel.AutoSize = true;
            this._directoryLabel.Location = new System.Drawing.Point(10, 36);
            this._directoryLabel.Name = "_directoryLabel";
            this._directoryLabel.Size = new System.Drawing.Size(53, 12);
            this._directoryLabel.TabIndex = 14;
            this._directoryLabel.Text = "디렉토리";
            // 
            // _directory
            // 
            this._directory.Location = new System.Drawing.Point(66, 31);
            this._directory.Name = "_directory";
            this._directory.Size = new System.Drawing.Size(253, 21);
            this._directory.TabIndex = 15;
            // 
            // _serachButton
            // 
            this._serachButton.Location = new System.Drawing.Point(325, 31);
            this._serachButton.Name = "_serachButton";
            this._serachButton.Size = new System.Drawing.Size(75, 23);
            this._serachButton.TabIndex = 16;
            this._serachButton.Text = "검색";
            this._serachButton.UseVisualStyleBackColor = true;
            this._serachButton.Click += new System.EventHandler(this._serachButton_Click);
            // 
            // enCubExport
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(412, 638);
            this.Controls.Add(this._serachButton);
            this.Controls.Add(this._directory);
            this.Controls.Add(this._directoryLabel);
            this.Controls.Add(this._status);
            this.Controls.Add(this._progressLabel);
            this.Controls.Add(this._progress);
            this.Controls.Add(this._log);
            this.Controls.Add(this._exportButton);
            this.Controls.Add(this._selectAll);
            this.Controls.Add(this._listView);
            this.Controls.Add(this._project);
            this.Controls.Add(this._projectLabel);
            this.Font = new System.Drawing.Font("굴림체", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "enCubExport";
            this.Text = "배포";
            ((System.ComponentModel.ISupportInitialize)(this._listView)).EndInit();
            this._status.ResumeLayout(false);
            this._status.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label _projectLabel;
        private System.Windows.Forms.TextBox _project;
        private System.Windows.Forms.DataGridView _listView;
        private System.Windows.Forms.CheckBox _selectAll;
        private System.Windows.Forms.Button _exportButton;
        private System.Windows.Forms.TextBox _log;
        private System.Windows.Forms.Label _progressLabel;
        private System.Windows.Forms.ProgressBar _progress;
        private System.Windows.Forms.StatusStrip _status;
        private System.Windows.Forms.ToolStripStatusLabel _progressStatus;
        private System.Windows.Forms.Label _directoryLabel;
        private System.Windows.Forms.TextBox _directory;
        private System.Windows.Forms.Button _serachButton;
    }
}