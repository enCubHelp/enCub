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
import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.util.*;

import enCub.PLSQL.Parser.*;

public class PLSQL_TParser {
    public String ReadFile(String parmFile) throws Exception {
        InputStream     _is = new FileInputStream(parmFile);
        StringBuffer    _sb = new StringBuffer();
        byte[] _byte= new byte[4096];
        for (int _length; (_length = _is.read(_byte)) != -1;) {
            _sb.append(new String(_byte, 0, _length));
        }
        return _sb.toString();
    }
    public void Parse(String parmString) throws Exception {
        InputStream _is = new ByteArrayInputStream(parmString.getBytes());
        ANTLRInputStream _input = new ANTLRInputStream(parmString);
        PLSQL_TLexer _lexer = new PLSQL_TLexer(_input);
        PLSQLTokens _tokenList = new PLSQLTokens();
        for (Token _token = _lexer.nextToken();
             _token.getType() != Token.EOF;
             _token = _lexer.nextToken())
        {
            PLSQLToken _plsqlToken = new PLSQLToken();
            _plsqlToken._line           = _token.getLine();
            _plsqlToken._column         = _token.getCharPositionInLine();
            _plsqlToken._tokenNumber    = _token.getType();
            _plsqlToken._token          = _token.getText();
            _tokenList.Add(_plsqlToken);
        }
        for (int _index = 0; _index < _tokenList.Size(); _index++)
        {
            System.out.printf("Line =[%05d], Column=[%05d], TokenNo=[%05d], Token=[%s]%s", _tokenList.Get(_index)._line, _tokenList.Get(_index)._column, _tokenList.Get(_index)._tokenNumber, _tokenList.Get(_index)._token, System.getProperty("line.separator"));
        }

        //////ProxyPrintStream _outPrintStream = new ProxyPrintStream(System.out);
        //////ProxyPrintStream _errPrintStream = new ProxyPrintStream(System.err);
        //////System.setOut(_outPrintStream);
        //////System.setErr(_errPrintStream);
        //////
        //////_is = new FileInputStream(parmFile);
        //////_input = new ANTLRInputStream(parmInputStream);
        //////_lexer = new PLSQL_TLexer(_input);
        //////CommonTokenStream _tokens = new CommonTokenStream(_lexer);
        //////enCub.PLSQL.Parser.PLSQL_TParser _parser = new enCub.PLSQL.Parser.PLSQL_TParser(_tokens);
        //////ParseTree _tree = _parser.start(); // parse; start at prog
        //////_parser.reset();
        //////_parser.setTrace(true);
        //////ParserRuleContext _context = _parser.start(); // parse; start at prog
        //////String      _type           = "";
        //////String      _rule           = "";
        //////int         _line           = 0;
        //////int         _column         = 0;
        //////int         _length         = 0;
        //////String      _token          = "";
        //////int         _tokenNo        = 0;
        //////int         _tokenNameNo    = 0;
        //////
        //////_errPrintStream.resetErr();
        //////_outPrintStream.resetOut();
        //////String[]    _outList    = _outPrintStream.getOutput().split(System.getProperty("line.separator"));
        //////for(int i = 0; i < _outList.length; i++)
        //////{
        //////    String  _saveOut = _outList[i];
        //////    if (_outList[i].trim().equals("") ||
        //////        _outList[i].trim().length() < 4)
        //////    {
        //////        continue;
        //////    }
        //////    _type = _outList[i].substring(0, 8).trim();
        //////    if (_type.equals("enter") ||
        //////        _type.equals("exit"))
        //////    {
        //////        _rule           = _outList[i].substring(8, _outList[i].indexOf(','));
        //////        _line           = 0;
        //////        _column         = 0;
        //////        _length         = 0;
        //////        _token          = "";
        //////        _tokenNo        = -1;
        //////        _tokenNameNo    = -1;
        //////    }
        //////    else if (_type.equals("consume"))
        //////    {
        //////        _tokenNo    = 0;
        //////        _line       = 0;
        //////        _column     = 0;
        //////        _length     = 0;
        //////        _token      = "";
        //////        _rule       = "";
        //////
        //////        int _startPosition  = 0;
        //////        int _endPosition    = 0;
        //////        if (tryParseInt(_outList[i].substring(10, _outList[i].indexOf(','))))
        //////        {
        //////            _tokenNo    = Integer.parseInt(_outList[i].substring(10, _outList[i].indexOf(',')));
        //////            _outList[i] = _outList[i].substring(_outList[i].indexOf(',') + 1);
        //////            if (tryParseInt(_outList[i].substring(0, _outList[i].indexOf(':'))))
        //////            {
        //////                _startPosition  =Integer.parseInt(_outList[i].substring(0, _outList[i].indexOf(':')));
        //////                _outList[i]     = _outList[i].substring(_outList[i].indexOf(':') + 1);
        //////                if (tryParseInt(_outList[i].substring(0, _outList[i].indexOf('='))))
        //////                {
        //////                    _endPosition    =Integer.parseInt(_outList[i].substring(0, _outList[i].indexOf('=')));
        //////                    _length         = _endPosition - _startPosition + 1;
        //////                    _outList[i]     = _outList[i].substring(_outList[i].indexOf('=') + 2);                  // EQUAL(=) + QUOTATION(')
        //////                    _token          = _outList[i].substring(0, _length);
        //////                    _outList[i]     = _outList[i].substring(_length + 3);
        //////                    if (tryParseInt(_outList[i].substring(0, _outList[i].indexOf('>'))))
        //////                    {
        //////                        _tokenNameNo    = Integer.parseInt(_outList[i].substring(0, _outList[i].indexOf('>')));
        //////                        _outList[i]     = _outList[i].substring(_outList[i].indexOf('>') + 2);              // GT(>) + COMMA(,)
        //////                        if (tryParseInt(_outList[i].substring(0, _outList[i].indexOf(':'))))
        //////                        {
        //////                            _line       = Integer.parseInt(_outList[i].substring(0, _outList[i].indexOf(':')));
        //////                            _outList[i] = _outList[i].substring(_outList[i].indexOf(':') + 1);          // COLON(:)
        //////                            if (tryParseInt(_outList[i].substring(0, _outList[i].indexOf(']'))))
        //////                            {
        //////                                _column = Integer.parseInt(_outList[i].substring(0, _outList[i].indexOf(']')));
        //////                                _rule   = _outList[i].substring(_outList[i].indexOf(']') + 7);          // COLON(]) + " rule "
        //////                            }
        //////                        }
        //////                    }
        //////                }
        //////            }
        //////        }
        //////    }
        //////    else
        //////    {
        //////        System.out.println("_type=[" + _type + "],OUT=[" + _outList[i] + "]");
        //////        continue;
        //////    }
        //////    if (_type.equals("enter") ||
        //////        _type.equals("exit"))
        //////    {
        //////        System.out.println(String.format("Type=[%-8s],Rule=[%-40s]",_type, _rule));
        //////    }
        //////    else
        //////    {
        //////        if(_tokenNameNo < 0)
        //////        {
        //////            System.out.println(String.format("Type=[%-8s],Rule=[%-40s],Line=[%05d],Column=[%+5d],Length=[%05d],Token=[%-40s],TokenNo=[%05d],TokenNameNo=[%05d]",_type, _rule, _line, _column, _length, _token, _tokenNo, _tokenNameNo));
        //////        }
        //////        else
        //////        {
        //////            System.out.println(String.format("Type=[%-8s],Rule=[%-40s],Line=[%05d],Column=[%05d],Length=[%05d],Token=[%-40s],TokenNo=[%07d],TokenNameNo=[%05d],TokenName=[%-40s]",_type, _rule, _line, _column, _length, _token, _tokenNo, _tokenNameNo, _parser.tokenNames[_tokenNameNo]));
        //////        }
        //////    }
        //////}
        //////String[]    _errList    = _errPrintStream.getOutput().split(System.getProperty("line.separator"));
        //////String      _msg        = "";
        //////String      _saveErr    = "";
        //////for(int i = 0; i < _errList.length; i++)
        //////{
        //////    if(_errList[i].trim().equals(""))
        //////    {
        //////        continue;
        //////    }
        //////    _saveErr    = _errList[i];
        //////    _line       = 0;
        //////    _column     = 0;
        //////    _msg        = "";
        //////    if (tryParseInt(_errList[i].substring(5, _errList[i].indexOf(':'))))
        //////    {
        //////        _line       = Integer.parseInt(_errList[i].substring(5, _errList[i].indexOf(':')));
        //////        _errList[i] = _errList[i].substring(_errList[i].indexOf(':') + 1);
        //////        if (tryParseInt(_errList[i].substring(0, _errList[i].indexOf(' '))))
        //////        {
        //////            _column     = Integer.parseInt(_errList[i].substring(0, _errList[i].indexOf(' ')));
        //////            _msg        = _errList[i].substring(_errList[i].indexOf(' ') + 1);
        //////            if(_msg.length() > 100)
        //////            {
        //////                _msg    = _msg.substring(0, 100);
        //////            }
        //////        }
        //////    }
        //////    else
        //////    {
        //////        System.out.println("_errList[i].substring(6, _errList[i].indexOf(':'))=[" + _errList[i].substring(6, _errList[i].indexOf(':')) + "]");
        //////    }
        //////    if (_line == 0)
        //////    {
        //////        if(_msg.length() > 100)
        //////        {
        //////        System.out.println("_saveErr=[" + _saveErr.substring(0,100) + "]");
        //////        }
        //////        else
        //////        {
        //////        System.out.println("_saveErr=[" + _saveErr + "]");
        //////        }
        //////    }
        //////    else
        //////    {
        //////    System.err.println(String.format("Line=[%05d],Column=[%05d],MSG=[%-100s]", _line, _column, _msg));
        //////    }
        //////}
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
        if ( args.length > 0 )
        {
            PLSQL_TParser _parser = new PLSQL_TParser();
            _parser.Parse(_parser.ReadFile(args[0]));
        }
    }
}
