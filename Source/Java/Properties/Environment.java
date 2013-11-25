package enCub.PLSQL.Properties;

import java.util.*;
import java.util.Map.Entry;
import java.sql.*;
import java.io.*;
import java.util.regex.Pattern;
import org.apache.commons.codec.binary.Base64;

public class Environment
{
    private static Environment _environment = null;
    public static String _envFile = "Properties" + System.getProperty("file.separator") + "Environment.properties";
    private static Properties _properties = new Properties();
    public static Environment getInstance() throws Exception
    {
        if (_environment == null)
        {
            _environment = new Environment();
            _properties = new Properties();
            _properties.load(new BufferedReader(new InputStreamReader(new FileInputStream(_envFile))));
        }
        return _environment;
    }
    public static HashMap<String, String> List() throws Exception
    {
        getInstance();
        HashMap<String, String> _lists = new HashMap<String, String>();
        Enumeration e = _properties.propertyNames();
        while (e.hasMoreElements())
        {
            String key = (String) e.nextElement();
            _lists.put(key, new String(Base64.decodeBase64(_properties.getProperty(key))));
        }
        return _lists;
    }
    public static String Get(String parmKey) throws Exception
    {
        getInstance();
//////        return _properties.getProperty(parmKey);
        return new String(Base64.decodeBase64(_properties.getProperty(parmKey)));
    }
    public static void Set(String parmKey, String parmValue) throws Exception
    {
        getInstance();
        _properties.setProperty(parmKey, new String(Base64.encodeBase64(parmValue.getBytes())));
    }
    public static void Remove(String parmKey) throws Exception
    {
        getInstance();
        _properties.remove(parmKey);
    }
    public static void Save() throws Exception
    {
        getInstance();
        OutputStream _outputStream = new FileOutputStream(_envFile);
        _properties.store(_outputStream,"enCub Environment Properties");
    }
    public static void main(String[] args) throws Exception
    {
        if (args.length == 1 &&
            args[0].toUpperCase().equals("LIST"))
        {
            HashMap<String, String> _lists = new HashMap<String, String>();
            _lists = Environment.List();
            Iterator iter = _lists.entrySet().iterator();
            while (iter.hasNext())
            {
                Entry entry = (Entry) iter.next();
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }
        }
        else if (args.length == 2 &&
                 args[0].toUpperCase().equals("GET"))
        {
            String _value = Environment.Get(args[1]);
            if (_value == null)
            {
                _value = "";
            }
            System.out.println(args[1] + '=' + _value);
        }
        else if (args.length % 2 == 1 &&
                 args[0].toUpperCase().equals("SET"))
        {
            for(int _loop = 1; _loop < args.length; _loop+=2)
            {
                Environment.Set(args[_loop], args[_loop + 1]);
            }
            Environment.Save();
        }
        else if (args[0].toUpperCase().equals("REMOVE"))
        {
            for(int _loop = 1; _loop < args.length; _loop++)
            {
                Environment.Remove(args[_loop]);
            }
            Environment.Save();
        }
    }
}