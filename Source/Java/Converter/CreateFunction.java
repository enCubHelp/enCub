package enCub.PLSQL.Converter;

import java.util.*;

public class CreateFunction extends PLSQLStatement {
    PLSQLStatement _plsqlStatement;
    public void Convert(List<PLSQLParsing> _selectList) {
        String          _token          = "";
        String          _tokenName      = "";
        String          _schemaName     = "";
        String          _procedureName  = "";
        String          _lines          = "";
        String          _columns        = "";
        String          _inout          = "";
        String          _parameter      = "";
        String          _datatype       = "";
        int             _length         = 0;
        int             _precision      = 0;
        String          _initValue      = "";
        String          _sourceLines    = "";
        String          _sourceColumns  = "";
        String          _statement      = "";
        String          _cursorName     = "";
        String          _leftParen      = "'('";
        String          _rightParen     = "')'";
        String          _comma          = "','";
        if (GetCurrentRule().equals("body") &&
            GetCurrentTokenName().equals("END"))
        {
            while(true)
            {
                if (GetCurrentRule() == null)
                {
                    break;
                }
                if (GetCurrentTokenName().equals("END"))
                {
                    _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                    _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                }
                else if (GetCurrentTokenName().equals("END"))
                {
                    _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                    _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                }
                else if (GetCurrentTokenName().equals("';'"))
                {
                    _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                    _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                }
//////                System.out.print("SEQ=" + GetCurrentPosition() + ",");
//////                System.out.print("Type=" + GetCurrentType());
//////                System.out.print(",Level=" + GetCurrentLevel());
//////                System.out.print(",Rule=" + GetCurrentRule());
//////                System.out.print(",Line=" + GetCurrentLine());
//////                System.out.print(",Column=" + GetCurrentColumn());
//////                System.out.print(",Length=" + GetCurrentLength());
//////                System.out.print(",Token=" + GetCurrentToken());
//////                System.out.print(",TokenNo=" + GetCurrentTokenNo());
//////                System.out.println(",TokenName=" + GetCurrentTokenName());
                GetNextPosition();
            }
            _statement      = "}";
            ConvertStatement(JavaWriter._End, _sourceLines, _sourceColumns, JavaWriter._CMD_EndProc, _statement);
        }
        else
        {
            while(true)
            {
                if (GetCurrentRule() == null)
                {
                    break;
                }
                else if (GetCurrentType().equals("exit") &&
                         GetCurrentRule().equals("create_function"))
                {
                    break;
                }
                else if (GetCurrentRule().equals("start") ||
                         GetCurrentRule().equals("statement"))
                {
                    GetNextRule();
                    continue;
                }
                else if (GetCurrentRule().equals("create_function") &&
                         GetCurrentTokenName().equals(""))
                {
                    GetNextToken();                                         // CREATE
                    while(!GetCurrentTokenName().equals("FUNCTION"))        // skip OR REPLACE
                    {
                        GetNextPosition();
                    }
                    GetNextPosition();                                      // skip FUNCTION
                    _procedureName = GetNextToken();                        // PROCEDURE-NAME
                    GetNextPosition();
                    GetNextTokenName();
                    if (GetCurrentTokenName().equals(_leftParen))
                    {
                        GetNextPosition();
                        while(!GetCurrentTokenName().equals(_rightParen))
                        {
                            if (GetCurrentType().equals("exit"))
                            {
                                GetNextPosition();
                                continue;
                            }
                            else if (GetCurrentRule().equals("parameter"))
                            {
                                _parameter = GetNextToken();
                                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                            }
                            else if (GetCurrentTokenName().equals("IN"))
                            {
                                _inout = "IN";
                                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                            }
                            else if (GetCurrentTokenName().equals("OUT"))
                            {
                                _inout += "OUT";
                                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                            }
                            else if (GetCurrentRule().equals("datatypes"))
                            {
                                GetNextPosition();
                                _datatype = GetNextTokenName();
                                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                            }
                            else if (GetCurrentTokenName().equals(_comma))
                            {
                                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                                if (_inout.equals("OUT") ||
                                    _inout.equals("IN OUT"))
                                {
                                    _statement  = GetJavaType(_datatype, _length, _precision) + "[] " + _parameter + GetCurrentToken();
                                }
                                else
                                {
                                    _statement  = GetJavaType(_datatype, _length, _precision) + " " + _parameter + GetCurrentToken();
                                }
                                AddData(_parameter, _datatype, _length, _precision, _inout);
                                ConvertStatement(JavaWriter._Parameter, _sourceLines, _sourceColumns, JavaWriter._CMD_Parameter, _statement);
                                _parameter      = "";
                                _datatype       = "";
                                _length         = 0;
                                _precision      = 0;
                                _inout          = "";
                                _sourceLines    = "";
                                _sourceColumns  = "";
                                _statement      = "";
                            }
                            GetNextPosition();
                        }
                        if (_inout.equals("OUT") ||
                            _inout.equals("IN OUT"))
                        {
                            _statement  = GetJavaType(_datatype, _length, _precision) + "[] " + _parameter + GetCurrentToken() + " throws SQLException";
                        }
                        else
                        {
                            _statement  = GetJavaType(_datatype, _length, _precision) + " " + _parameter + GetCurrentToken() + " throws SQLException";
                        }
                        AddData(_parameter, _datatype, _length, _precision, _inout);
                        ConvertStatement(JavaWriter._Parameter, _sourceLines, _sourceColumns, JavaWriter._CMD_Parameter, _statement);
                        _parameter      = "";
                        _datatype       = "";
                        _length         = 0;
                        _precision      = 0;
                        _inout          = "";
                        _sourceLines    = "";
                        _sourceColumns  = "";
                        _statement      = "";
                    }
                    GetNextPosition();
                    continue;
                }
                else if (GetCurrentRule().equals("create_function") &&
                         GetCurrentTokenName().equals("RETURN"))
                {
                    GetNextPosition();
                    String _returnType = GetNextToken();
                    ConvertStatement(JavaWriter._Procedure, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, "public class " + GetProgram() + " {");
//////                    System.out.println("CreateFunction:_returnType=[" + _returnType + "], GetJavaType=[" + GetJavaType(_returnType, 0, 0) + "]");
                    ConvertStatement(JavaWriter._Procedure, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, "public static " + GetJavaType(_returnType, 0, 0) + " " + _procedureName + "(");
                }
                else if (GetCurrentRule().equals("create_function") &&
                        (GetCurrentTokenName().equals("IS") ||
                         GetCurrentTokenName().equals("AS")))
                {
                    while(true)
                    {
                        if (GetCurrentRule().equals("body"))
                        {
                            break;
                        }
                        if (GetCurrentTokenName().equals("VARIABLE_NAME"))
                        {
//////                            System.out.println("<<<<<<<<<<<<<<<<<<<<< VARIABLE_NAME >>>>>>>>>>>>>>>>>>>>>>");
                            _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                            _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                            _parameter      = GetCurrentToken();
//////                            System.out.println("CreateFunction:Variable=[" + _parameter + "]");
                            GetNextPosition();
                            GetNextRule();
                            if (GetCurrentRule() != null &&
                               (GetCurrentRule().equals("datatypes") ||
                                GetCurrentRule().equals("type")))
                            {
                                _datatype = GetNextToken();
                            }
                            else
                            {
                                GetNextPosition();
                                _datatype = "";
                            }
//////                            System.out.println("CreateFunction:Variable=[" + _parameter + "],_datatype=[" + _datatype + "]");
                            GetNextPosition();
                            GetNextTokenName();
//////                            System.out.println("CreateFunction:GetCurrentTokenName()=[" + GetCurrentTokenName() + "]");
                            if (GetCurrentTokenName() != null &&
                                GetCurrentTokenName().equals("'('"))
                            {
                                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                                GetNextPosition();
                                _length = Integer.parseInt(GetNextToken());
                                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                                GetNextPosition();
                                GetNextTokenName();
                                if (GetCurrentTokenName().equals("','"))
                                {
                                    _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                                    _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                                    GetNextPosition();
                                    _precision = Integer.parseInt(GetNextToken());
                                    _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                                    _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                                }
                                else
                                {
                                    _length     = 0;
                                }
                            }
                            else
                            {
                                _length     = 0;
                                _precision  = 0;
                            }
                            if (GetCurrentTokenName() != null &&
                                GetCurrentTokenName().equals("PLSQL_ASSIGN"))
                            {
                                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                                GetNextPosition();
                                GetNextTokenName();
                                _initValue = GetCurrentToken();
                            }
//////                            System.out.println("CreateFunction:Variable=[" + _parameter + "],_datatype=[" + _datatype + "],_length=[" + _length + "],_precision=[" + _precision + "],_initValue=[" + _initValue + "]");
                            while(true)
                            {
                                if (GetCurrentTokenName() == null ||
                                    GetCurrentTokenName().equals("';'"))
                                {
                                    break;
                                }
//////                                System.out.println("Create Function:GetCurrentTokenName()=[" + GetCurrentTokenName() + "]");
                                GetNextPosition();
                            }
                            AddData(_parameter, _datatype, _length, _precision, _inout);
//////                            System.out.println("CreateFunction:_parameter=[" + _parameter + "], _datatype=[" + _datatype + "]");
                            _statement  = GetJavaType(_datatype, _length, _precision) + " " + _parameter;
                            if (!_initValue.equals(""))
                            {
                                if (GetJavaType(_datatype, _length, _precision).equals("BigDecimal"))
                                {
                                    _statement += " = new BigDecimal(" + _initValue + ")";
                                }
                                else if (GetJavaType(_datatype, _length, _precision).equals("String"))
                                {
                                    if (_initValue.substring(0,1).equals("'"))
                                    {
                                        _initValue = _initValue.replaceAll("'", "\"");
                                    }
                                    _statement += " = new String(" + _initValue + ")";
                                }
                            }
                            ConvertStatement(JavaWriter._Variable, _sourceLines, _sourceColumns, JavaWriter._CMD_Parameter, _statement + ";");
//////                            System.out.println("CreateFunction:_statement=[" + _statement + "]");
                            if (_datatype.toUpperCase().equals("SYS_REFCURSOR"))
                            {
                                SetRefCursor(true);
                            }
                            _parameter      = "";
                            _datatype       = "";
                            _length         = 0;
                            _precision      = 0;
                            _inout          = "OUT";
                            _sourceLines    = "";
                            _sourceColumns  = "";
                            _statement      = "";
                        }
                        else if (GetCurrentTokenName().equals("CURSOR"))
                        {
//////                            System.out.println("<<<<<<<<<<<<<<<<<<<<< CUROSR >>>>>>>>>>>>>>>>>>>>>>");
                            SetSQL(true);
                            String _cursor = null;
                            List<PLSQLData> _variables  = new ArrayList<PLSQLData>();
//////                            List<PLSQLData> _fetchData  = new ArrayList<PLSQLData>();
                            List<PLSQLData> _usingData  = new ArrayList<PLSQLData>();
                            PLSQLData       _variable   = null;

                            GetNextPosition();

                            _cursor = GetNextToken();
                            _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                            _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                            while(true)                     // skip cursor_parameter_dec and IS
                            {
                                if (GetCurrentTokenName().equals("IS"))
                                {
                                    break;
                                }
                                GetNextPosition();
                            }
                            GetNextPosition();
                            boolean _isSelect   = false;
                            boolean _isWhere    = false;
                            while(true)
                            {
                                if (GetCurrentTokenName().equals("SELECT"))
                                {
                                    _statement = GetCurrentToken();
                                    _isSelect = true;
                                }
                                else if (GetCurrentTokenName().equals("FROM"))
                                {
                                    _statement += " " + GetCurrentToken();
                                    _isSelect = false;
                                }
                                else if (GetCurrentTokenName().equals("';'"))
                                {
                                    _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                                    _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
//////                                    System.out.println("===================== statement = [" + _statement + "]");
                                    _statement      = "String _str_" + _cursor + " = \"" + _statement + "\";";
                                    ConvertStatement(JavaWriter._Sql, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Cursor, _statement);
//////                                    _statement      = "PreparedStatement  _stmt_" + _cursor + " = _conn.prepareStatement(_str_" + _cursor + ");";
                                    _statement      = "_pstmnt = _conn.prepareStatement(_str_" + _cursor + ");";
                                    ConvertStatement(JavaWriter._Sql, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Cursor, _statement);
                                    _sourceLines    = "";
                                    _sourceColumns  = "";
                                    _statement      = "";
                                    SetCursorVariable(_cursor, _usingData);
//////                                    SetFetchVariable(_cursor, _fetchData);
                                    break;
                                }
                                else if (GetCurrentTokenName().equals("VARIABLE_NAME"))
                                {
                                    _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                                    _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                                    _variables = GetData(GetCurrentToken());
                                    if (_variables.size() > 0)
                                    {
                                        _variable = new PLSQLData();
                                        _variable = _variables.get(0);
                                        _variable._dataname = GetCurrentToken();
                                        _usingData.add(_variable);
                                        _statement     += " ?";
                                    }
                                    else
                                    {
                                        _statement     += " " + GetCurrentToken();
                                    }
//////                                    if (_isSelect)
//////                                    {
//////                                        _variable = new PLSQLData();
//////                                        _variable = _variables.get(0);
//////                                        _variable._dataname = GetCurrentToken();
//////                                        _fetchData.add(_variable);
//////                                    }
                                }
                                else if (!GetCurrentTokenName().equals(""))
                                {
                                    _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                                    _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                                    _statement     += " " + GetCurrentToken();
                                }
                                GetNextPosition();
                                GetNextTokenName();
                            }
                        }
//////                        System.out.print("CreateFunction");
//////                        System.out.print("SEQ=" + GetCurrentPosition() + ",");
//////                        System.out.print("Type=" + GetCurrentType());
//////                        System.out.print(",Level=" + GetCurrentLevel());
//////                        System.out.print(",Rule=" + GetCurrentRule());
//////                        System.out.print(",Line=" + GetCurrentLine());
//////                        System.out.print(",Column=" + GetCurrentColumn());
//////                        System.out.print(",Length=" + GetCurrentLength());
//////                        System.out.print(",Token=" + GetCurrentToken());
//////                        System.out.print(",TokenNo=" + GetCurrentTokenNo());
//////                        System.out.println(",TokenName=" + GetCurrentTokenName());
                        GetNextPosition();
                    }
                }
                else if (GetCurrentRule().equals("body") &&
                         GetCurrentTokenName().equals("BEGIN"))
                {
                    _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                    _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                    _statement      = "{";
                    ConvertStatement(JavaWriter._Parameter, _sourceLines, _sourceColumns, JavaWriter._CMD_Parameter, _statement);
                    _sourceLines    = "";
                    _sourceColumns  = "";
                    _statement      = "";
                }
//////                System.out.print("CreateFunction,");
//////                System.out.print("SEQ=" + GetCurrentPosition() + ",");
//////                System.out.print("Type=" + GetCurrentType());
//////                System.out.print(",Level=" + GetCurrentLevel());
//////                System.out.print(",Rule=" + GetCurrentRule());
//////                System.out.print(",Line=" + GetCurrentLine());
//////                System.out.print(",Column=" + GetCurrentColumn());
//////                System.out.print(",Length=" + GetCurrentLength());
//////                System.out.print(",Token=" + GetCurrentToken());
//////                System.out.print(",TokenNo=" + GetCurrentTokenNo());
//////                System.out.println(",TokenName=" + GetCurrentTokenName());
                GetNextPosition();
            }
        }
    }
}
