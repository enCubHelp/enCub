package enCub.PLSQL.Converter;

import java.util.*;

public class NotSupportStatement extends PLSQLStatement {
    PLSQLStatement _plsqlStatement;
    String _prevRule = "";
    public NotSupportStatement() {
    }
    public NotSupportStatement(String parmRule) {
        _prevRule = parmRule;
    }
    public void Convert(List<PLSQLParsing> _selectList) {
        String _rule = _selectList.get(0)._rule;
        if (_prevRule.equals(""))
        {
            System.out.println("Rule[" + _rule + "] can't not be converted!!!");
        }
//////        else
//////        {
//////            System.out.println("Rule[" + _prevRule + "] can't not be converted!!!");
//////        }
        for(int _loop = 0; _loop < _selectList.size(); )
        {
            //////System.out.print("Type=" + _selectList.get(_loop)._type);
            //////System.out.print(",Level=" + _selectList.get(_loop)._level);
            //////System.out.print(",Rule=" + _selectList.get(_loop)._rule);
            //////System.out.print(",Line=" + _selectList.get(_loop)._line);
            //////System.out.print(",Column=" + _selectList.get(_loop)._column);
            //////System.out.print(",Length=" + _selectList.get(_loop)._length);
            //////System.out.print(",Token=" + _selectList.get(_loop)._token);
            //////System.out.print(",TokenNo=" + _selectList.get(_loop)._tokenNo);
            //////System.out.println(",TokenName=" + _selectList.get(_loop)._tokenName);
            _selectList.remove(_loop);
        }
        //////System.out.println("Rule[" + _rule + "] can't not be converted finished!!!");
    }
}
