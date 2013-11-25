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
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.util.*;

import enCub.PLSQL.Parser.*;
import enCub.PLSQL.Repository.PLSQL;
import enCub.PLSQL.Repository.TokenTable;
import enCub.PLSQL.Repository.ParsingTable;
import enCub.PLSQL.Repository.ParsingErrLogTable;
import enCub.PLSQL.Repository.PLSQLCRUDTable;

import enCub.PLSQL.Util.LOG.LOGWriter;

public class PLSQLParser {
    private String _project = null;
    private String _plsql = null;
    public String ReadPLSQL(String parmProject, String parmPLSQL) throws Exception {
        _project = parmProject;
        _plsql = parmPLSQL;
        System.out.println("Project=" + parmProject);
        System.out.println("PLSQL=" + parmPLSQL);
        StringBuffer    _sb = new StringBuffer();
        List<String> _selectList = new ArrayList<String>();
        PLSQL _plsql = new PLSQL();
        _plsql.Select("", parmProject, parmPLSQL);
        _selectList = _plsql.Get();
        for(int _loop = 0; _loop < _selectList.size(); _loop++)
        {
            System.out.println(_selectList.get(_loop));
            if (_loop == (_selectList.size() - 1) &&
                _selectList.get(_loop).equals("/"))
            {
                _sb.append(_selectList.get(_loop) + System.getProperty("line.separator"));
            }
            else if (_loop == (_selectList.size() - 1))
            {
                _sb.append(_selectList.get(_loop));
            }
            else
            {
                _sb.append(_selectList.get(_loop) + System.getProperty("line.separator"));
            }
        }
        return _sb.toString();
    }
    public String ReadFile(String parmFile) throws Exception {
//////        InputStream     _is = new FileInputStream(parmFile);
        BufferedReader _is = new BufferedReader(new FileReader(parmFile));
        StringBuffer    _sb = new StringBuffer();
        byte[] _byte= new byte[4096];
        String _readLine = "";
        List<String> _selectList = new ArrayList<String>();
//////        for (int _length; (_length = _is.read(_byte)) != -1;) {
//////            _sb.append(new String(_byte, 0, _length));
//////      _selectList.add(new String(_byte, 0, _length));
//////  }
        while((_readLine = _is.readLine()) != null)
        {
            _selectList.add(_readLine);
        }
        for(int _loop = 0; _loop < _selectList.size(); _loop++)
        {
            if (_loop == (_selectList.size() - 1) &&
                _selectList.get(_loop).equals("/"))
            {
                System.out.println("111=[" + _selectList.get(_loop) + "]");
                _sb.append(_selectList.get(_loop) + System.getProperty("line.separator"));
            }
            else if (_loop == (_selectList.size() - 1))
            {
                System.out.println("222=[" + _selectList.get(_loop) + "]");
                _sb.append(_selectList.get(_loop));
            }
            else
            {
                _sb.append(_selectList.get(_loop) + System.getProperty("line.separator"));
            }
        }
        return _sb.toString();
    }
    public void Parse(String parmString) throws Exception {
//////        System.out.println("parmString=[" + parmString + "]");
        ANTLRInputStream _input = new ANTLRInputStream(parmString);
        PLSQLLexer _lexer = new PLSQLLexer(_input);
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
        TokenTable _tokenTable = new TokenTable();
        _tokenTable.Delete(_project, _plsql);
        for (int _index = 0; _index < _tokenList.Size(); _index++)
        {
            System.out.printf("Line =[%05d], Column=[%05d], TokenNo=[%05d], Token=[%s]%s", _tokenList.Get(_index)._line, _tokenList.Get(_index)._column, _tokenList.Get(_index)._tokenNumber, _tokenList.Get(_index)._token, System.getProperty("line.separator"));
            _tokenTable.Insert(_project, _plsql, (_index + 1), _tokenList.Get(_index)._line, _tokenList.Get(_index)._column, _tokenList.Get(_index)._token);
        }

        ParsingTable _parsingTbl = new ParsingTable();
        _parsingTbl.Delete(_project, _plsql);

        ProxyPrintStream _outPrintStream = new ProxyPrintStream(System.out);
        ProxyPrintStream _errPrintStream = new ProxyPrintStream(System.err);
        System.setOut(_outPrintStream);
        System.setErr(_errPrintStream);

        _input = new ANTLRInputStream(parmString);
        _lexer = new PLSQLLexer(_input);
        CommonTokenStream _tokens = new CommonTokenStream(_lexer);
        enCub.PLSQL.Parser.PLSQLParser _parser = new enCub.PLSQL.Parser.PLSQLParser(_tokens);
        ParseTree _tree = _parser.start(); // parse; start at prog
        _parser.reset();
        _parser.setTrace(true);
        ParserRuleContext _context = _parser.start(); // parse; start at prog
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
                _outList[i].trim().length() < 8)
            {
                _type = "";
            }
            else
            {
                _type = _outList[i].substring(0, 8).trim();
            }
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

            if (_type.equals(""))
            {
                System.out.println("OUT=[" + _outList[i] + "]");
            }
            else if (_type.equals("enter") ||
                     _type.equals("exit"))
            {
                System.out.println(String.format("Type=[%-8s],Rule=[%-40s]",_type, _rule));
                _parsingTbl.Insert(_project, _plsql, (i + 1), _type, _rule, 0, 0, 0, "", 0, "");
            }
            else
            {
                if(_tokenNameNo < 0)
                {
                    System.out.println(String.format("Type=[%-8s],Rule=[%-40s],Line=[%05d],Column=[%+5d],Length=[%05d],Token=[%-40s],TokenNo=[%05d],TokenNameNo=[%05d]",_type, _rule, _line, _column, _length, _token, _tokenNo, _tokenNameNo));
                    _parsingTbl.Insert(_project, _plsql, (i + 1), _type, _rule, _line, _column, _length, _token, _tokenNo, "");
                }
                else
                {
                    System.out.println(String.format("Type=[%-8s],Rule=[%-40s],Line=[%05d],Column=[%05d],Length=[%05d],Token=[%-40s],TokenNo=[%07d],TokenNameNo=[%05d],TokenName=[%-40s]",_type, _rule, _line, _column, _length, _token, _tokenNo, _tokenNameNo, _parser.tokenNames[_tokenNameNo]));
                    _parsingTbl.Insert(_project, _plsql, (i + 1), _type, _rule, _line, _column, _length, _token, _tokenNo, _parser.tokenNames[_tokenNameNo]);
                }
            }
        }
        String[]    _errList    = _errPrintStream.getOutput().split(System.getProperty("line.separator"));
        String      _msg        = "";
        String      _saveErr    = "";

        ParsingErrLogTable _errLogTable = new ParsingErrLogTable();
        _errLogTable.Delete(_project, _plsql);

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
//////                    if(_msg.length() > 100)
//////                    {
//////                        _msg    = _msg.substring(0, 100);
//////                    }
                }
            }
            else
            {
//////                System.out.println("_errList[i].substring(6, _errList[i].indexOf(':'))=[" + _errList[i].substring(6, _errList[i].indexOf(':')) + "]");
                _msg = _errList[i].substring(6, _errList[i].indexOf(':'));
            }
//////            if (_line == 0)
//////            {
//////                if(_msg.length() > 100)
//////                {
//////                System.out.println("_saveErr=[" + _saveErr.substring(0,100) + "]");
//////                }
//////                else
//////                {
//////                System.out.println("_saveErr=[" + _saveErr + "]");
//////                }
//////            }
//////            else
//////            {
//////                System.err.println(String.format("Line=[%05d],Column=[%05d],MSG=[%-100s]", _line, _column, _msg));
//////            }
            System.err.println(String.format("Line=[%05d],Column=[%05d],MSG=[%-100s]", _line, _column, _msg));
            _errLogTable.Insert(_project, _plsql, (i + 1), _line, _column, _msg);
        }
        ParseCRUD(_project, _plsql);
    }
    public void ParseCRUD(String parmProject, String parmPLSQL)
    {
        List<PLSQLParsing> _selectList = new ArrayList<PLSQLParsing>();
        PLSQLCRUDTable _crudTable = new PLSQLCRUDTable();
        int _level = 0;
        int _saveLevel = 0;
        int _crudCnt = 0;
        ParsingTable _parsingTable = new ParsingTable();
        _parsingTable.Select(parmProject, parmPLSQL);
        _selectList = _parsingTable.Get();
        _crudTable.Delete(parmProject, parmPLSQL);

        for(int _index1 = 0; _index1 < _selectList.size(); _index1++)
        {
            if (_selectList.get(_index1)._type.equals("exit"))
            {
                _level--;
            }
            if (_selectList.get(_index1)._type.equals("consume") &&
                _selectList.get(_index1)._rule.equals("sql_insert"))
            {
                _saveLevel = _level;
                for(int _index2 = _index1 + 1; _index2 < _selectList.size(); _index2++)
                {
                    if (_selectList.get(_index2)._type.equals("exit"))
                    {
                        _level--;
                        if (_saveLevel > _level)
                        {
                            _index1 = _index2;
                            break;
                        }
                    }
                    if (_selectList.get(_index2)._type.equals("consume") &&
                        _selectList.get(_index2)._rule.equals("insert_into_clause") &&
                        _selectList.get(_index2)._tokenName.equals("INTO"))
                    {
                        _saveLevel = _level;
                        for(int _index3 = _index2 + 1; _index3 < _selectList.size(); _index3++)
                        {
                            if (_selectList.get(_index3)._type.equals("consume") &&
                                _selectList.get(_index3)._tokenName.equals("VARIABLE_NAME"))
                            {
                                _crudCnt++;
//////                                System.out.println("Create Seq=[" + _crudCnt + "], Table Name=[" + _selectList.get(_index3)._token + "]");
                                _crudTable.Insert(parmProject, parmPLSQL, _crudCnt, "C", _selectList.get(_index3)._token);
                                _index2 = _index3;
                                break;
                            }
                            if (_selectList.get(_index3)._type.equals("exit"))
                            {
                                _level--;
                                if (_saveLevel >= _level)
                                {
                                    _index2 = _index3;
                                    break;
                                }
                            }
                            if (_selectList.get(_index3)._type.equals("enter"))
                            {
                                _level++;
                            }
                        }
                    }
                    if (_selectList.get(_index2)._type.equals("enter"))
                    {
                        _level++;
                    }
                }
            }
            else if (_selectList.get(_index1)._type.equals("consume") &&
                     _selectList.get(_index1)._tokenName.equals("SELECT"))
            {
//////                            System.out.print("SEQ=" + _selectList.get(_index1)._seq);
//////                            System.out.print(",Level=" + _level);
//////                            System.out.print(",Type=" + _selectList.get(_index1)._type);
//////                            System.out.print(",Rule=" + _selectList.get(_index1)._rule);
//////                            System.out.print(",Line=" + _selectList.get(_index1)._line);
//////                            System.out.print(",Column=" + _selectList.get(_index1)._column);
//////                            System.out.print(",Length=" + _selectList.get(_index1)._length);
//////                            System.out.print(",Token=" + _selectList.get(_index1)._token);
//////                            System.out.print(",TokenNo=" + _selectList.get(_index1)._tokenNo);
//////                            System.out.println(",TokenName=" + _selectList.get(_index1)._tokenName);
                _saveLevel = _level;
                for(int _index2 = _index1 + 1; _index2 < _selectList.size(); _index2++)
                {
                    if (_selectList.get(_index2)._type.equals("exit"))
                    {
                        _level--;
                        if (_saveLevel > _level)
                        {
                            _index1 = _index2;
                            break;
                        }
                    }
                    if (_selectList.get(_index2)._type.equals("consume") &&
                        _selectList.get(_index2)._tokenName.equals("FROM"))
                    {
                        _saveLevel = _level;
                        for(int _index3 = _index2 + 1; _index3 < _selectList.size(); _index3++)
                        {
                            if (_selectList.get(_index3)._type.equals("consume") &&
                                _selectList.get(_index3)._tokenName.equals("VARIABLE_NAME"))
                            {
                                _crudCnt++;
//////                                System.out.println("Select Seq=[" + _crudCnt + "], Table Name=[" + _selectList.get(_index3)._token + "]");
                                _crudTable.Insert(parmProject, parmPLSQL, _crudCnt, "R", _selectList.get(_index3)._token);
                                _index2 = _index3;
                                break;
                            }
                            if (_selectList.get(_index3)._type.equals("exit"))
                            {
                                _level--;
                                if (_saveLevel >= _level)
                                {
                                    _index2 = _index3;
                                    break;
                                }
                            }
                            if (_selectList.get(_index3)._type.equals("enter"))
                            {
                                _level++;
                            }
                        }
                    }
                    if (_selectList.get(_index2)._type.equals("enter"))
                    {
                        _level++;
                    }
                }
            }
            else if (_selectList.get(_index1)._type.equals("consume") &&
                    (_selectList.get(_index1)._rule.equals("sql_update") ||
                     _selectList.get(_index1)._rule.equals("sql_delete")))
            {
                _saveLevel = _level;
                for(int _index2 = _index1 + 1; _index2 < _selectList.size(); _index2++)
                {
                    if (_selectList.get(_index2)._type.equals("exit"))
                    {
                        _level--;
                        if (_saveLevel >= _level)
                        {
                            _index1 = _index2;
                            break;
                        }
                    }
                    if (_selectList.get(_index2)._type.equals("consume") &&
                        _selectList.get(_index2)._tokenName.equals("VARIABLE_NAME"))
                    {
                        _crudCnt++;
                        if (_selectList.get(_index1)._rule.equals("sql_update"))
                        {
//////                            System.out.println("Update Seq=[" + _crudCnt + "], Table Name=[" + _selectList.get(_index2)._token + "]");
                                _crudTable.Insert(parmProject, parmPLSQL, _crudCnt, "U", _selectList.get(_index2)._token);
                        }
                        else
                        {
//////                            System.out.println("Delete Seq=[" + _crudCnt + "], Table Name=[" + _selectList.get(_index2)._token + "]");
                                _crudTable.Insert(parmProject, parmPLSQL, _crudCnt, "D", _selectList.get(_index2)._token);
                        }
                        _index1 = _index2;
                        break;
                    }
                    if (_selectList.get(_index2)._type.equals("enter"))
                    {
                        _level++;
                    }
                }
            }
//////                            System.out.print("SEQ=" + _selectList.get(_index1)._seq);
//////                            System.out.print(",Level=" + _level);
//////                            System.out.print(",Type=" + _selectList.get(_index1)._type);
//////                            System.out.print(",Rule=" + _selectList.get(_index1)._rule);
//////                            System.out.print(",Line=" + _selectList.get(_index1)._line);
//////                            System.out.print(",Column=" + _selectList.get(_index1)._column);
//////                            System.out.print(",Length=" + _selectList.get(_index1)._length);
//////                            System.out.print(",Token=" + _selectList.get(_index1)._token);
//////                            System.out.print(",TokenNo=" + _selectList.get(_index1)._tokenNo);
//////                            System.out.println(",TokenName=" + _selectList.get(_index1)._tokenName);

            if (_selectList.get(_index1)._type.equals("enter"))
            {
                _level++;
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
        try
        {
            if ( args.length > 1 )
            {
                PLSQLParser _parser = new PLSQLParser();
                LOGWriter.Write("Project[" + args[0] + "], PLSQL[" + args[1] + "] is parsing.");
                _parser.Parse(_parser.ReadPLSQL(args[0], args[1]));
                LOGWriter.Write("Project[" + args[0] + "], PLSQL[" + args[1] + "] was parsed.");
            }
            else if ( args.length > 0 )
            {
                PLSQLParser _parser = new PLSQLParser();
                _parser.Parse(_parser.ReadFile(args[0]));
            }
            else
            {
                System.out.println("argument not found.");
            }
        }
        catch(Exception e)
        {
            System.err.println("Error=" + e.toString());
            e.printStackTrace();
        }
    }
}
