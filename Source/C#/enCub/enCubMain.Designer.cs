﻿namespace Salt.enCub
{
    partial class enCubMain
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
            this._sourceLists = new System.Windows.Forms.TreeView();
            this.SuspendLayout();
            // 
            // _sourceLists
            // 
            this._sourceLists.Dock = System.Windows.Forms.DockStyle.Fill;
            this._sourceLists.Location = new System.Drawing.Point(0, 0);
            this._sourceLists.Name = "_sourceLists";
            this._sourceLists.Size = new System.Drawing.Size(226, 159);
            this._sourceLists.TabIndex = 0;
            // 
            // enCubMain
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(226, 159);
            this.Controls.Add(this._sourceLists);
            this.Font = new System.Drawing.Font("굴림체", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.Name = "enCubMain";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.TreeView _sourceLists;

    }
}
