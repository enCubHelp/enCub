/*------------------------------------------------------*/
/* Converted By EnCub                                   */
/*------------------------------------------------------*/


import java.sql.*;
import java.text.*;
import cubrid.jdbc.driver.CUBRIDResultSet;

import java.math.BigDecimal;

public class UpdateCost {
    public static void UpdateCost(String _old_po_no, String[] _new_po_no,
                                  BigDecimal _old_po_seq, BigDecimal[] _new_po_seq,
                                  String _old_item_no, String[] _new_item_no,
                                  BigDecimal _old_po_qty, BigDecimal[] _new_po_qty,
                                  BigDecimal _old_po_ucost, BigDecimal[] _new_po_ucost,
                                  BigDecimal _old_po_cost, BigDecimal[] _new_po_cost) throws SQLException
    {
        _new_po_cost[0] = _new_po_qty[0].multiply(_new_po_ucost[0]);
        Connection _conn = DriverManager.getConnection("jdbc:default:connection");
        PreparedStatement _pstmnt   = null;
        String            _sqlQuery = null;
        _sqlQuery = "update PURCHASE_ORDER_D"
                  + "       set ITEM_NO = ?"
                  + "          ,PO_QTY = ?"
                  + "          ,PO_UCOST = ?"
                  + "          ,PO_COST = ?"
                  + "     where PO_NO = ?"
                  + "       and PO_SEQ = ?";
        _pstmnt = _conn.prepareStatement(_sqlQuery);
        _pstmnt.setString(1,_new_item_no[0]);
        _pstmnt.setBigDecimal(2,_new_po_qty[0]);
        _pstmnt.setBigDecimal(3,_new_po_ucost[0]);
        _pstmnt.setBigDecimal(4,_new_po_cost[0]);
        _pstmnt.setString(5,_old_po_no);
        _pstmnt.setBigDecimal(6,_old_po_seq);
        _pstmnt.executeUpdate();
        _pstmnt.close();
        _conn.close();
    }
}
