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
    public partial class enCubImport : Form
    {
        private String _selectedPath = null;
        private List<String> _selectedFiles = null;
        private List<int> _selectedFileSizes = null;
        private int _totalFileSize = 0;
        private BackgroundWorker _worker = new BackgroundWorker();
        private String _actionType = "Import";

        public enCubImport()
        {
            InitializeComponent();
            InitializeMenu();
        }
        public void InitializeMenu()
        {
            this.StartPosition = FormStartPosition.CenterScreen;
            this.AcceptButton = this._serachButton;

            this._overwriteN.Checked = true;
            this._overwriteY.Checked = false;
        }
        public void SetProject(String parmProject)
        {
            this._project.Text = parmProject;
        }

        private void _serachButton_Click(object sender, EventArgs e)
        {
            if (_actionType.Equals("Close"))
            {
                this.Close();
            }
            else
            {
                enCubImportFile _importFile = new enCubImportFile();
                if (_importFile.ShowDialog() == DialogResult.OK)
                {
                    _importFile.GetSelectedFiles();
                    _selectedPath = _importFile.GetPath();
                    _selectedFiles = _importFile.GetSelectedFiles();
                    _selectedFileSizes = _importFile.GetSelectedFileSizes();
                    _totalFileSize = 0;
                    this._source.Text = "";
                    for (int _fileIndex = 0; _fileIndex < _selectedFiles.Count; _fileIndex++)
                    {
                        this._source.Text += _selectedPath + "\\" + _selectedFiles[_fileIndex] + ";";
                        this._totalFileSize += _selectedFileSizes[_fileIndex];
                    }

                    Common.Delegate.Delegate.LOG = new Common.Delegate.Delegate.LOG_INFO(LOG);
                    Common.Delegate.Delegate.THREAD_LOG = new Common.Delegate.Delegate.THREAD_LOG_INFO(StatucLOG);
                    Common.Delegate.Delegate.THREAD_END = new Common.Delegate.Delegate.THREAD_END_FUNC(ThreadEnd);
                    this._progress.Maximum = this._selectedFiles.Count;
                    this._progress.Maximum = this._totalFileSize;
                    this._progress.Minimum = 0;
                    this._progress.Step = 1;

                    _worker.DoWork += new DoWorkEventHandler(DoImport);
                    _worker.ProgressChanged += new ProgressChangedEventHandler(ProgressChanged);
                    _worker.WorkerReportsProgress = true;
                    _worker.RunWorkerAsync();
                    this._serachButton.Text = "Close";
                }
                else
                {
                    MessageBox.Show("취소되었습니다.");
                }
            }
        }

        //////////private void _confirmButton_Click(object sender, EventArgs e)
        //////////{
        //////////    if (_selectedFiles.Count > 0)
        //////////    {
        //////////        this._confirmButton.Enabled = false;
        //////////        Common.Delegate.Delegate.LOG = new Common.Delegate.Delegate.LOG_INFO(LOG);
        //////////        Common.Delegate.Delegate.THREAD_LOG = new Common.Delegate.Delegate.THREAD_LOG_INFO(StatucLOG);
        //////////        Common.Delegate.Delegate.THREAD_END = new Common.Delegate.Delegate.THREAD_END_FUNC(ThreadEnd);
        //////////        this._progress.Maximum = this._selectedFiles.Count;
        //////////        this._progress.Maximum = this._totalFileSize;
        //////////        this._progress.Minimum = 0;
        //////////        this._progress.Step = 1;

        //////////        _worker.DoWork += new DoWorkEventHandler(DoImport);
        //////////        _worker.ProgressChanged += new ProgressChangedEventHandler(ProgressChanged);
        //////////        _worker.WorkerReportsProgress = true;
        //////////        _worker.RunWorkerAsync();
        //////////    }
        //////////    else
        //////////    {
        //////////        MessageBox.Show("파일을 선택하십시오.");
        //////////    }
        //////////}
        private void LOG(String parmLOG)
        {
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
        private void StatucLOG(int parmTotalCnt, int parmSuccessCnt, int parmErrorCnt, int parmImportFileSize)
        {
            if (this._log.InvokeRequired)
            {
                Common.Delegate.Delegate.THREAD_LOG = new Common.Delegate.Delegate.THREAD_LOG_INFO(StatucLOG);
                this.Invoke(Common.Delegate.Delegate.THREAD_LOG, parmTotalCnt, parmSuccessCnt, parmErrorCnt, parmImportFileSize);
            }
            else
            {
                this._progressStatus.Text = " Total Count= [" + parmTotalCnt + "],Success Count=[" + parmSuccessCnt + "],Error Count=[" + parmErrorCnt + "], Complete=[" + (parmImportFileSize * 100 / _totalFileSize) + "]%";
            }
        }
        private void ThreadEnd(int parmTotalCnt, int parmSuccessCnt, int parmErrorCnt, int parmImportFileSize)
        {
            if (this._log.InvokeRequired)
            {
                Common.Delegate.Delegate.THREAD_END = new Common.Delegate.Delegate.THREAD_END_FUNC(ThreadEnd);
                this.Invoke(Common.Delegate.Delegate.THREAD_END, parmTotalCnt, parmSuccessCnt, parmErrorCnt, parmImportFileSize);
            }
            else
            {
                this._log.SelectionStart = this._log.Text.Length;
                ////////////this._progressStatus.Text = " Total Count= [" + parmTotalCnt + "],Success Count=[" + parmSuccessCnt + "],Error Count=[" + parmErrorCnt + "], Complete=[" + ( parmImportFileSize * 100 / _totalFileSize) + "]%";
                this._progressStatus.Text = " Total Count= [" + parmTotalCnt + "],Success Count=[" + parmSuccessCnt + "],Error Count=[" + parmErrorCnt + "], Process Complete";
                this._log.ScrollToCaret();
                MessageBox.Show(this._progressStatus.Text);
//////                this._confirmButton.Enabled = true;
//////                this.Close();
                this._actionType = "Close";
            }
        }
        private void ProgressChanged(object sender, ProgressChangedEventArgs e)
        {
            this._progress.Value = e.ProgressPercentage;
        }
        private void DoImport(object sender, DoWorkEventArgs e)
        {
            int _successCnt = 0;
            int _errorCnt = 0;
            int _currentImportFileSize = 0;
            for (int _fileIndex = 0; _fileIndex < _selectedFiles.Count; _fileIndex++)
            {
                if (ImportSQL(this._project.Text, _selectedPath + "\\" + _selectedFiles[_fileIndex]))
                {
                    _successCnt++;
                }
                else
                {
                    _errorCnt++;
                }
                Common.Delegate.Delegate.THREAD_LOG(_selectedFiles.Count, _successCnt, _errorCnt, _currentImportFileSize);
                _currentImportFileSize += _selectedFileSizes[_fileIndex];
                //_worker.ReportProgress(_fileIndex + 1);
                _worker.ReportProgress(_currentImportFileSize);
            }
            Common.Delegate.Delegate.THREAD_END(_selectedFiles.Count, _successCnt, _errorCnt, _currentImportFileSize);
            Common.Delegate.Delegate.ReadProject();
        }
        private bool ImportSQL(String parmProject, String parmFile)
        {
            bool _success = true;
            ProcessStartInfo _start = new ProcessStartInfo();
            _start.FileName = "java";
            _start.UseShellExecute = false;
            _start.RedirectStandardOutput = true;
            _start.RedirectStandardError = true;
            _start.WindowStyle = ProcessWindowStyle.Hidden;
            _start.CreateNoWindow = true;
            _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.PLSQL IMPORT";
            _start.Arguments += " \"" + parmProject + "\"";
            _start.Arguments += " \"" + parmFile + "\"";
            _start.Arguments += " \"" + (this._overwriteY.Checked ? "Y" : "N") + "\"";
            using (Process _process = Process.Start(_start))
            {
                ////////using (StreamReader reader = _process.StandardOutput)
                ////////{
                ////////    String _result = reader.ReadLine();
                ////////    while (_result != null)
                ////////    {
                ////////        Common.Delegate.Delegate.LOG(reader.ReadLine());
                ////////    }
                ////////}
                using (StreamReader reader = _process.StandardError)
                {
                    String _result = reader.ReadLine();
                    if (_result != null)
                    {
                        _success = false;
                    }
                    //////while (_result != null)
                    //////{
                    //////    Common.Delegate.Delegate.LOG(reader.ReadLine());
                    //////}
                }
            }
            if (_success)
            {
                Common.Delegate.Delegate.LOG(parmFile + " is imported.");
            }
            else
            {
                Common.Delegate.Delegate.LOG(parmFile + " is not imported.");
            }
            return _success;
        }
    }
}
