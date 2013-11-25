/*------------------------------------------------------*/
/* Converted By EnCub                                   */
/*------------------------------------------------------*/


import java.sql.*;
import java.text.*;
import cubrid.jdbc.driver.CUBRIDResultSet;

import java.math.BigDecimal;

public class UpdatePurchaseM {
    public static void UpdatePurchaseM(
    String p_po_no,
    String p_ven_code,
    Date p_po_date,
    BigDecimal p_po_amt) throws SQLException
    {
        Connection _conn = DriverManager.getConnection("jdbc:default:connection");
        PreparedStatement _pstmnt   = null;
        String            _sqlQuery = null;
        boolean _isFound = false;
        int rowsUpdated  = 0;
        _sqlQuery = "update Purchase_Order_M set ven_code = ?, po_date = ?, po_amt = ? where po_no = ?";
        _pstmnt = _conn.prepareStatement(_sqlQuery);
        _pstmnt.setString(1,p_ven_code);
        _pstmnt.setDate(2,p_po_date);
        _pstmnt.setBigDecimal(3,p_po_amt);
        _pstmnt.setString(4,p_po_no);
        rowsUpdated = _pstmnt.executeUpdate();
    }
}
