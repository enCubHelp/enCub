namespace Salt.enCub
{
    partial class enCubAbout
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(enCubAbout));
            this.label2 = new System.Windows.Forms.Label();
            this._buttonOK = new System.Windows.Forms.Button();
            this._enCubVersionText = new System.Windows.Forms.Label();
            this._saltImage = new System.Windows.Forms.PictureBox();
            ((System.ComponentModel.ISupportInitialize)(this._saltImage)).BeginInit();
            this.SuspendLayout();
            // 
            // label2
            // 
            this.label2.BackColor = System.Drawing.Color.Transparent;
            this.label2.Location = new System.Drawing.Point(24, 84);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(339, 22);
            this.label2.TabIndex = 8;
            this.label2.Text = "COPYRIGHT © 2013 Saltware Co., Ltd. All Rights Reserved";
            // 
            // _buttonOK
            // 
            this._buttonOK.DialogResult = System.Windows.Forms.DialogResult.Cancel;
            this._buttonOK.Location = new System.Drawing.Point(151, 109);
            this._buttonOK.Name = "_buttonOK";
            this._buttonOK.Size = new System.Drawing.Size(75, 23);
            this._buttonOK.TabIndex = 6;
            this._buttonOK.Text = "OK";
            // 
            // _enCubVersionText
            // 
            this._enCubVersionText.AutoSize = true;
            this._enCubVersionText.BackColor = System.Drawing.Color.Transparent;
            this._enCubVersionText.Location = new System.Drawing.Point(24, 46);
            this._enCubVersionText.Name = "_enCubVersionText";
            this._enCubVersionText.Size = new System.Drawing.Size(113, 12);
            this._enCubVersionText.TabIndex = 9;
            this._enCubVersionText.Text = "enCub Version: 0.1";
            // 
            // _saltImage
            // 
            this._saltImage.BackColor = System.Drawing.Color.Transparent;
            this._saltImage.BackgroundImage = global::Salt.enCub.Properties.Resources.Saltware_logo;
            this._saltImage.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Center;
            this._saltImage.ErrorImage = global::Salt.enCub.Properties.Resources.Saltware_logo;
            this._saltImage.Image = global::Salt.enCub.Properties.Resources.Saltware_logo;
            this._saltImage.InitialImage = global::Salt.enCub.Properties.Resources.Saltware_logo;
            this._saltImage.Location = new System.Drawing.Point(239, 16);
            this._saltImage.Name = "_saltImage";
            this._saltImage.Size = new System.Drawing.Size(116, 50);
            this._saltImage.TabIndex = 10;
            this._saltImage.TabStop = false;
            // 
            // enCubAbout
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.None;
            this.ClientSize = new System.Drawing.Size(375, 142);
            this.Controls.Add(this._saltImage);
            this.Controls.Add(this._enCubVersionText);
            this.Controls.Add(this.label2);
            this.Controls.Add(this._buttonOK);
            this.Font = new System.Drawing.Font("굴림체", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(129)));
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "enCubAbout";
            this.Text = "About";
            ((System.ComponentModel.ISupportInitialize)(this._saltImage)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button _buttonOK;
        private System.Windows.Forms.Label _enCubVersionText;
        private System.Windows.Forms.PictureBox _saltImage;
    }
}