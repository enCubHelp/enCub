namespace Salt.enCub
{
    partial class enCubTokenTable
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
            this._project = new System.Windows.Forms.TextBox();
            this._projectLabel = new System.Windows.Forms.Label();
            this._PLSQL = new System.Windows.Forms.TextBox();
            this._PLSQLLabel = new System.Windows.Forms.Label();
            this._closeButton = new System.Windows.Forms.Button();
            this._listView = new System.Windows.Forms.DataGridView();
            ((System.ComponentModel.ISupportInitialize)(this._listView)).BeginInit();
            this.SuspendLayout();
            // 
            // _project
            // 
            this._project.Location = new System.Drawing.Point(64, 12);
            this._project.Name = "_project";
            this._project.ReadOnly = true;
            this._project.Size = new System.Drawing.Size(334, 21);
            this._project.TabIndex = 3;
            // 
            // _projectLabel
            // 
            this._projectLabel.AutoSize = true;
            this._projectLabel.Location = new System.Drawing.Point(8, 17);
            this._projectLabel.Name = "_projectLabel";
            this._projectLabel.Size = new System.Drawing.Size(44, 12);
            this._projectLabel.TabIndex = 2;
            this._projectLabel.Text = "Project";
            // 
            // _PLSQL
            // 
            this._PLSQL.Location = new System.Drawing.Point(64, 39);
            this._PLSQL.Name = "_PLSQL";
            this._PLSQL.ReadOnly = true;
            this._PLSQL.Size = new System.Drawing.Size(334, 21);
            this._PLSQL.TabIndex = 5;
            // 
            // _PLSQLLabel
            // 
            this._PLSQLLabel.AutoSize = true;
            this._PLSQLLabel.Location = new System.Drawing.Point(8, 44);
            this._PLSQLLabel.Name = "_PLSQLLabel";
            this._PLSQLLabel.Size = new System.Drawing.Size(44, 12);
            this._PLSQLLabel.TabIndex = 4;
            this._PLSQLLabel.Text = "PLSQL";
            // 
            // _closeButton
            // 
            this._closeButton.Location = new System.Drawing.Point(323, 402);
            this._closeButton.Name = "_closeButton";
            this._closeButton.Size = new System.Drawing.Size(75, 23);
            this._closeButton.TabIndex = 7;
            this._closeButton.Text = "닫기";
            this._closeButton.UseVisualStyleBackColor = true;
            this._closeButton.Click += new System.EventHandler(this._closeButton_Click);
            // 
            // _listView
            // 
            this._listView.AllowUserToAddRows = false;
            this._listView.AllowUserToDeleteRows = false;
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
            this._listView.Location = new System.Drawing.Point(10, 66);
            this._listView.Name = "_listView";
            this._listView.RowHeadersVisible = false;
            this._listView.RowTemplate.Height = 23;
            this._listView.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this._listView.Size = new System.Drawing.Size(388, 330);
            this._listView.TabIndex = 6;
            // 
            // enCubTokenTable
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(410, 434);
            this.Controls.Add(this._closeButton);
            this.Controls.Add(this._listView);
            this.Controls.Add(this._PLSQL);
            this.Controls.Add(this._PLSQLLabel);
            this.Controls.Add(this._project);
            this.Controls.Add(this._projectLabel);
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "enCubTokenTable";
            this.Text = "토큰조회";
            ((System.ComponentModel.ISupportInitialize)(this._listView)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox _project;
        private System.Windows.Forms.Label _projectLabel;
        private System.Windows.Forms.TextBox _PLSQL;
        private System.Windows.Forms.Label _PLSQLLabel;
        private System.Windows.Forms.Button _closeButton;
        private System.Windows.Forms.DataGridView _listView;
    }
}