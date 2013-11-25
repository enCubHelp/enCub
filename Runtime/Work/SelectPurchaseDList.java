/*------------------------------------------------------*/
/* Converted By EnCub                                   */
/*------------------------------------------------------*/


import java.sql.*;
import java.text.*;
import cubrid.jdbc.driver.CUBRIDResultSet;


public class SelectPurchaseDList {
    public static ResultSet SelectPurchaseDList(
    String p_po_no) throws SQLException
    {
        ResultSet cursor_purchase_d;
        Connection _conn = DriverManager.getConnection("jdbc:default:connection");
        PreparedStatement _pstmnt   = null;
        String            _sqlQuery = null;
        boolean _isFound = false;
        int rowsUpdated  = 0;
        _sqlQuery = "select a . po_no, a . po_seq, a . item_no, b . item_desc, a . po_qty, a . po_ucost, a . po_cost from purchase_order_d a, item b where a.po_no = ? and b.item_no = a.item_no order by a . po_no, a . po_seq";
        _pstmnt = _conn.prepareStatement(_sqlQuery);
        _pstmnt.setString(1, p_po_no);
        cursor_purchase_d = _pstmnt.executeQuery();
        ((CUBRIDResultSet)cursor_purchase_d).setReturnable();
        return cursor_purchase_d;
    }
}
