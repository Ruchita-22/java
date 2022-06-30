package com.ibm.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
   static Connection con=null;
   
	public static Connection getConnect() {
		
		  try {
			
			  Class.forName("com.mysql.jdbc.Driver");
			
	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibm","root","root");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return con;
		
	}
	
	
	
	
	
	
	
}
