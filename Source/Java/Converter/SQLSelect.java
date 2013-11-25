package enCub.PLSQL.Converter;

import java.util.*;

public class SQLSelect extends PLSQLStatement {
    PLSQLStatement _plsqlStatement;
    public void Convert(List<PLSQLParsing> _selectList) {
        String  _sourceLines    = "";
        String  _sourceColumns  = "";
        String  _statement      = "";

        List<PLSQLData> _usingData  = new ArrayList<PLSQLData>();

        _sourceLines    = "0";
        _sourceColumns  = "0";
        _statement      = "_pstmt = con.createStatement();";
        ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Select, _statement);

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
                     GetCurrentRule().equals("query_block"))
            {
                _statement = GetNextToken();                    // Select
                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                GetNextPosition();
                continue;
            }
            else if (GetCurrentType().equals("enter") &&
                     GetCurrentRule().equals("dml_table_expression_clause"))
            {
                while(true)
                {
                    if (GetCurrentType().equals("exit") &&
                        GetCurrentRule().equals("dml_table_expression_clause"))
                    {
                        GetNextPosition();
                        break;
                    }
                    if (GetCurrentToken().equals("."))
                    {
                        _statement += GetCurrentToken();
                        _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                        _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                        GetNextPosition();
                        _statement += GetNextToken();
                        _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                        _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                    }
                    else if (!GetCurrentToken().equals(""))
                    {
                        _statement += " " + GetCurrentToken();
                        _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                        _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                    }
                    GetNextPosition();
                }
                continue;
            }
            else if (GetCurrentType().equals("enter") &&
                     GetCurrentRule().equals("where_clause"))
            {
                _statement += " " + GetNextToken();
                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
//////                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                GetNextPosition();
                String _sourceVariable  = "";
                String _operator        = "";
                String _targetVariable  = "";
                String _betweenAnd      = "";
                String _betweenVariable = "";
                List<PLSQLData> _variables = new ArrayList<PLSQLData>();
                PLSQLData _variable = null;
                while(true)
                {
                    if (GetCurrentType() == null)
                    {
                        break;
                    }
                    GetNextToken();
                    _sourceVariable = GetCurrentToken();
                    GetNextPosition();
                    GetNextToken();
                    if (GetCurrentTokenName().equals("'.'"))
                    {
                        _sourceVariable += GetCurrentToken();
                        GetNextPosition();
                        GetNextToken();
                        _sourceVariable += GetCurrentToken();
                        GetNextPosition();
                        GetNextToken();
                    }
                    _variables = GetData(_sourceVariable);
                    if (_variables.size() > 0)
                    {
                        _variable = new PLSQLData();
                        _variable = _variables.get(0);
                        _variable._dataname = _sourceVariable;
                        _usingData.add(_variable);
                        _sourceVariable = "?";
                    }
                    _operator = GetCurrentToken();
                    GetNextPosition();
                    GetNextToken();
                    _targetVariable = GetCurrentToken();
                    GetNextPosition();
                    GetNextToken();
                    if (GetCurrentTokenName().equals("'.'"))
                    {
                        _targetVariable += GetCurrentToken();
                        GetNextPosition();
                        GetNextToken();
                        _targetVariable += GetCurrentToken();
                        GetNextPosition();
                        GetNextToken();
                    }
                    _variables = GetData(_targetVariable);
                    if (_variables.size() > 0)
                    {
                        _variable = new PLSQLData();
                        _variable = _variables.get(0);
                        _variable._dataname = _targetVariable;
                        _usingData.add(_variable);
                        _targetVariable = "?";
                    }
                    if (_operator.toUpperCase().equals("BETWEEN"))
                    {
                        _betweenAnd         = GetCurrentToken();
                        GetNextPosition();
                        GetNextToken();
                        _betweenVariable    = GetCurrentToken();
                        GetNextPosition();
                        GetNextToken();
                        if (GetCurrentTokenName().equals("'.'"))
                        {
                            _betweenVariable += GetCurrentToken();
                            GetNextPosition();
                            GetNextToken();
                            _betweenVariable += GetCurrentToken();
                            GetNextPosition();
                            GetNextToken();
                        }
                        _variables = GetData(_betweenVariable);
                        if (_variables.size() > 0)
                        {
                            _variable = new PLSQLData();
                            _variable = _variables.get(0);
                            _variable._dataname = _betweenVariable;
                            _usingData.add(_variable);
                            _betweenVariable = "?";
                        }
                    }
                    else
                    {
                        _betweenAnd         = "";
                        _betweenVariable    = "";
                    }
                    if (GetCurrentTokenName().equals("AND") ||
                        GetCurrentTokenName().equals("OR"))
                    {
                        if (_betweenAnd.equals(""))
                        {
                            _statement += " " + _sourceVariable + " " + _operator + " " + _targetVariable + " " + GetCurrentToken();
//////                            System.out.println("Where=[" + _sourceVariable + " " + _operator + " " + _targetVariable + " " + GetCurrentToken() + "]");
                        }
                        else
                        {
                            _statement += " " + _sourceVariable + " " + _operator + " " + _targetVariable + " " + _betweenAnd + " " + _betweenVariable + " " + GetCurrentToken();
//////                            System.out.println("Where=[" + _sourceVariable + " " + _operator + " " + _targetVariable + " " + _betweenAnd + " " + _betweenVariable + " " + GetCurrentToken() + "]");
                        }
                    }
                    else
                    {
                        if (_betweenAnd.equals(""))
                        {
                            _statement += " " + _sourceVariable + " " + _operator + " " + _targetVariable;
//////                            System.out.println("Where=[" + _sourceVariable + " " + _operator + " " + _targetVariable + "]");
                        }
                        else
                        {
                            _statement += " " + _sourceVariable + " " + _operator + " " + _targetVariable + " " + _betweenAnd + " " + _betweenVariable;
//////                            System.out.println("Where=[" + _sourceVariable + " " + _operator + " " + _targetVariable + " " + _betweenAnd + " " + _betweenVariable + " " + "]");
                        }
                        GetPrevToken();
                        break;
                    }
                    if (GetCurrentType().equals("exit") &&
                        GetCurrentRule().equals("where_clause"))
                    {
                        break;
                    }
                    GetNextPosition();
                }
//////                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            }
//////            System.out.print("SQLSelect,");
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
        System.out.println("Statement=[" + _statement + "]");
        _statement = "_sqlQuery = \"" + _statement + "\";";
        ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Select, _statement);
        _statement = "_pstmnt = _conn.prepareStatement(_sqlQuery);";
        ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Select, _statement);
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
                    _statement = "/* _pstmnt.set" + _javaType + "(" + _plsqlData._dataname + "[0]); */";
                }
                else
                {
                    _statement = "/* _pstmnt.set" + _javaType + "(" + _plsqlData._dataname + "); */";
                }
//////                System.out.println("Dataname=[" + _plsqlData._dataname + "], Datatype=[" + _plsqlData._datatype + "], Length=[" + _plsqlData._length + "], Precision=[" + _plsqlData._precision + "], InOut=[" + _plsqlData._inout + "],JavaType=[" + _javaType + "]");
            }
            else
            {
                if (_plsqlData._inout.toUpperCase().indexOf("OUT") >= 0)
                {
                    _statement = "_pstmnt.set" + _javaType + "(" + _plsqlData._dataname + "[0]);";
                }
                else
                {
                    _statement = "_pstmnt.set" + _javaType + "(" + _plsqlData._dataname + ");";
                }
//////                System.out.println("Dataname=[" + _plsqlData._dataname + "], Datatype=[" + _plsqlData._datatype + "], Length=[" + _plsqlData._length + "], Precision=[" + _plsqlData._precision + "], InOut=[" + _plsqlData._inout + "],JavaType=[" + _javaType + "]");
            }
            ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Select, _statement);
        }
        _sourceLines    = "0";
        _sourceColumns  = "0";
        _statement = "ResultSet rs = stmt.executeQuery(query);";
        ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Select, _statement);
    }
}
