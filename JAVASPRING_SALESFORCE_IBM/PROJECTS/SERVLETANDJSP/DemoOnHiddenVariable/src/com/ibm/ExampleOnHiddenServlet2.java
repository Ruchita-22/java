package com.ibm;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ExampleOnHiddenServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 response.setContentType("text/html");
           //first form details from hidden input tag
		  String fname = request.getParameter("fn1");
		  String lname = request.getParameter("ln1");
		
		  //second form details
		  String fathername = request.getParameter("ftn");
		  String mothername = request.getParameter("mtn");
		  
		  PrintWriter out = response.getWriter();
		  
		  out.println("FirstName is : "+fname+"<br>");
		  out.println("LastName is : "+lname+"<br>");
		  out.println("FatherName is : "+fathername+"<br>");
		  out.println("MotherName is : "+mothername+"<br>");
		  
		   try {
			   
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			
			 Class.forName("com.mysql.jdbc.Driver");
			   
			try {
				/*Connection con = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","ibm","ibm");
				*/
				Connection con = DriverManager.getConnection
						("jdbc:mysql://localhost:3306/ibm","root","root");
				
				
				PreparedStatement pstmt = con.prepareStatement
						         ("insert into employeee values(?,?,?,?)");
				
				pstmt.setString(1,fname);
				pstmt.setString(2,lname);
				pstmt.setString(3,fathername);
				pstmt.setString(4,mothername);
				
				int i = pstmt.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
		  
		  
		  
		  
		
		
		
		
		
	}

}
