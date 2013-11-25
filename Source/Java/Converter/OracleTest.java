import java.util.*;

import java.sql.*;

public class OracleTest {
    public static void main(String[] args) {
        String _DB_URL      = "jdbc:oracle:thin:@localhost:1521/pdborcl";
        String _DB_USER     = "orauser";
        String _DB_PASSWORD = "orauser";
        Connection _conn = null;
        Statement  _stmt = null;
        String _msg = "";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            _conn = DriverManager.getConnection(_DB_URL, _DB_USER, _DB_PASSWORD);
            _stmt = _conn.createStatement();
            _conn.close();
            _msg = "성공";
        }
        catch(Exception e)
        {
            _msg = "실패:" + e.getMessage();
        }
        System.out.println("Message=[" + _msg + "]");
    }
}