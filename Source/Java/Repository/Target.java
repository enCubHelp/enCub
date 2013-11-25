package enCub.PLSQL.Repository;

import java.util.*;
import java.sql.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.apache.commons.codec.binary.Base64;

public class Target
{
    private List<String> _selectList = new ArrayList<String>();
    public List<String> Get()
    {
        return _selectList;
    }
    public void Select(String parmType, String parmProject, String parmJava)
    {
        Database _database = new Database();
        Connection _conn = null;
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "SELECT * FROM JAVA";
            if(parmType.equals("ALL"))
            {
                _sql += " ORDER BY Project ASC, PLSQL ASC;";
            }
            else if(parmType.equals("DISTINCT"))
            {
                _sql = "SELECT DISTINCT Project, PLSQL FROM JAVA WHERE Project = '" + parmProject + "' ORDER BY Project ASC, PLSQL ASC";
            }
            else
            {
                _sql = "SELECT * FROM JAVA"
                     + " WHERE Project = '" + parmProject + "'"
                     + "   AND PLSQL = '"   + parmJava   + "'"
                     + " ORDER BY Project ASC, PLSQL ASC, SEQ ASC;";
            }
//////            System.out.println("SQL=[" + _sql + "]");
            ResultSet _rs = _statement.executeQuery(_sql);
            while(_rs.next())
            {
                System.out.println("Project=" + _rs.getString("Project"));
                System.out.println("JAVA="   + _rs.getString("PLSQL"));
                if(!parmType.equals("DISTINCT"))
                {
                    System.out.println("Seq="     + _rs.getString("Seq"));
                    System.out.println("Text="    + new String(Base64.decodeBase64(_rs.getString("Text"))));
                    _selectList.add(new String(Base64.decodeBase64(_rs.getString("Text"))));
                }
            }
            _rs.close();
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
    public void Insert(String parmProject, String parmJava, int parmSeq, String parmText)
    {
        Database _database = new Database();
        Connection _conn = null;
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "INSERT INTO JAVA(Project, PLSQL, Seq, Text) Values('" +
                          parmProject + "', '" + parmJava + "', " + parmSeq + ", '" + new String(Base64.encodeBase64(parmText.getBytes())) +   "');";
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
    public void Update(String parmProject, String parmJava, int parmSeq, String parmText)
    {
        Database _database = new Database();
        Connection _conn = null;
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "UPDATE JAVA SET Text = '" + parmText  + "'" +
                          " WHERE Project = '" + parmProject + "'" +
                          "   AND PLSQL = '"   + parmJava   + "'" +
                          "   AND Seq = "      + parmSeq     + ";";
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
    public void Delete(String parmProject, String parmJava)
    {
        Delete(parmProject, parmJava, -1);
    }
    public void Delete(String parmProject, String parmJava, int parmSeq)
    {
        Database _database = new Database();
        Connection _conn = null;
        Statement _statement = null;
        try
        {
            _conn = _database.Connect();
            _statement = _conn.createStatement();
            String _sql = "DELETE JAVA WHERE Project = '" + parmProject + "'"
                                      + " AND PLSQL = '"   + parmJava   + "'";
            if(parmSeq != -1)
            {
                _sql += "   AND Seq = "      + parmSeq;
            }
            _sql += ";";
//////            System.out.println("SQL=[" + _sql + "]");
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
    public void Import(String parmProject, String parmFile, String replaceYN)
    {
        BufferedReader _bufferedReader = null;
        String _readLine = null;
//////        System.out.println("parmFile=[" + parmFile + "]");
        String[] _filePath = parmFile.split(Pattern.quote(File.separator));
        if(_filePath[_filePath.length -1].indexOf(".") >= 0)
        {
            _filePath[_filePath.length -1] = _filePath[_filePath.length -1].substring(0, _filePath[_filePath.length -1].indexOf("."));
        }
        int _seq = 0;
        if(replaceYN.equals("Y"))
        {
            Delete(parmProject, _filePath[_filePath.length -1]);
        }
        try
        {
            _bufferedReader = new BufferedReader(new FileReader(parmFile));
            while((_readLine = _bufferedReader.readLine()) != null)
            {
                _seq++;
                Insert(parmProject, _filePath[_filePath.length -1], _seq, new String(Base64.encodeBase64(_readLine.getBytes())));
            }
            _bufferedReader.close();
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
        finally
        {
            try
            {
                if(_bufferedReader != null)
                {
                    _bufferedReader.close();
                }
            }
            catch(Exception e)
            {
                System.err.println(e.getMessage());
            }
        }
    }
    public void Export(String parmProject, String parmFile, String parmPath) throws Exception
    {
        File        _outFile    = new File(parmPath + System.getProperty("file.separator") + parmFile + ".java");
//////        System.out.println("PATH=[" + _outFile.getPath() + "]");
//////        System.out.println("FILE=[" + _outFile.getName() + "]");
        if (_outFile.exists())
        {
            _outFile.delete();
        }
        FileWriter  _outWriter  = new FileWriter(_outFile, false);;
        Select("", parmProject, parmFile);
        System.out.println("_selectList.size()=[" + _selectList.size() + "]");
        for(int _loop = 0; _loop < _selectList.size(); _loop++)
        {
            _outWriter.write(_selectList.get(_loop) + System.getProperty( "line.separator" ));
            System.out.println("_selectList.get(_loop)=[" + _selectList.get(_loop) + "]");
        }
        _outWriter.close();
    }
    public static void main(String[] args) throws Exception
    {
        Target _plsql = new Target();
        System.out.println("args.length=[" + args.length + "]");
        System.out.println("args[0]=[" + args[0] + "]");
        if(args.length == 2 &&
           args[0].equals("SELECT") &&
           args[1].equals("ALL"))
        {
            _plsql.Select(args[1], null, null);
        }
        else if(args.length == 3 &&
                args[0].equals("SELECT") &&
                args[1].equals("DISTINCT"))
        {
            _plsql.Select(args[1], args[2], null);
        }
        else if(args.length == 4 &&
                args[0].equals("SELECT"))
        {
            _plsql.Select(args[1], args[2], args[3]);
        }
        else if(args.length == 6 &&
                args[0].equals("INSERT"))
        {
            _plsql.Insert(args[1], args[2], Integer.parseInt(args[3]), args[4]);
            System.out.println("입력되었습니다.");
        }
        else if(args.length == 6 &&
                args[0].equals("UPDATE"))
        {
            _plsql.Update(args[1], args[2], Integer.parseInt(args[3]), args[4]);
            System.out.println("수정되었습니다.");
        }
        else if(args.length == 4 &&
                args[0].equals("DELETE"))
        {
            _plsql.Delete(args[1], args[2], Integer.parseInt(args[3]));
            System.out.println("삭제되었습니다.");
        }
        else if(args.length == 3 &&
                args[0].equals("DELETE"))
        {
            _plsql.Delete(args[1], args[2]);
            System.out.println("삭제되었습니다.");
        }
        else if(args.length == 4 &&
                args[0].equals("IMPORT"))
        {
            _plsql.Import(args[1], args[2], args[3]);
            System.out.println("Import되었습니다.");
        }
        else if(args.length == 4 &&
                args[0].equals("EXPORT"))
        {
            _plsql.Export(args[1], args[2], args[3]);
            System.out.println("Export되었습니다.");
        }
        else
        {
            System.err.println("입력값을 확인하십시오.");
        }
    }
}