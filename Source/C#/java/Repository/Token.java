package enCub.PLSQL.Repository;

import java.util.*;
import java.sql.*;
import java.util.regex.Pattern;
import org.apache.commons.codec.binary.Base64;

public class Token
{
    private List<TokenObject> _selectList = new ArrayList<TokenObject>();
    public List<TokenObject> Get()
    {
        return _selectList;
    }
    public void Select(String parmProject, String parmPlsql)
    {
        Database _database = new Database();
        Connection _conn = null;
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "SELECT * FROM Token  ";
            if(parmProject.equals("ALL"))
            {
                _sql += " ORDER BY Project ASC;";
            }
            else
            {
                _sql += " WHERE Project = '" + parmProject + "';";
            }
            ResultSet _rs = _statement.executeQuery(_sql);
            while(_rs.next())
            {
                TokenObject _tokenObject = new TokenObject();
                _tokenObject._project = _rs.getString("Project");
                _tokenObject._plsql = _rs.getString("Plsql");
                _tokenObject._seq = _rs.getString("Seq");
                _tokenObject._line = _rs.getString("Line");
                _tokenObject._column = _rs.getString("Token_Column");
                _tokenObject._length = _rs.getString("Token_Length");
                _tokenObject._token = new String(Base64.decodeBase64(_rs.getString("Token")));
                _tokenObject._tokenNo = _rs.getString("TokenNo");
                _tokenObject._tokenName = new String(Base64.decodeBase64(_rs.getString("TokeNname")));
                _selectList.add(_tokenObject);
                System.out.println("Project="    + _rs.getString("Project"));
                System.out.println("Plsql=" + _rs.getString("Plsql"));
                System.out.println("Seq=" + _rs.getString("Seq"));
                System.out.println("Line=" + _rs.getString("Line"));
                System.out.println("Column=" + _rs.getString("Token_Column"));
                System.out.println("Length=" + _rs.getString("Token_Length"));
                System.out.println("Token=" + new String(Base64.decodeBase64(_rs.getString("Token"))));
                System.out.println("TokenNo=" + _rs.getString("TokenNo"));
                System.out.println("TokeNname="    + new String(Base64.decodeBase64(_rs.getString("TokeNname"))));
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
    public void Insert(String parmProject, String parmPlsql, int parmSeq, int parmLine, int parmColumn, int parmLength, String parmToken, int parmTokenNo, String parmTokenName)
    {
        Database _database = new Database();
        Connection _conn = null;
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "INSERT INTO Token(Project, plsql, seq, line, token_column, token_length, token, tokenno, tokenname ) Values('" +
                          parmProject + "','" + parmPlsql + "', " + parmSeq + ", " + parmLine + ", " + parmColumn + ", " + parmLength  + ", '" + new String(Base64.encodeBase64(parmToken.getBytes())) + "', " + parmTokenNo + ", '" + new String(Base64.encodeBase64(parmTokenName.getBytes())) +  "');";
//////             System.out.println("_sql=[" + _sql + "]");
            _statement.executeUpdate(_sql);
            _conn.commit();
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
    //////public void Update(String parmProject, String parmSource, String parmTarget, String parmComment)
    //////{
    //////    Database _database = new Database();
    //////    Connection _conn = null;
    //////    Statement _statement = null;
    //////    try
    //////    {
    //////        _conn = _database.Connect();
    //////        _statement = _conn.createStatement();
    //////        String _sql = "UPDATE Project SET SourceDBMS = '" + parmSource  + "'"
    //////                                     + ", TargetDBMS = '" + parmTarget  + "'"
    //////                                     + ", Comment = '"    + parmComment + "'" +
    //////                      " WHERE Project = '" + parmProject + "';";
    //////        _statement.executeUpdate(_sql);
    //////        _conn.commit();
    //////        _statement.close();
    //////        _conn.close();
    //////    }
    //////    catch(Exception e)
    //////    {
    //////        System.err.println(e.getMessage());
    //////    }
    //////    finally
    //////    {
    //////        try
    //////        {
    //////            if(_statement != null)
    //////            {
    //////                _statement.close();
    //////            }
    //////            if(_conn != null)
    //////            {
    //////                _conn.close();
    //////            }
    //////        }
    //////        catch(SQLException e)
    //////        {
    //////            System.err.println(e.getMessage());
    //////        }
    //////    }
    //////}
    public void Delete(String parmProject, String parmPlsql)
    {
        Database _database = new Database();
        Connection _conn = null;
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "DELETE Token WHERE Project = '" + parmProject + "' and Plsql = '" + parmPlsql + "';";
            _statement.executeUpdate(_sql);
            _conn.commit();
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
    public static void main(String[] args)
    {
        Project _project = new Project();
        if(args.length == 2 &&
           args[0].equals("SELECT"))
        {
            _project.Select(args[1]);
        }
        else if(args.length == 5 &&
                args[0].equals("INSERT"))
        {
            _project.Insert(args[1], args[2], args[3], args[4]);
            System.out.println("입력되었습니다.");
        }
        else if(args.length == 5 &&
                args[0].equals("UPDATE"))
        {
            _project.Update(args[1], args[2], args[3], args[4]);
            System.out.println("수정되었습니다.");
        }
        else if(args.length == 2 &&
                args[0].equals("DELETE"))
        {
            _project.Delete(args[1]);
            System.out.println("삭제되었습니다.");
        }
        else
        {
            System.err.println("입력값을 확인하십시오.");
        }
    }
}