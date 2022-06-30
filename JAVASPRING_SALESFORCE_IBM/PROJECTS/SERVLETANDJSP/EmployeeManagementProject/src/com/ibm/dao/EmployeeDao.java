package com.ibm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ibm.model.Employee;
import com.mysql.jdbc.Driver;

public class EmployeeDao {

	
	public void save(Employee e) throws SQLException{
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/ibm","root","root");
			
			PreparedStatement pstmt= con.prepareStatement
					("insert into employee values(?,?,?,?)");
			
		pstmt.setString(1,e.getFname());	
		pstmt.setString(2,e.getLname());
		pstmt.setString(3,e.getFthname());
		pstmt.setString(4, e.getMthname());
		
		pstmt.executeUpdate();
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	
	
}
