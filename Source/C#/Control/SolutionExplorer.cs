using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Common.Control
{
    public partial class SolutionExplorer : ToolWindow
    {
        public SolutionExplorer()
        {
            InitializeComponent();
        }
        private void SolutionExplorer_RightToLeftLayoutChanged(object sender, EventArgs e)
        {
            this._listView.RightToLeftLayout = RightToLeftLayout;
        }
    }
}
