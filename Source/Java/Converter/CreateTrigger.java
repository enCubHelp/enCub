package enCub.PLSQL.Converter;

import java.util.*;

import enCub.PLSQL.Repository.OracleSchema;
import enCub.PLSQL.Repository.OracleSchemaData;
import enCub.PLSQL.Properties.Environment;

public class CreateTrigger extends PLSQLStatement {
    PLSQLStatement _plsqlStatement;
    public void Convert(List<PLSQLParsing> _selectList) throws Exception {
        String          _token          = "";
        String          _tokenName      = "";
        String          _triggerName    = "";
        String          _tableName      = "";
        String          _tableLines     = "";
        String          _tableColumns   = "";
        String          _sourceLines    = "";
        String          _sourceColumns  = "";
        String          _statement      = "";
        String          _leftParen      = "'('";
        String          _rightParen     = "')'";
        String          _leftBrace      = "'{'";
        String          _rightBrace     = "'}'";
        String          _comma          = "','";
        boolean         _isUpdateColumn = false;
        List<String>    _columns        = new ArrayList<String>();
        String          _columnsLines   = "";
        String          _columnsColumns = "";
        String          _targetDBMS     = Environment.Get("TargetDBMS");
        boolean         _isBefore       = false;

        if (_targetDBMS.toUpperCase().startsWith("CUBRID"))
        {
            _targetDBMS = "CUBRID";
        }
        else if (_targetDBMS.toUpperCase().startsWith("ORACLE"))
        {
            _targetDBMS = "ORACLE";
        }
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
//////                System.out.print("SQLTrigger:");
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
            System.out.println("Target DBMS=[" + _targetDBMS + "]");
            while(true)
            {
//////                System.out.print("SQLTrigger:");
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
                if (GetCurrentRule() == null)
                {
                    break;
                }
                else if (GetCurrentType().equals("exit") &&
                         GetCurrentRule().equals("create_trigger"))
                {
                    break;
                }
                else if (GetCurrentRule().equals("start") ||
                         GetCurrentRule().equals("statement"))
                {
                    GetNextRule();
                    continue;
                }
                else if (GetCurrentRule().equals("create_trigger") &&
                         GetCurrentTokenName().equals(""))
                {
                    GetNextToken();                                         // CREATE
                    while(!GetCurrentTokenName().equals("TRIGGER"))         // skip OR REPLACE
                    {
                        GetNextPosition();
                    }
                    GetNextPosition();                                      // skip TRIGGER
                    _triggerName = GetNextToken();                          // trigger-name
//////                    ConvertStatement(JavaWriter._Procedure, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, "public class " + GetProgram() + " {");
//////                    ConvertStatement(JavaWriter._Procedure, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, "public static void " + _triggerName + "(");
                    GetNextPosition();
                    GetNextTokenName();                                     // BEFORE or AFTER
                    if (GetCurrentTokenName().toUpperCase().equals("BEFORE"))
                    {
                        _isBefore = true;
                    }
                    GetNextPosition();                                      // skip BEFORE or AFTER
                    GetNextTokenName();
                    while (true)
                    {
                        if (GetCurrentRule() == null)
                        {
                            break;
                        }
                        if(GetCurrentTokenName().equals("ON"))
                        {
                            _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                            _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                            GetNextPosition();
                            GetNextTokenName();
                            _tableName      = GetCurrentToken();
                            _tableLines     = AppendLine(_tableLines, GetCurrentLine());
                            _tableColumns   = AppendColumn(_tableColumns, GetCurrentColumn());
                            _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                            _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                            break;
                        }
                        else if(GetCurrentTokenName().equals(_comma) ||
                                GetCurrentTokenName().equals("OF") ||
                                GetCurrentTokenName().equals("OR") ||
                                GetCurrentTokenName().equals("INSERT") ||
                                GetCurrentTokenName().equals("UPDATE") ||
                                GetCurrentTokenName().equals("DELETE"))
                        {
                            _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                            _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                            GetNextPosition();
                            continue;
                        }
                        else if (GetCurrentType().equals("enter") &&
                                 GetCurrentRule().equals("column"))
                        {
                            _isUpdateColumn = true;
                            GetNextTokenName();
                            _columns.add(GetCurrentToken());
                            _columnsLines   = AppendLine(_columnsLines, GetCurrentLine());
                            _columnsColumns = AppendColumn(_columnsColumns, GetCurrentColumn());
                        }
                        GetNextPosition();
                    }
                }
                else if (GetCurrentRule().equals("body") &&
                         GetCurrentTokenName().equals("BEGIN"))
                {
//////                    System.out.print("CreateTrigger,");
//////                    System.out.print("SEQ=" + GetCurrentPosition() + ",");
//////                    System.out.print("Type=" + GetCurrentType());
//////                    System.out.print(",Level=" + GetCurrentLevel());
//////                    System.out.print(",Rule=" + GetCurrentRule());
//////                    System.out.print(",Line=" + GetCurrentLine());
//////                    System.out.print(",Column=" + GetCurrentColumn());
//////                    System.out.print(",Length=" + GetCurrentLength());
//////                    System.out.print(",Token=" + GetCurrentToken());
//////                    System.out.print(",TokenNo=" + GetCurrentTokenNo());
//////                    System.out.println(",TokenName=" + GetCurrentTokenName());
                    ConvertStatement(JavaWriter._Procedure, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, "public class " + GetProgram() + " {");
                    _statement = "public static void " + _triggerName + "(";
                    int     _intentLength   = _statement.length();
                    String  _intentString   = "                                                                                                                                         ";
                    String  _javaType       = "";
//////                    System.out.println("CreateTrigger:_columns.size()=[" + _columns.size() + "]");
                    List<OracleSchemaData>  _schemas    = new ArrayList<OracleSchemaData>();
                    OracleSchema _schema = new OracleSchema();
                    _schema.Select(_tableName);
                    _schemas    = _schema.Get();
                    if(_columns.size() == 0 ||
                       _targetDBMS.equals("CUBRID"))
                    {
//////        for(int _loop = 0; _loop < _schemas.size(); _loop++)
//////        {
//////            System.out.print("CreateTrigger:");
//////            System.out.print("column=[" + _schemas.get(_loop)._column + "]");
//////            System.out.print("type =[" + _schemas.get(_loop)._type + "]");
//////            System.out.print("length=[" + _schemas.get(_loop)._length + "]");
//////            System.out.print("precision=[" + _schemas.get(_loop)._precision + "]");
//////            System.out.print("scale=[" + _schemas.get(_loop)._scale + "]");
//////            System.out.print("nullable=[" + _schemas.get(_loop)._nullable + "]");
//////            System.out.print("columnid=[" + _schemas.get(_loop)._columnid + "]");
//////            System.out.println("_comments=[" + _schemas.get(_loop)._comments + "]");
//////        }
                        for(int _loopColumns = 0; _loopColumns < _schemas.size(); _loopColumns++)
                        {
                            if (_schemas.get(_loopColumns)._precision == 0)
                            {
                                _javaType = GetJavaType(_schemas.get(_loopColumns)._type, _schemas.get(_loopColumns)._length, _schemas.get(_loopColumns)._precision);
                                AddData(GetJavaVariable("old." + _schemas.get(_loopColumns)._column), _schemas.get(_loopColumns)._type, _schemas.get(_loopColumns)._length, _schemas.get(_loopColumns)._precision, "");
                                AddData(GetJavaVariable("new." + _schemas.get(_loopColumns)._column), _schemas.get(_loopColumns)._type, _schemas.get(_loopColumns)._length, _schemas.get(_loopColumns)._precision, "");
                            }
                            else
                            {
                                _javaType = GetJavaType(_schemas.get(_loopColumns)._type, _schemas.get(_loopColumns)._precision, _schemas.get(_loopColumns)._scale);
                                AddData(GetJavaVariable("old." + _schemas.get(_loopColumns)._column), _schemas.get(_loopColumns)._type, _schemas.get(_loopColumns)._precision, _schemas.get(_loopColumns)._scale, "");
                                AddData(GetJavaVariable("new." + _schemas.get(_loopColumns)._column), _schemas.get(_loopColumns)._type, _schemas.get(_loopColumns)._precision, _schemas.get(_loopColumns)._scale, "");
                            }
                            if (_loopColumns == 0)
                            {
                                _statement += _javaType + " _old_" + GetJavaVariable(_schemas.get(_loopColumns)._column) + ", " + _javaType + "[] _new_" + GetJavaVariable(_schemas.get(_loopColumns)._column);
                            }
                            else
                            {
                                if (_intentString.length() > _intentLength)
                                {
                                    _statement += _intentString.substring(0, _intentLength) + _javaType + " _old_" + GetJavaVariable(_schemas.get(_loopColumns)._column) + ", " + _javaType + "[] _new_" + GetJavaVariable(_schemas.get(_loopColumns)._column);
                                }
                                else
                                {
                                    _statement += _intentString + _javaType + " _old_" + GetJavaVariable(_schemas.get(_loopColumns)._column) + ", " + _javaType + "[] _new_" + GetJavaVariable(_schemas.get(_loopColumns)._column);
                                }
                            }
                            if (_loopColumns == (_schemas.size() - 1))
                            {
                                if (_targetDBMS.equals("CUBRID"))
                                {
                                    _statement     += ") throws SQLException";
                                }
                                else
                                {
                                    _statement     += ")";
                                }
                                ConvertStatement(JavaWriter._Procedure, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, _statement);

                                if (_targetDBMS.equals("CUBRID"))
                                {
                                    int _loopSeq = 0;

                                    _statement = "Connection _conn = DriverManager.getConnection(\"jdbc:default:connection\");";
                                    ConvertStatement(JavaWriter._End, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, _statement);
                                    _statement = "PreparedStatement _pstmnt   = null;";
                                    ConvertStatement(JavaWriter._End, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, _statement);
                                    _statement = "String            _sqlQuery = null;";
                                    ConvertStatement(JavaWriter._End, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, _statement);
                                    _statement = "_sqlQuery = \"update PURCHASE_ORDER_D\"";
                                    ConvertStatement(JavaWriter._End, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, _statement);
                                    for(int _loopColumns1 = 0; _loopColumns1 < _schemas.size(); _loopColumns1++)
                                    {
                                        if (_schemas.get(_loopColumns1)._isPK)
                                        {
                                            continue;
                                        }
                                        if (_loopSeq == 0)
                                        {
                                            _statement = "          + \"       set " + _schemas.get(_loopColumns1)._column  + " = ?\"";
                                            ConvertStatement(JavaWriter._End, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, _statement);
                                        }
                                        else
                                        {
                                            _statement = "          + \"          ," + _schemas.get(_loopColumns1)._column  + " = ?\"";
                                            ConvertStatement(JavaWriter._End, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, _statement);
                                        }
                                        _loopSeq++;
                                    }
                                    _loopSeq = 0;
                                    for(int _loopColumns1 = 0; _loopColumns1 < _schemas.size(); _loopColumns1++)
                                    {
                                        if (_schemas.get(_loopColumns1)._isPK)
                                        {
                                            if (_loopSeq == 0)
                                            {
                                                _statement = "          + \"     where " + _schemas.get(_loopColumns1)._column + " = ?\"";
                                            }
                                            else
                                            {
                                                _statement = "          + \"       and " + _schemas.get(_loopColumns1)._column + " = ?\"";
                                            }
                                            if (_schemas.get(_loopColumns1)._isLastPK)
                                            {
                                                _statement += ";";
                                            }
                                            ConvertStatement(JavaWriter._End, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, _statement);
                                            _loopSeq++;
                                        }
                                    }
                                    _statement = "_pstmnt = _conn.prepareStatement(_sqlQuery);";
                                    ConvertStatement(JavaWriter._End, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, _statement);
                                    _loopSeq = 1;
                                    for(int _loopColumns1 = 0; _loopColumns1 < _schemas.size(); _loopColumns1++)
                                    {
                                        if (_schemas.get(_loopColumns1)._isPK)
                                        {
                                            continue;
                                        }
                                        _javaType = GetJavaType(_schemas.get(_loopColumns1)._type, _schemas.get(_loopColumns1)._precision, _schemas.get(_loopColumns1)._scale);
                                        _statement = "_pstmnt.set" + _javaType + "(" + (_loopSeq) + ",_new_" + GetJavaVariable(_schemas.get(_loopColumns1)._column) + "[0]);";
                                        ConvertStatement(JavaWriter._End, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, _statement);
                                        _loopSeq++;
                                    }
                                    for(int _loopColumns1 = 0; _loopColumns1 < _schemas.size(); _loopColumns1++)
                                    {
                                        if (_schemas.get(_loopColumns1)._isPK)
                                        {
                                            _javaType = GetJavaType(_schemas.get(_loopColumns1)._type, _schemas.get(_loopColumns1)._precision, _schemas.get(_loopColumns1)._scale);
                                            _statement = "_pstmnt.set" + _javaType + "(" + _loopSeq + ",_old_" + GetJavaVariable(_schemas.get(_loopColumns1)._column) + ");";
                                            ConvertStatement(JavaWriter._End, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, _statement);
                                            _loopSeq++;
                                        }
                                    }
                                    _statement = "_pstmnt.executeUpdate();";
                                    ConvertStatement(JavaWriter._End, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, _statement);
                                    _statement = "_pstmnt.close();";
                                    ConvertStatement(JavaWriter._End, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, _statement);
                                    _statement = "_conn.close();";
                                    ConvertStatement(JavaWriter._End, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, _statement);
                                }

                                _statement      = "";
                                _sourceLines    = "";
                                _sourceColumns  = "";
                            }
                            else
                            {
                                _statement     += ",";
                                ConvertStatement(JavaWriter._Procedure, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, _statement);
                                _statement      = "";
                                _sourceLines    = "";
                                _sourceColumns  = "";
                            }
                        }
                    }
                    else
                    {
                        for(int _loop = 0; _loop < _columns.size(); _loop++)
                        {
//////            System.out.print("CreateTrigger:");
//////            System.out.print("_columns.get(_loop)=[" + _columns.get(_loop) + "],");
                            boolean _found = false;
                            for(int _loopColumns = 0; _loopColumns < _schemas.size(); _loopColumns++)
                            {
//////            System.out.print("column=[" + _schemas.get(_loopColumns)._column + "]");
//////            System.out.print("type =[" + _schemas.get(_loopColumns)._type + "]");
//////            System.out.print("length=[" + _schemas.get(_loopColumns)._length + "]");
//////            System.out.print("precision=[" + _schemas.get(_loopColumns)._precision + "]");
//////            System.out.print("scale=[" + _schemas.get(_loopColumns)._scale + "]");
//////            System.out.print("nullable=[" + _schemas.get(_loopColumns)._nullable + "]");
//////            System.out.print("columnid=[" + _schemas.get(_loopColumns)._columnid + "]");
//////            System.out.println("_comments=[" + _schemas.get(_loopColumns)._comments + "]");
                                if (GetJavaVariable(_schemas.get(_loopColumns)._column).equals(GetJavaVariable(_columns.get(_loop))))
                                {
//////            System.out.println("Found!!!!");
                                    if (_schemas.get(_loopColumns)._precision == 0)
                                    {
                                        _javaType = GetJavaType(_schemas.get(_loopColumns)._type, _schemas.get(_loopColumns)._length, _schemas.get(_loopColumns)._precision);
                                        AddData(GetJavaVariable("old." + _columns.get(_loop)), _schemas.get(_loopColumns)._type, _schemas.get(_loopColumns)._length, _schemas.get(_loopColumns)._precision, "");
                                        AddData(GetJavaVariable("new." + _columns.get(_loop)), _schemas.get(_loopColumns)._type, _schemas.get(_loopColumns)._length, _schemas.get(_loopColumns)._precision, "");
                                    }
                                    else
                                    {
                                        _javaType = GetJavaType(_schemas.get(_loopColumns)._type, _schemas.get(_loopColumns)._precision, _schemas.get(_loopColumns)._scale);
                                        AddData(GetJavaVariable("old." + _columns.get(_loop)), _schemas.get(_loopColumns)._type, _schemas.get(_loopColumns)._precision, _schemas.get(_loopColumns)._scale, "");
                                        AddData(GetJavaVariable("new." + _columns.get(_loop)), _schemas.get(_loopColumns)._type, _schemas.get(_loopColumns)._precision, _schemas.get(_loopColumns)._scale, "");
                                    }
                                    _found = true;
                                    break;
                                }
                            }
                            if (_found)
                            {
                            }
                            else
                            {
                                _javaType = "Unknown";
                                AddData(GetJavaVariable("old." + _columns.get(_loop)), "Unknown", 0, 0, "");
                                AddData(GetJavaVariable("new." + _columns.get(_loop)), "Unknown", 0, 0, "");
                            }
                            if (_loop == 0)
                            {
                                _statement += _javaType + " _old_" + _columns.get(_loop) + ", " + _javaType + "[] _new_" + _columns.get(_loop);
                            }
                            else
                            {
                                if (_intentString.length() > _intentLength)
                                {
                                    _statement += _intentString.substring(0, _intentLength) + _javaType + " _old_" + _columns.get(_loop) + ", " + _javaType + "[] _new_" + _columns.get(_loop);
                                }
                                else
                                {
                                    _statement += _intentString + _javaType + " _old_" + _columns.get(_loop) + ", " + _javaType + "[] _new_" + _columns.get(_loop);
                                }
                            }
                            if (_loop == (_columns.size() - 1))
                            {
                                _statement     += ")";
                                ConvertStatement(JavaWriter._Procedure, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, _statement);

                                _statement      = "";
                                _sourceLines    = "";
                                _sourceColumns  = "";
                            }
                            else
                            {
                                _statement     += ",";
                                ConvertStatement(JavaWriter._Procedure, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, _statement);
                                _statement      = "";
                                _sourceLines    = "";
                                _sourceColumns  = "";
                            }
                        }
                    }
                    _sourceLines    = "";
                    _sourceColumns  = "";
                    _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                    _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                    ConvertStatement(JavaWriter._Procedure, GetCurrentLine(), GetCurrentColumn(), JavaWriter._CMD_Class, "{");
                }
//////                System.out.print("CreateTrigger,");
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
