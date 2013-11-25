package enCub.PLSQL.Repository;

import java.util.*;

public class OracleSchemaData {
    public String   _column     = new String();
    public String   _type       = new String();
    public int      _length     = 0;
    public int      _precision  = 0;
    public int      _scale      = 0;
    public String   _nullable   = new String();
    public int      _columnid   = 0;
    public String   _comments   = new String();
    public boolean  _isPK       = false;
    public boolean  _isLastPK   = false;
}