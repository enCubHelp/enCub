package enCub.PLSQL.Converter;

import java.util.List;
import java.util.ArrayList;

public class PLSQLParsingData {
    private static PLSQLParsingData _parsingData = null;
    private static int _tokenPosition = 0;
    private static int _level = 0;
    private static List<PLSQLParsing> _selectList = new ArrayList<PLSQLParsing>();

    public static PLSQLParsingData getInstance() throws Exception
    {
        if (_parsingData == null)
        {
            _parsingData = new PLSQLParsingData();
            _tokenPosition = 0;
        }
        return _parsingData;
    }
    public void AddData(PLSQLParsing parmData)
    {
        if (parmData._type.equals("exit"))
        {
            _level--;
        }
        parmData._level = _level;
        _selectList.add(parmData);
        if (parmData._type.equals("enter"))
        {
            _level++;
        }
    }
    public void SetData(List<PLSQLParsing> parmData)
    {
        _selectList = parmData;
    }
    public PLSQLParsing GetCurrent()
    {
        return _selectList.get(_tokenPosition);
    }
    public PLSQLParsing GetNext()
    {
        _tokenPosition++;
        return _selectList.get(_tokenPosition - 1);
    }
}