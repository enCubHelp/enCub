package enCub.PLSQL.Converter;

import java.util.*;

public class SQLClose extends PLSQLStatement {
    PLSQLStatement _plsqlStatement;
    public void Convert(List<PLSQLParsing> _selectList) {
        String  _sourceLines    = "";
        String  _sourceColumns  = "";
        String  _statement      = "";
        String  _cursor         = "";

        List<String> _parameters = new ArrayList<String>();

        _sourceLines    = "";
        _sourceColumns  = "";
        _statement      = "";

//////        System.out.println("SQLClose:");
//////        for (int _loop = 0; _loop < _selectList.size(); _loop++)
//////        {
//////                System.out.print("SQLClose,");
//////                System.out.print("SEQ=" + _loop + ",");
//////                System.out.print("Type=" + _selectList.get(_loop)._type);
//////                System.out.print(",Level=" + _selectList.get(_loop)._level);
//////                System.out.print(",Rule=" + _selectList.get(_loop)._rule);
//////                System.out.print(",Line=" + _selectList.get(_loop)._line);
//////                System.out.print(",Column=" + _selectList.get(_loop)._column);
//////                System.out.print(",Length=" + _selectList.get(_loop)._length);
//////                System.out.print(",Token=" + _selectList.get(_loop)._token);
//////                System.out.print(",TokenNo=" + _selectList.get(_loop)._tokenNo);
//////                System.out.println(",TokenName=" + _selectList.get(_loop)._tokenName);
//////        }
        SetSQL(true);

        while(true)
        {
            if (GetCurrentType() == null ||
                GetCurrentPosition() == -1)
            {
                break;
            }
            else if (GetCurrentType().equals("enter") &&
                     GetCurrentRule().equals("close_statement"))
            {
                GetNextPosition();
                GetNextToken();                                                 // CLOSE
                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                GetNextPosition();
                _cursor         = GetNextToken();                               // CursorName
                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                GetNextPosition();
                GetNextTokenName();                                             // SEMI
                _sourceLines    = AppendLine(_sourceLines, GetCurrentLine());
                _sourceColumns  = AppendColumn(_sourceColumns, GetCurrentColumn());
                _statement = "_pstmnt.close();";
                ConvertStatement(JavaWriter._Statement, _sourceLines, _sourceColumns, JavaWriter._CMD_SQL_Close, _statement);
                break;
            }
            GetNextPosition();
        }
    }
}
