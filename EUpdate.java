import java.sql.*;
class EUpdate
 {
public static void main(String a[])
 {
Connection c;
try
 {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
c=DriverManager.getConnection("jdbc:odbc:dsn5");
PreparedStatement ps=c.prepareStatement("Update Employee set Ename=?,Design=?,where EId=?");
ps.setInt(3,Integer.parseInt(a[0]));
ps.setString(1,a[1]);
ps.setString(2,a[2]);
int k=ps.executeUpdate();
if(k>0)
System.out.println("Record Successfully Updated");
c.close();
}catch(Exception e)
 {
System.out.println(e);
 }
}
}