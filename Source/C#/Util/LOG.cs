using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;

namespace Common.Util
{
    public static class LOG
    {
        private static String _LOG_FILE_PATH = ".";
        private static String _LOG_FILE_NAME = "enCub.log";
        private static StreamWriter _LOG_WRITER = null;
        public static void DefineLOG(String parmPath, String parmFile)
        {
            _LOG_WRITER = new StreamWriter(parmPath + Path.DirectorySeparatorChar.ToString() + parmFile, true);
        }
        public static void DefineLOG(String parmFile)
        {
            DefineLOG(_LOG_FILE_PATH, parmFile);
        }
        public static void DefineLOG()
        {
            DefineLOG(_LOG_FILE_PATH, _LOG_FILE_NAME);
        }
        public static void WriteLOG(String parmLOG)
        {
            if (_LOG_WRITER == null)
            {
                DefineLOG();
            }
            _LOG_WRITER.WriteLine(parmLOG);
        }
    }
}
