/*------------------------------------------------------*/
/* Converted By EnCub                                   */
/*------------------------------------------------------*/


import java.sql.*;
import java.text.*;

import java.math.BigDecimal;

public class InsertAmt {
    public static void InsertAmt(
    String p_po_no) throws SQLException
    {
        BigDecimal v_po_amt = new BigDecimal(0);
        BigDecimal v_tot_po_amt = new BigDecimal(0);
        Connection _conn = DriverManager.getConnection("jdbc:default:connection");
        PreparedStatement _pstmnt   = null;
        String            _sqlQuery = null;
        boolean _isFound = false;
        int rowsUpdated  = 0;
        String _str_c_po_amt = "select po_cost from purchase_order_d where po_no = ?";
        _pstmnt = _conn.prepareStatement(_str_c_po_amt);
        _pstmnt.setString(1,p_po_no);
        ResultSet _rs_c_po_amt = _pstmnt.executeQuery();
        while(true) {
            _isFound = _rs_c_po_amt.next();
            if(_isFound) {
                v_po_amt = _rs_c_po_amt.getBigDecimal(1);
            }
            if(!_isFound) {
                break;
            }
            v_tot_po_amt = v_tot_po_amt.add(v_po_amt);
        }
        _pstmnt.close();
        _sqlQuery = "update PURCHASE_ORDER_M set po_amt = ? where po_no = ?";
        _pstmnt = _conn.prepareStatement(_sqlQuery);
        _pstmnt.setBigDecimal(1,v_tot_po_amt);
        _pstmnt.setString(2,p_po_no);
        rowsUpdated = _pstmnt.executeUpdate();
    }
}
