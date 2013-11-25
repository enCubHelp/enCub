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
    public partial class enCubMenu : DockContent
    {
        public enCubMenu()
        {
            InitializeComponent();
            InitializeMenu();
        }
        private void InitializeMenu()
        {
            this.StartPosition = FormStartPosition.CenterScreen;
            this.WindowState = FormWindowState.Maximized;
            SetAdministrator();
        }
        public void SetAdministrator()
        {
            this._menuTreeView.Nodes.Clear();
            TreeNode _childNode = new TreeNode("PL/SQL 관리");
            _childNode.Nodes.Add("PL/SQL 조회");
            _childNode.Nodes.Add("PL/SQL 문법분석");
            _childNode.Nodes.Add("PL/SQL 변환분석");
            _childNode.Nodes.Add("PL/SQL CRUD조회");
            _menuTreeView.Nodes.Add(_childNode);
            _childNode = new TreeNode("PL/SQL 변환관리");
            _childNode.Nodes.Add("변환결과 조회");
            _childNode.Nodes.Add("변환로그 조회");
            _childNode.Nodes.Add("JAVA  CRUD 조회");
            _menuTreeView.Nodes.Add(_childNode);
            _childNode = new TreeNode("PL변환검증");
            _childNode.Nodes.Add("변환 전/후 비교");
            _childNode.Nodes.Add("변환율 조회");
            _childNode.Nodes.Add("CRUD 비교");
            _menuTreeView.Nodes.Add(_childNode);
            _childNode = new TreeNode("변환 관리");
            _childNode.Nodes.Add("환경 관리");
            _childNode.Nodes.Add("Repository 관리");
            _childNode.Nodes.Add("사용자권한 관리");
            _childNode.Nodes.Add("변환매핑 관리");
            _menuTreeView.Nodes.Add(_childNode);
            _menuTreeView.Dock = DockStyle.Fill;
            _menuTreeView.ExpandAll();
        }
        public void SetDeveloper()
        {
            this._menuTreeView.Nodes.Clear();
            TreeNode _childNode = new TreeNode("PL/SQL 관리");
            _childNode.Nodes.Add("PL/SQL 수집");
            _childNode.Nodes.Add("PL/SQL 조회");
            _childNode.Nodes.Add("PL/SQL Parsing");
            _childNode.Nodes.Add("PL/SQL 문법분석");
            _childNode.Nodes.Add("PL/SQL 변환분석");
            _childNode.Nodes.Add("PL/SQL CRUD조회");
            _menuTreeView.Nodes.Add(_childNode);
            _childNode = new TreeNode("PL/SQL 변환관리");
            _childNode.Nodes.Add("PL/SQL 변환");
            _childNode.Nodes.Add("변환결과 조회");
            _childNode.Nodes.Add("변환로그 조회");
            _childNode.Nodes.Add("JAVA  CRUD 조회");
            _menuTreeView.Nodes.Add(_childNode);
            _childNode = new TreeNode("PL변환검증");
            _childNode.Nodes.Add("변환 전/후 비교");
            _childNode.Nodes.Add("변환율 조회");
            _childNode.Nodes.Add("CRUD 비교");
            _menuTreeView.Nodes.Add(_childNode);
            _menuTreeView.Dock = DockStyle.Fill;
            _menuTreeView.ExpandAll();
        }
        public void SetUser()
        {
            this._menuTreeView.Nodes.Clear();
            TreeNode _childNode = new TreeNode("PL/SQL 관리");
            _childNode.Nodes.Add("PL/SQL 문법분석");
            _childNode.Nodes.Add("PL/SQL 변환분석");
            _childNode.Nodes.Add("PL/SQL CRUD조회");
            _menuTreeView.Nodes.Add(_childNode);
            _childNode = new TreeNode("PL변환검증");
            _childNode.Nodes.Add("변환 전/후 비교");
            _childNode.Nodes.Add("변환율 조회");
            _childNode.Nodes.Add("CRUD 비교");
            _menuTreeView.Nodes.Add(_childNode);
            _menuTreeView.Dock = DockStyle.Fill;
            _menuTreeView.ExpandAll();
        }

        private void _menuTreeView_DoubleClick(object sender, EventArgs e)
        {
            if (this._menuTreeView.SelectedNode.Level == 1)
            {
                MessageBox.Show("Level=[" + this._menuTreeView.SelectedNode.Level + "], Text=[" + this._menuTreeView.SelectedNode.Text + "]");
            }
        }
    }
}
