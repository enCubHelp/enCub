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
using System.Threading;

namespace Salt.enCub
{
    public partial class enCubList : Form
    {
        private String _actionType = "Parse";
        private bool _isCheckedBox = false;
        private BackgroundWorker _worker = new BackgroundWorker();
        private int _selectCnt = 0;
        public enCubList()
        {
            InitializeComponent();
            InitializeMenu();
        }
        private void InitializeMenu()
        {
            this.StartPosition = FormStartPosition.CenterScreen;
            this.AcceptButton = this._parseButton;
        }
        public void SetActionType(String parmActionType)
        {
            _actionType = parmActionType;
            this._parseButton.Text = _actionType;
            if (_actionType.Equals("Convert"))
            {
                this.Text = "Converting";
            }
            else if(_actionType.Equals("Parse"))
            {
                this.Text = "Parsing";
            }
            else if (_actionType.Equals("LoadJava"))
            {
                this.Text = "LoadJava";
            }
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
        private void _parseButton_Click(object sender, EventArgs e)
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
                    this._parseButton.Enabled = false;
                    Common.Delegate.Delegate.LOG = new Common.Delegate.Delegate.LOG_INFO(LOG);
                    Common.Delegate.Delegate.THREAD_LOG = new Common.Delegate.Delegate.THREAD_LOG_INFO(StatucLOG);
                    Common.Delegate.Delegate.THREAD_END = new Common.Delegate.Delegate.THREAD_END_FUNC(ThreadEnd);
                    this._progress.Maximum = _selectCnt;
                    this._progress.Minimum = 0;
                    this._progress.Step = 1;

                    _worker.WorkerSupportsCancellation = true;
                    _worker.DoWork += new DoWorkEventHandler(DoParse);
                    ////////////_worker.RunWorkerCompleted += _RunWorkerCompleted;
                    _worker.ProgressChanged += new ProgressChangedEventHandler(ProgressChanged);
                    _worker.WorkerReportsProgress = true;
                    _worker.RunWorkerAsync();
                    ////////do
                    ////////{
                    ////////    //비동기가 끝날때까지 대기
                    ////////    if (_worker.IsBusy)
                    ////////    {
                    ////////        Thread.Sleep(1);
                    ////////    }
                    ////////    else
                    ////////    {
                    ////////        //비동기 작업이 종료되면 loop 밖으로 나간다.
                    ////////        break;
                    ////////    }
                    ////////} while (true);
                }
                else
                {
                    MessageBox.Show("항목을 선택하십시오.");
                }
            }
            //////////int _selectCnt = 0;
            //////////for (int _rowIndex = 0; _rowIndex < this._listView.Rows.Count; _rowIndex++)
            //////////{
            //////////    if (this._listView.Rows[_rowIndex].Cells[0].Value != null)
            //////////    {
            //////////        _selectCnt++;
            //////////        this._log.Text += this._listView[2, _rowIndex].Value.ToString() + "가 시작되었습니다." + Environment.NewLine;
            //////////        if (_actionType.Equals("Convert"))
            //////////        {
            //////////            Converting(this._listView[2, _rowIndex].Value.ToString());
            //////////        }
            //////////        else
            //////////        {
            //////////            Parsing(this._listView[2, _rowIndex].Value.ToString());
            //////////        }
            //////////        this._log.Text += this._listView[2, _rowIndex].Value.ToString() + "가 완료되었습니다." + Environment.NewLine;
            //////////    }
            //////////}
            //////////if (_selectCnt == 0)
            //////////{
            //////////    MessageBox.Show("항목을 선택하십시오.");
            //////////}
            //////////else
            //////////{
            //////////    MessageBox.Show("완료되었습니다.");
            //////////}
        }
        private void LOG(String parmLOG)
        {
            if (this._log.InvokeRequired)
            {
                Common.Delegate.Delegate.LOG = new Common.Delegate.Delegate.LOG_INFO(LOG);
                this.Invoke(Common.Delegate.Delegate.LOG, parmLOG);
            }
            else
            {
                if (this._log.Text.Equals(""))
                {
                    this._log.AppendText(parmLOG);
                }
                else if (this._log.Text.Split(Environment.NewLine.ToCharArray()[0]).Length > 200)
                {
                    String _temp = this._log.Text.Substring(this._log.Text.IndexOf(Environment.NewLine) + 2);
                    this._log.Text = "";
                    this._log.AppendText(_temp);
                }
                else
                {
                    this._log.AppendText(Environment.NewLine + parmLOG);
                }
                this._log.Refresh();
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
                this._parseButton.Enabled = true;
                MessageBox.Show(this._progressStatus.Text);
                this._parseButton.Text = "Close";
                _actionType = "Close";
                //////sthis.Close();
            }
        }
        private void ProgressChanged(object sender, ProgressChangedEventArgs e)
        {
            this._progress.Value = e.ProgressPercentage;
        }
        ////////////private void _RunWorkerCompleted(object sender, RunWorkerCompletedEventArgs e)
        ////////////{
        ////////////    //  작업 끝났음. 해야할일 하기
        ////////////    if (e.Error != null)
        ////////////    {
        ////////////        MessageBox.Show("RunWorkerCompleted::에러남:" + e.Error.Message);
        ////////////    }
        ////////////    else if (e.Cancelled == true)
        ////////////    {
        ////////////        MessageBox.Show("RunWorkerCompleted::취소함");
        ////////////    }
        ////////////    else
        ////////////    {
        ////////////        MessageBox.Show("RunWorkerCompleted::모든 작업끝~!");
        ////////////    }
        ////////////}
        private void DoParse(object sender, DoWorkEventArgs e)
        {
            int _successCnt = 0;
            int _errorCnt = 0;
            for (int _rowIndex = 0; _rowIndex < this._listView.Rows.Count; _rowIndex++)
            {
                if (this._listView.Rows[_rowIndex].Cells[0].Value != null)
                {
                    if (_actionType.Equals("Convert"))
                    {
                        Common.Delegate.Delegate.LOG(this._listView[2, _rowIndex].Value.ToString() + " is converting...");
                        if (Converting(this._listView[2, _rowIndex].Value.ToString()))
                        {
                            _successCnt++;
                        }
                        else
                        {
                            _errorCnt++;
                        }
                        Common.Delegate.Delegate.LOG(this._listView[2, _rowIndex].Value.ToString() + " was converted.");
                    }
                    else if(_actionType.Equals("Parse"))
                    {
                        Common.Delegate.Delegate.LOG(this._listView[2, _rowIndex].Value.ToString() + " is parsing...");
                        if (Parsing(this._listView[2, _rowIndex].Value.ToString()))
                        {
                            _successCnt++;
                        }
                        else
                        {
                            _errorCnt++;
                        }
                        Common.Delegate.Delegate.LOG(this._listView[2, _rowIndex].Value.ToString() + " was parsed.");
                    }
                    else if (_actionType.Equals("LoadJava"))
                    {
                        Common.Delegate.Delegate.LOG(this._listView[2, _rowIndex].Value.ToString() + " is loading Java...");
                        if (LoadJava(this._listView[2, _rowIndex].Value.ToString()))
                        {
                            _successCnt++;
                        }
                        else
                        {
                            _errorCnt++;
                        }
                        Common.Delegate.Delegate.LOG(this._listView[2, _rowIndex].Value.ToString() + " was loaded Java.");
                    }
                    _worker.ReportProgress(_successCnt + _errorCnt);
                }
            }
            Common.Delegate.Delegate.THREAD_END(_selectCnt, _successCnt, _errorCnt, 0);
        }
        private bool Converting(String parmSource)
        {
            bool _success = true;
            ProcessStartInfo _start = new ProcessStartInfo();
            _start.FileName = "java";
            _start.UseShellExecute = false;
            _start.RedirectStandardOutput = true;
            _start.RedirectStandardError = true;
            _start.WindowStyle = ProcessWindowStyle.Hidden;
            _start.CreateNoWindow = true;
            _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;antlr-4.1-complete.jar;cubrid_jdbc.jar enCub.PLSQL.Converter.PLSQLConverter \"" + this._project.Text + "\" \"" + parmSource + "\"";
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
                        _success = false;
                        Common.Delegate.Delegate.LOG(_result);
                        _result = reader.ReadLine();
                    }
                }
            }
            return _success;
        }
        private bool Parsing(String parmSource)
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
                _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;antlr-4.1-complete.jar;cubrid_jdbc.jar enCub.PLSQL.Converter.PLSQLParser \"" + this._project.Text + "\" \"" + parmSource + "\"";
                using (Process _process = Process.Start(_start))
                {
                    using (StreamReader reader = _process.StandardOutput)
                    {
                        int _readCnt = 0;
                        String _result = reader.ReadLine();
                        while (_result != null)
                        {
                            _readCnt++;
                            if (_readCnt <= 400)
                            {
                                Common.Delegate.Delegate.LOG(_result);
                                _result = reader.ReadLine();
                            }
                            else
                            {
                                break;
                            }
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
        private bool LoadJava(String parmSource)
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
                _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;antlr-4.1-complete.jar;cubrid_jdbc.jar enCub.PLSQL.Converter.LoadJava \"" + this._project.Text + "\" \"" + parmSource + "\"";
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
    }
}
