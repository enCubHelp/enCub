package enCub.PLSQL.Converter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

import enCub.PLSQL.Repository.Target;
import enCub.PLSQL.Properties.Environment;

public class LoadJava {
    public void Load(String parmProject, String parmJava) throws Exception {
        String _exportPath  = "work";
        String _command     = "javac";
        String _argument    = "-d work work" + System.getProperty("file.separator") + parmJava + ".java";
        Target _export = new Target();
        _export.Export(parmProject, parmJava, _exportPath);

        _command    = "\"" + _command + "\"";
        System.out.println("Command=[" + _command + " " + _argument + "]");
        Runtime         _systemShell = Runtime.getRuntime();
        Process         _output      = _systemShell.exec(_command + " " + _argument);
        BufferedReader  _stdout      = new BufferedReader (new InputStreamReader(_output.getInputStream()));
        String          _line        = null;
        while((_line = _stdout.readLine()) != null) {
            System.out.println(_line);
        }
        int _exitVal = _output.waitFor();
        if (_exitVal == 0)
        {
            System.out.println("javac:Success");
        }
        else
        {
            System.out.println("javac:Error Code=" + _exitVal);
            return;
        }
        String _loadJavaPath = Environment.Get("TargetDBMSLoadJavaPath");
        _command = "\"" + Environment.Get("TargetDBMSLoadJavaPath") + System.getProperty("file.separator") + "loadjava" + "\"";
        _command = Environment.Get("TargetDBMSLoadJavaPath") + System.getProperty("file.separator") + "loadjava";
        if (Environment.Get("TargetDBMS").toUpperCase().startsWith("CUBRID"))
        {
            _argument = "-y " + Environment.Get("TargetDBMSConnection").substring(28, Environment.Get("TargetDBMSConnection").length() - 3);
        }
        else if (Environment.Get("TargetDBMS").toUpperCase().startsWith("ORACLE"))
        {
            _command = "cmd /c " + _command;
            _argument = "-u " + Environment.Get("TargetDBMSUser") + "/" + Environment.Get("TargetDBMSPassword") + "@//" + Environment.Get("TargetDBMSConnection").substring(18) + " -f -v";
        }
        _argument += " work" + System.getProperty("file.separator") + parmJava + ".class";
        System.out.println("Command=[" + _command + " " + _argument + "]");
        _output      = _systemShell.exec(_command + " " + _argument);
        _stdout      = new BufferedReader (new InputStreamReader(_output.getInputStream()));
        _line        = null;
        while((_line = _stdout.readLine()) != null) {
            System.out.println(_line);
        }
        _exitVal = _output.waitFor();
        if (_exitVal == 0)
        {
            System.out.println("loadjava:Success");
        }
        else
        {
            System.out.println("loadjava:Error Code=" + _exitVal);
            return;
        }
    }
    public static void main(String[] args) {
        try {
            LoadJava _loadJava = new LoadJava();
            _loadJava.Load(args[0], args[1]);
        } catch(Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}