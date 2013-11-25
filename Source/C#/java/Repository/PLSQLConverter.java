package enCub.PLSQL.Converter;

// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.ByteArrayInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

import enCub.PLSQL.parser.*;
import enCub.PLSQL.Repository.*;

public class PLSQLConverter
{
    private InputStream _is = null;
    private String _fileName = null;
    private String _project = new String();
    private String _plsql = new String();
    private List<TokenObject> _selectList = new ArrayList<TokenObject>();

    public void SetTable(String parmProject, String parmPlsql)
    {
        enCub.PLSQL.Repository.Token _Token = new enCub.PLSQL.Repository.Token();
        try
        {
            _Token.Select(parmProject, parmPlsql);
            _selectList = _Token.Get();
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
        _project = parmProject;
        _plsql = parmPlsql;
    }
    public void Convert() throws Exception
    {
            for(int i = 0; i < _selectList.size(); i++)
            {
                TokenObject _tokenObject = _selectList.get(i);
                System.out.print("Project=[" + _tokenObject._project + "],");
                System.out.print("PLSQL=[" + _tokenObject._plsql + "],");
                System.out.print("Seq=[" + _tokenObject._seq + "],");
                System.out.print("Line=[" + _tokenObject._line + "],");
                System.out.print("Column=[" + _tokenObject._column + "],");
                System.out.print("Lengh=[" + _tokenObject._length + "],");
                System.out.print("Token=[" + _tokenObject._token + "],");
                System.out.print("TokenNo=[" + _tokenObject._tokenNo + "],");
                System.out.println("TokenName=[" + _tokenObject._tokenName + "],");
            }
            Thread.sleep(5 * 1000);
            if(_plsql.equals("after_create"))
            {
                enCub.PLSQL.Repository.Target _target = new enCub.PLSQL.Repository.Target();
                try
                {
                    _target.Delete(_project, _plsql);
                }
                catch(Exception e)
                {
                }

                try
                {
                    BufferedReader _in = new BufferedReader(new FileReader("D:\\enCub\\after_create.java"));
                    String _readLine;
                    int _cnt = 0;
                    while ((_readLine = _in.readLine()) != null)
                    {
                        _cnt++;
                        _target.Insert(_project, _plsql, _cnt, _readLine);
                    }
                    _in.close();
                }
                catch (Exception e)
                {
                    System.err.println(e); // 에러가 있다면 메시지 출력
                }
            }
            else if(_plsql.equals("delete_emp"))
            {
                enCub.PLSQL.Repository.Target _target = new enCub.PLSQL.Repository.Target();
                try
                {
                    _target.Delete(_project, _plsql);
                }
                catch(Exception e)
                {
                }

                try
                {
                    BufferedReader _in = new BufferedReader(new FileReader("D:\\enCub\\delete_emp.java"));
                    String _readLine;
                    int _cnt = 0;
                    while ((_readLine = _in.readLine()) != null)
                    {
                        _cnt++;
                        _target.Insert(_project, _plsql, _cnt, _readLine);
                    }
                    _in.close();
                }
                catch (Exception e)
                {
                    System.err.println(e); // 에러가 있다면 메시지 출력
                }
            }
            else if(_plsql.equals("get_bal"))
            {
                enCub.PLSQL.Repository.Target _target = new enCub.PLSQL.Repository.Target();
                try
                {
                    _target.Delete(_project, _plsql);
                }
                catch(Exception e)
                {
                }

                try
                {
                    BufferedReader _in = new BufferedReader(new FileReader("D:\\enCub\\get_bal.java"));
                    String _readLine;
                    int _cnt = 0;
                    while ((_readLine = _in.readLine()) != null)
                    {
                        _cnt++;
                        _target.Insert(_project, _plsql, _cnt, _readLine);
                    }
                    _in.close();
                }
                catch (Exception e)
                {
                    System.err.println(e); // 에러가 있다면 메시지 출력
                }
            }
    }
    public boolean tryParseInt(String parmValue)
    {
        try
        {
            Integer.parseInt(parmValue);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public static void main(String[] args) throws Exception {
        if ( args.length > 1 )
        {
            PLSQLConverter _converter = new PLSQLConverter();
            _converter.SetTable(args[0], args[1]);
            _converter.Convert();
        }
    }
}