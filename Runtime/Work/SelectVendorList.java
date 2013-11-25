/*------------------------------------------------------*/
/* Converted By EnCub                                   */
/*------------------------------------------------------*/


import java.sql.*;
import java.text.*;
import cubrid.jdbc.driver.CUBRIDResultSet;


public class SelectVendorList {
    public static ResultSet SelectVendorList(
    String p_ven_code) throws SQLException
    {
        ResultSet cursor_vendor;
        Connection _conn = DriverManager.getConnection("jdbc:default:connection");
        PreparedStatement _pstmnt   = null;
        String            _sqlQuery = null;
        boolean _isFound = false;
        int rowsUpdated  = 0;
        _sqlQuery = "select ven_code, ven_desc, ven_idno, ven_addr from vendor where ven_code >= ? order by ven_code";
        _pstmnt = _conn.prepareStatement(_sqlQuery);
        _pstmnt.setString(1, p_ven_code);
        cursor_vendor = _pstmnt.executeQuery();
        ((CUBRIDResultSet)cursor_vendor).setReturnable();
        return cursor_vendor;
    }
}
