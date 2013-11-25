namespace Common.Control
{
    partial class CompareDoc
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
            this._splitContainer = new System.Windows.Forms.SplitContainer();
            this._source = new System.Windows.Forms.RichTextBox();
            this._target = new System.Windows.Forms.RichTextBox();
            ((System.ComponentModel.ISupportInitialize)(this._splitContainer)).BeginInit();
            this._splitContainer.Panel1.SuspendLayout();
            this._splitContainer.Panel2.SuspendLayout();
            this._splitContainer.SuspendLayout();
            this.SuspendLayout();
            // 
            // _splitContainer
            // 
            this._splitContainer.Dock = System.Windows.Forms.DockStyle.Fill;
            this._splitContainer.Location = new System.Drawing.Point(0, 0);
            this._splitContainer.Name = "_splitContainer";
            // 
            // _splitContainer.Panel1
            // 
            this._splitContainer.Panel1.Controls.Add(this._source);
            // 
            // _splitContainer.Panel2
            // 
            this._splitContainer.Panel2.Controls.Add(this._target);
            this._splitContainer.Size = new System.Drawing.Size(284, 262);
            this._splitContainer.SplitterDistance = 144;
            this._splitContainer.TabIndex = 0;
            // 
            // _source
            // 
            this._source.Dock = System.Windows.Forms.DockStyle.Fill;
            this._source.Location = new System.Drawing.Point(0, 0);
            this._source.Name = "_source";
            this._source.Size = new System.Drawing.Size(144, 262);
            this._source.TabIndex = 1;
            this._source.Text = "";
            // 
            // _target
            // 
            this._target.Dock = System.Windows.Forms.DockStyle.Fill;
            this._target.Location = new System.Drawing.Point(0, 0);
            this._target.Name = "_target";
            this._target.Size = new System.Drawing.Size(136, 262);
            this._target.TabIndex = 2;
            this._target.Text = "";
            // 
            // CompareDoc
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(284, 262);
            this.Controls.Add(this._splitContainer);
            this.Font = new System.Drawing.Font("굴림체", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.Name = "CompareDoc";
            this._splitContainer.Panel1.ResumeLayout(false);
            this._splitContainer.Panel2.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this._splitContainer)).EndInit();
            this._splitContainer.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.SplitContainer _splitContainer;
        private System.Windows.Forms.RichTextBox _source;
        private System.Windows.Forms.RichTextBox _target;
    }
}
