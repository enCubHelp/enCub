namespace Salt.enCub
{
    partial class enCubSolution
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
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(enCubSolution));
            this._listView = new System.Windows.Forms.TreeView();
            this._popupMenu = new System.Windows.Forms.ContextMenuStrip(this.components);
            this.createProjectToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.deleteProjectToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripSeparator1 = new System.Windows.Forms.ToolStripSeparator();
            this.importSourceToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.browseSourceToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.deleteSourceToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this._popupMenu.SuspendLayout();
            this.SuspendLayout();
            // 
            // _listView
            // 
            this._listView.Dock = System.Windows.Forms.DockStyle.Fill;
            this._listView.Location = new System.Drawing.Point(0, 24);
            this._listView.Name = "_listView";
            this._listView.Size = new System.Drawing.Size(243, 238);
            this._listView.TabIndex = 0;
            this._listView.AfterSelect += new System.Windows.Forms.TreeViewEventHandler(this._listView_AfterSelect);
            this._listView.DoubleClick += new System.EventHandler(this._listView_DoubleClick);
            // 
            // _popupMenu
            // 
            this._popupMenu.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.createProjectToolStripMenuItem,
            this.deleteProjectToolStripMenuItem,
            this.toolStripSeparator1,
            this.importSourceToolStripMenuItem,
            this.browseSourceToolStripMenuItem,
            this.deleteSourceToolStripMenuItem});
            this._popupMenu.Name = "_popupMenu";
            this._popupMenu.Size = new System.Drawing.Size(151, 98);
            // 
            // createProjectToolStripMenuItem
            // 
            this.createProjectToolStripMenuItem.Name = "createProjectToolStripMenuItem";
            this.createProjectToolStripMenuItem.Size = new System.Drawing.Size(150, 22);
            this.createProjectToolStripMenuItem.Text = "프로젝트 생성";
            this.createProjectToolStripMenuItem.Click += new System.EventHandler(this.createProjectToolStripMenuItem_Click);
            // 
            // deleteProjectToolStripMenuItem
            // 
            this.deleteProjectToolStripMenuItem.Name = "deleteProjectToolStripMenuItem";
            this.deleteProjectToolStripMenuItem.Size = new System.Drawing.Size(150, 22);
            this.deleteProjectToolStripMenuItem.Text = "프로젝트 삭제";
            this.deleteProjectToolStripMenuItem.Click += new System.EventHandler(this.deleteProjectToolStripMenuItem_Click);
            // 
            // toolStripSeparator1
            // 
            this.toolStripSeparator1.Name = "toolStripSeparator1";
            this.toolStripSeparator1.Size = new System.Drawing.Size(147, 6);
            // 
            // importSourceToolStripMenuItem
            // 
            this.importSourceToolStripMenuItem.Name = "importSourceToolStripMenuItem";
            this.importSourceToolStripMenuItem.Size = new System.Drawing.Size(150, 22);
            this.importSourceToolStripMenuItem.Text = "PL/SQL 수집";
            this.importSourceToolStripMenuItem.Click += new System.EventHandler(this.importSourceToolStripMenuItem_Click);
            // 
            // browseSourceToolStripMenuItem
            // 
            this.browseSourceToolStripMenuItem.Name = "browseSourceToolStripMenuItem";
            this.browseSourceToolStripMenuItem.Size = new System.Drawing.Size(150, 22);
            this.browseSourceToolStripMenuItem.Text = "PL/SQL 조회";
            this.browseSourceToolStripMenuItem.Click += new System.EventHandler(this.browseSourceToolStripMenuItem_Click);
            // 
            // deleteSourceToolStripMenuItem
            // 
            this.deleteSourceToolStripMenuItem.Name = "deleteSourceToolStripMenuItem";
            this.deleteSourceToolStripMenuItem.Size = new System.Drawing.Size(150, 22);
            this.deleteSourceToolStripMenuItem.Text = "PL/SQL 삭제";
            this.deleteSourceToolStripMenuItem.Click += new System.EventHandler(this.deleteSourceToolStripMenuItem_Click);
            // 
            // enCubSolution
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(243, 262);
            this.Controls.Add(this._listView);
            this.Font = new System.Drawing.Font("굴림체", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "enCubSolution";
            this.Padding = new System.Windows.Forms.Padding(0, 24, 0, 0);
            this._popupMenu.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.TreeView _listView;
        private System.Windows.Forms.ContextMenuStrip _popupMenu;
        private System.Windows.Forms.ToolStripMenuItem createProjectToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem deleteProjectToolStripMenuItem;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator1;
        private System.Windows.Forms.ToolStripMenuItem importSourceToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem browseSourceToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem deleteSourceToolStripMenuItem;
    }
}
