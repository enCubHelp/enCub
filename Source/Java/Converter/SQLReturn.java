package enCub.PLSQL.Converter;

import java.util.*;

import enCub.PLSQL.Properties.Environment;

public class SQLReturn extends PLSQLStatement {
    PLSQLStatement _plsqlStatement;
    public void Convert(List<PLSQLParsing> _selectList) {
        String  _sourceLines    = "";
        String  _sourceColumns  = "";
        String  _statement      = "";
        String  _returnName     = "";

        List<String> _parameters = new ArrayList<String>();

        _sourceLines    = "";
        _sourceColumns  = "";
        _statement      = "";

        SetSQL(false);

        while(true)
        {
            if (GetCurrentType() == null ||
                GetCurrentPosition() == -1)
            {
                break;
            }
            else if (GetCurrentType().equals("enter") &&
                     GetCurrentRule().equals("return_statement"))
            {
                GetNextPosition();
                GetNextToken();                                                 // RETURN
                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                String _SEMI = "";
                GetNextPosition();
                while(true)
                {
                    GetNextTokenName();
                    if (GetCurrentTokenName() == null)
                    {
                        break;
                    }
                    else if (GetCurrentTokenName().equals("';'"))
                    {
                        _SEMI = GetCurrentToken();                           // SEMI(;)
//////                        _returnName    += GetCurrentToken();                           // SEMI(;)
                        _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                        _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                        break;
                    }
//////            System.out.print("SQLReturn:");
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
                    if (GetCurrentToken().equals("") ||
                        GetCurrentToken().equals(".") ||
                        GetCurrentToken().equals("(") ||
                        GetCurrentToken().equals(")") ||
                        _returnName.equals(""))
                    {
                        _returnName    += GetCurrentToken();                               // expression
                    }
                    else
                    {
                        _returnName    += " " + GetCurrentToken();                               // expression
                    }
//////            System.out.println("_returnName=[" + _returnName + "]");
                    _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                    _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                    GetNextPosition();
                }
                List<PLSQLData> _returnDatas = GetData(_returnName.trim());
//////                System.out.println("SQLReturn:_returnName=[" + _returnName + "], _returnDatas.size()=[" + _returnDatas.size() + "]");
                if (_returnDatas.size() > 0 &&
                    _returnDatas.get(0)._datatype.toUpperCase().equals("SYS_REFCURSOR"))
                {
                    try {
                        String          _targetDBMS     = Environment.Get("TargetDBMS");
                        if (_targetDBMS.toUpperCase().startsWith("CUBRID"))
                        {
                            _statement = "((CUBRIDResultSet)" + _returnName + ").setReturnable();";
                            ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Return, _statement);
                        }
                    } catch(Exception e) {
                    }
                }
                _statement = "return " + _returnName + _SEMI;
                ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Return, _statement);
                break;
            }
            System.out.print("SQLReturn:");
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
    }
}
