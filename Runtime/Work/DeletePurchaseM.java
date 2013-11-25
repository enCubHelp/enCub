/*------------------------------------------------------*/
/* Converted By EnCub                                   */
/*------------------------------------------------------*/


import java.sql.*;
import java.text.*;
import cubrid.jdbc.driver.CUBRIDResultSet;


public class DeletePurchaseM {
    public static void DeletePurchaseM(
    String p_po_no) throws SQLException
    {
        Connection _conn = DriverManager.getConnection("jdbc:default:connection");
        PreparedStatement _pstmnt   = null;
        String            _sqlQuery = null;
        boolean _isFound = false;
        int rowsUpdated  = 0;
        _sqlQuery = "delete Purchase_Order_M where po_no = ?";
        _pstmnt = _conn.prepareStatement(_sqlQuery);
        _pstmnt.setString(1, p_po_no);
        rowsUpdated  = _pstmnt.executeUpdate();
    }
}
