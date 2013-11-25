package enCub.PLSQL.Repository;

import java.util.*;
import java.sql.*;
import java.util.*;
import java.util.regex.Pattern;
import org.apache.commons.codec.binary.Base64;

import enCub.PLSQL.Converter.PLSQLConversion;

public class ConversionTable
{
    private List<PLSQLConversion>    _selectList = new ArrayList<PLSQLConversion>();
    private Connection          _conn       = null;
    public List<PLSQLConversion> Get()
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
                _sql = "SELECT DISTINCT PLSQL FROM ConversionLog WHERE Project = '" + parmProject + "' ORDER BY PLSQL;";
            }
            else if(parmPlsql.equals("DISPLAY"))
            {
                _sql = "SELECT * FROM ConversionLog WHERE Project = '" + parmProject + "' ORDER BY PLSQL;";
            }
            else
            {
                _sql = "SELECT * FROM ConversionLog WHERE Project = '" + parmProject + "' AND PLSQL = '" + parmPlsql + "' ORDER BY Project, PLSQL, SEQ;";
            }
            System.out.println("SQL=[" + _sql + "]");
            ResultSet _rs = _statement.executeQuery(_sql);
            while(_rs.next())
            {
                PLSQLConversion _conversion = new PLSQLConversion();
                _conversion._project           = parmProject;
                _conversion._plsql             = _rs.getString("PLSQL");
                if(parmPlsql.equals("DISTINCT"))
                {
                    _conversion._seq        = 0;
                    _conversion._text       = "";
                }
                else
                {
                    _conversion._seq        = Integer.parseInt(_rs.getString("Seq"));
                    _conversion._text       = new String(Base64.decodeBase64(_rs.getString("Text")));
                }
                _selectList.add(_conversion);
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
    public void Insert(String parmProject, String parmPlsql, int parmSeq, String parmText)
    {
        Database _database = new Database();
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "INSERT INTO ConversionLog(Project, PLSQL, seq, text) Values('" +
                          parmProject + "','" + parmPlsql + "', " + parmSeq + ",'" + new String(Base64.encodeBase64(parmText.getBytes())) +  "');";
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
            String _sql = "DELETE ConversionLog WHERE Project = '" + parmProject + "' and PLSQL = '" + parmPlsql + "';";
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
        ConversionTable _conversionTable = new ConversionTable();
        if(args.length >= 3 &&
           args[0].equals("SELECT"))
        {
            List<PLSQLConversion> _selectList = new ArrayList<PLSQLConversion>();
            if (args[1].equals("DISTINCT") ||
                args[1].equals("DISPLAY"))
            {
                _conversionTable.Select(args[2], args[1]);
            }
            else
            {
                _conversionTable.Select(args[1], args[2]);
            }
            _selectList = _conversionTable.Get();
            for(int _index = 0; _index < _selectList.size(); _index++)
            {
                System.out.println("Project=" + _selectList.get(_index)._project);
                System.out.println("PLSQL=" + _selectList.get(_index)._plsql);
                if (!args[1].equals("DISTINCT"))
                {
                    System.out.println("SEQ=" + _selectList.get(_index)._seq);
                    System.out.println("Text=" + _selectList.get(_index)._text);
                }
            }
        }
//////        else if(args.length >= 3 &&
//////                args[0].equals("DISPLAY"))
//////        {
//////            List<PLSQLConversion> _selectList = new ArrayList<PLSQLConversion>();
//////            if(args[1].equals("DISTINCT"))
//////            {
//////                _conversionTable.Select(args[2], args[1]);
//////            }
//////            else
//////            {
//////                _conversionTable.Select(args[1], args[2]);
//////            }
//////            _selectList = _conversionTable.Get();
//////            for(int _index = 0; _index < _selectList.size(); _index++)
//////            {
//////                System.out.println("Project=" + _selectList.get(_index)._project);
//////                System.out.println("PLSQL=" + _selectList.get(_index)._plsql);
//////                if (!args[1].equals("DISTINCT"))
//////                {
//////                    System.out.println("SEQ=" + _selectList.get(_index)._seq);
//////                    System.out.println("Text=" + _selectList.get(_index)._text);
//////                }
//////            }
//////        }
        else if(args.length == 5 &&
                args[0].equals("INSERT"))
        {
            _conversionTable.Insert(args[1], args[2], Integer.parseInt(args[3]), args[4]);
            System.out.println("입력되었습니다.");
        }
        else if(args.length == 2 &&
                args[0].equals("DELETE"))
        {
            _conversionTable.Delete(args[1], args[2]);
            System.out.println("삭제되었습니다.");
        }
        else
        {
            System.err.println("입력값을 확인하십시오.");
        }
    }
}