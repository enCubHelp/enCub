package enCub.PLSQL.Repository;

import java.util.*;
import java.sql.*;

public class Project
{
    public void Select(String parmProject)
    {
        Database _database = new Database();
        Connection _conn = null;
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "SELECT * FROM Project";
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
                System.out.println("Project="    + _rs.getString("Project"));
                System.out.println("Comment="    + _rs.getString("Comment"));
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
    public void Insert(String parmProject, String parmComment)
    {
        Database _database = new Database();
        Connection _conn = null;
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "INSERT INTO Project(Project, SourceDBMS, TargetDBMS, Comment) Values('" +
                          parmProject + "', '', '', '" + parmComment +  "');";
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
    public void Update(String parmProject, String parmComment)
    {
        Database _database = new Database();
        Connection _conn = null;
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "UPDATE Project SET Comment = '"    + parmComment + "'" +
                          " WHERE Project = '" + parmProject + "';";
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
    public void Delete(String parmProject)
    {
        Database _database = new Database();
        Connection _conn = null;
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "DELETE Project WHERE Project = '" + parmProject + "';";
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
        else if(args.length == 3 &&
                args[0].equals("INSERT"))
        {
            _project.Insert(args[1], args[2]);
            System.out.println("입력되었습니다.");
        }
        else if(args.length == 3 &&
                args[0].equals("UPDATE"))
        {
            _project.Update(args[1], args[2]);
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