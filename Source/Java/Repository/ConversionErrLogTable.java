package enCub.PLSQL.Repository;

import java.util.*;
import java.sql.*;
import java.util.*;
import java.util.regex.Pattern;
import org.apache.commons.codec.binary.Base64;

import enCub.PLSQL.Converter.PLSQLParsingErrLog;

public class ConversionErrLogTable
{
    private List<PLSQLParsingErrLog>    _selectList = new ArrayList<PLSQLParsingErrLog>();
    private Connection                  _conn       = null;
    public List<PLSQLParsingErrLog> Get()
    {
        return _selectList;
    }
    public void Join(String parmProject)
    {
        Database _database = new Database();
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "SELECT DISTINCT a.project, a.plsql, b.err_line, b.err_column, b.content FROM conversiontbl a LEFT OUTER JOIN conversionerrlog b on a.project = b.project AND a.plsql = b.plsql WHERE a.project = '" + parmProject + "' ORDER BY a.project, a.plsql, b.err_line, b.err_column;";
            ResultSet _rs = _statement.executeQuery(_sql);
//////            System.out.println("Join SQL=[" + _sql + "]");
            int _seq = 1;
            while(_rs.next())
            {
//////                System.out.println("Plsql=[" + _rs.getString("Plsql") + "]");
//////                System.out.println("SEQ=[" + _seq + "]");
                PLSQLParsingErrLog  _log    = new PLSQLParsingErrLog();
                _log._project   = parmProject;
                _log._plsql     = _rs.getString("Plsql");
                _log._seq       = _seq;
                try
                {
                    _log._line      = Integer.parseInt(_rs.getString("Err_Line"));
                    _log._column    = Integer.parseInt(_rs.getString("Err_Column"));
                    _log._content     = new String(Base64.decodeBase64(_rs.getString("Content")));
                }
                catch(Exception e)
                {
                    _log._line      = 0;
                    _log._column    = 0;
                    _log._content   = "";
                }
                _selectList.add(_log);
                _seq++;
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
    public void Select(String parmProject, String parmPlsql)
    {
        Database _database = new Database();
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "";
            if(parmPlsql.equals("DISTINCT"))
            {
                _sql = "SELECT DISTINCT PLSQL FROM conversionerrlog WHERE Project = '" + parmProject + "' ORDER BY PLSQL;";
            }
            else
            {
                _sql = "SELECT * FROM conversionerrlog WHERE Project = '" + parmProject + "' AND PLSQL = '" + parmPlsql + "' ORDER BY Project, PLSQL, SEQ;";
            }
            ResultSet _rs = _statement.executeQuery(_sql);
            while(_rs.next())
            {
                PLSQLParsingErrLog  _log    = new PLSQLParsingErrLog();
                _log._project   = parmProject;
                _log._plsql     = _rs.getString("Plsql");
                if(parmPlsql.equals("DISTINCT"))
                {
                    _log._seq       = 0;
                    _log._line      = 0;
                    _log._column    = 0;
                    _log._content   = "";
                }
                else
                {
                    _log._seq       = Integer.parseInt(_rs.getString("Seq"));
                    try
                    {
                        _log._line      = Integer.parseInt(_rs.getString("Err_Line"));
                        _log._column    = Integer.parseInt(_rs.getString("Err_Column"));
                        _log._content   = new String(Base64.decodeBase64(_rs.getString("Content")));
                    }
                    catch(Exception e)
                    {
                        _log._line      = 0;
                        _log._column    = 0;
                        _log._content   = "";
                    }
                }
                _selectList.add(_log);
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
    public void Insert(String parmProject, String parmPlsql, int parmSeq, int parmLine, int parmColumn, String parmContent)
    {
        Database _database = new Database();
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "INSERT INTO conversionerrlog(Project, plsql, seq, err_line, err_column, content) Values('" +
                          parmProject + "','" + parmPlsql + "', " + parmSeq + ", " + parmLine + ", " + parmColumn + ", '" + new String(Base64.encodeBase64(parmContent.getBytes())) + "');";
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
            String _sql = "DELETE conversionerrlog WHERE Project = '" + parmProject + "' and Plsql = '" + parmPlsql + "';";
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
        ParsingErrLogTable _logTbl = new ParsingErrLogTable();
        if(args.length >= 3 &&
           args[0].equals("SELECT"))
        {
            List<PLSQLParsingErrLog> _selectList = new ArrayList<PLSQLParsingErrLog>();
            _logTbl.Select(args[1], args[2]);
            _selectList = _logTbl.Get();
            for(int _index = 0; _index < _selectList.size(); _index++)
            {
                System.out.println("Project=" + _selectList.get(_index)._project);
                System.out.println("PLSQL=" + _selectList.get(_index)._plsql);
                System.out.println("SEQ=" + _selectList.get(_index)._seq);
                System.out.println("Line=" + _selectList.get(_index)._line);
                System.out.println("Column=" + _selectList.get(_index)._column);
                System.out.println("Content=" + _selectList.get(_index)._content);
            }
        }
        else if(args.length >= 2 &&
                args[0].equals("JOIN"))
        {
            List<PLSQLParsingErrLog> _selectList = new ArrayList<PLSQLParsingErrLog>();
            _logTbl.Join(args[1]);
            _selectList = _logTbl.Get();
            for(int _index = 0; _index < _selectList.size(); _index++)
            {
                System.out.println("Project=" + _selectList.get(_index)._project);
                System.out.println("PLSQL=" + _selectList.get(_index)._plsql);
                System.out.println("SEQ=" + _selectList.get(_index)._seq);
                System.out.println("Line=" + _selectList.get(_index)._line);
                System.out.println("Column=" + _selectList.get(_index)._column);
                System.out.println("Content=" + _selectList.get(_index)._content);
            }
        }
        else if(args.length == 7 &&
                args[0].equals("INSERT"))
        {
            _logTbl.Insert(args[1], args[2], Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]), args[6]);
            System.out.println("입력되었습니다.");
        }
        else if(args.length == 2 &&
                args[0].equals("DELETE"))
        {
            _logTbl.Delete(args[1], args[2]);
            System.out.println("삭제되었습니다.");
        }
        else
        {
            System.err.println("입력값을 확인하십시오.");
        }
    }
}