using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace Salt.enCub
{
    public partial class enCubAbout : Form
    {
        public enCubAbout()
        {
            InitializeComponent();
            InitializeMenu();
        }
        public void InitializeMenu()
        {
            this.StartPosition = FormStartPosition.CenterScreen;
        }
    }
}
