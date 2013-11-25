using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using WeifenLuo.WinFormsUI.Docking;
using System.IO;

namespace Salt.enCub
{
    public partial class enCubForm : Form
    {
        private DeserializeDockContent _deserializeDockContent = null;
        private enCubSolution _solutionExplorer = null;

        private enCubMenu _menu = new enCubMenu();
        
        public enCubForm()
        {
            InitializeComponent();
            InitializeMenu();
        }
        private void InitializeMenu()
        {
            this.StartPosition = FormStartPosition.CenterScreen;

            CreateMenuControls();

            showRightToLeft.Checked = (RightToLeft == RightToLeft.Yes);
            RightToLeftLayout = showRightToLeft.Checked;
            _deserializeDockContent = new DeserializeDockContent(GetContentFromPersistString);

            _dockPanel.SuspendLayout(true);

            _solutionExplorer.Text = "Project";
            _solutionExplorer.Dock = DockStyle.Fill;
            _solutionExplorer.Show(_dockPanel, DockState.DockLeft);

            _menu.Text = "Menu";
            _menu.Dock = DockStyle.Fill;
            _menu.Show(_dockPanel, DockState.DockRight);

            _dockPanel.ResumeLayout(true, true);

            Common.Delegate.Delegate.ReadProject = new Common.Delegate.Delegate.ReadProjectAll(ReadProject);
        }
        public void ReadProject()
        {
            if (this._solutionExplorer.InvokeRequired)
            {
                Common.Delegate.Delegate.ReadProject = new Common.Delegate.Delegate.ReadProjectAll(ReadProject);
                this.Invoke(Common.Delegate.Delegate.ReadProject);
            }
            else
            {
                _solutionExplorer.ReadProject();
            }

        }
        public void CreateMenuControls()
        {
            Common.Delegate.Delegate.NewDocument = new Common.Delegate.Delegate.CreateNewDocument(CreateNewDocument);
            _solutionExplorer = new enCubSolution();
        }
        private IDockContent FindDocument(string text)
        {
            if (_dockPanel.DocumentStyle == DocumentStyle.SystemMdi)
            {
                foreach (Form _form in MdiChildren)
                {
                    if (_form.Text == text)
                    {
                        _form.Focus();
                        return _form as IDockContent;
                    }
                }
                return null;
            }
            else
            {
                foreach (IDockContent _content in _dockPanel.Documents)
                {
                    if (_content.DockHandler.TabText == text)
                    {
                        _content.DockHandler.Form.Focus();
                        return _content;
                    }
                }
                return null;
            }
        }
        public void CreateNewDocument(String parmProject, String parmPLSQL)
        {
            if (FindDocument(parmPLSQL) == null)
            {
                enCubDoc _doc = new enCubDoc();
                _doc.SetDocument(parmProject, parmPLSQL);
                _doc.Show(_dockPanel, DockState.Document);
                _dockPanel.ResumeLayout(true, true);
            }
        }
        public void CloseMenuControls()
        {
            _solutionExplorer = null;
        }
        private IDockContent GetContentFromPersistString(String persistString)
        {
            if (persistString == typeof(enCubSolution).ToString())
            {
                return _solutionExplorer;
            }
            else
            {
                String[] parsedStrings = persistString.Split(new char[] { ',' });
                if (parsedStrings.Length != 3)
                {
                    return null;
                }

                if (parsedStrings[0] != typeof(enCubDoc).ToString())
                {
                    return null;
                }

                enCubDoc _doc = new enCubDoc();
                if (parsedStrings[1] != String.Empty)
                {
                    _doc._project = parsedStrings[1];
                }
                if (parsedStrings[2] != String.Empty)
                {
                    _doc.Text = parsedStrings[2];
                }
                return _doc;
            }
        }

        private void ExitToolsStripMenuItem_Click(object sender, EventArgs e)
        {
            this.Close();
        }
 
        private void ToolBarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            toolStrip.Visible = toolBarToolStripMenuItem.Checked;
        }

        private void StatusBarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            statusStrip.Visible = statusBarToolStripMenuItem.Checked;
        }

        private void aboutToolStripMenuItem_Click(object sender, EventArgs e)
        {
            enCubAbout _aboutForm = new enCubAbout();
            _aboutForm.ShowDialog();
        }

        private void 환경관리CToolStripMenuItem_Click(object sender, EventArgs e)
        {
            enCubConfigForm _config = new enCubConfigForm();
            _config.ShowDialog();
        }

        private void repository관리RToolStripMenuItem_Click(object sender, EventArgs e)
        {
            enCubRepositoryForm _repository = new enCubRepositoryForm();
            _repository.ShowDialog();
        }

        private void 사용자권한관리UToolStripMenuItem_Click(object sender, EventArgs e)
        {
            enCubUserForm _user = new enCubUserForm();
            _user.ShowDialog();
        }

        private void enCubForm_Load(object sender, EventArgs e)
        {
            ////////////this.변환로그조회LToolStripMenuItem.Visible = false;
            ////////////this.jAVACRUD조회MToolStripMenuItem.Visible = false;
            this.변환매핑관리MToolStripMenuItem.Visible = false;
            //////변환검증VToolStripMenuItem.Visible = false;
            this.변환전후비교CToolStripMenuItem.Visible = false;
            this.변환율조회RToolStripMenuItem.Visible = false;
            ////////////enCubLogin _login = new enCubLogin();
            ////////////if (_login.ShowDialog() == DialogResult.OK)
            ////////////{
            ////////////    ///Administrator, Developer, User
            ////////////    if (Common.Config.User.GetAuthority().Equals("Administrator"))
            ////////////    {
            ////////////        this.pLSQL수집IToolStripMenuItem.Visible = false;ssss
            ////////////        this.pLSQL변환CToolStripMenuItem.Visible = false;
            ////////////        _menu.SetAdministrator();
            ////////////    }
            ////////////    else if (Common.Config.User.GetAuthority().Equals("Developer"))
            ////////////    {
            ////////////        this.변환관리CToolStripMenuItem.Visible = true;
            ////////////        this.변환매핑관리MToolStripMenuItem.Visible = false;ss
            ////////////        _menu.SetDeveloper();
            ////////////    }
            ////////////    else
            ////////////    {
            ////////////        this.변환관리CToolStripMenuItem.Visible = false;
            ////////////        this.pLSQL변환CToolStripMenuItem.Visible = false;
            ////////////        _menu.SetUser();
            ////////////    }
            ////////////}
            ////////////else
            ////////////{
            ////////////    this.Close();
            ////////////}
        }

        private void pLSQL수집IToolStripMenuItem_Click(object sender, EventArgs e)
        {
            this._solutionExplorer.ImportSource();
        }

        private void pLSQL조회BToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (this._solutionExplorer.GetProject() == null ||
                this._solutionExplorer.GetProject().Equals(""))
            {
                MessageBox.Show("Project를 선택하십시오.");
            }
            else if (this._solutionExplorer.GetPLSQL() == null ||
                     this._solutionExplorer.GetPLSQL().Equals(""))
            {
                MessageBox.Show("PLSQL을 선택하십시오.");
            }
            else
            {
                Common.Delegate.Delegate.NewDocument(this._solutionExplorer.GetProject(), this._solutionExplorer.GetPLSQL());
            }
        }
        private void pLSQL변환CToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (this._solutionExplorer.GetProject() == null ||
                this._solutionExplorer.GetProject().Equals(""))
            {
                MessageBox.Show("Project를 선택하십시오.");
            }
            else
            {
                enCubList _list = new enCubList();
                _list.SetProject(this._solutionExplorer.GetProject());
                _list.SetActionType("Convert");
                _list.ShowDialog();
            }
        }
        private void 변환결과조회BToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (this._solutionExplorer.GetProject() == null ||
                this._solutionExplorer.GetProject().Equals(""))
            {
                MessageBox.Show("Project를 선택하십시오.");
            }
            else
            {
                enCubConversionLogDetail _log = new enCubConversionLogDetail();
                _log.SetProject(this._solutionExplorer.GetProject());
                _log.ShowDialog();
            }
        }
        private void 변환로그조회LToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (this._solutionExplorer.GetProject() == null ||
                this._solutionExplorer.GetProject().Equals(""))
            {
                MessageBox.Show("Project를 선택하십시오.");
            }
            else
            {
                enCubConversionLog _log = new enCubConversionLog();
                _log.SetProject(this._solutionExplorer.GetProject());
                _log.ShowDialog();
            }
        }

        private void jAVACRUD조회MToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (this._solutionExplorer.GetProject() == null ||
                this._solutionExplorer.GetProject().Equals(""))
            {
                MessageBox.Show("Project를 선택하십시오.");
            }
            else
            {
                enCubJAVACRUD _javaCRUD = new enCubJAVACRUD();
                _javaCRUD.SetProject(this._solutionExplorer.GetProject());
                _javaCRUD.ShowDialog();
            }
        }

        private void 변환율조회RToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MessageBox.Show("개발중입니다.");
            //////////if (this._solutionExplorer.GetProject() == null ||
            //////////    this._solutionExplorer.GetProject().Equals(""))
            //////////{
            //////////    MessageBox.Show("Project를 선택하십시오.");
            //////////}
            //////////else
            //////////{
            //////////    enCubConversionRate _conversionRate = new enCubConversionRate();
            //////////    _conversionRate.SetProject(this._solutionExplorer.GetProject());
            //////////    _conversionRate.ShowDialog();
            //////////}
        }

        private void cRUD비교MToolStripMenuItem_Click(object sender, EventArgs e)
        {
            //////////MessageBox.Show("개발중입니다.");
            if (this._solutionExplorer.GetProject() == null ||
                this._solutionExplorer.GetProject().Equals(""))
            {
                MessageBox.Show("Project를 선택하십시오.");
            }
            else
            {
                enCubCompareCRUD _compareCRUD = new enCubCompareCRUD();
                _compareCRUD.SetProject(this._solutionExplorer.GetProject());
                _compareCRUD.ShowDialog();
            }
        }

        private void 변환전후비교CToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MessageBox.Show("개발중입니다.");
        }

        private void projectCreateToolStripMenuItem_Click(object sender, EventArgs e)
        {
            enCubProject _project = new enCubProject();
            _project.ShowDialog();
        }

        private void projectDeleteToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (this._solutionExplorer.GetProject() == null ||
                this._solutionExplorer.GetProject().Equals(""))
            {
                MessageBox.Show("Project를 선택하십시오.");
            }
            else
            {
                enCubProject _project = new enCubProject();
                _project.SetExecuteType("DELETE");
                _project.SetProject(this._solutionExplorer.GetProject());
                _project.ShowDialog();
            }
        }
        private void pLSQLParsingToolStripMenuItem1_Click(object sender, EventArgs e)
        {
            if (this._solutionExplorer.GetProject() == null ||
                this._solutionExplorer.GetProject().Equals(""))
            {
                MessageBox.Show("Project를 선택하십시오.");
            }
            else
            {
                enCubList _list = new enCubList();
                _list.SetProject(this._solutionExplorer.GetProject());
                _list.SetActionType("Parse");
                _list.ShowDialog();
            }
        }
        private void parsingResultToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (this._solutionExplorer.GetProject() == null ||
                this._solutionExplorer.GetProject().Equals(""))
            {
                MessageBox.Show("Project를 선택하십시오.");
            }
            else
            {
                enCubSyntax _syntax = new enCubSyntax();
                _syntax.SetProject(this._solutionExplorer.GetProject());
                _syntax.ShowDialog();
            }
        }

        private void parsingErrorToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (this._solutionExplorer.GetProject() == null ||
                this._solutionExplorer.GetProject().Equals(""))
            {
                MessageBox.Show("Project를 선택하십시오.");
            }
            else
            {
                enCubAnalyzeParsing _analyze = new enCubAnalyzeParsing();
                _analyze.ReadProject(this._solutionExplorer.GetProject(), this._solutionExplorer.GetPLSQL());
                _analyze.ShowDialog();
            }
        }

        private void pLSQLSyntaxToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (this._solutionExplorer.GetProject() == null ||
                this._solutionExplorer.GetProject().Equals(""))
            {
                MessageBox.Show("Project를 선택하십시오.");
            }
            else if (this._solutionExplorer.GetPLSQL() == null ||
                     this._solutionExplorer.GetPLSQL().Equals(""))
            {
                MessageBox.Show("PLSQL을 선택하십시오.");
            }
            else
            {
                enCubDisplayParsing _analyze = new enCubDisplayParsing();
                _analyze.ReadProject(this._solutionExplorer.GetProject(), this._solutionExplorer.GetPLSQL());
                _analyze.ShowDialog();
            }
        }

        private void pLSQLTokenToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (this._solutionExplorer.GetProject() == null ||
                this._solutionExplorer.GetProject().Equals(""))
            {
                MessageBox.Show("Project를 선택하십시오.");
            }
            else if (this._solutionExplorer.GetPLSQL() == null ||
                     this._solutionExplorer.GetPLSQL().Equals(""))
            {
                MessageBox.Show("PLSQL을 선택하십시오.");
            }
            else
            {
                enCubTokenTable _token = new enCubTokenTable();
                _token.ReadToken(this._solutionExplorer.GetProject(), this._solutionExplorer.GetPLSQL());
                _token.ShowDialog();
            }
        }

        private void pLSQLCRUDToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (this._solutionExplorer.GetProject() == null ||
                this._solutionExplorer.GetProject().Equals(""))
            {
                MessageBox.Show("Project를 선택하십시오.");
            }
            else
            {
                enCubPLSQLCRUD _plsqlCRUD = new enCubPLSQLCRUD();
                _plsqlCRUD.SetProject(this._solutionExplorer.GetProject());
                _plsqlCRUD.ShowDialog();
            }
        }

        private void 배포EToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (this._solutionExplorer.GetProject() == null ||
                this._solutionExplorer.GetProject().Equals(""))
            {
                MessageBox.Show("Project를 선택하십시오.");
            }
            else
            {
                enCubExport _export = new enCubExport();
                _export.SetProject(this._solutionExplorer.GetProject());
                _export.ShowDialog();
            }
        }

        private void targetDBMS설정TToolStripMenuItem_Click(object sender, EventArgs e)
        {
            enCubTargetDBMSForm _config = new enCubTargetDBMSForm();
            _config.ShowDialog();
        }

        private void loadJavaJToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (this._solutionExplorer.GetProject() == null ||
                this._solutionExplorer.GetProject().Equals(""))
            {
                MessageBox.Show("Project를 선택하십시오.");
            }
            else
            {
                enCubList _list = new enCubList();
                _list.SetProject(this._solutionExplorer.GetProject());
                _list.SetActionType("LoadJava");
                _list.ShowDialog();
            }
        }
    }
}
