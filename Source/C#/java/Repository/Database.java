package enCub.PLSQL.Repository;

import java.util.*;
import java.sql.*;

public class Database
{
    public Connection Connect() throws Exception
    {
        Connection _conn = null;
        try
        {
            Class.forName("cubrid.jdbc.driver.CUBRIDDriver");
//          _conn = DriverManager.getConnection("jdbc:cubrid:localhost:8001:Repository:dba::","dba","");
//          _conn = DriverManager.getConnection("jdbc:cubrid:localhost:45001:Repository:dba::","dba","");
            _conn = DriverManager.getConnection("jdbc:cubrid:localhost:33000:enCubRepository:::","dba","1111");
//          _conn = DriverManager.getConnection("jdbc:cubrid:192.168.1.113:8001:Repository:::","dba","");
            _conn.setAutoCommit(false);
        }
        catch(Exception e)
        {
            throw e;
        }
        return _conn;
    }
    public static void main(String[] args)
    {
        Database _database = new Database();
        Connection _conn = null;
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "SELECT * FROM USERS;";
            ResultSet _rs = _statement.executeQuery(_sql);
            String _userID = null;
            String _userName = null;
            String _password = null;
            String _authority = null;
            String _comment = null;
            while(_rs.next())
            {
                _userID = _rs.getString("UserID");
                _userName = _rs.getString("UserName");
                _password = _rs.getString("Password");
                _authority = _rs.getString("Authority");
                _comment = _rs.getString("Comment");
                System.out.println("UserID = [" + _userID + "]");
                System.out.println("UserName = [" + _userName + "]");
                System.out.println("Password = [" + _password + "]");
                System.out.println("Authority = [" + _authority + "]");
                System.out.println("Comment = [" + _comment + "]");
            }
            _statement.close();
            _conn.close();
        }
        catch(Exception e)
        {
            System.out.println("SQLException : " + e.getMessage());
            e.printStackTrace();
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
            }
        }
    }
}