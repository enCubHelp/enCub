package enCub.PLSQL.Repository;

import java.util.*;
import java.sql.*;
import java.util.*;
import java.util.regex.Pattern;
import org.apache.commons.codec.binary.Base64;

import enCub.PLSQL.Converter.PLSQLToken;

public class TokenTable
{
    private List<PLSQLToken>    _selectList = new ArrayList<PLSQLToken>();
    private Connection          _conn       = null;
    public List<PLSQLToken> Get()
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
            String _sql = "SELECT * FROM Tokens  ";
            if(parmPlsql.equals("DISTINCT"))
            {
                _sql = "SELECT DISTINCT PLSQL FROM Tokens WHERE Project = '" + parmProject + "' ORDER BY PLSQL;";
            }
            else
            {
                _sql = "SELECT * FROM Tokens WHERE Project = '" + parmProject + "' AND PLSQL = '" + parmPlsql + "' ORDER BY Project, PLSQL, SEQ;";
            }
            ResultSet _rs = _statement.executeQuery(_sql);
            while(_rs.next())
            {
                PLSQLToken _token   = new PLSQLToken();
                _token._project     = parmProject;
                _token._plsql       = _rs.getString("Plsql");
                if(parmPlsql.equals("DISTINCT"))
                {
                    _token._seq         = 0;
                    _token._line        = 0;
                    _token._column      = 0;
                    _token._token       = "";
                }
                else
                {
                    _token._seq         = Integer.parseInt(_rs.getString("Seq"));
                    _token._line        = Integer.parseInt(_rs.getString("Line"));
                    _token._column      = Integer.parseInt(_rs.getString("Token_Column"));
                    _token._token       = new String(Base64.decodeBase64(_rs.getString("Token")));
                }
                _selectList.add(_token);
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
    public void Insert(String parmProject, String parmPlsql, int parmSeq, int parmLine, int parmColumn, String parmToken)
    {
        Database _database = new Database();
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "INSERT INTO Tokens(Project, plsql, seq, line, token_column, token) Values('" +
                          parmProject + "','" + parmPlsql + "', " + parmSeq + ", " + parmLine + ", " + parmColumn + ", '" + new String(Base64.encodeBase64(parmToken.getBytes())) +  "');";
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
            String _sql = "DELETE Tokens WHERE Project = '" + parmProject + "' and Plsql = '" + parmPlsql + "';";
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
        TokenTable _token = new TokenTable();
        if(args.length == 3 &&
           args[0].equals("SELECT"))
        {
            List<PLSQLToken> _selectList = new ArrayList<PLSQLToken>();
            _token.Select(args[1], args[2]);
            _selectList = _token.Get();
            for(int _index = 0; _index < _selectList.size(); _index++)
            {
                System.out.println("Project=" + _selectList.get(_index)._project);
                System.out.println("PLSQL=" + _selectList.get(_index)._plsql);
                System.out.println("SEQ=" + _selectList.get(_index)._seq);
                System.out.println("Line=" + _selectList.get(_index)._line);
                System.out.println("Column=" + _selectList.get(_index)._column);
                System.out.println("Token=" + _selectList.get(_index)._token);
            }
        }
        else if(args.length == 5 &&
                args[0].equals("INSERT"))
        {
            _token.Insert(args[1], args[2], Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]), args[6]);
            System.out.println("입력되었습니다.");
        }
        else if(args.length == 2 &&
                args[0].equals("DELETE"))
        {
            _token.Delete(args[1], args[2]);
            System.out.println("삭제되었습니다.");
        }
        else
        {
            System.err.println("입력값을 확인하십시오.");
        }
    }
}