import java.sql.*;
class EDelete
 {
public static void main(String a[])
 {
Connection c;
try
 {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
c=DriverManager.getConnection("jdbc:odbc:dsn5");
PreparedStatement ps=c.prepareStatement("Delete*from Employee where EId=?");
ps.setInt(1,Integer.parseInt(a[0]));
int k=ps.executeUpdate();
if(k>0)
System.out.println("Record Successfully Deleted");
c.close();
}catch(Exception e)
 {
System.out.println(e);
 }
}
}