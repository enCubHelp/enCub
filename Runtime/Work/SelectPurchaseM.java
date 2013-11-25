/*------------------------------------------------------*/
/* Converted By EnCub                                   */
/*------------------------------------------------------*/


import java.sql.*;
import java.text.*;
import cubrid.jdbc.driver.CUBRIDResultSet;

import java.math.BigDecimal;

public class SelectPurchaseM {
    public static void SelectPurchaseM(
    String p_po_no,
    String[] p_ven_code,
    String[] p_ven_desc,
    Date[] p_po_date,
    BigDecimal[] p_po_amt) throws SQLException
    {
        Connection _conn = DriverManager.getConnection("jdbc:default:connection");
        PreparedStatement _pstmnt   = null;
        String            _sqlQuery = null;
        boolean _isFound = false;
        int rowsUpdated  = 0;
        _sqlQuery = "select a.ven_code , b.ven_desc , a.po_date , a.po_amt from purchase_order_m a , vendor b where a.po_no = ? and b.ven_code = a.ven_code";
        _pstmnt = _conn.prepareStatement(_sqlQuery);
        _pstmnt.setString(1, p_po_no);
        ResultSet _rs = _pstmnt.executeQuery();
        if (_rs.next()) {
            p_ven_code[0] = _rs.getString(1);
            p_ven_desc[0] = _rs.getString(2);
            p_po_date[0] = _rs.getDate(3);
            p_po_amt[0] = _rs.getBigDecimal(4);
        }
    }
}
