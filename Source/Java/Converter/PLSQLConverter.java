package enCub.PLSQL.Converter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

import enCub.PLSQL.Repository.ParsingTable;
import enCub.PLSQL.Repository.ConversionTable;
import enCub.PLSQL.Repository.Target;

import enCub.PLSQL.Util.LOG.LOGWriter;

public class PLSQLConverter {
    public void Convert(String parmProject, String parmPLSQL) throws Exception {
        ParsingTable _parsingTable = new ParsingTable();
        Target _target = new Target();
        List<PLSQLParsing> _selectList = new ArrayList<PLSQLParsing>();
        _parsingTable.Select(parmProject, parmPLSQL);
        _selectList = _parsingTable.Get();
        int _level = 1;
        System.out.println("Project=" + parmProject);
        System.out.println("PLSQL=" + parmPLSQL);
        System.out.println("_selectList.size()=[" + _selectList.size() + "]");
        for(int _loop = 0; _loop < _selectList.size(); _loop++)
        {
            System.out.print("Seq=" + _loop);
            System.out.print(",Type=" + _selectList.get(_loop)._type);
            System.out.print(",Level=" + _selectList.get(_loop)._level);
            System.out.print(",Rule=" + _selectList.get(_loop)._rule);
            System.out.print(",Line=" + _selectList.get(_loop)._line);
            System.out.print(",Column=" + _selectList.get(_loop)._column);
            System.out.print(",Length=" + _selectList.get(_loop)._length);
            System.out.print(",Token=" + _selectList.get(_loop)._token);
            System.out.print(",TokenNo=" + _selectList.get(_loop)._tokenNo);
            System.out.println(",TokenName=" + _selectList.get(_loop)._tokenName);
        }
        System.out.println("Converting is starting... Program=[" + parmPLSQL + "], Thread=[" + Thread.currentThread().getName() + "]");
        JavaWriter.SetProgram(parmProject, parmPLSQL);
        PLSQLStatements _plsqlStatements = new PLSQLStatements();
//////        System.out.println("PLSQLConverter:_plsqlStatements.Convert(_selectList");
        _plsqlStatements.Convert(_selectList);
        JavaWriter.WriteStatement();
//////            if (_selectList.get(_loop)._type.equals("consume") &&
//////                _selectList.get(_loop)._rule.equals("create_procedure"))
//////            {
//////                System.out.println("CreateProcedure");
//////                _plsqlStatement = new CreateProcedure();
//////                _selectList = _plsqlStatement.Convert(_selectList, _loop);
//////                _loop = -1;
//////            }
//////        }
        ConversionTable _conversionTable = new ConversionTable();
        _conversionTable.Delete(parmProject, parmPLSQL);
        _conversionTable.Insert(parmProject, parmPLSQL, 1, "성공");
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
            if ( args.length == 2 )
            {
                PLSQLConverter _converter = new PLSQLConverter();
                LOGWriter.Write("Project[" + args[0] + "], PLSQL[" + args[1] + "] is converting.");
                _converter.Convert(args[0], args[1]);
                LOGWriter.Write("Project[" + args[0] + "], PLSQL[" + args[1] + "] was converted.");
            }
            else
            {
                System.out.println("argument를 확인하십시오.");
            }
        }
        catch(Exception e)
        {
            System.err.println("Error=[" + e.toString() + "]");
            e.printStackTrace();
        }
    }
}