package enCub.PLSQL.Converter;

import java.util.*;

public class SQLFetch extends PLSQLStatement {
    PLSQLStatement _plsqlStatement;
    public void Convert(List<PLSQLParsing> _selectList) {
        String  _sourceLines    = "";
        String  _sourceColumns  = "";
        String  _statement      = "";
        String  _cursor         = "";

        List<PLSQLData> _selectVariables    = new ArrayList<PLSQLData>();
        List<String>    _parameters         = new ArrayList<String>();
        List<PLSQLData> _fetchData          = new ArrayList<PLSQLData>();
        List<PLSQLData> _variables          = new ArrayList<PLSQLData>();
        PLSQLData       _variable           = null;

        _sourceLines    = "";
        _sourceColumns  = "";
        _statement      = "";

        SetSQL(true);

        while(true)
        {
            if (GetCurrentType() == null ||
                GetCurrentPosition() == -1)
            {
                break;
            }
            else if (GetCurrentType().equals("enter") &&
                     GetCurrentRule().equals("fetch_statement"))
            {
                GetNextPosition();
                GetNextToken();                                                 // FETCH
                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                GetNextPosition();
                _cursor         = GetNextToken();                               // CursorName
                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                GetNextPosition();
                GetNextTokenName();                                             // INTO or bulk_collect_into_clause
                if (GetCurrentTokenName().equals("INTO"))
                {
                    _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                    _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                    while(true)
                    {
                        GetNextPosition();
                        GetNextTokenName();
                        if (GetCurrentTokenName().equals("';'"))
                        {
                            _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                            _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                            GetNextPosition();
                            break;
                        }
                        else if (GetCurrentTokenName().equals("VARIABLE_NAME"))
                        {
                            _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                            _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                            _parameters.add(GetCurrentToken());
                            _variables = GetData(GetCurrentToken());
                            _variable = new PLSQLData();
                            _variable = _variables.get(0);
                            _variable._dataname = GetCurrentToken();
                            _fetchData.add(_variable);
                        }
//////            System.out.print("SQLFetch:");
//////            System.out.print("_parameters.size()=[" + _parameters.size() + "]");
//////            System.out.print("SEQ=" + GetCurrentPosition() + ",");
//////            System.out.print("Type=" + GetCurrentType());
//////            System.out.print(",Level=" + GetCurrentLevel());
//////            System.out.print(",Rule=" + GetCurrentRule());
//////            System.out.print(",Line=" + GetCurrentLine());
//////            System.out.print(",Column=" + GetCurrentColumn());
//////            System.out.print(",Length=" + GetCurrentLength());
//////            System.out.print(",Token=" + GetCurrentToken());
//////            System.out.print(",TokenNo=" + GetCurrentTokenNo());
//////            System.out.println(",TokenName=" + GetCurrentTokenName());
                    }
                    _statement = "_isFound = _rs_" + _cursor + ".next();";
                    ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Fetch, _statement);
                }
                else
                {
                    while(true)
                    {
                        if (GetCurrentType() == null ||
                            GetCurrentPosition() == -1)
                        {
                            break;
                        }
                        _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                        _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                        GetNextPosition();
                        GetNextTokenName();
                    }
                    System.err.println("Fetch ... bulk_collect_into_clause is not support.[" + _sourceLines + "]");
                    return;
                }
                continue;
            }
//////            System.out.print("SQLFetch:");
//////            System.out.print("SEQ=" + GetCurrentPosition() + ",");
//////            System.out.print("Type=" + GetCurrentType());
//////            System.out.print(",Level=" + GetCurrentLevel());
//////            System.out.print(",Rule=" + GetCurrentRule());
//////            System.out.print(",Line=" + GetCurrentLine());
//////            System.out.print(",Column=" + GetCurrentColumn());
//////            System.out.print(",Length=" + GetCurrentLength());
//////            System.out.print(",Token=" + GetCurrentToken());
//////            System.out.print(",TokenNo=" + GetCurrentTokenNo());
//////            System.out.println(",TokenName=" + GetCurrentTokenName());
            GetNextPosition();
        }

        SetFetchVariable(_cursor, _fetchData);

        if (_parameters.size() > 0)
        {
//////            List<PLSQLData> _cursorVariables    = GetCursorVariable(_cursor);
            String          _javaType           = "";
            _statement = "if(_isFound) {";
            ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Fetch, _statement);
//////            for(int _loop = 0; _loop < _cursorVariables.size(); _loop++)
//////            {
//////                PLSQLData _plsqlData = _cursorVariables.get(_loop);
//////                _javaType = GetJavaType(_plsqlData._datatype, _plsqlData._length, _plsqlData._precision);
//////                System.out.println("SQLFetch:_plsqlData._dataname=[" + _plsqlData._dataname + "],_plsqlData._datatype=[" + _plsqlData._datatype + "], _javaType=[" + _javaType + "]");
//////                if (_javaType.equals("Unknown"))
//////                {
////////////                    _statement = "/* " + _parameters.get(_loop) + " = _rs_" + _cursor + ".get" + _javaType + "(" + _plsqlData._dataname + "); */";
//////                    _statement = "/* " + _parameters.get(_loop) + " = _rs_" + _cursor + ".get" + _javaType + "(" + (_loop + 1) + "); */";
////////////                    System.out.println("Dataname=[" + _plsqlData._dataname + "], Datatype=[" + _plsqlData._datatype + "], Length=[" + _plsqlData._length + "], Precision=[" + _plsqlData._precision + "], InOut=[" + _plsqlData._inout + "],JavaType=[" + _javaType + "]");
//////                }
//////                else
//////                {
////////////                    _statement = _parameters.get(_loop) + " = _stmt_" + _cursor + ".get" + _javaType + "(" + _plsqlData._dataname + ");";
//////                    _statement = _parameters.get(_loop) + " = _stmt_" + _cursor + ".get" + _javaType + "(" + (_loop + 1) + ");";
////////////                    System.out.println("Dataname=[" + _plsqlData._dataname + "], Datatype=[" + _plsqlData._datatype + "], Length=[" + _plsqlData._length + "], Precision=[" + _plsqlData._precision + "], InOut=[" + _plsqlData._inout + "],JavaType=[" + _javaType + "]");
//////                }
//////                ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Fetch, _statement);
//////            }
//////            _statement = "}";
//////            ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Fetch, _statement);
            List<PLSQLData> _fetchVariables     = GetFetchVariable(_cursor);
//////            System.out.println("SQLFetch:_fetchVariables.size()=[" + _fetchVariables.size() + "]");
            for(int _loop = 0; _loop < _fetchVariables.size(); _loop++)
            {
                PLSQLData _plsqlData = _fetchVariables.get(_loop);
                _javaType = GetJavaType(_plsqlData._datatype, _plsqlData._length, _plsqlData._precision);
//////                System.out.println("SQLFetch:_plsqlData._dataname=[" + _plsqlData._dataname + "],_plsqlData._datatype=[" + _plsqlData._datatype + "], _javaType=[" + _javaType + "]");
                if (_javaType.equals("Unknown"))
                {
//////                    _statement = "/* " + _parameters.get(_loop) + " = _rs_" + _cursor + ".get" + _javaType + "(" + _plsqlData._dataname + "); */";
//////                    _statement = "/* " + _parameters.get(_loop) + " = _rs_" + _cursor + ".get" + _javaType + "(" + (_loop + 1) + "); */";
                    if (_plsqlData._inout.toUpperCase().indexOf("OUT") >= 0)
                    {
                        _statement = "/* " + _parameters.get(_loop) + "[0] = _rs_" + _cursor + ".get" + _javaType + "(" + (_loop + 1) + "); */";
                    }
                    else
                    {
                        _statement = "/* " + _parameters.get(_loop) + " = _rs_" + _cursor + ".get" + _javaType + "(" + (_loop + 1) + "); */";
                    }
//////                    System.out.println("Dataname=[" + _plsqlData._dataname + "], Datatype=[" + _plsqlData._datatype + "], Length=[" + _plsqlData._length + "], Precision=[" + _plsqlData._precision + "], InOut=[" + _plsqlData._inout + "],JavaType=[" + _javaType + "]");
                }
                else
                {
//////                    _statement = _parameters.get(_loop) + " = _stmt_" + _cursor + ".get" + _javaType + "(" + _plsqlData._dataname + ");";
//////                    _statement = _parameters.get(_loop) + " = _stmt_" + _cursor + ".get" + _javaType + "(" + (_loop + 1) + ");";
                    if (_plsqlData._inout.toUpperCase().indexOf("OUT") >= 0)
                    {
                        _statement = _parameters.get(_loop) + "[0] = _rs_" + _cursor + ".get" + _javaType + "(" + (_loop + 1) + ");";
                    }
                    else
                    {
                        _statement = _parameters.get(_loop) + " = _rs_" + _cursor + ".get" + _javaType + "(" + (_loop + 1) + ");";
                    }
//////                    System.out.println("Dataname=[" + _plsqlData._dataname + "], Datatype=[" + _plsqlData._datatype + "], Length=[" + _plsqlData._length + "], Precision=[" + _plsqlData._precision + "], InOut=[" + _plsqlData._inout + "],JavaType=[" + _javaType + "]");
                }
                ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Fetch, _statement);
            }
            _statement = "}";
            ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Fetch, _statement);
        }
    }
}
