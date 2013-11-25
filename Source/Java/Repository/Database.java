package enCub.PLSQL.Repository;

import java.util.*;
import java.sql.*;

import enCub.PLSQL.Properties.Environment;

public class Database
{
    public Connection Connect() throws Exception
    {
        return Connect("Repository");
    }
    public Connection Connect(String parmType) throws Exception
    {
        Connection _conn = null;
        try
        {
//////            String _driverName          = "cubrid.jdbc.driver.CUBRIDDriver";
//////            String _connectionString    = "jdbc:cubrid:localhost:33000:enCubRepository:::";
//////            String _user                = "dba";
//////            String _password            = "1111";
            String _driverName          = "";
            String _connectionString    = "";
            String _user                = "";
            String _password            = "";
            if (parmType.equals("Repository"))
            {
                if (Environment.Get("Repository").equals("Cubrid 9.1.0"))
                {
                    _driverName = "cubrid.jdbc.driver.CUBRIDDriver";
                }
                _connectionString   = Environment.Get("RepositoryConnection");
                _user               = Environment.Get("RepositoryUser");
                _password           = Environment.Get("RepositoryPassword");
            }
            else if (parmType.equals("Oracle"))
            {
                _driverName         = "oracle.jdbc.driver.OracleDriver";
            }
            _connectionString   = Environment.Get(parmType + "Connection");
            _user               = Environment.Get(parmType + "User");
            _password           = Environment.Get(parmType + "Password");
//////            System.out.println("_driverName=[" + _driverName + "]");
//////            System.out.println("_connectionString=[" + _connectionString + "]");
//////            System.out.println("_user=[" + _user + "]");
//////            System.out.println("_password=[" + _password + "]");
            Class.forName(_driverName);
            _conn = DriverManager.getConnection(_connectionString, _user, _password);
            _conn.setAutoCommit(false);
        }
        catch(Exception e)
        {
            System.out.println("Error=[" + e.toString() + "]");
            e.printStackTrace();
            throw e;
        }
        return _conn;
    }
    public static void TryConnect(String parmDriver, String parmConnection, String parmUser, String parmPassword) throws Exception
    {
        Class.forName(parmDriver);
        Connection _conn = DriverManager.getConnection(parmConnection, parmUser, parmPassword);
        _conn.setAutoCommit(false);
        _conn.close();
    }
    public static void main(String[] args)
    {
        Database _database = new Database();
        if (args[0].toUpperCase().equals("TRY"))
        {
            try
            {
                _database.TryConnect(args[1], args[2], args[3], args[4]);
                System.out.println("Success");
            }
            catch(Exception e)
            {
                System.err.println(e.toString());
            }
        }
        else
        {
            Connection _conn = null;
            Statement _statement = null;
            try
            {
    //////            _conn = _database.Connect("");
                _conn = _database.Connect("Oracle");
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
                    _password = _rs.getString("PSWD");
                    _authority = _rs.getString("Authority");
                    _comment = _rs.getString("Comment");
    //////                System.out.println("UserID = [" + _userID + "]");
    //////                System.out.println("UserName = [" + _userName + "]");
    //////                System.out.println("Password = [" + _password + "]");
    //////                System.out.println("Authority = [" + _authority + "]");
    //////                System.out.println("Comment = [" + _comment + "]");
                }
                _statement.close();
                _conn.close();
            }
            catch(Exception e)
            {
                System.out.println("SQLException : " + e.getMessage());
//////                e.printStackTrace();
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
}