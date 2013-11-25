package enCub.PLSQL.Converter;

import java.util.*;

public class PLSQLExit extends PLSQLStatement {
    PLSQLStatement _plsqlStatement;
    public void Convert(List<PLSQLParsing> _selectList) {
        String  _sourceLines    = "";
        String  _sourceColumns  = "";
        String  _statement      = "";
        String  _label          = "";
        String  _when           = "";
        boolean _isNotFound     = false;

        List<String> _parameters = new ArrayList<String>();

        _sourceLines    = "";
        _sourceColumns  = "";
        _statement      = "";

        while(true)
        {
            if (GetCurrentType() == null ||
                GetCurrentPosition() == -1)
            {
                break;
            }
            else if (GetCurrentType().equals("enter") &&
                     GetCurrentRule().equals("exit_statement"))
            {
                GetNextPosition();
                GetNextToken();                                                 // EXIT
                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                GetNextPosition();
                _label          = GetNextTokenName();                           // label or WHEN
                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                if (_label.equals("WHEN"))                                     // is label
                {
                    _label = "";
                }
                else
                {
                    GetNextPosition();
                    GetNextTokenName();                                         // WHEN
                }
                while(true)
                {
                    GetNextPosition();
                    GetNextTokenName();
                    _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                    _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                    if (GetCurrentTokenName().equals("';'"))                   // SEMI
                    {
                        break;
                    }
                    else if (GetCurrentToken().equals("%"))
                    {
                        _when += GetCurrentToken();
                        GetNextPosition();
                        GetNextTokenName();
                        _when += GetCurrentToken();
                        if (GetCurrentToken().equals("NOTFOUND"))
                        {
                            _isNotFound = true;
                        }
                    }
                    else if (GetCurrentToken().equals("."))
                    {
                        _when += GetCurrentToken();
                        GetNextPosition();
                        GetNextTokenName();
                        _when += GetCurrentToken();
                    }
                }
            }
            GetNextPosition();
        }
        if (_isNotFound)
        {
            _statement = "if(!_isFound) {";
             ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_Exit, _statement);
        } else if(!_when.equals(""))
        {
            _statement = "if(" + _when + ") {";
        }
        if (_label.equals(""))
        {
            _statement = "break;";
        }
        else
        {
            _statement = "break " + _label + ".";
        }
         ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_Exit, _statement);
        if (_isNotFound ||
           !_when.equals(""))
        {
            _statement = "}";
             ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_Exit, _statement);
        }
    }
}
