import java.sql.*;

class MySQLHelper {
public static Connection getMySqlDBConnection()
{
  // get Mysql db conncetion using conncetion paramenter
  return null;
}
}


class OracleHelper {
public static Connection getOracleDBConnection()
{

return null;

}
}

class HelperFacade {
static Connection getConnection(String type)
{
Connection con = null;

if(type.equals("oracle"))
{

con = OracleHelper.getOracleDBConnection();

}else if(type.equals("mysql"))
{
con = MySQLHelper.getMySqlDBConnection();
}

}


public class Demo2 {
public static void main(String[] args)
{
Connection con;
con = HelperFacade.getConnection("oracle");

}
}

