package enCub.PLSQL.Util.Process;

import java.io.*;
import java.util.*;

public class CmdProcessBuilder {
    public void ExecuteCmd(String[] parmArgs) throws InterruptedException,IOException {
        List<String> _command = new ArrayList<String>();
        for(int _argsLoop = 0; _argsLoop < parmArgs.length; _argsLoop++) {
            _command.add(parmArgs[_argsLoop]);
        }
        ExecuteCmd(_command);
    }
    public void ExecuteCmd(List<String> parmCommand)  throws InterruptedException,IOException {
        ProcessBuilder _builder = new ProcessBuilder(parmCommand);
        Map<String, String> _environment = _builder.environment();

        _builder.redirectErrorStream(true);
        final Process _process = _builder.start();
        InputStreamReader _isr = new InputStreamReader(_process.getInputStream());
        BufferedReader _br = new BufferedReader(_isr);
        String _line;
        while ((_line = _br.readLine()) != null) {
            System.out.println(_line);
        }
        int _rc = _process.waitFor();
        System.out.println("Return Code=[" + _rc + "]");
    }
    public static void main(String args[]) throws InterruptedException,IOException
    {
        CmdProcessBuilder _process = new CmdProcessBuilder();
        _process.ExecuteCmd(args);
        System.out.println("Program terminated!");
  }
}