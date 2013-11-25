package enCub.PLSQL.Converter;

import java.util.*;

public class PLSQLTokens {
    private ArrayList<PLSQLToken> _tokens = null;
    public void Add(PLSQLToken parmToken)
    {
        if(_tokens == null)
        {
            _tokens = new ArrayList<PLSQLToken>();
        }
        _tokens.add(parmToken);
    }
    public PLSQLToken Get(int parmPos)
    {
        return _tokens.get(parmPos);
    }
    public void Remove(int parmPos)
    {
        _tokens.remove(parmPos);
    }
    public int Size()
    {
        if(_tokens == null)
        {
            return 0;
        }
        return _tokens.size();
    }
}