/*------------------------------------------------------*/
/* Converted By EnCub                                   */
/*------------------------------------------------------*/


import java.sql.*;
import java.text.*;
import cubrid.jdbc.driver.CUBRIDResultSet;


public class SelectItemList {
    public static ResultSet SelectItemList(
    String p_item_no) throws SQLException
    {
        ResultSet cursor_item;
        Connection _conn = DriverManager.getConnection("jdbc:default:connection");
        PreparedStatement _pstmnt   = null;
        String            _sqlQuery = null;
        boolean _isFound = false;
        int rowsUpdated  = 0;
        _sqlQuery = "select item_no, item_desc, item_spec, item_scost from item where item_no >= ? order by item_no";
        _pstmnt = _conn.prepareStatement(_sqlQuery);
        _pstmnt.setString(1, p_item_no);
        cursor_item = _pstmnt.executeQuery();
        ((CUBRIDResultSet)cursor_item).setReturnable();
        return cursor_item;
    }
}
