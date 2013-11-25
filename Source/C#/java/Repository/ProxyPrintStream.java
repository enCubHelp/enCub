package enCub.PLSQL.Converter;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

class ProxyPrintStream extends PrintStream
{
    private PrintStream _originalPrintStream = null;
    private String _outString = null;
    public ProxyPrintStream(PrintStream out) {
        super(out);
        _originalPrintStream = out;
        _outString = new String();
    }
    public void print(final String str) {
        _outString += str;
    }
    public void println(final String str) {
        _outString += str + System.getProperty("line.separator");
    }
    public String getOutput() {
        return _outString;
    }
    public void resetOut() {
        System.setOut(_originalPrintStream);
    }
    public void resetErr() {
        System.setErr(_originalPrintStream);
    }
}