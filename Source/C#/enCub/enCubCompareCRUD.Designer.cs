namespace Salt.enCub
{
    partial class enCubCompareCRUD
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(enCubCompareCRUD));
            this._projectLabel = new System.Windows.Forms.Label();
            this._project = new System.Windows.Forms.TextBox();
            this._listView = new System.Windows.Forms.DataGridView();
            this._closeButton = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this._listView)).BeginInit();
            this.SuspendLayout();
            // 
            // _projectLabel
            // 
            this._projectLabel.AutoSize = true;
            this._projectLabel.Location = new System.Drawing.Point(12, 18);
            this._projectLabel.Name = "_projectLabel";
            this._projectLabel.Size = new System.Drawing.Size(47, 12);
            this._projectLabel.TabIndex = 0;
            this._projectLabel.Text = "Project";
            // 
            // _project
            // 
            this._project.Location = new System.Drawing.Point(77, 13);
            this._project.Name = "_project";
            this._project.ReadOnly = true;
            this._project.Size = new System.Drawing.Size(656, 21);
            this._project.TabIndex = 1;
            // 
            // _listView
            // 
            this._listView.AllowUserToAddRows = false;
            this._listView.AllowUserToResizeRows = false;
            dataGridViewCellStyle1.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleCenter;
            dataGridViewCellStyle1.BackColor = System.Drawing.SystemColors.Control;
            dataGridViewCellStyle1.Font = new System.Drawing.Font("굴림체", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            dataGridViewCellStyle1.ForeColor = System.Drawing.SystemColors.WindowText;
            dataGridViewCellStyle1.SelectionBackColor = System.Drawing.SystemColors.Highlight;
            dataGridViewCellStyle1.SelectionForeColor = System.Drawing.SystemColors.HighlightText;
            dataGridViewCellStyle1.WrapMode = System.Windows.Forms.DataGridViewTriState.True;
            this._listView.ColumnHeadersDefaultCellStyle = dataGridViewCellStyle1;
            this._listView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this._listView.Location = new System.Drawing.Point(12, 40);
            this._listView.Name = "_listView";
            this._listView.RowHeadersVisible = false;
            this._listView.RowTemplate.Height = 23;
            this._listView.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this._listView.Size = new System.Drawing.Size(721, 392);
            this._listView.TabIndex = 2;
            // 
            // _closeButton
            // 
            this._closeButton.Location = new System.Drawing.Point(658, 438);
            this._closeButton.Name = "_closeButton";
            this._closeButton.Size = new System.Drawing.Size(75, 23);
            this._closeButton.TabIndex = 3;
            this._closeButton.Text = "닫기";
            this._closeButton.UseVisualStyleBackColor = true;
            this._closeButton.Click += new System.EventHandler(this._closeButton_Click);
            // 
            // enCubCompareCRUD
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(745, 472);
            this.Controls.Add(this._closeButton);
            this.Controls.Add(this._listView);
            this.Controls.Add(this._project);
            this.Controls.Add(this._projectLabel);
            this.Font = new System.Drawing.Font("굴림체", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "enCubCompareCRUD";
            this.Text = "PL/SQL과 Java CRUD 조회";
            ((System.ComponentModel.ISupportInitialize)(this._listView)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label _projectLabel;
        private System.Windows.Forms.TextBox _project;
        private System.Windows.Forms.DataGridView _listView;
        private System.Windows.Forms.Button _closeButton;
    }
}