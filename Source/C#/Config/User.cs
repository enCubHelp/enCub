using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Diagnostics;
using System.IO;

namespace Common.Config
{
    public static class User
    {
        private static String _userID = "";
        private static String _userName = "";
        private static String _password = "";
        private static String _authority = "";
        private static String _comment = "";

        public static String GetAuthority()
        {
            return _authority;
        }
        public static bool CheckUser(String parmUserID, String parmPassword)
        {
            bool _returnValue = false;
            ProcessStartInfo _start = new ProcessStartInfo();
            _start.FileName = "java";
            _start.UseShellExecute = false;
            _start.RedirectStandardOutput = true;
            _start.RedirectStandardError = true;
            _start.WindowStyle = ProcessWindowStyle.Hidden;
            _start.CreateNoWindow = true;
            _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Repository.User SELECT";
            _start.Arguments += " \"" + parmUserID + "\"";
            using (Process _process = Process.Start(_start))
            {
                using (StreamReader reader = _process.StandardOutput)
                {
                    String _result = reader.ReadLine();
                    while (_result != null)
                    {
                        String[] _readColumn = _result.Split('=');
                        if (_readColumn[0].Equals("UserID") &&
                            _readColumn[1].Equals(parmUserID))
                        {
                            _userID = _readColumn[1];
                        }
                        else if (_readColumn[0].Equals("UserName"))
                        {
                            _userName = _readColumn[1];
                        }
                        else if (_readColumn[0].Equals("Password") &&
                                 _readColumn[1].Equals(parmPassword))
                        {
                            _password = _readColumn[1];
                            _returnValue = true;
                        }
                        else if (_readColumn[0].Equals("Authority"))
                        {
                            _authority = _readColumn[1];
                        }
                        else if (_readColumn[0].Equals("Comment"))
                        {
                            _comment = _readColumn[1];
                        }
                        _result = reader.ReadLine();
                    }
                }
                using (StreamReader reader = _process.StandardError)
                {
                    String _result = reader.ReadLine();
                    while (_result != null)
                    {
                        return false;
                    }
                }
            }
            return _returnValue;
        }
    }
}
