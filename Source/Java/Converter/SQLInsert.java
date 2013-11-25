package enCub.PLSQL.Converter;

import java.util.*;

public class SQLInsert extends PLSQLStatement {
    PLSQLStatement _plsqlStatement;
    public void Convert(List<PLSQLParsing> _selectList) {
        String  _sourceLines    = "";
        String  _sourceColumns  = "";
        String  _statement      = "";

        List<PLSQLData> _usingData  = new ArrayList<PLSQLData>();

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
            else if (GetCurrentType().equals("consume") &&
                     GetCurrentRule().equals("sql_insert") &&
                     GetCurrentToken().equals(";"))
            {
                GetNextPosition();
                continue;
            }
            else if (GetCurrentType().equals("enter") &&
                     GetCurrentRule().equals("values_clause"))
            {
                String _sourceVariable  = "";
                List<PLSQLData> _variables = new ArrayList<PLSQLData>();
                PLSQLData _variable = null;
                GetNextPosition();
                _statement += " " + GetNextToken();                         // VALUES
                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                GetNextPosition();
                _statement += GetNextToken();                               // LPAREN('(')
                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                GetNextPosition();
                while(true)
                {
                    if (GetCurrentType().equals("exit") &&
                        GetCurrentRule().equals("values_clause"))
                    {
                        GetNextPosition();
                        break;
                    }
                    GetNextToken();
//////            System.out.print("SQLInsert 1111111111111111,");
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
                    if (GetCurrentToken().equals(","))
                    {
                        _statement     += GetCurrentToken();
                        _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                        _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                    }
                    _sourceVariable = GetCurrentToken();
                    _statement += " ?";
                    _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                    _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                    GetNextPosition();
                    GetNextToken();
//////            System.out.print("SQLInsert 22222222222222222,");
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
                    if (GetCurrentToken().equals("."))
                    {
                        _sourceVariable += GetCurrentToken();
                        _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                        _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                        GetNextPosition();
                        GetNextToken();
                        _sourceVariable += GetCurrentToken();
                        _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                        _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                        GetNextPosition();
                        GetNextToken();
                    }
                    else
                    {
                        _statement     += GetCurrentToken();
                        _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                        _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                    }
                    _variables = GetData(_sourceVariable);
                    if (_variables.size() > 0)
                    {
                        _variable = new PLSQLData();
                        _variable = _variables.get(0);
                        _variable._dataname = _sourceVariable;
                        _usingData.add(_variable);
                    }
                    GetNextPosition();
                }
                continue;
//////                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            }
            if (!GetCurrentTokenName().equals(""))
            {
                if(_statement.equals(""))
                {
                    _statement = GetCurrentToken();
                }
                else
                {
                    _statement += " " + GetCurrentToken();
                }
            }
            System.out.print("SQLInsert,");
            System.out.print("SEQ=" + GetCurrentPosition() + ",");
            System.out.print("Type=" + GetCurrentType());
            System.out.print(",Level=" + GetCurrentLevel());
            System.out.print(",Rule=" + GetCurrentRule());
            System.out.print(",Line=" + GetCurrentLine());
            System.out.print(",Column=" + GetCurrentColumn());
            System.out.print(",Length=" + GetCurrentLength());
            System.out.print(",Token=" + GetCurrentToken());
            System.out.print(",TokenNo=" + GetCurrentTokenNo());
            System.out.println(",TokenName=" + GetCurrentTokenName());
            GetNextPosition();
        }
        System.out.println("Statement=[" + _statement + "]");
        _statement = "_sqlQuery = \"" + _statement + "\";";
        ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Insert, _statement);
        _statement      = "_pstmnt = _conn.prepareStatement(_sqlQuery);";
        ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Insert, _statement);
//////        System.out.println("_usingData.size()=[" + _usingData.size() + "]");
        String _javaType = "";
        for(int _loop = 0; _loop < _usingData.size(); _loop++)
        {
            PLSQLData _plsqlData = _usingData.get(_loop);
            _javaType = GetJavaType(_plsqlData._datatype, _plsqlData._length, _plsqlData._precision);
            if (_javaType.equals("Unknown"))
            {
                if (_plsqlData._inout.toUpperCase().indexOf("OUT") >= 0)
                {
                    _statement = "/* _pstmnt.set" + _javaType + "(" + (_loop + 1) + ", " +_plsqlData._dataname + "[0]); */";
                }
                else
                {
                    _statement = "/* _pstmnt.set" + _javaType + "(" + (_loop + 1) + ", " +_plsqlData._dataname + "); */";
                }
//////                System.out.println("Dataname=[" + _plsqlData._dataname + "], Datatype=[" + _plsqlData._datatype + "], Length=[" + _plsqlData._length + "], Precision=[" + _plsqlData._precision + "], InOut=[" + _plsqlData._inout + "],JavaType=[" + _javaType + "]");
            }
            else
            {
                if (_plsqlData._inout.toUpperCase().indexOf("OUT") >= 0)
                {
                    _statement = "_pstmnt.set" + _javaType + "(" + (_loop + 1) + ", " + _plsqlData._dataname + "[0]);";
                }
                else
                {
                    _statement = "_pstmnt.set" + _javaType + "(" + (_loop + 1) + ", " + _plsqlData._dataname + ");";
                }
//////                System.out.println("Dataname=[" + _plsqlData._dataname + "], Datatype=[" + _plsqlData._datatype + "], Length=[" + _plsqlData._length + "], Precision=[" + _plsqlData._precision + "], InOut=[" + _plsqlData._inout + "],JavaType=[" + _javaType + "]");
            }
            ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Insert, _statement);
        }
        _sourceLines    = "0";
        _sourceColumns  = "0";
        _statement = "rowsUpdated = _pstmnt.executeUpdate();";
        ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Insert, _statement);
    }
}
