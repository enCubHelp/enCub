package enCub.PLSQL.Util.LOG;

import java.util.*;
import java.util.Map.Entry;
import java.sql.*;
import java.io.*;
import java.text.*;
import java.util.Date;

public class LOGWriter
{
    private static LOGWriter _writer = null;
    public static String _logFile = "LOG" + System.getProperty("file.separator") + "enCub.log";
    public static File _outFile;
    public static FileWriter _outWriter;
    public static LOGWriter getInstance() throws Exception
    {
        if (_writer == null)
        {
            _writer = new LOGWriter();
            _outFile = new File(_logFile);
            if (!_outFile.exists())
            {
                _outFile.createNewFile();
            }
        }
        _outWriter = new FileWriter(_logFile, true);
        return _writer;
    }
    public static void Write(String parmLOG) throws Exception
    {
        getInstance();
        Date                _now    = new Date();
        SimpleDateFormat    _date   = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");

        _outWriter.append("[" + _date.format(_now) + "] " + parmLOG + System.getProperty("line.separator"));
        _outWriter.close();
    }
    public static void main(String[] args) throws Exception
    {
        LOGWriter.Write("TEST LOG¿‘¥œ¥Ÿ.");
    }
}