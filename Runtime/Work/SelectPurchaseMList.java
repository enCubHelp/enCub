/*------------------------------------------------------*/
/* Converted By EnCub                                   */
/*------------------------------------------------------*/


import java.sql.*;
import java.text.*;
import cubrid.jdbc.driver.CUBRIDResultSet;


public class SelectPurchaseMList {
    public static ResultSet SelectPurchaseMList(
    String p_po_no) throws SQLException
    {
        ResultSet cursor_purchase_m;
        Connection _conn = DriverManager.getConnection("jdbc:default:connection");
        PreparedStatement _pstmnt   = null;
        String            _sqlQuery = null;
        boolean _isFound = false;
        int rowsUpdated  = 0;
        _sqlQuery = "select a . po_no, a . ven_code, b . ven_desc, a . po_date, a . po_amt from purchase_order_m a, vendor b where a.po_no >= ? and b.ven_code = a.ven_code order by a . po_no";
        _pstmnt = _conn.prepareStatement(_sqlQuery);
        _pstmnt.setString(1, p_po_no);
        cursor_purchase_m = _pstmnt.executeQuery();
        ((CUBRIDResultSet)cursor_purchase_m).setReturnable();
        return cursor_purchase_m;
    }
}
