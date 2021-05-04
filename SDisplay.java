import java.sql.*;
class SDisplay
{
 public static void main(String a[])
 { 
  Connection c;
  try
  {
  Class.forName("sun.jdc.odbc.jdbcodbcDriver");  
  Statement s=c.createStatement();
  ResultSet rs=s.excuteQuery("select*from student");
  while(rs.next())
  System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3));
  c.close();
  }
  catch(Exception e)
  {
  System.out.println(e);
 }
  }
                                                                                                                                                                                               