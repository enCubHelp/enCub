package enCub.PLSQL.Repository;

import java.util.*;
import java.sql.*;

public class User
{
    public void Select(String parmUser)
    {
        Database _database = new Database();
        Connection _conn = null;
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "SELECT * FROM USERS";
            if(parmUser.equals("ALL"))
            {
                _sql += " ORDER BY UserID ASC;";
            }
            else
            {
                _sql += " WHERE UserID = '" + parmUser + "';";
            }
            ResultSet _rs = _statement.executeQuery(_sql);
            while(_rs.next())
            {
                System.out.println("UserID=" + _rs.getString("UserID"));
                System.out.println("UserName=" + _rs.getString("UserName"));
                System.out.println("Password=" + _rs.getString("PSWD"));
                System.out.println("Authority=" + _rs.getString("Authority"));
                System.out.println("Comment=" + _rs.getString("Comment"));
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
    public void Insert(String parmUser, String parmUserName, String parmPassword, String parmAuthority, String parmComment)
    {
        Database _database = new Database();
        Connection _conn = null;
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "INSERT INTO USERS(UserID, UserName, PSWD, Authority, Comment) Values('" +
                          parmUser + "', '" + parmUserName  + "', '" + parmPassword +   "', '" + parmAuthority + "', '" + parmComment + "');";
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
    public void Update(String parmUser, String parmUserName, String parmPassword, String parmAuthority, String parmComment)
    {
        Database _database = new Database();
        Connection _conn = null;
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "UPDATE USERS SET UserName = '"  + parmUserName  + "'"
                                       + ", PSWD = '"      + parmPassword  + "'"
                                       + ", Authority = '" + parmAuthority + "'"
                                       + ", Comment = '"   + parmComment   + "'" +
                          " WHERE UserID = '" + parmUser + "';";
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
    public void Delete(String parmUser)
    {
        Database _database = new Database();
        Connection _conn = null;
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "DELETE USERS WHERE UserID = '" + parmUser + "';";
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
        User _user = new User();
        if(args.length == 2 &&
           args[0].equals("SELECT"))
        {
            _user.Select(args[1]);
        }
        else if(args.length == 6 &&
                args[0].equals("INSERT"))
        {
            _user.Insert(args[1], args[2], args[3], args[4], args[5]);
            System.out.println("입력되었습니다.");
        }
        else if(args.length == 6 &&
                args[0].equals("UPDATE"))
        {
            _user.Update(args[1], args[2], args[3], args[4], args[5]);
            System.out.println("수정되었습니다.");
        }
        else if(args.length == 2 &&
                args[0].equals("DELETE"))
        {
            _user.Delete(args[1]);
            System.out.println("삭제되었습니다.");
        }
        else
        {
            System.err.println("입력값을 확인하십시오.");
        }
    }
}