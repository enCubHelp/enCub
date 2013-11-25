package enCub.PLSQL.Repository;

import java.util.*;
import java.sql.*;
import java.util.*;
import java.util.regex.Pattern;
import org.apache.commons.codec.binary.Base64;

import enCub.PLSQL.Converter.PLSQLCRUD;

public class PLSQLCRUDTable
{
    private List<PLSQLCRUD>    _selectList = new ArrayList<PLSQLCRUD>();
    private Connection          _conn       = null;
    public List<PLSQLCRUD> Get()
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
                _sql = "SELECT DISTINCT PLSQL FROM PLSQLCRUD WHERE Project = '" + parmProject + "' ORDER BY PLSQL;";
            }
            else if(parmPlsql.equals("DISPLAY"))
            {
                _sql = "SELECT * FROM PLSQLCRUD WHERE Project = '" + parmProject + "' ORDER BY Project, PLSQL, SEQ;";
            }
            else
            {
                _sql = "SELECT * FROM PLSQLCRUD WHERE Project = '" + parmProject + "' AND PLSQL = '" + parmPlsql + "' ORDER BY Project, PLSQL, SEQ;";
            }
//////            System.out.println("SQL=[" + _sql + "]");
            ResultSet _rs = _statement.executeQuery(_sql);
            while(_rs.next())
            {
                PLSQLCRUD _crud     = new PLSQLCRUD();
                _crud._project      = parmProject;
                _crud._plsql        = _rs.getString("Plsql");
                if(parmPlsql.equals("DISTINCT"))
                {
                    _crud._seq  = 0;
                    _crud._type = "";
                    _crud._crud = "";
                }
                else
                {
                    _crud._seq       = Integer.parseInt(_rs.getString("Seq"));
                    _crud._type      = _rs.getString("CRUD_type");
                    _crud._crud      = _rs.getString("CRUD_Content");
                }
                _selectList.add(_crud);
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
    public void Insert(String parmProject, String parmPlsql, int parmSeq, String parmType, String parmContent)
    {
        Database _database = new Database();
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "INSERT INTO PLSQLCRUD(Project, plsql, seq, crud_type, crud_content) Values('" +
                          parmProject + "','" + parmPlsql + "', " + parmSeq + ",'" + parmType + "','" + parmContent +  "');";
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
            String _sql = "DELETE PLSQLCRUD WHERE Project = '" + parmProject + "' and Plsql = '" + parmPlsql + "';";
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
        PLSQLCRUDTable _crudTbl = new PLSQLCRUDTable();
        System.out.println("argument Cnt=[" + args.length + "]");
        if(args.length >= 3 &&
           args[0].equals("SELECT"))
        {
            List<PLSQLCRUD> _selectList = new ArrayList<PLSQLCRUD>();
            if (args[1].equals("DISTINCT") ||
                args[1].equals("DISPLAY"))
            {
                _crudTbl.Select(args[2], args[1]);
            }
            else
            {
                _crudTbl.Select(args[1], args[2]);
            }
            _selectList = _crudTbl.Get();
            for(int _index = 0; _index < _selectList.size(); _index++)
            {
                System.out.println("Project=" + _selectList.get(_index)._project);
                System.out.println("PLSQL=" + _selectList.get(_index)._plsql);
                if (!args[1].equals("DISTINCT"))
                {
                    System.out.println("SEQ=" + _selectList.get(_index)._seq);
                    System.out.println("Type=" + _selectList.get(_index)._type);
                    System.out.println("Table=" + _selectList.get(_index)._crud);
                }
            }
        }
//////        else if(args.length >= 3 &&
//////                args[1].equals("DISPLAY"))
//////        {
//////            List<PLSQLCRUD> _selectList = new ArrayList<PLSQLCRUD>();
//////            if(args[1].equals("DISPLAY"))
//////            {
//////                System.out.println("args[2]=[" + args[2] + "]");
//////                System.out.println("args[1]=[" + args[1] + "]");
//////                _crudTbl.Select(args[2], args[1]);
//////            }
//////            else
//////            {
//////                _crudTbl.Select(args[1], args[2]);
//////            }
//////            _selectList = _crudTbl.Get();
//////            for(int _index = 0; _index < _selectList.size(); _index++)
//////            {
//////                System.out.println("Project=" + _selectList.get(_index)._project);
//////                System.out.println("PLSQL=" + _selectList.get(_index)._plsql);
//////                if (!args[1].equals("DISPLAY"))
//////                {
//////                    System.out.print("SEQ=" + _selectList.get(_index)._seq);
//////                    System.out.print(",Type=" + _selectList.get(_index)._type);
//////                    System.out.println("Table=" + _selectList.get(_index)._crud);
//////                }
//////            }
//////        }
        else if(args.length == 12 &&
                args[0].equals("INSERT"))
        {
            _crudTbl.Insert(args[1], args[2], Integer.parseInt(args[3]), args[4], args[5]);
            System.out.println("입력되었습니다.");
        }
        else if(args.length == 2 &&
                args[0].equals("DELETE"))
        {
            _crudTbl.Delete(args[1], args[2]);
            System.out.println("삭제되었습니다.");
        }
        else
        {
            System.err.println("입력값을 확인하십시오.");
        }
    }
}