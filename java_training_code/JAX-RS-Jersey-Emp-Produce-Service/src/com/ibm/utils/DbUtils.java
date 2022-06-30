package com.ibm.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtils {
	static Connection connection=null;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/ruchita","root","mysql");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
}



//http://localhost:8082/JAX-RS-Jersey-Emp-Produce-Service/rest/getemp/details?eid=234