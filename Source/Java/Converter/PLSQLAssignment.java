package enCub.PLSQL.Converter;

import java.util.*;

public class PLSQLAssignment extends PLSQLStatement {
    PLSQLStatement _plsqlStatement;
    public void Convert(List<PLSQLParsing> _selectList) {
//////        String          _javaString     = "";
        String  _token          = "";
        String  _tokenName      = "";
        String  _sourceLines    = "";
        String  _sourceColumns  = "";
        String  _statement      = "";
        String  _targetType     = "";
        String  _variable       = "";

        List<PLSQLData> _plsqlDatas     = new ArrayList<PLSQLData>();
        PLSQLData       _plsqlData      = new PLSQLData();
        List<String>    _srcStatement   = new ArrayList<String>();

        while(GetNextPosition() != -1)
        {
//////            System.out.print("PLSQLAssignment 1111,");
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
            if (GetCurrentType() == null)
            {
                break;
            }
            if (GetCurrentType().equals("enter") &&
                GetCurrentRule().equals("assignment_statement_target"))
            {
                _variable       = GetNextToken();
                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                _sourceColumns  = AppendLine(_sourceColumns, GetCurrentColumn());
                if (_variable.equals(":"))
                {
                    GetNextPosition();
                    GetNextToken();
                    if (GetCurrentTokenName().equals("NEW") ||
                        GetCurrentTokenName().equals("OLD"))
                    {
                        _variable = GetCurrentToken();
                        GetNextPosition();
                        _variable += GetNextToken();                                // '.'
                        GetNextPosition();
                        _variable += GetNextToken();
                    }
                }
                _variable  = GetJavaVariable(_variable);
                _statement = _variable;
//////                System.out.println("PLSQLAssignment:_variable=[" + _variable + "]");
                _plsqlDatas = GetData(_variable);
                _plsqlData  = _plsqlDatas.get(0);
                _targetType = GetJavaType(_plsqlData._datatype, _plsqlData._length, _plsqlData._precision);
//////                System.out.println("PLSQLAssignment:_targetType=[" + _targetType + "],_plsqlData._datatype=[" + _plsqlData._datatype + "], _plsqlData._length=[" + _plsqlData._length + "],_plsqlData._precision=[" + _plsqlData._precision + "]" );
            }
            else if (GetCurrentTokenName().equals("PLSQL_ASSIGN"))
            {
                _statement      += " = ";
                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                _sourceColumns  = AppendLine(_sourceColumns, GetCurrentColumn());
            }
            else if (GetCurrentTokenName().equals("';'"))
            {
//////                _statement      += ";";
                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                _sourceColumns  = AppendLine(_sourceColumns, GetCurrentColumn());
                _statement      += ConvertAssign(_targetType, _srcStatement).split(new String(JavaWriter._Seperator, 0, JavaWriter._Seperator.length))[1] + ";";
                ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_Assignment, _statement);
//////                System.out.println("PLSQLAssign:");
            }
            else if (!GetCurrentTokenName().equals(""))
            {
                _tokenName      = GetCurrentTokenName();
                _token          = GetCurrentToken();
//////                _statement      += " " + _token;
                if (_token.equals(":"))
                {
                    GetNextPosition();
                    GetNextToken();
                    if (GetCurrentTokenName().equals("NEW") ||
                        GetCurrentTokenName().equals("OLD"))
                    {
                        _token = GetCurrentToken();
                        GetNextPosition();
                        _token += GetNextToken();                                // '.'
                        GetNextPosition();
                        _token += GetNextToken();
                    }
                }
                _srcStatement.add(_token);
//////                System.out.println("PLSQLAssignment:_token=[" + _token + "]");
                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                _sourceColumns  = AppendLine(_sourceColumns, GetCurrentColumn());
            }
        }
    }
    public String ConvertAssign(String _targetType, List<String> _srcStatement)
    {
        String          _lParen         = "(";
        String          _rParen         = ")";
        String          _op_add         = ".add(";
        String          _op_subtract    = ".subtract(";
        String          _op_multiply    = ".multiply(";
        String          _op_divide      = ".divide(";

        String          _retString      = "";
        String          _retType        = "";
        String          _javaType       = "";
        String          _operator       = "";

//////        System.out.println("PLSQLAssign:ConvertAssignment:_targetType=[" + _targetType + "],_srcStatement=[" + _srcStatement + "]");
        if (_targetType.equals("String") ||
            _targetType.equals("int") ||
            _targetType.equals("dobule") ||
            _targetType.equals("float") ||
            _targetType.equals("boolean"))
        {
            if (_srcStatement.size() > 0)
            {
                _retString = GetJavaVariable(_srcStatement.get(0));
                for(int _loop = 1; _loop < _srcStatement.size(); _loop++)
                {
                    _retString += " " + GetJavaVariable(_srcStatement.get(_loop));
                }
            }
            _retString = _retType + new String(JavaWriter._Seperator, 0, JavaWriter._Seperator.length) + _retString;
        }
        else if(_targetType.equals("BigDecimal"))
        {
            boolean _isOperator = false;
            for(int _loop = 0; _loop < _srcStatement.size(); _loop++)
            {
                if (_srcStatement.get(_loop).equals(_lParen) ||
                    _srcStatement.get(_loop).equals(_rParen))
                {
                    _retString += GetJavaVariable(_srcStatement.get(_loop));
                }
                else if (_srcStatement.get(_loop).equals("+"))
                {
                    _retString += _op_add;
                    _isOperator = true;
                }
                else if (_srcStatement.get(_loop).equals("-"))
                {
                    _retString += _op_subtract;
                    _isOperator = true;
                }
                else if (_srcStatement.get(_loop).equals("*"))
                {
                    _retString += _op_multiply;
                    _isOperator = true;
                }
                else if (_srcStatement.get(_loop).equals("/"))
                {
                    _retString += _op_divide;
                    _isOperator = true;
                }
                else if(_isOperator)
                {
                    PLSQLData _plsqlData = GetData(GetJavaVariable(_srcStatement.get(_loop))).get(0);
                    _javaType = GetJavaType(_plsqlData._datatype, _plsqlData._length, _plsqlData._precision);
                    if (_javaType.equals("BigDecimal"))
                    {
                        _retString += GetJavaVariable(_srcStatement.get(_loop));
                    }
                    else
                    {
                        _retString += "new BigDecimal(" + GetJavaVariable(_srcStatement.get(_loop)) + ")";
                    }
                    _retString += _rParen;
//////                    System.out.println("PLSQLAssignment:_retString=[" + _retString + "]");
                    _isOperator = false;
                }
                else
                {
//////                    System.out.println("PLSQLAssignment:_srcStatement.get(_loop)=[" + GetJavaVariable(_srcStatement.get(_loop)) + "]");
                    PLSQLData _plsqlData = GetData(GetJavaVariable(_srcStatement.get(_loop))).get(0);
                    _javaType = GetJavaType(_plsqlData._datatype, _plsqlData._length, _plsqlData._precision);
                    if (_javaType.equals("BigDecimal"))
                    {
                        if (_retString.equals(""))
                        {
                            _retString = GetJavaVariable(_srcStatement.get(_loop));
                        }
                        else
                        {
                            _retString += GetJavaVariable(_srcStatement.get(_loop));
                        }
                    }
                    else
                    {
                        if (_retString.equals(""))
                        {
                            _retString = "new BigDecimal(" + GetJavaVariable(_srcStatement.get(_loop)) + ")";
                        }
                        else
                        {
                            _retString += " new BigDecimal(" + GetJavaVariable(_srcStatement.get(_loop)) + ")";
                        }
                    }
                }
            }
            _retString = "BigDecimal" + new String(JavaWriter._Seperator, 0, JavaWriter._Seperator.length) + _retString;
        }
        return _retString;
    }
}
