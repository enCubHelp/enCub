namespace Salt.enCub
{
    partial class enCubMenu
    {
        /// <summary> 
        /// 필수 디자이너 변수입니다.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary> 
        /// 사용 중인 모든 리소스를 정리합니다.
        /// </summary>
        /// <param name="disposing">관리되는 리소스를 삭제해야 하면 true이고, 그렇지 않으면 false입니다.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region 구성 요소 디자이너에서 생성한 코드

        /// <summary> 
        /// 디자이너 지원에 필요한 메서드입니다. 
        /// 이 메서드의 내용을 코드 편집기로 수정하지 마십시오.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(enCubMenu));
            this.splitContainer1 = new System.Windows.Forms.SplitContainer();
            this._menuTreeView = new System.Windows.Forms.TreeView();
            this._companyBox = new System.Windows.Forms.PictureBox();
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer1)).BeginInit();
            this.splitContainer1.Panel1.SuspendLayout();
            this.splitContainer1.Panel2.SuspendLayout();
            this.splitContainer1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this._companyBox)).BeginInit();
            this.SuspendLayout();
            // 
            // splitContainer1
            // 
            this.splitContainer1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer1.Location = new System.Drawing.Point(0, 24);
            this.splitContainer1.Name = "splitContainer1";
            this.splitContainer1.Orientation = System.Windows.Forms.Orientation.Horizontal;
            // 
            // splitContainer1.Panel1
            // 
            this.splitContainer1.Panel1.Controls.Add(this._menuTreeView);
            // 
            // splitContainer1.Panel2
            // 
            this.splitContainer1.Panel2.Controls.Add(this._companyBox);
            this.splitContainer1.Size = new System.Drawing.Size(249, 455);
            this.splitContainer1.SplitterDistance = 406;
            this.splitContainer1.TabIndex = 0;
            // 
            // _menuTreeView
            // 
            this._menuTreeView.Dock = System.Windows.Forms.DockStyle.Bottom;
            this._menuTreeView.Location = new System.Drawing.Point(0, 13);
            this._menuTreeView.Name = "_menuTreeView";
            this._menuTreeView.Size = new System.Drawing.Size(249, 393);
            this._menuTreeView.TabIndex = 0;
            this._menuTreeView.DoubleClick += new System.EventHandler(this._menuTreeView_DoubleClick);
            // 
            // _companyBox
            // 
            this._companyBox.Dock = System.Windows.Forms.DockStyle.Fill;
            this._companyBox.Image = global::Salt.enCub.Properties.Resources.Saltware_logo;
            this._companyBox.Location = new System.Drawing.Point(0, 0);
            this._companyBox.Name = "_companyBox";
            this._companyBox.Size = new System.Drawing.Size(249, 45);
            this._companyBox.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this._companyBox.TabIndex = 0;
            this._companyBox.TabStop = false;
            // 
            // enCubMenu
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(249, 480);
            this.Controls.Add(this.splitContainer1);
            this.Font = new System.Drawing.Font("굴림체", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "enCubMenu";
            this.Padding = new System.Windows.Forms.Padding(0, 24, 0, 1);
            this.splitContainer1.Panel1.ResumeLayout(false);
            this.splitContainer1.Panel2.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer1)).EndInit();
            this.splitContainer1.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this._companyBox)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.SplitContainer splitContainer1;
        private System.Windows.Forms.PictureBox _companyBox;
        private System.Windows.Forms.TreeView _menuTreeView;

    }
}
