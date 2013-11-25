namespace Salt.enCub
{
    partial class enCubImportFile
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(enCubImportFile));
            this._file = new System.Windows.Forms.TextBox();
            this._icon = new System.Windows.Forms.ComboBox();
            this._directoryView = new System.Windows.Forms.TreeView();
            this._selectAll = new System.Windows.Forms.CheckBox();
            this._cancelButton = new System.Windows.Forms.Button();
            this._confirmButton = new System.Windows.Forms.Button();
            this._fileView = new System.Windows.Forms.ListView();
            this.SuspendLayout();
            // 
            // _file
            // 
            this._file.Location = new System.Drawing.Point(12, 12);
            this._file.Name = "_file";
            this._file.Size = new System.Drawing.Size(433, 21);
            this._file.TabIndex = 0;
            // 
            // _icon
            // 
            this._icon.FormattingEnabled = true;
            this._icon.Location = new System.Drawing.Point(451, 13);
            this._icon.Name = "_icon";
            this._icon.Size = new System.Drawing.Size(96, 20);
            this._icon.TabIndex = 1;
            this._icon.SelectedIndexChanged += new System.EventHandler(this._icon_SelectedIndexChanged);
            // 
            // _directoryView
            // 
            this._directoryView.Location = new System.Drawing.Point(12, 39);
            this._directoryView.Name = "_directoryView";
            this._directoryView.Size = new System.Drawing.Size(172, 476);
            this._directoryView.TabIndex = 2;
            this._directoryView.AfterSelect += new System.Windows.Forms.TreeViewEventHandler(this._directoryView_AfterSelect);
            // 
            // _selectAll
            // 
            this._selectAll.AutoSize = true;
            this._selectAll.Location = new System.Drawing.Point(190, 526);
            this._selectAll.Name = "_selectAll";
            this._selectAll.Size = new System.Drawing.Size(72, 16);
            this._selectAll.TabIndex = 4;
            this._selectAll.Text = "전체선택";
            this._selectAll.UseVisualStyleBackColor = true;
            this._selectAll.CheckedChanged += new System.EventHandler(this._selectAll_CheckedChanged);
            // 
            // _cancelButton
            // 
            this._cancelButton.Location = new System.Drawing.Point(472, 521);
            this._cancelButton.Name = "_cancelButton";
            this._cancelButton.Size = new System.Drawing.Size(75, 23);
            this._cancelButton.TabIndex = 5;
            this._cancelButton.Text = "취소";
            this._cancelButton.UseVisualStyleBackColor = true;
            this._cancelButton.Click += new System.EventHandler(this._cancelButton_Click);
            // 
            // _confirmButton
            // 
            this._confirmButton.Location = new System.Drawing.Point(391, 521);
            this._confirmButton.Name = "_confirmButton";
            this._confirmButton.Size = new System.Drawing.Size(75, 23);
            this._confirmButton.TabIndex = 6;
            this._confirmButton.Text = "확인";
            this._confirmButton.UseVisualStyleBackColor = true;
            this._confirmButton.Click += new System.EventHandler(this._confirmButton_Click);
            // 
            // _fileView
            // 
            this._fileView.Location = new System.Drawing.Point(190, 39);
            this._fileView.Name = "_fileView";
            this._fileView.Size = new System.Drawing.Size(360, 476);
            this._fileView.TabIndex = 7;
            this._fileView.UseCompatibleStateImageBehavior = false;
            // 
            // enCubImportFile
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(562, 553);
            this.Controls.Add(this._fileView);
            this.Controls.Add(this._confirmButton);
            this.Controls.Add(this._cancelButton);
            this.Controls.Add(this._selectAll);
            this.Controls.Add(this._directoryView);
            this.Controls.Add(this._icon);
            this.Controls.Add(this._file);
            this.Font = new System.Drawing.Font("굴림체", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "enCubImportFile";
            this.Text = "PL/SQL 수집";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox _file;
        private System.Windows.Forms.ComboBox _icon;
        private System.Windows.Forms.TreeView _directoryView;
        private System.Windows.Forms.CheckBox _selectAll;
        private System.Windows.Forms.Button _cancelButton;
        private System.Windows.Forms.Button _confirmButton;
        private System.Windows.Forms.ListView _fileView;
    }
}