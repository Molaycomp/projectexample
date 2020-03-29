import java.sql.*;  
class b{  
public static void main(String args[]){  
 try{  
   //String database="college.mdb";
   Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
  
   String url="jdbc:ucanaccess://college.mdb";  
  
  
   Connection c=DriverManager.getConnection(url);  
   Statement st=c.createStatement();  
   ResultSet rs=st.executeQuery("select * from student");  
    
   while(rs.next())
   
   {  
    System.out.println(rs.getString(1));  
   }  
  
}catch(Exception ee){System.out.println(ee);}  
  
}}


