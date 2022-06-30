<%@ page import="java.sql.*"%>

<% 


  //1)register the driver 
    Class.forName("com.mysql.jdbc.Driver");
   // DriverManager.registerDriver(new com.mysql.jdbc.Driver());
   
  //2 get the connection
  
    Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/ibm",
    		                                                "root","root");
  //3create statment or prepared statment object
    
    Statement stmt = con.createStatement();
         
 //4 execute the queries
  //non-select --int executeUpdate() -
  //select  --- ResultSet executeQuery()
     
    ResultSet rs  = stmt.executeQuery("select * from emp");
  
    while(rs.next()){
    	
    	
     out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
     out.println("<br>");
    	
    }
  
     
  //5 close the connection, statement or preparestatement object
  
  stmt.close();
  
  con.close();
  
  
  
    

   








%>

