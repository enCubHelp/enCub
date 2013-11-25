package enCub.PLSQL.Converter;

import java.util.*;

public class SQLUpdate extends PLSQLStatement {
    PLSQLStatement _plsqlStatement;
    public void Convert(List<PLSQLParsing> _selectList) {
        String  _sourceLines    = "";
        String  _sourceColumns  = "";
        String  _statement      = "";

        List<PLSQLData> _usingData  = new ArrayList<PLSQLData>();

        SetSQL(true);

        while(true)
        {
//////            System.out.print("SQLUpdate,");
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
            if (GetCurrentType() == null ||
                GetCurrentPosition() == -1)
            {
                break;
            }
            else if (GetCurrentType().equals("enter") &&
                     GetCurrentRule().equals("sql_update"))
            {
                _statement      = GetNextToken();                                   // Update
                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                GetNextPosition();
                continue;
            }
            else if (GetCurrentType().equals("enter") &&
                     GetCurrentRule().equals("dml_table_expression_clause"))
            {
                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                _statement     += " " + GetNextToken();                             // table name
                GetNextPosition();
            }
            else if (GetCurrentType().equals("enter") &&
                     GetCurrentRule().equals("update_set_clause"))
            {
                _statement     += " " + GetNextToken();                             // SET
                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
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
                    if (GetCurrentType().equals("exit") &&
                        GetCurrentRule().equals("update_set_clause"))
                    {
                        GetNextPosition();
                        break;
                    }
                    else if (GetCurrentType().equals("enter") &&
                             GetCurrentRule().equals("where_clause"))
                    {
                        break;
                    }
                    GetNextToken();
                    if (GetCurrentToken().equals(","))
                    {
                        _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                        _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                        _statement     += GetCurrentToken();
                        GetNextPosition();
                        GetNextToken();
                    }
                    _sourceVariable = GetCurrentToken();
                    GetNextPosition();
                    GetNextToken();
                    if (GetCurrentTokenName().equals("'.'"))
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
                    _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                    _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                    GetNextPosition();
                    GetNextToken();
                    _targetVariable = GetCurrentToken();
                    System.out.println("SQLUpdate:_sourceVariable=[" + _sourceVariable + "]");
                    System.out.println("SQLUpdate:_operator=[" + _operator + "]");
                    System.out.println("SQLUpdate:_targetVariable=[" + _targetVariable + "]");
                    _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                    _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                    GetNextPosition();
                    if (GetCurrentType() == null)
                    {
                        break;
                    }
                    if (GetCurrentType().equals("exit") &&
                        GetCurrentRule().equals("name"))
                    {
                        _variables = GetData(_targetVariable);
                        if (_variables.size() > 0)
                        {
                            _variable = new PLSQLData();
                            _variable = _variables.get(0);
                            _variable._dataname = _targetVariable;
                            _usingData.add(_variable);
                            _targetVariable = "?";
                        }
                        while(true)
                        {
                            if (GetCurrentType().equals("exit") &&
                                GetCurrentRule().equals("expr"))
                            {
                                break;
                            }
                            GetNextPosition();
                        }
                    }
                    else
                    {
                        GetNextTokenName();
                        if (GetCurrentTokenName().equals("'.'"))
                        {
                            _targetVariable += GetCurrentToken();
                            _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                            _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                            GetNextPosition();
                            GetNextToken();
                            _targetVariable += GetCurrentToken();
                            _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                            _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
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
                    }
                    _statement += " " + _sourceVariable + " " + _operator + " " + _targetVariable;
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
                    _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                    _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                    GetNextPosition();
                    GetNextToken();
                    if (GetCurrentTokenName().equals("'.'"))
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
                    _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                    _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                    GetNextPosition();
                    GetNextToken();
                    _targetVariable = GetCurrentToken();
                    _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                    _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                    GetNextPosition();
                    GetNextToken();
                    if (GetCurrentTokenName().equals("'.'"))
                    {
                        _targetVariable += GetCurrentToken();
                        _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                        _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                        GetNextPosition();
                        GetNextToken();
                        _targetVariable += GetCurrentToken();
                        _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                        _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
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
                        _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                        _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                        GetNextPosition();
                        GetNextToken();
                        _betweenVariable    = GetCurrentToken();
                        _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                        _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                        GetNextPosition();
                        GetNextToken();
                        if (GetCurrentTokenName().equals("'.'"))
                        {
                            _betweenVariable += GetCurrentToken();
                            _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                            _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                            GetNextPosition();
                            GetNextToken();
                            _betweenVariable += GetCurrentToken();
                            _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                            _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
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
            GetNextPosition();
        }
//////        System.out.println("Statement=[" + _statement + "]");
        _statement = "_sqlQuery = \"" + _statement + "\";";
        ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Update, _statement);
        _statement      = "_pstmnt = _conn.prepareStatement(_sqlQuery);";
        ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Delete, _statement);

//////        System.out.println("SQLUpdate:_usingData.size()=[" + _usingData.size() + "]");
        String _javaType = "";
        for(int _loop = 0; _loop < _usingData.size(); _loop++)
        {
            PLSQLData _plsqlData = _usingData.get(_loop);
            _javaType = GetJavaType(_plsqlData._datatype, _plsqlData._length, _plsqlData._precision);
            if (_javaType.equals("Unknown"))
            {
//////                _statement = "/* _statement.set" + _javaType + "(" + _plsqlData._dataname + "); */";
                _statement = "/* _pstmnt.set" + _javaType + "(" + (_loop + 1) + "," + _plsqlData._dataname + "); */";
//////                System.out.println("Dataname=[" + _plsqlData._dataname + "], Datatype=[" + _plsqlData._datatype + "], Length=[" + _plsqlData._length + "], Precision=[" + _plsqlData._precision + "], InOut=[" + _plsqlData._inout + "],JavaType=[" + _javaType + "]");
            }
            else
            {
//////                _statement = "_statement.set" + _javaType + "(" + _plsqlData._dataname + ");";
                _statement = "_pstmnt.set" + _javaType + "(" + (_loop + 1) + "," + _plsqlData._dataname + ");";
//////                System.out.println("Dataname=[" + _plsqlData._dataname + "], Datatype=[" + _plsqlData._datatype + "], Length=[" + _plsqlData._length + "], Precision=[" + _plsqlData._precision + "], InOut=[" + _plsqlData._inout + "],JavaType=[" + _javaType + "]");
            }
            ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Update, _statement);
        }
//////        _sourceLines    = "0";
//////        _sourceColumns  = "0";
//////        _statement = "ResultSet rs = stmt.executeUpdate(query);";
        _statement = "rowsUpdated = _pstmnt.executeUpdate();";
        ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Update, _statement);
    }
}
