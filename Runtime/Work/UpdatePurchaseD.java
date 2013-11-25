/*------------------------------------------------------*/
/* Converted By EnCub                                   */
/*------------------------------------------------------*/


import java.sql.*;
import java.text.*;
import cubrid.jdbc.driver.CUBRIDResultSet;

import java.math.BigDecimal;

public class UpdatePurchaseD {
    public static void UpdatePurchaseD(
    String p_po_no,
    BigDecimal p_po_seq,
    String p_item_no,
    BigDecimal p_po_qty,
    BigDecimal p_po_ucost,
    BigDecimal p_po_cost) throws SQLException
    {
        Connection _conn = DriverManager.getConnection("jdbc:default:connection");
        PreparedStatement _pstmnt   = null;
        String            _sqlQuery = null;
        boolean _isFound = false;
        int rowsUpdated  = 0;
        _sqlQuery = "update Purchase_Order_D set item_no = ?, po_qty = ?, po_ucost = ? where po_no = ? and po_seq = ?";
        _pstmnt = _conn.prepareStatement(_sqlQuery);
        _pstmnt.setString(1,p_item_no);
        _pstmnt.setBigDecimal(2,p_po_qty);
        _pstmnt.setBigDecimal(3,p_po_ucost);
        _pstmnt.setString(4,p_po_no);
        _pstmnt.setBigDecimal(5,p_po_seq);
        rowsUpdated = _pstmnt.executeUpdate();
    }
}
