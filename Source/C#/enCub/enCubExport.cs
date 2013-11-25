using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Diagnostics;
using System.IO;

namespace Salt.enCub
{
    public partial class enCubExport : Form
    {
        private bool _isCheckedBox = false;
        private BackgroundWorker _worker = new BackgroundWorker();
        private int _selectCnt = 0;
        private String _actionType = "Export";
        public enCubExport()
        {
            InitializeComponent();
            InitializeMenu();
        }
        private void InitializeMenu()
        {
            this.StartPosition = FormStartPosition.CenterScreen;
            this.AcceptButton = this._exportButton;
        }
        public void SetProject(String parmProject)
        {
            this._project.Text = parmProject;
            ReadProject();
        }
        public void ReadProject()
        {
            DataTable _listTable = new DataTable();
            _listTable.Columns.Add("PROJECT");
            _listTable.Columns.Add("PL/SQL");

            ProcessStartInfo _start = new ProcessStartInfo();
            _start.FileName = "java";
            _start.UseShellExecute = false;
            _start.RedirectStandardOutput = true;
            _start.RedirectStandardError = true;
            _start.WindowStyle = ProcessWindowStyle.Hidden;
            _start.CreateNoWindow = true;
            _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.PLSQL SELECT DISTINCT \"" + this._project.Text + "\" \"\"";
            using (Process _process = Process.Start(_start))
            {
                using (StreamReader reader = _process.StandardOutput)
                {
                    String _result = reader.ReadLine();
                    while (_result != null)
                    {
                        String[] _readColumn = _result.Split('=');
                        if (_readColumn[0].Equals("Project"))
                        {
                            _listTable.Rows.Add(_readColumn[1]);
                        }
                        else if (_readColumn[0].Equals("PLSQL"))
                        {
                            _listTable.Rows[_listTable.Rows.Count - 1][1] = _readColumn[1];
                        }
                        _result = reader.ReadLine();
                    }
                }
                using (StreamReader reader = _process.StandardError)
                {
                    String _result = reader.ReadLine();
                    while (_result != null)
                    {
                        MessageBox.Show(_result);
                        _result = reader.ReadLine();
                    }
                }
            }
            this._listView.DataSource = _listTable;
            if (!_isCheckedBox)
            {
                DataGridViewCheckBoxColumn _checkBox = new DataGridViewCheckBoxColumn();
                _checkBox.HeaderText = "Select";
                _checkBox.Name = "check";
                this._listView.Columns.Insert(0, _checkBox);
                _isCheckedBox = true;
            }
            this._listView.Columns[0].AutoSizeMode = DataGridViewAutoSizeColumnMode.DisplayedCells;
            this._listView.Columns[1].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
            this._listView.Columns[2].AutoSizeMode = DataGridViewAutoSizeColumnMode.Fill;
        }

        private void _selectAll_CheckedChanged(object sender, EventArgs e)
        {
            if (((CheckBox)sender).Checked)
            {
                for (int _rowIndex = 0; _rowIndex < this._listView.Rows.Count; _rowIndex++)
                {
                    this._listView.Rows[_rowIndex].Cells[0].Value = true;
                }
            }
            else
            {
                for (int _rowIndex = 0; _rowIndex < this._listView.Rows.Count; _rowIndex++)
                {
                    this._listView.Rows[_rowIndex].Cells[0].Value = false;
                }
            }
        }
        private void _exportButton_Click(object sender, EventArgs e)
        {
            if (_actionType.Equals("Close"))
            {
                this.Close();
            }
            else
            {
                _selectCnt = 0;
                for (int _rowIndex = 0; _rowIndex < this._listView.Rows.Count; _rowIndex++)
                {
                    if (this._listView.Rows[_rowIndex].Cells[0].Value != null)
                    {
                        _selectCnt++;
                    }
                }
                if (_selectCnt > 0)
                {
                    this._exportButton.Enabled = false;
                    Common.Delegate.Delegate.LOG = new Common.Delegate.Delegate.LOG_INFO(LOG);
                    Common.Delegate.Delegate.THREAD_LOG = new Common.Delegate.Delegate.THREAD_LOG_INFO(StatucLOG);
                    Common.Delegate.Delegate.THREAD_END = new Common.Delegate.Delegate.THREAD_END_FUNC(ThreadEnd);
                    this._progress.Maximum = _selectCnt;
                    this._progress.Minimum = 0;
                    this._progress.Step = 1;

                    _worker.DoWork += new DoWorkEventHandler(DoExport);
                    _worker.ProgressChanged += new ProgressChangedEventHandler(ProgressChanged);
                    _worker.WorkerReportsProgress = true;
                    _worker.RunWorkerAsync();
                }
                else
                {
                    MessageBox.Show("항목을 선택하십시오.");
                }
            }
        }
        private void LOG(String parmLOG)
        {
            if (parmLOG.Equals("Type=[exit    ],Rule=[start                                   ]"))
            {
            }
            if (this._log.InvokeRequired)
            {
                Common.Delegate.Delegate.LOG = new Common.Delegate.Delegate.LOG_INFO(LOG);
                this.Invoke(Common.Delegate.Delegate.LOG, parmLOG);
            }
            else
            {
                this._log.Text += Environment.NewLine + parmLOG;
                this._log.SelectionStart = this._log.Text.Length;
                this._log.ScrollToCaret();
            }
        }
        private void StatucLOG(int parmTotalCnt, int parmSuccessCnt, int parmErrorCnt, int parmType)
        {
            if (this._log.InvokeRequired)
            {
                Common.Delegate.Delegate.THREAD_LOG = new Common.Delegate.Delegate.THREAD_LOG_INFO(StatucLOG);
                this.Invoke(Common.Delegate.Delegate.THREAD_LOG, parmTotalCnt, parmSuccessCnt, parmErrorCnt, parmType);
            }
            {
                this._progressStatus.Text = " Total Count= [" + parmTotalCnt + "],Success Count=[" + parmSuccessCnt + "],Error Count=[" + parmErrorCnt + "], Complete=[" + ((parmSuccessCnt + parmErrorCnt) * 100 / parmTotalCnt) + "]%";
            }
        }
        private void ThreadEnd(int parmTotalCnt, int parmSuccessCnt, int parmErrorCnt, int parmType)
        {
            if (this._log.InvokeRequired)
            {
                Common.Delegate.Delegate.THREAD_END = new Common.Delegate.Delegate.THREAD_END_FUNC(ThreadEnd);
                this.Invoke(Common.Delegate.Delegate.THREAD_END, parmTotalCnt, parmSuccessCnt, parmErrorCnt, parmType);
            }
            else
            {
                this._log.SelectionStart = this._log.Text.Length;
                ////////////this._progressStatus.Text = " Total Count= [" + parmTotalCnt + "],Success Count=[" + parmSuccessCnt + "],Error Count=[" + parmErrorCnt + "], Complete=[" + ((parmSuccessCnt + parmErrorCnt) * 100 / parmTotalCnt) + "]%";
                this._progressStatus.Text = " Total Count= [" + parmTotalCnt + "],Success Count=[" + parmSuccessCnt + "],Error Count=[" + parmErrorCnt + "], Process Complete";
                this._log.ScrollToCaret();
                this._exportButton.Enabled = true;
                MessageBox.Show(this._progressStatus.Text);
                this._exportButton.Text = "Close";
                ////////////this.Close();
                this._actionType = "Close";
            }
        }
        private void ProgressChanged(object sender, ProgressChangedEventArgs e)
        {
            this._progress.Value = e.ProgressPercentage;
        }
        private void DoExport(object sender, DoWorkEventArgs e)
        {
            int _successCnt = 0;
            int _errorCnt = 0;
            for (int _rowIndex = 0; _rowIndex < this._listView.Rows.Count; _rowIndex++)
            {
                if (this._listView.Rows[_rowIndex].Cells[0].Value != null)
                {
                    Common.Delegate.Delegate.LOG(this._listView[2, _rowIndex].Value.ToString() + " is exporting...");
                    if (Exporting(this._listView[2, _rowIndex].Value.ToString()))
                    {
                        _successCnt++;
                    }
                    else
                    {
                        _errorCnt++;
                    }
                    Common.Delegate.Delegate.LOG(this._listView[2, _rowIndex].Value.ToString() + " was exported.");
                    _worker.ReportProgress(_successCnt + _errorCnt);
                }
            }
            Common.Delegate.Delegate.THREAD_END(_selectCnt, _successCnt, _errorCnt, 0);
        }
        private bool Exporting(String parmSource)
        {
            bool _success = true;
            try
            {
                ProcessStartInfo _start = new ProcessStartInfo();
                _start.FileName = "java";
                _start.UseShellExecute = false;
                _start.RedirectStandardOutput = true;
                _start.RedirectStandardError = true;
                _start.WindowStyle = ProcessWindowStyle.Hidden;
                _start.CreateNoWindow = true;
                _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;antlr-4.1-complete.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.Target EXPORT \"" + this._project.Text + "\" \"" + parmSource + "\" \"" + _directory.Text + "\"";
                Common.Delegate.Delegate.LOG(_start.Arguments);
                using (Process _process = Process.Start(_start))
                {
                    using (StreamReader reader = _process.StandardOutput)
                    {
                        String _result = reader.ReadLine();
                        while (_result != null)
                        {
                            Common.Delegate.Delegate.LOG(_result);
                            _result = reader.ReadLine();
                        }
                    }
                    using (StreamReader reader = _process.StandardError)
                    {
                        String _result = reader.ReadLine();
                        while (_result != null)
                        {
                            Common.Delegate.Delegate.LOG(_result);
                            _success = false;
                            _result = reader.ReadLine();
                        }
                    }
                }
            }
            catch (Exception _parseException)
            {
                Common.Delegate.Delegate.LOG(_parseException.ToString());
                _success = false;
                return _success;
            }
            return _success;
        }

        private void _serachButton_Click(object sender, EventArgs e)
        {
            try
            {
                String startupPath = Application.StartupPath;
                using (FolderBrowserDialog dialog = new FolderBrowserDialog())
                {
                    dialog.Description = "Open a folder which write java stored procedure";
                    dialog.ShowNewFolderButton = false;
                    dialog.RootFolder = Environment.SpecialFolder.MyComputer;
                    if (dialog.ShowDialog() == DialogResult.OK)
                    {
                        _directory.Text = dialog.SelectedPath;
                    }
                }
            }
            catch (Exception _directoryException)
            {
                MessageBox.Show("Export failed : " + _directoryException.Message + " , please try again later.");
            }
        }
    }
}
