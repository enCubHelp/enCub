using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;
using System.Diagnostics;

namespace Common.Config
{
    public static class Config
    {
        private static String _CONFIG_PATH = ".";
        private static String _CONFIG_NAME = "Config.cfg";

        private static String _Repository = null;
        private static String _RepositoryUser = null;
        private static String _RepositoryPassword = null;
        private static String _RepositoryClass = null;
        private static String _RepositoryConnection = null;
        private static String _ProjectName = null;
        private static String _OracleVersion = null;
        private static String _OracleUser = null;
        private static String _OraclePassword = null;
        private static String _OracleClass = null;
        private static String _OracleConnection = null;
        private static String _TargetDBMS = null;
        private static String _TargetDBMSUser = null;
        private static String _TargetDBMSPassword = null;
        private static String _TargetDBMSClass = null;
        private static String _TargetDBMSJDKPath = null;
        private static String _TargetDBMSLoadJavaPath = null;
        private static String _TargetDBMSConnection = null;

        private const String _Passphrase = "SaltenCu";

        public static void SetConfigPath(String parmPath)
        {
            _CONFIG_PATH = parmPath;
        }
        public static void SetConfigName(String parmFile)
        {
            _CONFIG_NAME = parmFile;
        }
        public static String GetProjectName()
        {
            return _ProjectName;
        }
        public static void SetProjectName(String parmProject)
        {
            _ProjectName = parmProject;
        }
        public static String GetRepository()
        {
            return _Repository;
        }
        public static void SetRepository(String parmRepository)
        {
            _Repository = parmRepository;
        }
        public static String GetRepositoryUser()
        {
            return _RepositoryUser;
        }
        public static void SetRepositoryUser(String parmUser)
        {
            _RepositoryUser = parmUser;
        }
        public static String GetRepositoryPassword()
        {
            return _RepositoryPassword;
        }
        public static void SetRepositoryPassword(String parmPassword)
        {
            _RepositoryPassword = parmPassword;
        }
        public static String GetRepositoryClass()
        {
            return _RepositoryClass;
        }
        public static void SetRepositoryClass(String parmClass)
        {
            _RepositoryClass = parmClass;
        }
        public static String GetRepositoryConnection()
        {
            return _RepositoryConnection;
        }
        public static void SetRepositoryConnection(String parmConnection)
        {
            _RepositoryConnection = parmConnection;
        }
        public static String GetOracleVersion()
        {
            return _OracleVersion;
        }
        public static void SetOracleVersion(String parmVersion)
        {
            _OracleVersion = parmVersion;
        }
        public static String GetOracleUser()
        {
            return _OracleUser;
        }
        public static void SetOracleUser(String parmUser)
        {
            _OracleUser = parmUser;
        }
        public static String GetOraclePassword()
        {
            return _OraclePassword;
        }
        public static void SetOraclePassword(String parmPassword)
        {
            _OraclePassword = parmPassword;
        }
        public static String GetOracleClass()
        {
            return _OracleClass;
        }
        public static void SetOracleClass(String parmClass)
        {
            _OracleClass = parmClass;
        }
        public static String GetOracleConnection()
        {
            return _OracleConnection;
        }
        public static void SetOracleConnection(String parmConnection)
        {
            _OracleConnection = parmConnection;
        }
        public static String GetTargetDBMS()
        {
            return _TargetDBMS;
        }
        public static void SetTargetDBMS(String parmDBMS)
        {
            _TargetDBMS = parmDBMS;
        }
        public static String GetTargetDBMSUser()
        {
            return _TargetDBMSUser;
        }
        public static void SetTargetDBMSUser(String parmUser)
        {
            _TargetDBMSUser = parmUser;
        }
        public static String GetTargetDBMSPassword()
        {
            return _TargetDBMSPassword;
        }
        public static void SetTargetDBMSPassword(String parmPassword)
        {
            _TargetDBMSPassword = parmPassword;
        }
        public static String GetTargetDBMSClass()
        {
            return _TargetDBMSClass;
        }
        public static void SetTargetDBMSClass(String parmClass)
        {
            _TargetDBMSClass = parmClass;
        }
        public static String GetTargetDBMSJDKPath()
        {
            return _TargetDBMSJDKPath;
        }
        public static void SetTargetDBMSJDKPath(String parmJDKPath)
        {
            _TargetDBMSJDKPath = parmJDKPath;
        }
        public static String GetTargetDBMSLoadJavaPath()
        {
            return _TargetDBMSLoadJavaPath;
        }
        public static void SetTargetDBMSLoadJavaPath(String parmLoadJavaPath)
        {
            _TargetDBMSLoadJavaPath = parmLoadJavaPath;
        }
        public static String GetTargetDBMSConnection()
        {
            return _TargetDBMSConnection;
        }
        public static void SetTargetDBMSConnection(String parmConnection)
        {
            _TargetDBMSConnection = parmConnection;
        }
        public static void ReadConfig()
        {
            if (_ProjectName != null)
            {
                return;
            }
            ProcessStartInfo _start = new ProcessStartInfo();
            _start.FileName = "java";
            _start.UseShellExecute = false;
            _start.RedirectStandardOutput = true;
            _start.RedirectStandardError = true;
            _start.WindowStyle = ProcessWindowStyle.Hidden;
            _start.CreateNoWindow = true;
            _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Properties.Environment LIST";
            using (Process _process = Process.Start(_start))
            {
                using (StreamReader reader = _process.StandardOutput)
                {
                    String _result = reader.ReadLine();
                    while (_result != null)
                    {
                        String[] _readColumn = _result.Split('=');
                        switch (_readColumn[0])
                        {
                            case "PROJECT": _ProjectName = _readColumn[1];
                                break;
                            case "Repository": _Repository = _readColumn[1];
                                break;
                            case "RepositoryUser": _RepositoryUser = _readColumn[1];
                                break;
                            case "RepositoryPassword": _RepositoryPassword = _readColumn[1];
                                break;
                            case "RepositoryClass": _RepositoryClass = _readColumn[1];
                                break;
                            case "RepositoryConnection": _RepositoryConnection = _readColumn[1];
                                break;
                            case "OracleVersion": _OracleVersion = _readColumn[1];
                                break;
                            case "OracleUser": _OracleUser = _readColumn[1];
                                break;
                            case "OraclePassword": _OraclePassword = _readColumn[1];
                                break;
                            case "OracleClass": _OracleClass = _readColumn[1];
                                break;
                            case "OracleConnection": _OracleConnection = _readColumn[1];
                                break;
                            case "TargetDBMS": _TargetDBMS = _readColumn[1];
                                break;
                            case "TargetDBMSUser": _TargetDBMSUser = _readColumn[1];
                                break;
                            case "TargetDBMSPassword": _TargetDBMSPassword = _readColumn[1];
                                break;
                            case "TargetDBMSClass": _TargetDBMSClass = _readColumn[1];
                                break;
                            case "TargetDBMSLoadJavaPath": _TargetDBMSLoadJavaPath = _readColumn[1];
                                break;
                            case "TargetDBMSJDKPath": _TargetDBMSJDKPath = _readColumn[1];
                                break;
                            case "TargetDBMSConnection": _TargetDBMSConnection = _readColumn[1];
                                break;
                            default: break;
                        }
                        _result = reader.ReadLine();
                    }
                }
                using (StreamReader reader = _process.StandardError)
                {
                    String _result = reader.ReadLine();
                    while (_result != null)
                    {
                        _result = reader.ReadLine();
                    }
                }
            }
        }
        public static void SaveConfig()
        {
            ProcessStartInfo _start = new ProcessStartInfo();
            _start.FileName = "java";
            _start.UseShellExecute = false;
            _start.RedirectStandardOutput = true;
            _start.RedirectStandardError = true;
            _start.WindowStyle = ProcessWindowStyle.Hidden;
            _start.CreateNoWindow = true;
            _start.Arguments = "-cp enCub.jar;ojdbc6.jar;commons-codec-1.8.jar;cubrid_jdbc.jar enCub.PLSQL.Properties.Environment SET";
            _start.Arguments += " PROJECT \"" + _ProjectName + "\"";
            _start.Arguments += " Repository \"" + _Repository + "\"";
            _start.Arguments += " RepositoryUser \"" + _RepositoryUser + "\"";
            _start.Arguments += " RepositoryPassword \"" + _RepositoryPassword + "\"";
            _start.Arguments += " RepositoryClass \"" + _RepositoryClass + "\"";
            _start.Arguments += " RepositoryConnection \"" + _RepositoryConnection + "\"";
            _start.Arguments += " OracleVersion \"" + _OracleVersion + "\"";
            _start.Arguments += " OracleUser \"" + _OracleUser + "\"";
            _start.Arguments += " OraclePassword \"" + _OraclePassword + "\"";
            _start.Arguments += " OracleClass \"" + _OracleClass + "\"";
            _start.Arguments += " OracleConnection \"" + _OracleConnection + "\"";
            _start.Arguments += " TargetDBMS \"" + _TargetDBMS + "\"";
            _start.Arguments += " TargetDBMSUser \"" + _TargetDBMSUser + "\"";
            _start.Arguments += " TargetDBMSPassword \"" + _TargetDBMSPassword + "\"";
            _start.Arguments += " TargetDBMSClass \"" + _TargetDBMSClass + "\"";
            _start.Arguments += " TargetDBMSLoadJavaPath \"" + _TargetDBMSLoadJavaPath + "\"";
            _start.Arguments += " TargetDBMSJDKPath \"" + _TargetDBMSJDKPath + "\"";
            _start.Arguments += " TargetDBMSConnection \"" + _TargetDBMSConnection + "\"";
            using (Process _process = Process.Start(_start))
            {
                using (StreamReader reader = _process.StandardError)
                {
                    String _result = reader.ReadLine();
                    while (_result != null)
                    {
                        throw new Exception(_result);
                    }
                }
            }
        }
    }
}
