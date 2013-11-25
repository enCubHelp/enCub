package enCub.PLSQL.Converter;

import java.util.*;

public class JavaWriter {
    private static JavaWriter       _javaWriter         = null;
    private static List<String>     _threadName         = new ArrayList<String>();
    private static List<String>     _project            = new ArrayList<String>();
    private static List<String>     _program            = new ArrayList<String>();
    private static List<PLSQL2Java> _plsql2Javas        = new ArrayList<PLSQL2Java>();
    public  static int              _Package            = 1;
    public  static int              _Import             = 2;
    public  static int              _Procedure          = 3;
    public  static int              _Parameter          = 4;
    public  static int              _Variable           = 5;
    public  static int              _Sql                = 6;
    public  static int              _Statement          = 7;
    public  static int              _Reserved           = 8;
    public  static int              _End                = 9;
    public  static String           _CMD_Package        = "Package";
    public  static String           _CMD_Import         = "Import";
    public  static String           _CMD_Class          = "Class";
    public  static String           _CMD_Method         = "Method";
    public  static String           _CMD_Parameter      = "Parameter";
    public  static String           _CMD_Variable       = "Variable";
    public  static String           _CMD_EndProc        = "EndProc";
    public  static String           _CMD_EndClass       = "EndClass";
    public  static String           _CMD_Connection     = "Connection";
    public  static String           _CMD_Assignment     = "Assign";
    public  static String           _CMD_Exit           = "Exit";
    public  static String           _CMD_Loop           = "Loop";
    public  static String           _CMD_SQL_Cursor     = "SQL_Cursor";
    public  static String           _CMD_SQL_Open       = "SQL_Open";
    public  static String           _CMD_SQL_Open_For   = "SQL_Open_For";
    public  static String           _CMD_SQL_Fetch      = "SQL_Fetch";
    public  static String           _CMD_SQL_Close      = "SQL_Close";
    public  static String           _CMD_SQL_Insert     = "SQL_Insert";
    public  static String           _CMD_SQL_Select     = "SQL_Select";
    public  static String           _CMD_SQL_SelectInto = "SQL_SelectInto";
    public  static String           _CMD_SQL_Update     = "SQL_Update";
    public  static String           _CMD_SQL_Delete     = "SQL_Delete";
    public  static String           _CMD_SQL_Return     = "SQL_Return";
    public  static byte[]           _Seperator          = new byte[] {0x01};
    public static JavaWriter getInstance() throws Exception
    {
        if (_javaWriter == null)
        {
            _javaWriter = new JavaWriter();
        }
        return _javaWriter;
    }
    private static int FindThreadNo()
    {
        int _threadNo = -1;
        for(int _loop = 0; _loop < _threadName.size(); _loop++)
        {
            if (_threadName.get(_loop).equals(Thread.currentThread().getName()))
            {
                _threadNo = _loop;
                break;
            }
        }
        return _threadNo;
    }
    public static void ConvertStatement(int parmType, String parmLines, String parmColumns, String parmCommand, String parmStatement) {
        int _threadNo = FindThreadNo();
        if (_threadNo == -1)
        {
            _threadName.add(Thread.currentThread().getName());
            _plsql2Javas.add(new PLSQL2Java());
            _threadNo = 0;
        }
        PLSQL2Java _plsql2Java = _plsql2Javas.get(_threadNo);
        _plsql2Java.ConvertStatement(parmType, parmLines, parmColumns, parmCommand, parmStatement);
    }
    public static void SetProgram(String parmProject, String parmProgram)
    {
        String _curProject = parmProject;
        String _curProgram = parmProgram;
        int _threadNo = FindThreadNo();
        if (_threadNo == -1)
        {
            _threadName.add(Thread.currentThread().getName());
            _plsql2Javas.add(new PLSQL2Java(_curProject, _curProgram));
            _project.add(_curProject);
            _program.add(_curProgram);
            _threadNo = 0;
        }
        else
        {
            _program.set(_threadNo, _curProgram);
        }
    }
    public static String GetProgram()
    {
        int _threadNo = FindThreadNo();
        if (_threadNo == -1)
        {
            System.out.println("Thread Not Found!!!");
            System.out.println("_threadName.size()=[" + _threadName.size() + "]");
            System.out.println("_plsql2Javas.size()=[" + _plsql2Javas.size() + "]");
            return null;
        }
        else
        {
            return _program.get(_threadNo);
        }
    }
    public static void AddData(String parmName, String parmType, int parmLength, int parmPrecision, String parmInOut)
    {
        int _threadNo = FindThreadNo();
        if (_threadNo == -1)
        {
            _threadName.add(Thread.currentThread().getName());
            _plsql2Javas.add(new PLSQL2Java());
            _threadNo = 0;
        }
        PLSQL2Java _plsql2Java = _plsql2Javas.get(_threadNo);
        _plsql2Java.AddData(parmName, parmType, parmLength, parmPrecision, parmInOut);
    }
    public static List<PLSQLData> GetData()
    {
        int _threadNo = FindThreadNo();
        if (_threadNo == -1)
        {
            System.out.println("Thread Not Found!!!");
            System.out.println("_threadName.size()=[" + _threadName.size() + "]");
            System.out.println("_plsql2Javas.size()=[" + _plsql2Javas.size() + "]");
            return null;
        }
        else
        {
            PLSQL2Java _plsql2Java = _plsql2Javas.get(_threadNo);
            return _plsql2Java.GetData();
        }
    }
    public static List<PLSQLData> GetData(String parmName)
    {
        int _threadNo = FindThreadNo();
        if (_threadNo == -1)
        {
            System.out.println("Thread Not Found!!!");
            System.out.println("_threadName.size()=[" + _threadName.size() + "]");
            System.out.println("_plsql2Javas.size()=[" + _plsql2Javas.size() + "]");
            return null;
        }
        else
        {
            PLSQL2Java _plsql2Java = _plsql2Javas.get(_threadNo);
            return _plsql2Java.GetData(parmName);
        }
    }
    public static String GetDataName(String parmName)
    {
        int _threadNo = FindThreadNo();
        if (_threadNo == -1)
        {
            System.out.println("Thread Not Found!!!");
            System.out.println("_threadName.size()=[" + _threadName.size() + "]");
            System.out.println("_plsql2Javas.size()=[" + _plsql2Javas.size() + "]");
            return parmName;
        }
        else
        {
            PLSQL2Java _plsql2Java = _plsql2Javas.get(_threadNo);
            return _plsql2Java.GetDataName(parmName);
        }
    }
    public static void SetSQL(boolean parmSQL) {
        int _threadNo = FindThreadNo();
        if (_threadNo == -1)
        {
            System.out.println("Thread Not Found!!!");
            System.out.println("_threadName.size()=[" + _threadName.size() + "]");
            System.out.println("_plsql2Javas.size()=[" + _plsql2Javas.size() + "]");
        }
        else
        {
            PLSQL2Java _plsql2Java = _plsql2Javas.get(_threadNo);
            _plsql2Java.SetSQL(parmSQL);
        }
    }
    public static void SetRefCursor(boolean parmRefCursor) {
        int _threadNo = FindThreadNo();
        if (_threadNo == -1)
        {
            System.out.println("Thread Not Found!!!");
            System.out.println("_threadName.size()=[" + _threadName.size() + "]");
            System.out.println("_plsql2Javas.size()=[" + _plsql2Javas.size() + "]");
        }
        else
        {
            PLSQL2Java _plsql2Java = _plsql2Javas.get(_threadNo);
            _plsql2Java.SetRefCursor(parmRefCursor);
        }
    }
    public static void WriteStatement()
    {
        int _threadNo = FindThreadNo();
        if (_threadNo == -1)
        {
            System.out.println("Thread Not Found!!!");
            System.out.println("_threadName.size()=[" + _threadName.size() + "]");
            System.out.println("_plsql2Javas.size()=[" + _plsql2Javas.size() + "]");
        }
        else
        {
            PLSQL2Java _plsql2Java = _plsql2Javas.get(_threadNo);
            _plsql2Java.WriteStatement();
        }
    }
    public static List<PLSQLData> GetCursorVariable(String parmCursor) {
        List<PLSQLData> _returnData = new ArrayList<PLSQLData>();
        int _threadNo = FindThreadNo();
        if (_threadNo == -1)
        {
            System.out.println("Thread Not Found!!!");
            System.out.println("_threadName.size()=[" + _threadName.size() + "]");
            System.out.println("_plsql2Javas.size()=[" + _plsql2Javas.size() + "]");
        }
        else
        {
            PLSQL2Java _plsql2Java = _plsql2Javas.get(_threadNo);
            return _plsql2Java.GetCursorVariable(parmCursor);
        }
        return _returnData;
    }
    public static void SetCursorVariable(String parmCursor, List<PLSQLData> parmPlsql) {
        int _threadNo = FindThreadNo();
        if (_threadNo == -1)
        {
            System.out.println("Thread Not Found!!!");
            System.out.println("_threadName.size()=[" + _threadName.size() + "]");
            System.out.println("_plsql2Javas.size()=[" + _plsql2Javas.size() + "]");
        }
        else
        {
            PLSQL2Java _plsql2Java = _plsql2Javas.get(_threadNo);
            _plsql2Java.SetCursorVariable(parmCursor, parmPlsql);
        }
    }
    public static List<PLSQLData> GetFetchVariable(String parmCursor) {
        List<PLSQLData> _returnData = new ArrayList<PLSQLData>();
        int _threadNo = FindThreadNo();
        if (_threadNo == -1)
        {
            System.out.println("Thread Not Found!!!");
            System.out.println("_threadName.size()=[" + _threadName.size() + "]");
            System.out.println("_plsql2Javas.size()=[" + _plsql2Javas.size() + "]");
        }
        else
        {
            PLSQL2Java _plsql2Java = _plsql2Javas.get(_threadNo);
            return _plsql2Java.GetFetchVariable(parmCursor);
        }
        return _returnData;
    }
    public static void SetFetchVariable(String parmCursor, List<PLSQLData> parmPlsql) {
        int _threadNo = FindThreadNo();
        if (_threadNo == -1)
        {
            System.out.println("Thread Not Found!!!");
            System.out.println("_threadName.size()=[" + _threadName.size() + "]");
            System.out.println("_plsql2Javas.size()=[" + _plsql2Javas.size() + "]");
        }
        else
        {
            PLSQL2Java _plsql2Java = _plsql2Javas.get(_threadNo);
            _plsql2Java.SetFetchVariable(parmCursor, parmPlsql);
        }
    }
    public static String GetJavaVariable(String parmVariable)
    {
        String _returnVariable = parmVariable;
        int _threadNo = FindThreadNo();
        if (_threadNo == -1)
        {
            System.out.println("Thread Not Found!!!");
            System.out.println("_threadName.size()=[" + _threadName.size() + "]");
            System.out.println("_plsql2Javas.size()=[" + _plsql2Javas.size() + "]");
        }
        else
        {
            PLSQL2Java _plsql2Java = _plsql2Javas.get(_threadNo);
            return _plsql2Java.GetJavaVariable(parmVariable);
        }
        return _returnVariable;
    }
}
