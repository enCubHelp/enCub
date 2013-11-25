package enCub.PLSQL.Converter;

import java.util.*;
import java.util.*;

import enCub.PLSQL.Repository.ParsingTable;
import enCub.PLSQL.Repository.PLSQLCRUDTable;
import enCub.PLSQL.Converter.PLSQLParsing;

public class PLSQLReadParsing {
    private List<PLSQLParsing> _selectList = new ArrayList<PLSQLParsing>();
    private PLSQLCRUDTable _crudTable = new PLSQLCRUDTable();
    public void ParseCRUD(String parmProject, String parmPLSQL)
    {
        int _level = 0;
        int _saveLevel = 0;
        int _crudCnt = 0;
        ParsingTable _parsingTable = new ParsingTable();
        _parsingTable.Select(parmProject, parmPLSQL);
        _selectList = _parsingTable.Get();

        System.out.println("Project=" + parmProject);
        System.out.println("PLSQL=" + parmPLSQL);
        for(int _index1 = 0; _index1 < _selectList.size(); _index1++)
        {
            if (_selectList.get(_index1)._type.equals("exit"))
            {
                _level--;
            }
            if (_selectList.get(_index1)._type.equals("consume") &&
                _selectList.get(_index1)._rule.equals("sql_insert"))
            {
                _saveLevel = _level;
                for(int _index2 = _index1 + 1; _index2 < _selectList.size(); _index2++)
                {
                    if (_selectList.get(_index2)._type.equals("exit"))
                    {
                        _level--;
                        if (_saveLevel > _level)
                        {
                            _index1 = _index2;
                            break;
                        }
                    }
                    if (_selectList.get(_index2)._type.equals("consume") &&
                        _selectList.get(_index2)._rule.equals("insert_into_clause") &&
                        _selectList.get(_index2)._tokenName.equals("INTO"))
                    {
                        _saveLevel = _level;
                        for(int _index3 = _index2 + 1; _index3 < _selectList.size(); _index3++)
                        {
                            if (_selectList.get(_index3)._type.equals("consume") &&
                                _selectList.get(_index3)._tokenName.equals("VARIABLE_NAME"))
                            {
                                _crudCnt++;
//////                                System.out.println("Create Seq=[" + _crudCnt + "], Table Name=[" + _selectList.get(_index3)._token + "]");
                                _crudTable.Insert(parmProject, parmPLSQL, _crudCnt, "C", _selectList.get(_index3)._token);
                                _index2 = _index3;
                                break;
                            }
                            if (_selectList.get(_index3)._type.equals("exit"))
                            {
                                _level--;
                                if (_saveLevel >= _level)
                                {
                                    _index2 = _index3;
                                    break;
                                }
                            }
                            if (_selectList.get(_index3)._type.equals("enter"))
                            {
                                _level++;
                            }
                        }
                    }
                    if (_selectList.get(_index2)._type.equals("enter"))
                    {
                        _level++;
                    }
                }
            }
            else if (_selectList.get(_index1)._type.equals("consume") &&
                     _selectList.get(_index1)._tokenName.equals("SELECT"))
            {
//////                            System.out.print("SEQ=" + _selectList.get(_index1)._seq);
//////                            System.out.print(",Level=" + _level);
//////                            System.out.print(",Type=" + _selectList.get(_index1)._type);
//////                            System.out.print(",Rule=" + _selectList.get(_index1)._rule);
//////                            System.out.print(",Line=" + _selectList.get(_index1)._line);
//////                            System.out.print(",Column=" + _selectList.get(_index1)._column);
//////                            System.out.print(",Length=" + _selectList.get(_index1)._length);
//////                            System.out.print(",Token=" + _selectList.get(_index1)._token);
//////                            System.out.print(",TokenNo=" + _selectList.get(_index1)._tokenNo);
//////                            System.out.println(",TokenName=" + _selectList.get(_index1)._tokenName);
                _saveLevel = _level;
                for(int _index2 = _index1 + 1; _index2 < _selectList.size(); _index2++)
                {
                    if (_selectList.get(_index2)._type.equals("exit"))
                    {
                        _level--;
                        if (_saveLevel > _level)
                        {
                            _index1 = _index2;
                            break;
                        }
                    }
                    if (_selectList.get(_index2)._type.equals("consume") &&
                        _selectList.get(_index2)._tokenName.equals("FROM"))
                    {
                        _saveLevel = _level;
                        for(int _index3 = _index2 + 1; _index3 < _selectList.size(); _index3++)
                        {
                            if (_selectList.get(_index3)._type.equals("consume") &&
                                _selectList.get(_index3)._tokenName.equals("VARIABLE_NAME"))
                            {
                                _crudCnt++;
//////                                System.out.println("Select Seq=[" + _crudCnt + "], Table Name=[" + _selectList.get(_index3)._token + "]");
                                _crudTable.Insert(parmProject, parmPLSQL, _crudCnt, "R", _selectList.get(_index3)._token);
                                _index2 = _index3;
                                break;
                            }
                            if (_selectList.get(_index3)._type.equals("exit"))
                            {
                                _level--;
                                if (_saveLevel >= _level)
                                {
                                    _index2 = _index3;
                                    break;
                                }
                            }
                            if (_selectList.get(_index3)._type.equals("enter"))
                            {
                                _level++;
                            }
                        }
                    }
                    if (_selectList.get(_index2)._type.equals("enter"))
                    {
                        _level++;
                    }
                }
            }
            else if (_selectList.get(_index1)._type.equals("consume") &&
                    (_selectList.get(_index1)._rule.equals("sql_update") ||
                     _selectList.get(_index1)._rule.equals("sql_delete")))
            {
                _saveLevel = _level;
                for(int _index2 = _index1 + 1; _index2 < _selectList.size(); _index2++)
                {
                    if (_selectList.get(_index2)._type.equals("exit"))
                    {
                        _level--;
                        if (_saveLevel >= _level)
                        {
                            _index1 = _index2;
                            break;
                        }
                    }
                    if (_selectList.get(_index2)._type.equals("consume") &&
                        _selectList.get(_index2)._tokenName.equals("VARIABLE_NAME"))
                    {
                        _crudCnt++;
                        if (_selectList.get(_index1)._rule.equals("sql_update"))
                        {
//////                            System.out.println("Update Seq=[" + _crudCnt + "], Table Name=[" + _selectList.get(_index2)._token + "]");
                                _crudTable.Insert(parmProject, parmPLSQL, _crudCnt, "U", _selectList.get(_index2)._token);
                        }
                        else
                        {
//////                            System.out.println("Delete Seq=[" + _crudCnt + "], Table Name=[" + _selectList.get(_index2)._token + "]");
                                _crudTable.Insert(parmProject, parmPLSQL, _crudCnt, "D", _selectList.get(_index2)._token);
                        }
                        _index1 = _index2;
                        break;
                    }
                    if (_selectList.get(_index2)._type.equals("enter"))
                    {
                        _level++;
                    }
                }
            }
//////                            System.out.print("SEQ=" + _selectList.get(_index1)._seq);
//////                            System.out.print(",Level=" + _level);
//////                            System.out.print(",Type=" + _selectList.get(_index1)._type);
//////                            System.out.print(",Rule=" + _selectList.get(_index1)._rule);
//////                            System.out.print(",Line=" + _selectList.get(_index1)._line);
//////                            System.out.print(",Column=" + _selectList.get(_index1)._column);
//////                            System.out.print(",Length=" + _selectList.get(_index1)._length);
//////                            System.out.print(",Token=" + _selectList.get(_index1)._token);
//////                            System.out.print(",TokenNo=" + _selectList.get(_index1)._tokenNo);
//////                            System.out.println(",TokenName=" + _selectList.get(_index1)._tokenName);

            if (_selectList.get(_index1)._type.equals("enter"))
            {
                _level++;
            }
        }
    }
    public boolean tryParseInt(String parmValue)
    {
        try
        {
            Integer.parseInt(parmValue);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public static void main(String[] args) throws Exception {
        if ( args.length > 1 )
        {
            PLSQLReadParsing _parser = new PLSQLReadParsing();
            _parser.ParseCRUD(args[0], args[1]);
        }
        else
        {
            System.out.println("argument not found.");
        }
    }
}
