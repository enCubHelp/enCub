package enCub.PLSQL.Converter;

import java.util.*;
import enCub.PLSQL.Properties.Environment;

abstract class PLSQLStatement {
    private List<PLSQLParsing>  _selectItem = new ArrayList<PLSQLParsing>();
    private int                 _curPos     = 0;
//////    private List<String>        _threadName = new ArrayList<String>();
//////    private List<PLSQL2Java>    _javaWriter = new ArrayList<PLSQL2Java>();

    public List<PLSQLParsing> Convert(PLSQLParsing _prevParsing, List<PLSQLParsing> _selectList, int _index) throws Exception
    {
        int _level = _prevParsing._level;
//////        System.out.println("Level=[" + _level + "]");
//////        System.out.print("_prevParsing._type=[" + _prevParsing._type + "],");
//////        System.out.print("_prevParsing._rule=[" + _prevParsing._rule + "],");
//////        System.out.print("_prevParsing._type=[" + _prevParsing._type + "],");
//////        System.out.println("_prevParsing._tokenName=[" + _prevParsing._tokenName + "]");
//////        System.out.println("_selectList.size()=[" + _selectList.size() + "]");
        for(int _loop = _index; _loop < _selectList.size();)
        {
//////            System.out.println("_selectList.get(_loop)._level=[" + _selectList.get(_loop)._level + "]");
//////            System.out.print("Loop=[" + _loop + ",");
//////            System.out.print("_selectList.get(_loop)._level=[" + _selectList.get(_loop)._level + "],");
//////            System.out.print("_selectList.get(_loop)._type=[" + _selectList.get(_loop)._type + "],");
//////            System.out.print("_selectList.get(_loop)._rule=[" + _selectList.get(_loop)._rule + "],");
//////            System.out.print("_selectList.get(_loop)._type=[" + _selectList.get(_loop)._type + "],");
//////            System.out.println("_selectList.get(_loop)._tokenName=[" + _selectList.get(_loop)._tokenName + "]");
            if ( _selectList.get(_loop)._level < _level)
            {
                _index = _loop - 1;
                if (_selectItem.size() > 0)
                {
                    Convert(_selectItem);
                }
                break;
            }
            _selectItem.add(_selectList.get(_loop));
//////            System.out.println("remove");
            _selectList.remove(_loop);
        }
        if (_selectItem.size() > 0)
        {
            Convert(_selectItem);
        }
        return _selectList;
    }
    public List<PLSQLParsing> Convert(List<PLSQLParsing> _selectList, int _index) throws Exception
    {
        int _level = _selectList.get(_index)._level;
        _selectItem.add(_selectList.get(_index));
        _selectList.remove(_index);
        for(int _loop = _index; _loop < _selectList.size();)
        {
            if ( _selectList.get(_loop)._level < _level)
            {
                _index = _loop - 1;
                if (_selectItem.size() > 0)
                {
                    Convert(_selectItem);
                }
                break;
            }
            else if (IsStatement(_selectList.get(_loop)))
            {
                _index = _loop - 1;
                if (_selectItem.size() > 0)
                {
                    Convert(_selectItem);
                }
                break;
            }
            _selectItem.add(_selectList.get(_loop));
            _selectList.remove(_loop);
        }
        return _selectList;
    }
    public abstract void Convert(List<PLSQLParsing> _selectList) throws Exception;

    public boolean IsExit(PLSQLParsing _selectList)
    {
            if (_selectList._type.equals("exit"))
            {
                return true;
            }
            else
            {
                return false;
            }
    }
    public boolean IsStart(PLSQLParsing _selectList)
    {
            if (_selectList._type.equals("enter") &&
                _selectList._rule.equals("start"))
            {
                return true;
            }
            else
            {
                return false;
            }
    }
    public boolean IsExitStart(PLSQLParsing _selectList)
    {
            if (_selectList._type.equals("exit") &&
                _selectList._rule.equals("start"))
            {
                return true;
            }
            else
            {
                return false;
            }
    }
    public boolean IsStatement(PLSQLParsing _selectList)
    {
            if (_selectList._type.equals("enter") &&
                _selectList._rule.equals("statement"))
            {
                return true;
            }
            else
            {
                return false;
            }
    }
    public boolean IsExitStatement(PLSQLParsing _selectList)
    {
            if (_selectList._type.equals("exit") &&
                _selectList._rule.equals("statement"))
            {
                return true;
            }
            else
            {
                return false;
            }
    }
    public boolean IsSupportedStatement(PLSQLParsing _selectList)
    {
            if (GetStatement(_selectList) == null)
            {
                return false;
            }
            else
            {
                return true;
            }
    }
    public PLSQLStatement GetStatement(PLSQLParsing _selectList)
    {
            if (_selectList._type.equals("enter") &&
                _selectList._rule.equals("create_procedure"))
            {
                return new CreateProcedure();
            }
            else if (_selectList._type.equals("enter") &&
                     _selectList._rule.equals("create_function"))
            {
                return new CreateFunction();
            }
            else if (_selectList._type.equals("enter") &&
                     _selectList._rule.equals("create_trigger"))
            {
                return new CreateTrigger();
            }
            else if (_selectList._type.equals("enter") &&
                     _selectList._rule.equals("create_function"))
            {
                return new CreateFunction();
            }
            else if (_selectList._type.equals("enter") &&
                     _selectList._rule.equals("sql_insert"))
            {
                return new SQLInsert();
            }
            else if (_selectList._type.equals("enter") &&
                     _selectList._rule.equals("sql_select"))
            {
                return new SQLSelect();
            }
            else if (_selectList._type.equals("enter") &&
                     _selectList._rule.equals("select_into_statement"))
            {
                return new SQLSelectInto();
            }
            else if (_selectList._type.equals("enter") &&
                     _selectList._rule.equals("sql_update"))
            {
                return new SQLUpdate();
            }
            else if (_selectList._type.equals("enter") &&
                     _selectList._rule.equals("sql_delete"))
            {
                return new SQLDelete();
            }
            else if (_selectList._type.equals("enter") &&
                     _selectList._rule.equals("open_statement"))
            {
                return new SQLOpen();
            }
            else if (_selectList._type.equals("enter") &&
                     _selectList._rule.equals("open_for_statement"))
            {
                return new SQLOpenFor();
            }
            else if (_selectList._type.equals("enter") &&
                     _selectList._rule.equals("close_statement"))
            {
                return new SQLClose();
            }
            else if (_selectList._type.equals("enter") &&
                     _selectList._rule.equals("fetch_statement"))
            {
                return new SQLFetch();
            }
            else if (_selectList._type.equals("enter") &&
                     _selectList._rule.equals("close_statement"))
            {
                return new SQLClose();
            }
            else if (_selectList._type.equals("enter") &&
                     _selectList._rule.equals("return_statement"))
            {
                return new SQLReturn();
            }
            else if (_selectList._type.equals("enter") &&
                     _selectList._rule.equals("assignment_statement"))
            {
                return new PLSQLAssignment();
            }
            else if (_selectList._type.equals("enter") &&
                     _selectList._rule.equals("basic_loop_statement"))
            {
                return new PLSQLLoop();
            }
            else if (_selectList._type.equals("enter") &&
                     _selectList._rule.equals("basic_loop_statement"))
            {
                return new PLSQLLoop();
            }
            else if (_selectList._type.equals("enter") &&
                     _selectList._rule.equals("exit_statement"))
            {
                return new PLSQLExit();
            }
            else
            {
                return null;
            }
    }
    public boolean IsBlockEnd(PLSQLParsing _selectList)
    {
            if (GetBlockEnd(_selectList) == null)
            {
                return false;
            }
            else
            {
                return true;
            }
    }
    public PLSQLStatement GetBlockEnd(PLSQLParsing _selectList)
    {
            if (_selectList._type.equals("consume") &&
                _selectList._rule.equals("basic_loop_statement") &&
                _selectList._tokenName.equals("END"))
            {
                return new PLSQLLoop();
            }
            else
            {
                return null;
            }
    }
    public int GetNextTokenPos(int _pos)
    {
        int _returnInt = -1;
        for(int _loop = _pos; _loop < _selectItem.size(); _loop++)
        {
            if (!_selectItem.get(_loop)._token.equals(""))
            {
                _returnInt = _loop;
                break;
            }
        }
        return _returnInt;
    }

    public int GetCurrentPosition()
    {
        return _curPos;
    }
    public int GetNextPosition()
    {
        if (_curPos == -1 ||
            _curPos >= _selectItem.size())
        {
            return -1;
        }
        else
        {
            _curPos++;
        }
        return _curPos;
    }
    public String GetCurrentType()
    {
        if (_curPos == -1 ||
            _curPos >= _selectItem.size())
        {
            return null;
        }
        return _selectItem.get(_curPos)._type;
    }
    public int GetCurrentLevel()
    {
        if (_curPos == -1 ||
            _curPos >= _selectItem.size())
        {
            return -1;
        }
        return _selectItem.get(_curPos)._level;
    }
    public String GetCurrentRule()
    {
        if (_curPos == -1 ||
            _curPos >= _selectItem.size())
        {
            return null;
        }
        return _selectItem.get(_curPos)._rule;
    }
    public int GetCurrentLine()
    {
        if (_curPos == -1 ||
            _curPos >= _selectItem.size())
        {
            return -1;
        }
        return _selectItem.get(_curPos)._line;
    }
    public int GetCurrentColumn()
    {
        if (_curPos == -1 ||
            _curPos >= _selectItem.size())
        {
            return -1;
        }
        return _selectItem.get(_curPos)._column;
    }
    public int GetCurrentLength()
    {
        if (_curPos == -1 ||
            _curPos >= _selectItem.size())
        {
            return -1;
        }
        return _selectItem.get(_curPos)._length;
    }
    public String GetCurrentToken()
    {
        if (_curPos == -1 ||
            _curPos >= _selectItem.size())
        {
            return null;
        }
        return _selectItem.get(_curPos)._token;
    }
    public int GetCurrentTokenNo()
    {
        if (_curPos == -1 ||
            _curPos >= _selectItem.size())
        {
            return -1;
        }
        return _selectItem.get(_curPos)._tokenNo;
    }
    public String GetCurrentTokenName()
    {
        if (_curPos == -1 ||
            _curPos >= _selectItem.size())
        {
            return null;
        }
        return _selectItem.get(_curPos)._tokenName;
    }

    public String GetNextRule()
    {
        String _returnString = "";
        if (_curPos == -1 ||
            _curPos >= _selectItem.size())
        {
            _curPos = -1;
            return null;
        }
        for(int _loop = _curPos; _loop < _selectItem.size(); _loop++)
        {
            if (!_selectItem.get(_loop)._type.equals("exit"))
            {
                _returnString   = _selectItem.get(_loop)._rule;
                _curPos         = _loop;
                break;
            }
        }
        return _returnString;
    }
    public String GetNextToken()
    {
        String _returnString = "";
        if (_curPos == -1 ||
            _curPos >= _selectItem.size())
        {
            _curPos = -1;
            return null;
        }
        for(int _loop = _curPos; _loop < _selectItem.size(); _loop++)
        {
            if (!_selectItem.get(_loop)._token.equals(""))
            {
                _returnString   = _selectItem.get(_loop)._token;
                _curPos         = _loop;
                break;
            }
        }
        return _returnString;
    }
    public void GetPrevToken()
    {
        if (_curPos <= 0)
        {
            _curPos = 0;
            return;
        }
        for(int _loop = (_curPos - 1); _loop >= 0; _loop--)
        {
            if (!_selectItem.get(_loop)._token.equals(""))
            {
                _curPos         = _loop;
                return;
            }
        }
        _curPos = 0;
    }
    public String GetNextTokenName()
    {
        String _returnString = "";
        if (_curPos == -1 ||
            _curPos >= _selectItem.size())
        {
            _curPos = -1;
            return null;
        }
        for(int _loop = _curPos; _loop < _selectItem.size(); _loop++)
        {
            if (!_selectItem.get(_loop)._tokenName.equals(""))
            {
                _returnString   = _selectItem.get(_loop)._tokenName;
                _curPos         = _loop;
                break;
            }
        }
        return _returnString;
    }
    public String GetNextToken(int _pos)
    {
        String _returnString = "";
        for(int _loop = _pos; _loop < _selectItem.size(); _loop++)
        {
            if (!_selectItem.get(_loop)._token.equals(""))
            {
                _returnString   = _selectItem.get(_loop)._token;
                break;
            }
        }
        return _returnString;
    }
    public String GetJavaType(String parmType, int parmLength, int parmPrecision)
    {
//////
//////      Following statement is supproted by Java Version 1.7 above.
//////
//////        switch(parmType)
//////        {
//////            case "CHAR":
//////            case "CHARACTER":
//////            case "LONG":
//////            case "STRING":
//////            case "VARCHAR":
//////            case "VARCHAR2":
//////                return "String";
//////            case "RAW":
//////            case "LONG RAW":
//////                return "byte[]";
//////            case "BINARY_INTEGER":
//////            case "NATURAL":
//////            case "NATURALN":
//////            case "PLS_INTEGER":
//////            case "POSITIVE":
//////            case "POSITIVEN":
//////            case "SIGNTYPE":
//////            case "INT":
//////            case "INTEGER":
//////            case "SMALLINT":
//////                return "int";
//////            case "DEC":
//////            case "DECIMAL":
//////            case "NUMBER":
//////            case "NUMERIC":
//////                return "BigDecimal";
//////            case "DOUBLE PRECISION":
//////            case "FLOAT":
//////                return "dobule";
//////            case "REAL":
//////                return "float";
//////            case "BOOLEAN":
//////                return "boolean";
//////            case "DATE":
//////                return "Date";
//////            default:
//////                return "Unkonwn";
//////        }
//////

//////      Following statement is supproted by Java Version 1.6 below.
//////
        String _type = parmType.toUpperCase();
        if (_type.equals("CHAR") ||
            _type.equals("CHARACTER") ||
            _type.equals("LONG") ||
            _type.equals("STRING") ||
            _type.equals("VARCHAR") ||
            _type.equals("VARCHAR2"))
        {
            return "String";
        }
        else if (_type.equals("RAW") ||
                 _type.equals("LONG RAW"))
        {
            return "byte[]";
        }
        else if (_type.equals("BINARY_INTEGER") ||
                 _type.equals("NATURAL") ||
                 _type.equals("NATURALN") ||
                 _type.equals("PLS_INTEGER") ||
                 _type.equals("POSITIVE") ||
                 _type.equals("POSITIVEN") ||
                 _type.equals("SIGNTYPE") ||
                 _type.equals("INT") ||
                 _type.equals("INTEGER") ||
                 _type.equals("SMALLINT"))
        {
            return "int";
        }
        else if (_type.equals("DEC") ||
                 _type.equals("DECIMAL") ||
                 _type.equals("NUMBER") ||
                 _type.equals("NUMERIC"))
        {
            return "BigDecimal";
        }
        else if (_type.equals("DOUBLE PRECISION") ||
                 _type.equals("FLOAT"))
        {
            return "dobule";
        }
        else if (_type.equals("REAL"))
        {
            return "float";
        }
        else if (_type.equals("BOOLEAN"))
        {
            return "boolean";
        }
        else if (_type.equals("DATE"))
        {
            return "Date";
        }
        else if (_type.equals("SYS_REFCURSOR"))
        {
            return "ResultSet";
//////            try {
//////                String          _targetDBMS     = Environment.Get("TargetDBMS");
//////                if (_targetDBMS.toUpperCase().startsWith("CUBRID"))
//////                {
//////                    return "Unkonwn";
//////                }
//////                else if (_targetDBMS.toUpperCase().startsWith("ORACLE"))
//////                {
//////                    return "ResultSet";
//////                }
//////                else
//////                {
//////                    return "Unkonwn";
//////                }
//////            } catch(Exception e) {
//////                return "Unkonwn";
//////            }
        }
        else
        {
//////            System.out.println("PLSQLStatement:_type=[" + _type + "]");
            return "Unkonwn";
        }
    }
    public String AppendLine(String parmAppendLines, int parmLine)
    {
        if (parmAppendLines.equals(""))
        {
            parmAppendLines = String.valueOf(parmLine);
        }
        else
        {
            parmAppendLines += new String(JavaWriter._Seperator, 0, JavaWriter._Seperator.length) + String.valueOf(parmLine);
        }
        return parmAppendLines;
    }
    public String AppendColumn(String parmAppendColumns, int parmColumn)
    {
        if (parmAppendColumns.equals(""))
        {
            parmAppendColumns = String.valueOf(parmColumn);
        }
        else
        {
            parmAppendColumns += new String(JavaWriter._Seperator, 0, JavaWriter._Seperator.length) + String.valueOf(parmColumn);
        }
        return parmAppendColumns;
    }
    public String GetProgram()
    {
        return JavaWriter.GetProgram();
    }
    public void SetSQL() {
        SetSQL(true);
    }
    public void SetSQL(boolean parmSQL) {
        JavaWriter.SetSQL(parmSQL);
    }
    public void SetRefCursor() {
        SetRefCursor(true);
    }
    public void SetRefCursor(boolean parmRefCursor) {
        JavaWriter.SetRefCursor(parmRefCursor);
    }
    public List<PLSQLData> GetData(String parmName) {
        return JavaWriter.GetData(parmName);
    }
    public List<PLSQLData> GetData() {
        return JavaWriter.GetData();
    }
    public void AddData(String parmName, String parmType, int parmLength, int parmPrecision, String parmInOut) {
        JavaWriter.AddData(parmName, parmType, parmLength, parmPrecision, parmInOut);
    }
    public String GetDataName(String parmName) {
        return JavaWriter.GetDataName(parmName);
    }
    public void ConvertStatement(int parmType, int parmLine, int parmColumn, String parmCommand, String parmStatement) {
        JavaWriter.ConvertStatement(parmType, String.valueOf(parmLine), String.valueOf(parmColumn), parmCommand, parmStatement);
    }
    public void ConvertStatement(int parmType, String parmLines, String parmColumns, String parmCommand, String parmStatement) {
        JavaWriter.ConvertStatement(parmType, parmLines, parmColumns, parmCommand, parmStatement);
    }
    public List<PLSQLData> GetCursorVariable(String parmCursor) {
        return JavaWriter.GetCursorVariable(parmCursor);
    }
    public void SetCursorVariable(String parmCursor, List<PLSQLData> parmPlsql) {
        JavaWriter.SetCursorVariable(parmCursor, parmPlsql);
    }
    public List<PLSQLData> GetFetchVariable(String parmCursor) {
        return JavaWriter.GetFetchVariable(parmCursor);
    }
    public void SetFetchVariable(String parmCursor, List<PLSQLData> parmPlsql) {
        JavaWriter.SetFetchVariable(parmCursor, parmPlsql);
    }
    public String GetJavaVariable(String parmVariable) {
        return JavaWriter.GetJavaVariable(parmVariable);
    }
}