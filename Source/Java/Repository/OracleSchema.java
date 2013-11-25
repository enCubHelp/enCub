package enCub.PLSQL.Repository;

import java.util.*;
import java.sql.*;
import java.util.*;
import java.util.regex.Pattern;
import org.apache.commons.codec.binary.Base64;

import enCub.PLSQL.Converter.PLSQLConversion;

public class OracleSchema
{
    private Connection              _conn       = null;
    private List<OracleSchemaData>  _schemas    = new ArrayList<OracleSchemaData>();
    public List<OracleSchemaData> Get() {
        return _schemas;
    }
    public void Select(String parmTable) throws Exception
    {
        Select(parmTable, null);
    }
    public void Select(String parmTable, String parmColumn) throws Exception
    {
        List<String> _pkColumns = SelectPrimaryKey(parmTable);

        Database _database = new Database();
        Statement _statement = null;
        try
        {
            _conn = _database.Connect("Oracle");
            _statement = _conn.createStatement();
            String _sql = "SELECT  B.COLUMN_NAME,"
                        +        " B.DATA_TYPE,"
                        +        " B.DATA_LENGTH,"
                        +        " B.DATA_PRECISION,"
                        +        " B.DATA_SCALE,"
                        +        " B.NULLABLE,"
                        +        " B.COLUMN_ID,"
                        +        " A.COMMENTS"
                        +   " FROM USER_COL_COMMENTS A,"
                        +        " USER_TAB_COLUMNS B"
                        +  " WHERE B.TABLE_NAME = A.TABLE_NAME"
                        +    " AND B.COLUMN_NAME = A.COLUMN_NAME"
                        +    " AND B.TABLE_NAME = '" + parmTable + "'";
            if (parmColumn != null)
            {
                _sql    +=   " AND A.TABLE_NAME = '" + parmColumn + "'";
            }
                _sql    += " ORDER BY B.COLUMN_ID";
//////            System.out.println("SQL=[" + _sql + "]");
            ResultSet _rs = _statement.executeQuery(_sql);
            while(_rs.next())
            {
                boolean _isPK = false;
                boolean _isLastPK = false;
                OracleSchemaData _schema = new OracleSchemaData();
                _schema._column     = _rs.getString("COLUMN_NAME");
                _schema._type       = _rs.getString("DATA_TYPE");
                _schema._length     = _rs.getInt("DATA_LENGTH");
                _schema._precision  = _rs.getInt("DATA_PRECISION");
                _schema._scale      = _rs.getInt("DATA_SCALE");
                _schema._nullable   = _rs.getString("NULLABLE");
                _schema._columnid   = _rs.getInt("COLUMN_ID");
                _schema._comments   = _rs.getString("COMMENTS");
                for(int _pkLoop = 0; _pkLoop < _pkColumns.size(); _pkLoop++)
                {
                    if (_schema._column.equals(_pkColumns.get(_pkLoop)))
                    {
                        _isPK = true;
                        break;
                    }
                }
                _schema._isPK = _isPK;
                _schema._isLastPK = _isLastPK;
                _schemas.add(_schema);
            }
            _rs.close();
            _statement.close();
            _conn.close();
            for(int _loop = (_schemas.size() - 1); _loop >= 0 ; _loop--)
            {
                if (_schemas.get(_loop)._isPK)
                {
                    OracleSchemaData _schema = new OracleSchemaData();
                    _schema             = _schemas.get(_loop);
                    _schema._isLastPK   = true;
                    _schemas.set(_loop, _schema);
                    break;
                }
            }
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
            throw e;
        }
        finally
        {
            try
            {
                if(_statement != null)
                {
                    _statement.close();
                }
                if(_conn != null)
                {
                    _conn.close();
                }
            }
            catch(SQLException e)
            {
                System.err.println(e.getMessage());
                throw e;
            }
        }
    }
    public List<String> SelectPrimaryKey(String parmTable) throws Exception
    {
        Database        _database   = new Database();
        List<String>    _columns    = new ArrayList<String>();
        Statement _statement = null;
        try
        {
            _conn = _database.Connect("Oracle");
            _statement = _conn.createStatement();
            String _sql = "select C.COLUMN_NAME from USER_CONS_COLUMNS C, USER_CONSTRAINTS S "
                        + "where C.CONSTRAINT_NAME = S.CONSTRAINT_NAME and S.CONSTRAINT_TYPE = 'P' "
                        + "AND C.TABLE_NAME = '" + parmTable + "'";
//////            System.out.println("SQL=[" + _sql + "]");
            ResultSet _rs = _statement.executeQuery(_sql);
            while(_rs.next())
            {
                _columns.add(_rs.getString("COLUMN_NAME"));
            }
            _rs.close();
            _statement.close();
            _conn.close();
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
            throw e;
        }
        finally
        {
            try
            {
                if(_statement != null)
                {
                    _statement.close();
                }
                if(_conn != null)
                {
                    _conn.close();
                }
            }
            catch(SQLException e)
            {
                System.err.println(e.getMessage());
                throw e;
            }
        }
        return _columns;
    }
    public static void main(String[] args) throws Exception
    {
        List<OracleSchemaData>  _schemas    = new ArrayList<OracleSchemaData>();
        OracleSchema _schema = new OracleSchema();
        if (args.length == 1)
        {
            _schema.Select(args[0]);
            _schemas    = _schema.Get();
            for(int _loop = 0; _loop < _schemas.size(); _loop++)
            {
                System.out.print("column=[" + _schemas.get(_loop)._column + "]");
                System.out.print("type =[" + _schemas.get(_loop)._type + "]");
                System.out.print("length=[" + _schemas.get(_loop)._length + "]");
                System.out.print("precision=[" + _schemas.get(_loop)._precision + "]");
                System.out.print("scale=[" + _schemas.get(_loop)._scale + "]");
                System.out.print("nullable=[" + _schemas.get(_loop)._nullable + "]");
                System.out.print("columnid=[" + _schemas.get(_loop)._columnid + "]");
                System.out.println("_comments=[" + _schemas.get(_loop)._comments + "]");
            }
        }
        else if (args.length == 2 &&
                 args[0].toUpperCase().equals("PK"))
        {
            List<String> _columns = new ArrayList<String>();
            _columns = _schema.SelectPrimaryKey(args[1]);
            for(int _loop = 0; _loop < _columns.size(); _loop++)
            {
                System.out.println("column=[" + _columns.get(_loop) + "]");
            }
        }
    }
}