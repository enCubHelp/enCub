package enCub.PLSQL.Converter;

import java.util.*;
import enCub.PLSQL.Repository.*;
import enCub.PLSQL.Properties.Environment;

public class PLSQL2Java {
    private String              _project            = "";
    private String              _program            = "";
    private boolean             _isSQL              = false;
    private boolean             _isSQLPrint         = false;
    private boolean             _isRefCursor        = false;
    private boolean             _isRefCursorPrint   = false;
    private List<PLSQLData>     _plsqlDatas         = new ArrayList<PLSQLData>();
    private List<String>        _cursorList         = new ArrayList<String>();
    private List<PLSQLData>     _cursorDatas        = new ArrayList<PLSQLData>();
    private List<String>        _fetchList          = new ArrayList<String>();
    private List<PLSQLData>     _fetchDatas         = new ArrayList<PLSQLData>();
    private List<TargetJava>    _javaStatements     = new ArrayList<TargetJava>();
    private List<TargetJava>    _convComment        = new ArrayList<TargetJava>();
    private List<TargetJava>    _javaStatement1     = new ArrayList<TargetJava>();
    private List<TargetJava>    _javaStatement2     = new ArrayList<TargetJava>();
    private List<TargetJava>    _javaStatement3     = new ArrayList<TargetJava>();
    private List<TargetJava>    _javaStatement4     = new ArrayList<TargetJava>();
    private List<TargetJava>    _javaStatement5     = new ArrayList<TargetJava>();
    private List<TargetJava>    _javaStatement6     = new ArrayList<TargetJava>();
    private List<TargetJava>    _javaStatement7     = new ArrayList<TargetJava>();
    private List<TargetJava>    _javaStatement8     = new ArrayList<TargetJava>();
    private List<TargetJava>    _javaStatement9     = new ArrayList<TargetJava>();
    private TargetJava          _blankLine          = new TargetJava();
    private boolean             _isBigDecimal       = false;
    private boolean             _isDate             = false;
    private String              _lParen             = "{";
    private String              _rParen             = "}";

    public PLSQL2Java() {
        this(null, null);
    }
    public PLSQL2Java(String parmProject, String parmProgram) {
        List<String> _headerComment = new ArrayList<String>();
        _headerComment.add("/*------------------------------------------------------*/");
        _headerComment.add("/* Converted By EnCub                                   */");
        _headerComment.add("/*------------------------------------------------------*/");
        _headerComment.add("");
        List<String> _defaultImport = new ArrayList<String>();
        _defaultImport.add("import java.sql.*;");
        _defaultImport.add("import java.text.*;");
//////        _defaultImport.add("import java.util.*;");
        try {
            String          _targetDBMS     = Environment.Get("TargetDBMS");
            if (_targetDBMS.toUpperCase().startsWith("CUBRID"))
            {
                _defaultImport.add("import cubrid.jdbc.driver.CUBRIDResultSet;");
            }
            else if (_targetDBMS.toUpperCase().startsWith("ORACLE"))
            {
                _defaultImport.add("import oracle.jdbc.OracleTypes;");
                _defaultImport.add("import oracle.jdbc.OracleConnection;");
            }
        } catch(Exception e) {
//////            _defaultImport.add("import oracle.jdbc.OracleTypes;");
        }
        _defaultImport.add("");
        for(int _loop = 0; _loop < _headerComment.size(); _loop++)
        {
            TargetJava _header      = new TargetJava();
            _header._sourceLines    = "0";
            _header._sourceColumns  = "0";
            _header._command        = "Comment";
            _header._statement      = _headerComment.get(_loop);
            _convComment.add(_header);
        }
        for(int _loop = 0; _loop < _defaultImport.size(); _loop++)
        {
            TargetJava _import      = new TargetJava();
            _import._sourceLines    = "0";
            _import._sourceColumns  = "0";
            _import._command        = "Import";
            _import._statement      = _defaultImport.get(_loop);
            _javaStatement2.add(_import);
        }
        _blankLine._sourceLines     = "0";
        _blankLine._sourceColumns   = "0";
        _blankLine._statement       = "";
        if (parmProject != null)
        {
            _project = parmProject;
        }
        if (parmProgram != null)
        {
            _program = parmProgram;
        }
    }
    public void AddData(String parmName, String parmType, int parmLength, int parmPrecision, String parmInOut) {
        if (parmName.endsWith("[0]"))
        {
            parmName = parmName.substring(0, parmName.length() - 3);
        }
        PLSQLData   _plsqlData  = new PLSQLData();
        _plsqlData._dataname    = parmName.toLowerCase();
        _plsqlData._datatype    = parmType;
        _plsqlData._length      = parmLength;
        _plsqlData._precision   = parmPrecision;
        _plsqlData._inout       = parmInOut;
        _plsqlDatas.add(_plsqlData);
//////        System.out.println("Variable=[" + parmName + "], Type=[" + parmType + "],BigDecimal=[" + _isBigDecimal + "]");
        if ((parmType.toUpperCase().equals("NUMERIC") ||
             parmType.toUpperCase().equals("NUMBER")) &&
            !_isBigDecimal)
        {
            _isBigDecimal = true;
            ConvertStatement(JavaWriter._Import, "0", "0", JavaWriter._CMD_Import, "import java.math.BigDecimal;");
        }
    }
    public List<PLSQLData> GetData() {
        return GetData(null);
    }
    public List<PLSQLData> GetData(String parmName) {
        List<PLSQLData> _returnData = new ArrayList<PLSQLData>();
        PLSQLData _plsqlData = null;
        String _prefix = "";
        parmName    = parmName.toLowerCase();
        if (parmName.endsWith("[0]"))
        {
            parmName = parmName.substring(0, parmName.length() - 3);
        }
        if (parmName != null &&
            parmName.indexOf('.') >= 0)
        {
            _prefix     = parmName.substring(0, parmName.indexOf('.'));
            parmName    = parmName.substring(parmName.indexOf('.') + 1);
        }
        for(int _loop = 0; _loop < _plsqlDatas.size(); _loop++)
        {
            if (parmName == null)
            {
                _returnData.add(_plsqlDatas.get(_loop));
            }
            else if (_plsqlDatas.get(_loop)._dataname.equals(parmName) &&
                    (_prefix.equals("") ||
                     _prefix.equals(_program)))
            {
                _plsqlData = new PLSQLData();
                _plsqlData._dataname    = _plsqlDatas.get(_loop)._dataname;
                _plsqlData._datatype    = _plsqlDatas.get(_loop)._datatype;
                _plsqlData._length      = _plsqlDatas.get(_loop)._length;
                _plsqlData._precision   = _plsqlDatas.get(_loop)._precision;
                _plsqlData._inout       = _plsqlDatas.get(_loop)._inout;
                _returnData.add(_plsqlData);
            }
        }
        return _returnData;
    }
    public String GetDataName(String parmName) {
        parmName    = parmName.toLowerCase();
        String _returnName = parmName;
        for(int _loop = 0; _loop < _plsqlDatas.size(); _loop++)
        {
            if (_plsqlDatas.get(_loop)._dataname.toLowerCase().equals(parmName))
            {
                if (_plsqlDatas.get(_loop)._inout.equals("OUT") ||
                    _plsqlDatas.get(_loop)._inout.equals("IN OUT"))
                {
                    _returnName = parmName + "[0]";
                }
                break;
            }
        }
        return _returnName;
    }
    public void SetCursorVariable(String parmCursor, List<PLSQLData> parmPlsql)
    {
        for(int _loop = 0; _loop < parmPlsql.size(); _loop++)
        {
            PLSQLData _plsqlData = new PLSQLData();
            _plsqlData._dataname    = parmPlsql.get(_loop)._dataname.toLowerCase();
            _plsqlData._datatype    = parmPlsql.get(_loop)._datatype;
            _plsqlData._length      = parmPlsql.get(_loop)._length;
            _plsqlData._precision   = parmPlsql.get(_loop)._precision;
            _plsqlData._inout       = parmPlsql.get(_loop)._inout;
            _cursorList.add(parmCursor);
            _cursorDatas.add(_plsqlData);
        }
    }
    public List<PLSQLData> GetCursorVariable(String parmCursor)
    {
        parmCursor    = parmCursor.toLowerCase();
        List<PLSQLData> _returnDatas = new ArrayList<PLSQLData>();
        for(int _loop = 0; _loop < _cursorList.size(); _loop++)
        {
            if (_cursorList.get(_loop).equals(parmCursor))
            {
                PLSQLData _plsqlData = new PLSQLData();
                _plsqlData._dataname    = _cursorDatas.get(_loop)._dataname;
                _plsqlData._datatype    = _cursorDatas.get(_loop)._datatype;
                _plsqlData._length      = _cursorDatas.get(_loop)._length;
                _plsqlData._precision   = _cursorDatas.get(_loop)._precision;
                _plsqlData._inout       = _cursorDatas.get(_loop)._inout;
                _returnDatas.add(_plsqlData);
            }
        }
        return _returnDatas;
    }
    public void SetFetchVariable(String parmCursor, List<PLSQLData> parmPlsql)
    {
        parmCursor    = parmCursor.toLowerCase();
        for(int _loop = 0; _loop < parmPlsql.size(); _loop++)
        {
            PLSQLData _plsqlData = new PLSQLData();
            _plsqlData._dataname    = parmPlsql.get(_loop)._dataname.toLowerCase();
            _plsqlData._datatype    = parmPlsql.get(_loop)._datatype;
            _plsqlData._length      = parmPlsql.get(_loop)._length;
            _plsqlData._precision   = parmPlsql.get(_loop)._precision;
            _plsqlData._inout       = parmPlsql.get(_loop)._inout;
            _fetchList.add(parmCursor);
            _fetchDatas.add(_plsqlData);
        }
    }
    public List<PLSQLData> GetFetchVariable(String parmCursor)
    {
        parmCursor    = parmCursor.toLowerCase();
        List<PLSQLData> _returnDatas = new ArrayList<PLSQLData>();
        System.out.println("PLSQL2Java:_fetchList.size()=[" + _fetchList.size() + "],parmCursor=[" + parmCursor + "]");
        for(int _loop = 0; _loop < _fetchList.size(); _loop++)
        {
            if (_fetchList.get(_loop).equals(parmCursor))
            {
                PLSQLData _plsqlData = new PLSQLData();
                _plsqlData._dataname    = _fetchDatas.get(_loop)._dataname;
                _plsqlData._datatype    = _fetchDatas.get(_loop)._datatype;
                _plsqlData._length      = _fetchDatas.get(_loop)._length;
                _plsqlData._precision   = _fetchDatas.get(_loop)._precision;
                _plsqlData._inout       = _fetchDatas.get(_loop)._inout;
                _returnDatas.add(_plsqlData);
            }
        }
        return _returnDatas;
    }
    public String GetJavaVariable(String parmVariable)
    {
        String _returnVariable = parmVariable.toLowerCase();
        if (parmVariable.startsWith("old."))
        {
            _returnVariable = "_old_" + _returnVariable.substring(4);
        }
        else if (parmVariable.startsWith("new."))
        {
            _returnVariable = "_new_" + _returnVariable.substring(4) + "[0]";
        }
        return _returnVariable;
    }
    public void SetSQL(boolean parmSQL) {
//////        System.out.println("parmSQL=[" + parmSQL + "],_isSQL=[" + _isSQL + "]");
        if (parmSQL &&
           !_isSQLPrint)
        {
            _isSQLPrint = parmSQL;
            ConvertStatement(JavaWriter._Sql, "0", "0", JavaWriter._CMD_Connection, "Connection _conn = DriverManager.getConnection(\"jdbc:default:connection\");");
            ConvertStatement(JavaWriter._Sql, "0", "0", JavaWriter._CMD_Connection, "PreparedStatement _pstmnt   = null;");
            ConvertStatement(JavaWriter._Sql, "0", "0", JavaWriter._CMD_Connection, "String            _sqlQuery = null;");
            ConvertStatement(JavaWriter._Sql, "0", "0", JavaWriter._CMD_Connection, "boolean _isFound = false;");
            ConvertStatement(JavaWriter._Sql, "0", "0", JavaWriter._CMD_Connection, "int rowsUpdated  = 0;");
        }
        _isSQL = parmSQL;
    }
    public void SetRefCursor(boolean parmRefCursor)
    {
        if (parmRefCursor &&
           !_isRefCursorPrint)
        {
            SetSQL(true);
            _isRefCursorPrint = parmRefCursor;
            try {
                String          _targetDBMS     = Environment.Get("TargetDBMS");
                if (_targetDBMS.toUpperCase().startsWith("ORACLE"))
                {
                    ConvertStatement(JavaWriter._Sql, "0", "0", JavaWriter._CMD_Connection, "// Create any subsequent statements as a REF CURSOR");
                    ConvertStatement(JavaWriter._Sql, "0", "0", JavaWriter._CMD_Connection, "((OracleConnection)_conn).setCreateStatementAsRefCursor(true);");
                }
            }
            catch(Exception e)
            {
            }
        }
        _isRefCursor = parmRefCursor;
    }
    public void ConvertStatement(int parmType, String parmLines, String parmColumns, String parmCommand, String parmStatement) {
        TargetJava _target      = new TargetJava();
        _target._sourceLines    = parmLines;
        _target._sourceColumns  = parmColumns;
        _target._command        = parmCommand;
        _target._statement      = parmStatement;
        switch(parmType)
        {
            case 1:
                _javaStatement1.add(_target);
                break;
            case 2:
                _javaStatement2.add(_target);
                break;
            case 3:
                _javaStatement3.add(_target);
                break;
            case 4:
                _javaStatement4.add(_target);
                break;
            case 5:
                _javaStatement5.add(_target);
                break;
            case 6:
                _javaStatement6.add(_target);
                break;
            case 7:
                _javaStatement7.add(_target);
                break;
            case 8:
                _javaStatement8.add(_target);
                break;
            case 9:
                _javaStatement8.add(_target);
                break;
            default:
                break;
        }
    }
    public void WriteStatement()
    {
        _javaStatement1.add(_blankLine);
        _javaStatement2.add(_blankLine);
        for(int _loop = 0; _loop < _convComment.size(); _loop++)
        {
            _javaStatements.add(_convComment.get(_loop));
        }
        for(int _loop = 0; _loop < _javaStatement1.size(); _loop++)
        {
            _javaStatements.add(_javaStatement1.get(_loop));
        }
        for(int _loop = 0; _loop < _javaStatement2.size(); _loop++)
        {
            _javaStatements.add(_javaStatement2.get(_loop));
        }
        for(int _loop = 0; _loop < _javaStatement3.size(); _loop++)
        {
            _javaStatements.add(_javaStatement3.get(_loop));
        }
        for(int _loop = 0; _loop < _javaStatement4.size(); _loop++)
        {
            _javaStatements.add(_javaStatement4.get(_loop));
        }
        for(int _loop = 0; _loop < _javaStatement5.size(); _loop++)
        {
            _javaStatements.add(_javaStatement5.get(_loop));
        }
        for(int _loop = 0; _loop < _javaStatement6.size(); _loop++)
        {
            _javaStatements.add(_javaStatement6.get(_loop));
        }
        for(int _loop = 0; _loop < _javaStatement7.size(); _loop++)
        {
            _javaStatements.add(_javaStatement7.get(_loop));
        }
        for(int _loop = 0; _loop < _javaStatement8.size(); _loop++)
        {
            _javaStatements.add(_javaStatement8.get(_loop));
        }
        for(int _loop = 0; _loop < _javaStatement9.size(); _loop++)
        {
            _javaStatements.add(_javaStatement9.get(_loop));
        }
        int _javaLine = 0;
        Target _target = new Target();
//////        System.out.println("Delete=[" + _project + ":" + _program + "]");
        _target.Delete(_project, _program);
        int _level = 0;
        int _loop  = 0;
        TargetJava _java = null;
        for(; _loop < _javaStatements.size(); _loop++)
        {
            _java = _javaStatements.get(_loop);
            _java._sourceLines = _java._sourceLines.replaceAll(new String(JavaWriter._Seperator, 0, JavaWriter._Seperator.length), " ");
            _java._sourceColumns = _java._sourceColumns.replaceAll(new String(JavaWriter._Seperator, 0, JavaWriter._Seperator.length), " ");
            if (_java._statement.endsWith(_rParen))
            {
//////                System.out.println("PLSQL2Java:EndWith=[}],statement=[" + _java._statement + "]");
                _level--;
            }
            _java._statement = IntentStatement(_level, _java._statement);
            _target.Insert(_project, _program, (_loop + 1), _java._statement);
            System.out.print("Java Line=[" + String.format("%5s", _javaLine) + "],");
            System.out.print("SRCE Line=[" +  String.format("%-5s", _java._sourceLines).substring(0,5) + "],");
            System.out.print("SRCE Col=[" +  String.format("%-5s", _java._sourceColumns).substring(0,5) + "],");
            System.out.print("Java Cmd=[" +  String.format("%-10s", _java._command).substring(0,10) + "],");
            System.out.println("Java Stmt=[" +  String.format("%-100s", _java._statement) + "]");
            if (_java._statement.endsWith(_lParen))
            {
//////                System.out.println("PLSQL2Java:EndWith=[{],statement=[" + _java._statement + "]");
                _level++;
            }
        }
        if (_level > 0)
        {
            _java._statement = IntentStatement(_level, _java._statement, 1);
            _target.Insert(_project, _program, (_loop + 1), _java._statement);
            System.out.print("Java Line=[" + String.format("%5s", _javaLine) + "],");
            System.out.print("SRCE Line=[" +  String.format("%-5s", _java._sourceLines).substring(0,5) + "],");
            System.out.print("SRCE Col=[" +  String.format("%-5s", _java._sourceColumns).substring(0,5) + "],");
            System.out.print("Java Cmd=[" +  String.format("%-10s", _java._command).substring(0,10) + "],");
            System.out.println("Java Stmt=[" +  String.format("%-100s", _java._statement) + "]");
        }
    }
    public String IntentStatement(int parmLevel, String parmStatement)
    {
        return IntentStatement(parmLevel, parmStatement, 0);
    }
    public String IntentStatement(int parmLevel, String parmStatement, int parmSubstract)
    {
        String  _appendString   = "                                                                                                                                                                ";
        int     _defaultIntent  = 4;

        if (parmSubstract == 0)
        {
            if (parmLevel <= 0)
            {
            }
            else if (_appendString.length() <= (parmLevel * _defaultIntent))
            {
                parmStatement = _appendString + parmStatement;
            }
            else
            {
                parmStatement = _appendString.substring(0, parmLevel * _defaultIntent) + parmStatement;
            }
        }
        else
        {
//////            System.out.println("PLSQL2Java:parmStatement.length()=[" + parmStatement.length() + "], parmSubstract=[" + parmSubstract + "], _defaultIntent=[" + _defaultIntent + "]");
            if (parmStatement.length() > (parmSubstract * _defaultIntent))
            {
                parmStatement = parmStatement.substring(parmSubstract * _defaultIntent);
            }
            else
            {
                parmStatement = "";
            }
        }
        return parmStatement;
    }
}
