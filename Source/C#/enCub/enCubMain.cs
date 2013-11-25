using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using WeifenLuo.WinFormsUI.Docking;

namespace Salt.enCub
{
    public partial class enCubMain : DockContent
    {
        public enCubMain()
        {
            InitializeComponent();
            InitializeMenu();
        }
        public void InitializeMenu()
        {
            this._sourceLists.Nodes.Add("111111");
            this._sourceLists.Nodes.Add("222222");
            this._sourceLists.Nodes.Add("333333");
            this._sourceLists.Nodes.Add("444444");
            this._sourceLists.Nodes.Add("555555");
            this._sourceLists.Nodes.Add("666666");
            this._sourceLists.Nodes.Add("777777");
            this._sourceLists.Nodes.Add("888888");
        }
    }
}
