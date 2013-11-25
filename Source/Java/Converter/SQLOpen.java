package enCub.PLSQL.Converter;

import java.util.*;

public class SQLOpen extends PLSQLStatement {
    PLSQLStatement _plsqlStatement;
    public void Convert(List<PLSQLParsing> _selectList) {
        String  _sourceLines    = "";
        String  _sourceColumns  = "";
        String  _statement      = "";
        String  _cursor         = "";

        List<String> _parameters = new ArrayList<String>();
        List<PLSQLData> _fetchData  = new ArrayList<PLSQLData>();
        List<PLSQLData> _variables  = new ArrayList<PLSQLData>();
        PLSQLData       _variable   = null;

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
                     GetCurrentRule().equals("open_statement"))
            {
                GetNextPosition();
                GetNextToken();                                                 // OPEN
                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                GetNextPosition();
                _cursor         = GetNextToken();                               // CursorName
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
                    else if (GetCurrentTokenName().equals("VARIABLE"))
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
                }
                continue;
            }
//////            System.out.print("??????SEQ=" + GetCurrentPosition() + ",");
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
//////        System.out.println("SQLFetch:_fetchData.size()=[" + _fetchData.size() + "]");
        if (_fetchData.size() > 0)
        {
            SetFetchVariable(_cursor, _fetchData);
        }
        if (_parameters.size() > 0)
        {
        }
        else
        {
            List<PLSQLData> _cursorVariables    = GetCursorVariable(_cursor);
            String          _javaType           = "";
            for(int _loop = 0; _loop < _cursorVariables.size(); _loop++)
            {
                PLSQLData _plsqlData = _cursorVariables.get(_loop);
                _javaType = GetJavaType(_plsqlData._datatype, _plsqlData._length, _plsqlData._precision);
                if (_javaType.equals("Unknown"))
                {
//////                    _statement = "/* _stmt_" + _cursor + ".set" + _javaType + "(" + _plsqlData._dataname + "); */";
                    _statement = "/* _pstmnt.set" + _javaType + "(" + (_loop + 1) + "," + _plsqlData._dataname + "); */";
//////                    System.out.println("Dataname=[" + _plsqlData._dataname + "], Datatype=[" + _plsqlData._datatype + "], Length=[" + _plsqlData._length + "], Precision=[" + _plsqlData._precision + "], InOut=[" + _plsqlData._inout + "],JavaType=[" + _javaType + "]");
                }
                else
                {
//////                    _statement = "_stmt_" + _cursor + ".set" + _javaType + "(" + _plsqlData._dataname + ");";
                    _statement = "_pstmnt.set" + _javaType + "(" + (_loop + 1) + ","  + _plsqlData._dataname + ");";
//////                    System.out.println("Dataname=[" + _plsqlData._dataname + "], Datatype=[" + _plsqlData._datatype + "], Length=[" + _plsqlData._length + "], Precision=[" + _plsqlData._precision + "], InOut=[" + _plsqlData._inout + "],JavaType=[" + _javaType + "]");
                }
                ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Open, _statement);
            }
//////            _statement = "ResultSet _rs_" + _cursor + " = _stmt_" + _cursor + ".executeQuery(" + _cursor + ");";
            _statement = "ResultSet _rs_" + _cursor + " = _pstmnt.executeQuery();";
            ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Open, _statement);
        }
    }
}
