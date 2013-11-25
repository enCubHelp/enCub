package enCub.PLSQL.Converter;

import java.util.*;

public class PLSQLStatements extends PLSQLStatement {
    public void Convert(List<PLSQLParsing> _selectList) throws Exception {
        PLSQLStatement _plsqlStatement = null;
        List<PLSQLParsing> _statementList = new ArrayList<PLSQLParsing>();
        List<PLSQLParsing> _selectItem = new ArrayList<PLSQLParsing>();
        for(int _loop = 0; _loop < _selectList.size();)
        {
            if (IsStart(_selectList.get(_loop)) ||
                IsExitStart(_selectList.get(_loop)))
            {
                _selectList.remove(_loop);
            }
            else if (_selectList.get(_loop)._type.equals("exit") &&
                     _selectList.get(_loop)._rule.equals("statement"))
            {
//////                System.out.println("Remove Statement");
//////                System.out.print("Type=" + _selectList.get(_loop)._type);
//////                System.out.print(",Level=" + _selectList.get(_loop)._level);
//////                System.out.print(",Rule=" + _selectList.get(_loop)._rule);
//////                System.out.print(",Line=" + _selectList.get(_loop)._line);
//////                System.out.print(",Column=" + _selectList.get(_loop)._column);
//////                System.out.print(",Length=" + _selectList.get(_loop)._length);
//////                System.out.print(",Token=" + _selectList.get(_loop)._token);
//////                System.out.print(",TokenNo=" + _selectList.get(_loop)._tokenNo);
//////                System.out.println(",TokenName=" + _selectList.get(_loop)._tokenName);
                _selectList.remove(_loop);
            }
            //////else if (IsExitStatement(_selectList.get(_loop)))
            //////{
            //////    System.out.println("Exit Statement Size ====>[" + _statementList.size() + "]");
            //////    System.out.print("Type=" + _selectList.get(_loop)._type);
            //////    System.out.print(",Level=" + _selectList.get(_loop)._level);
            //////    System.out.print(",Rule=" + _selectList.get(_loop)._rule);
            //////    System.out.print(",Line=" + _selectList.get(_loop)._line);
            //////    System.out.print(",Column=" + _selectList.get(_loop)._column);
            //////    System.out.print(",Length=" + _selectList.get(_loop)._length);
            //////    System.out.print(",Token=" + _selectList.get(_loop)._token);
            //////    System.out.print(",TokenNo=" + _selectList.get(_loop)._tokenNo);
            //////    System.out.println(",TokenName=" + _selectList.get(_loop)._tokenName);
            //////    if (_statementList.size() > 0)
            //////    {
            //////        System.out.println("GetStatement(_statementList.get(_statementList.size() - 1))=[" + GetStatement(_statementList.get(_statementList.size() - 1)) + "]");
            //////        System.out.println("_statementList.get(_statementList.size() - 1)._rule=[" + _statementList.get(_statementList.size() - 1)._rule + "]");
            //////        if (IsSupportedStatement(_statementList.get(_statementList.size() - 1)))
            //////        {
            //////            System.out.println("Exit Support!!!");
            //////            _plsqlStatement = GetStatement(_statementList.get(_statementList.size() - 1));
            //////        }
            //////        else
            //////        {
            //////            System.out.println("Exit Not Support!!!");
            //////            _plsqlStatement = new NotSupportStatement(_statementList.get(_statementList.size() - 1)._rule);
            //////        }
            //////        _selectList = _plsqlStatement.Convert(_statementList.get(_statementList.size() - 1), _selectList, _loop);
            //////        _statementList.remove(_statementList.size() - 1);
            //////    }
            //////    else if (_selectList.size() > 0)
            //////    {
            //////        if (IsSupportedStatement(_selectList.get(_loop)))
            //////        {
            //////            System.out.println("Exit Support 111 !!!");
            //////            _plsqlStatement = GetStatement(_selectList.get(_loop));
            //////        }
            //////        else
            //////        {
            //////            System.out.println("Exit Not Support 111 !!!");
            //////            _plsqlStatement = new NotSupportStatement();
            //////        }
            //////        _selectList = _plsqlStatement.Convert(_selectList, _loop);
            //////    }
            //////}
            else if (IsStatement(_selectList.get(_loop)))
            {
//////                System.out.print("Type=" + _selectList.get(_loop)._type);
//////                System.out.print(",Level=" + _selectList.get(_loop)._level);
//////                System.out.print(",Rule=" + _selectList.get(_loop)._rule);
//////                System.out.print(",Line=" + _selectList.get(_loop)._line);
//////                System.out.print(",Column=" + _selectList.get(_loop)._column);
//////                System.out.print(",Length=" + _selectList.get(_loop)._length);
//////                System.out.print(",Token=" + _selectList.get(_loop)._token);
//////                System.out.print(",TokenNo=" + _selectList.get(_loop)._tokenNo);
//////                System.out.println(",TokenName=" + _selectList.get(_loop)._tokenName);
//////                System.out.println("---------------------------------------------");
                _selectList.remove(_loop);
//////                System.out.println("Statement=[" + _selectList.get(_loop)._rule + "]");
                _statementList.add(_selectList.get(_loop));
//////                System.out.print("Type=" + _selectList.get(_loop)._type);
//////                System.out.print(",Level=" + _selectList.get(_loop)._level);
//////                System.out.print(",Rule=" + _selectList.get(_loop)._rule);
//////                System.out.print(",Line=" + _selectList.get(_loop)._line);
//////                System.out.print(",Column=" + _selectList.get(_loop)._column);
//////                System.out.print(",Length=" + _selectList.get(_loop)._length);
//////                System.out.print(",Token=" + _selectList.get(_loop)._token);
//////                System.out.print(",TokenNo=" + _selectList.get(_loop)._tokenNo);
//////                System.out.println(",TokenName=" + _selectList.get(_loop)._tokenName);
//////                System.out.println("==========================================");
                if (IsSupportedStatement(_selectList.get(_loop)))
                {
                    _plsqlStatement = GetStatement(_selectList.get(_loop));
                    _selectList = _plsqlStatement.Convert(_selectList, _loop);
                }
                else
                {
                    _plsqlStatement = new NotSupportStatement();
                    _selectList = _plsqlStatement.Convert(_selectList, _loop);
                }
                if (_selectList.get(_loop)._level < _statementList.get(_statementList.size() - 1)._level)
                {
                    _statementList.remove(_statementList.size() - 1);
                }
            }
            else if(IsBlockEnd(_selectList.get(_loop)))
            {
//////                System.out.print("Block End ====");
//////                System.out.print("Type=" + _selectList.get(_loop)._type);
//////                System.out.print(",Level=" + _selectList.get(_loop)._level);
//////                System.out.print(",Rule=" + _selectList.get(_loop)._rule);
//////                System.out.print(",Line=" + _selectList.get(_loop)._line);
//////                System.out.print(",Column=" + _selectList.get(_loop)._column);
//////                System.out.print(",Length=" + _selectList.get(_loop)._length);
//////                System.out.print(",Token=" + _selectList.get(_loop)._token);
//////                System.out.print(",TokenNo=" + _selectList.get(_loop)._tokenNo);
//////                System.out.println(",TokenName=" + _selectList.get(_loop)._tokenName);
//////                System.out.println("==========================================");
//////                if (IsSupportedStatement(_selectList.get(_loop)))
//////                {
                    _plsqlStatement = GetBlockEnd(_selectList.get(_loop));
                    _selectList = _plsqlStatement.Convert(_selectList, _loop);
//////                }
//////                else
//////                {
//////                    _plsqlStatement = new NotSupportStatement();
//////                    _selectList = _plsqlStatement.Convert(_selectList, _loop);
//////                }
                if (_selectList.get(_loop)._level < _statementList.get(_statementList.size() - 1)._level)
                {
                    _statementList.remove(_statementList.size() - 1);
                }
            }
            else
            {
                _selectItem.add(_selectList.get(_loop));
                _selectList.remove(_loop);
            }
        }
//////        for(int _loop = 0; _loop < _selectItem.size();_loop++)
//////        {
//////            System.out.println("Statementxxxx=[" + GetStatement(_selectItem.get(_loop)) + "]");
//////            System.out.print("Loop=" + _loop + ",");
//////            System.out.print("Type=" + _selectItem.get(_loop)._type);
//////            System.out.print(",Level=" + _selectItem.get(_loop)._level);
//////            System.out.print(",Rule=" + _selectItem.get(_loop)._rule);
//////            System.out.print(",Line=" + _selectItem.get(_loop)._line);
//////            System.out.print(",Column=" + _selectItem.get(_loop)._column);
//////            System.out.print(",Length=" + _selectItem.get(_loop)._length);
//////            System.out.print(",Token=" + _selectItem.get(_loop)._token);
//////            System.out.print(",TokenNo=" + _selectItem.get(_loop)._tokenNo);
//////            System.out.println(",TokenName=" + _selectItem.get(_loop)._tokenName);
//////        }
        while(_selectItem.size() > 0)
        {
            if (_statementList.size() > 0)
            {
                if (IsSupportedStatement(_statementList.get(_statementList.size() - 1)))
                {
                    _plsqlStatement = GetStatement(_statementList.get(_statementList.size() - 1));
                }
                else
                {
                    _plsqlStatement = new NotSupportStatement(_statementList.get(_statementList.size() - 1)._rule);
                }
                _selectItem = _plsqlStatement.Convert(_statementList.get(_statementList.size() - 1), _selectItem, 0);
                _statementList.remove(_statementList.size() - 1);
            }
            else if (IsSupportedStatement(_selectItem.get(0)))
            {
                _plsqlStatement = GetStatement(_selectItem.get(0));
                _selectItem = _plsqlStatement.Convert(_selectItem, 0);
            }
            else
            {
                _plsqlStatement = new NotSupportStatement();
                _selectItem = _plsqlStatement.Convert(_selectItem, 0);
            }
        }
    }
}
