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
import java.util.*;

import enCub.PLSQL.parser.*;
import enCub.PLSQL.Repository.*;

public class PLSQLParser
{
    private InputStream _is = null;
    private String _fileName = null;
    private String _iString = null;
    private String _project = new String();
    private String _plsql = new String();

    public void SetTable(String parmProject, String parmPlsql)
    {
        enCub.PLSQL.Repository.PLSQL _Plsql = new enCub.PLSQL.Repository.PLSQL();
        try
        {
            _Plsql.Select("SELECT", parmProject, parmPlsql);
            List<String> _selectList = _Plsql.Get();
            for(int i = 0; i < _selectList.size(); i++)
            {
                AddString(_selectList.get(i));
            }
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
        _project = parmProject;
        _plsql = parmPlsql;
    }
    public void SetFile(String parmFile)
    {
        if(_fileName == null)
        {
            _fileName = new String();
        }
        _fileName = parmFile;
    }
    public void AddString(String parmString)
    {
        if(_iString == null)
        {
            _iString = new String();
        }
        _iString += parmString + System.getProperty("line.separator");
    }
    public void Parse() throws Exception
    {
        ProxyPrintStream _outPrintStream = new ProxyPrintStream(System.out);
        ProxyPrintStream _errPrintStream = new ProxyPrintStream(System.err);
        System.setOut(_outPrintStream);
        System.setErr(_errPrintStream);
        if(_fileName == null)
        {
            _is = new ByteArrayInputStream(_iString.getBytes("UTF-8"));
        }
        else
        {
            _is = new FileInputStream(_fileName);
        }
        ANTLRInputStream _input = new ANTLRInputStream(_is);
        PLSQL_TLexer _lexer = new PLSQL_TLexer(_input);
        CommonTokenStream _tokens = new CommonTokenStream(_lexer);
        PLSQL_TParser _parser = new PLSQL_TParser(_tokens);
        ParseTree _tree = _parser.start(); // parse; start at prog
        _parser.reset();
        _parser.setTrace(true);
        ParserRuleContext _context = _parser.start(); // parse; start at prog

        enCub.PLSQL.Repository.Token _Token = new enCub.PLSQL.Repository.Token();
        try
        {
            _Token.Delete(_project, _plsql);
        }
        catch(Exception e)
        {
//////            System.err.println(e.getMessage());
        }


        String      _type           = "";
        String      _rule           = "";
        int         _line           = 0;
        int         _column         = 0;
        int         _length         = 0;
        String      _token          = "";
        int         _tokenNo        = 0;
        int         _tokenNameNo    = 0;

        _errPrintStream.resetErr();
        _outPrintStream.resetOut();
        String[]    _outList    = _outPrintStream.getOutput().split(System.getProperty("line.separator"));
        for(int i = 0; i < _outList.length; i++)
        {
            String  _saveOut = _outList[i];
            if (_outList[i].trim().equals("") ||
                _outList[i].trim().length() < 4)
            {
                continue;
            }
            _type = _outList[i].substring(0, 8).trim();
            if (_type.equals("enter") ||
                _type.equals("exit"))
            {
                _rule           = _outList[i].substring(8, _outList[i].indexOf(','));
                _line           = 0;
                _column         = 0;
                _length         = 0;
                _token          = "";
                _tokenNo        = -1;
                _tokenNameNo    = -1;
            }
            else if (_type.equals("consume"))
            {
                _tokenNo    = 0;
                _line       = 0;
                _column     = 0;
                _length     = 0;
                _token      = "";
                _rule       = "";

                int _startPosition  = 0;
                int _endPosition    = 0;
                if (tryParseInt(_outList[i].substring(10, _outList[i].indexOf(','))))
                {
                    _tokenNo    = Integer.parseInt(_outList[i].substring(10, _outList[i].indexOf(',')));
                    _outList[i] = _outList[i].substring(_outList[i].indexOf(',') + 1);
                    if (tryParseInt(_outList[i].substring(0, _outList[i].indexOf(':'))))
                    {
                        _startPosition  =Integer.parseInt(_outList[i].substring(0, _outList[i].indexOf(':')));
                        _outList[i]     = _outList[i].substring(_outList[i].indexOf(':') + 1);
                        if (tryParseInt(_outList[i].substring(0, _outList[i].indexOf('='))))
                        {
                            _endPosition    =Integer.parseInt(_outList[i].substring(0, _outList[i].indexOf('=')));
                            _length         = _endPosition - _startPosition + 1;
                            _outList[i]     = _outList[i].substring(_outList[i].indexOf('=') + 2);                  // EQUAL(=) + QUOTATION(')
                            _token          = _outList[i].substring(0, _length);
                            _outList[i]     = _outList[i].substring(_length + 3);
                            if (tryParseInt(_outList[i].substring(0, _outList[i].indexOf('>'))))
                            {
                                _tokenNameNo    = Integer.parseInt(_outList[i].substring(0, _outList[i].indexOf('>')));
                                _outList[i]     = _outList[i].substring(_outList[i].indexOf('>') + 2);              // GT(>) + COMMA(,)
                                if (tryParseInt(_outList[i].substring(0, _outList[i].indexOf(':'))))
                                {
                                    _line       = Integer.parseInt(_outList[i].substring(0, _outList[i].indexOf(':')));
                                    _outList[i] = _outList[i].substring(_outList[i].indexOf(':') + 1);          // COLON(:)
                                    if (tryParseInt(_outList[i].substring(0, _outList[i].indexOf(']'))))
                                    {
                                        _column = Integer.parseInt(_outList[i].substring(0, _outList[i].indexOf(']')));
                                        _rule   = _outList[i].substring(_outList[i].indexOf(']') + 7);          // COLON(]) + " rule "
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else
            {
                System.out.println("_type=[" + _type + "],OUT=[" + _outList[i] + "]");
                continue;
            }
            if (_type.equals("enter") ||
                _type.equals("exit"))
            {
                System.out.println(String.format("Type=[%-8s],Rule=[%-40s]",_type, _rule));
            }
            else
            {
                if(_tokenNameNo < 0)
                {
                    System.out.println(String.format("Type=[%-8s],Rule=[%-40s],Line=[%05d],Column=[%+5d],Length=[%05d],Token=[%-40s],TokenNo=[%05d],TokenNameNo=[%05d]",_type, _rule, _line, _column, _length, _token, _tokenNo, _tokenNameNo));
                }
                else
                {
                    System.out.println(String.format("Type=[%-8s],Rule=[%-40s],Line=[%05d],Column=[%05d],Length=[%05d],Token=[%-40s],TokenNo=[%07d],TokenNameNo=[%05d],TokenName=[%-40s]",_type, _rule, _line, _column, _length, _token, _tokenNo, _tokenNameNo, _parser.tokenNames[_tokenNameNo]));
                }
                _Token.Insert(_project, _plsql, i, _line, _column, _length, _token, _tokenNo, _parser.tokenNames[_tokenNameNo]);
            }
        }
        String[]    _errList    = _errPrintStream.getOutput().split(System.getProperty("line.separator"));
        String      _msg        = "";
        String      _saveErr    = "";
        for(int i = 0; i < _errList.length; i++)
        {
            if(_errList[i].trim().equals(""))
            {
                continue;
            }
            _saveErr    = _errList[i];
            _line       = 0;
            _column     = 0;
            _msg        = "";
            if (tryParseInt(_errList[i].substring(5, _errList[i].indexOf(':'))))
            {
                _line       = Integer.parseInt(_errList[i].substring(5, _errList[i].indexOf(':')));
                _errList[i] = _errList[i].substring(_errList[i].indexOf(':') + 1);
                if (tryParseInt(_errList[i].substring(0, _errList[i].indexOf(' '))))
                {
                    _column     = Integer.parseInt(_errList[i].substring(0, _errList[i].indexOf(' ')));
                    _msg        = _errList[i].substring(_errList[i].indexOf(' ') + 1);
                    if(_msg.length() > 100)
                    {
                        _msg    = _msg.substring(0, 100);
                    }
                }
            }
            else
            {
                System.out.println("_errList[i].substring(6, _errList[i].indexOf(':'))=[" + _errList[i].substring(6, _errList[i].indexOf(':')) + "]");
            }
            if (_line == 0)
            {
                if(_msg.length() > 100)
                {
                System.out.println("_saveErr=[" + _saveErr.substring(0,100) + "]");
                }
                else
                {
                System.out.println("_saveErr=[" + _saveErr + "]");
                }
            }
            else
            {
            System.err.println(String.format("Line=[%05d],Column=[%05d],MSG=[%-100s]", _line, _column, _msg));
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
            PLSQLParser _parser = new PLSQLParser();
            _parser.SetTable(args[0], args[1]);
            _parser.Parse();
        }
        else if ( args.length > 0 )
        {
            PLSQLParser _parser = new PLSQLParser();
            _parser.SetFile(args[0]);
            _parser.Parse();
        }
    }
}