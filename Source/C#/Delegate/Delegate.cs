using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Common.Delegate
{
    public class Delegate
    {
        public delegate void ReadProjectAll();
        public static ReadProjectAll ReadProject;
        public delegate void LOG_INFO(String parmLOG);
        public static LOG_INFO LOG;
        public delegate void THREAD_LOG_INFO(int parmTotalCnt, int parmSuccessCnt, int parmErrorCnt, int parmImportFileSize);
        public static THREAD_LOG_INFO THREAD_LOG;
        public delegate void THREAD_END_FUNC(int parmTotalCnt, int parmSuccessCnt, int parmErrorCnt, int parmImportFileSize);
        public static THREAD_END_FUNC THREAD_END;
        public delegate void CreateNewDocument(String parmProject, String parmPLSQL);
        public static CreateNewDocument NewDocument;
    }
}
