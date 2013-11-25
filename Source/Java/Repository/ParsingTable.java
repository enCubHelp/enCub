package enCub.PLSQL.Repository;

import java.util.*;
import java.sql.*;
import java.util.*;
import java.util.regex.Pattern;
import org.apache.commons.codec.binary.Base64;

import enCub.PLSQL.Converter.PLSQLParsing;

public class ParsingTable
{
    private List<PLSQLParsing>    _selectList = new ArrayList<PLSQLParsing>();
    private Connection          _conn       = null;
    public List<PLSQLParsing> Get()
    {
        return _selectList;
    }
    public void Select(String parmProject, String parmPlsql)
    {
        Database _database = new Database();
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "SELECT * FROM ParsingTbl  ";
            if(parmPlsql.equals("DISTINCT"))
            {
                _sql = "SELECT DISTINCT PLSQL FROM ParsingTbl WHERE Project = '" + parmProject + "' ORDER BY PLSQL;";
            }
            else
            {
                _sql = "SELECT * FROM ParsingTbl WHERE Project = '" + parmProject + "' AND PLSQL = '" + parmPlsql + "' ORDER BY Project, PLSQL, SEQ;";
            }
            System.out.println("SQL=[" + _sql + "]");
            ResultSet _rs = _statement.executeQuery(_sql);
            int _level = 0;
            while(_rs.next())
            {
                PLSQLParsing _parsing   = new PLSQLParsing();
                _parsing._project       = parmProject;
                _parsing._plsql         = _rs.getString("Plsql");
                if(parmPlsql.equals("DISTINCT"))
                {
                    _parsing._seq       = 0;
                    _parsing._type      = "";
                    _parsing._level     = 0;
                    _parsing._rule      = "";
                    _parsing._line      = 0;
                    _parsing._column    = 0;
                    _parsing._length    = 0;
                    _parsing._token     = "";
                    _parsing._tokenNo   = 0;
                    _parsing._tokenName = "";
                }
                else
                {
                    _parsing._seq       = Integer.parseInt(_rs.getString("Seq"));
                    _parsing._type      = _rs.getString("Parsing_type");
                    if (_parsing._type.equals("enter"))
                    {
                        _level++;
                        _parsing._level = _level;
                    }
                    else if (_parsing._type.equals("exit"))
                    {
                        _parsing._level = _level;
                        _level--;
                    }
                    else
                    {
                        _parsing._level = _level;
                    }
                    _parsing._rule      = _rs.getString("Rule");
                    _parsing._line      = Integer.parseInt(_rs.getString("Line"));
                    _parsing._column    = Integer.parseInt(_rs.getString("Parsing_Column"));
                    _parsing._length    = Integer.parseInt(_rs.getString("Parsing_Length"));
                    _parsing._token     = new String(Base64.decodeBase64(_rs.getString("Token")));
                    _parsing._tokenNo   = Integer.parseInt(_rs.getString("TokenNo"));
                    _parsing._tokenName = new String(Base64.decodeBase64(_rs.getString("TokenName")));
                }
                _selectList.add(_parsing);
            }
            _statement.close();
            _conn.close();
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
        finally
        {
            try
            {
                if(_statement != null)
                {
                    _statement.close();
                }
                if(_conn != null)
                {
                    _conn.close();
                }
            }
            catch(SQLException e)
            {
                System.err.println(e.getMessage());
            }
        }
    }
    public void Insert(String parmProject, String parmPlsql, int parmSeq, String parmType, String parmRule, int parmLine, int parmColumn, int parmLength, String parmToken, int parmTokenNo, String parmTokenName)
    {
        Database _database = new Database();
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "INSERT INTO ParsingTbl(Project, plsql, seq, parsing_type, rule, line, parsing_column, parsing_length, token, tokenno, tokenname) Values('" +
                          parmProject + "','" + parmPlsql + "', " + parmSeq + ",'" + parmType + "','" + parmRule + "', " + parmLine + ", " + parmColumn + ", " + parmLength + ", '" + new String(Base64.encodeBase64(parmToken.getBytes())) + "', " + parmTokenNo + ", '" + new String(Base64.encodeBase64(parmTokenName.getBytes())) +  "');";
            _statement.executeUpdate(_sql);
            _statement.close();
            _conn.commit();
            _conn.close();
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
        finally
        {
            try
            {
                if(_statement != null)
                {
                    _statement.close();
                }
                if(_conn != null)
                {
                    _conn.close();
                }
            }
            catch(SQLException e)
            {
                System.err.println(e.getMessage());
            }
        }
    }
    public void Delete(String parmProject, String parmPlsql)
    {
        Database _database = new Database();
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "DELETE ParsingTbl WHERE Project = '" + parmProject + "' and Plsql = '" + parmPlsql + "';";
            _statement.executeUpdate(_sql);
            _conn.commit();
            _statement.close();
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
        finally
        {
            try
            {
                if(_statement != null)
                {
                    _statement.close();
                }
                if(_conn != null)
                {
                    _conn.close();
                }
            }
            catch(SQLException e)
            {
                System.err.println(e.getMessage());
            }
        }
    }
    public void Commit() throws Exception
    {
        if(_conn != null)
        {
            _conn.commit();
            _conn.close();
        }
    }
    public static void main(String[] args) throws Exception
    {
        ParsingTable _parsintTbl = new ParsingTable();
        if(args.length >= 3 &&
           args[0].equals("SELECT"))
        {
            List<PLSQLParsing> _selectList = new ArrayList<PLSQLParsing>();
            if(args[1].equals("DISTINCT"))
            {
                _parsintTbl.Select(args[2], args[1]);
            }
            else
            {
                _parsintTbl.Select(args[1], args[2]);
            }
            _selectList = _parsintTbl.Get();
            for(int _index = 0; _index < _selectList.size(); _index++)
            {
                System.out.println("Project=" + _selectList.get(_index)._project);
                System.out.println("PLSQL=" + _selectList.get(_index)._plsql);
                if (!args[1].equals("DISTINCT"))
                {
                    System.out.println("SEQ=" + _selectList.get(_index)._seq);
                    System.out.println("Type=" + _selectList.get(_index)._type);
                    System.out.println("Rule=" + _selectList.get(_index)._rule);
                    System.out.println("Line=" + _selectList.get(_index)._line);
                    System.out.println("Column=" + _selectList.get(_index)._column);
                    System.out.println("Length=" + _selectList.get(_index)._length);
                    System.out.println("Token=" + _selectList.get(_index)._token);
                    System.out.println("TokenNo=" + _selectList.get(_index)._tokenNo);
                    System.out.println("TokenName=" + _selectList.get(_index)._tokenName);
                }
            }
        }
        else if(args.length >= 3 &&
                args[0].equals("DISPLAY"))
        {
            List<PLSQLParsing> _selectList = new ArrayList<PLSQLParsing>();
            if(args[1].equals("DISTINCT"))
            {
                _parsintTbl.Select(args[2], args[1]);
            }
            else
            {
                _parsintTbl.Select(args[1], args[2]);
            }
            _selectList = _parsintTbl.Get();
            for(int _index = 0; _index < _selectList.size(); _index++)
            {
                System.out.println("Project=" + _selectList.get(_index)._project);
                System.out.println("PLSQL=" + _selectList.get(_index)._plsql);
                if (!args[1].equals("DISTINCT"))
                {
                    System.out.print("SEQ=" + _selectList.get(_index)._seq);
                    System.out.print(",Type=" + _selectList.get(_index)._type);
                    System.out.print(",Rule=" + _selectList.get(_index)._rule);
                    System.out.print(",Line=" + _selectList.get(_index)._line);
                    System.out.print(",Column=" + _selectList.get(_index)._column);
                    System.out.print(",Length=" + _selectList.get(_index)._length);
                    System.out.print(",Token=" + _selectList.get(_index)._token);
                    System.out.print(",TokenNo=" + _selectList.get(_index)._tokenNo);
                    System.out.println(",TokenName=" + _selectList.get(_index)._tokenName);
                }
            }
        }
        else if(args.length == 12 &&
                args[0].equals("INSERT"))
        {
            _parsintTbl.Insert(args[1], args[2], Integer.parseInt(args[3]), args[4], args[5], Integer.parseInt(args[6]), Integer.parseInt(args[7]), Integer.parseInt(args[8]), args[9], Integer.parseInt(args[10]), args[11]);
            System.out.println("입력되었습니다.");
        }
        else if(args.length == 2 &&
                args[0].equals("DELETE"))
        {
            _parsintTbl.Delete(args[1], args[2]);
            System.out.println("삭제되었습니다.");
        }
        else
        {
            System.err.println("입력값을 확인하십시오.");
        }
    }
}