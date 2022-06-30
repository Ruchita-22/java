package com.ibm.dao;

import java.sql.Connection;
import java.sql.DriverManager;


import com.ibm.model.persistence.Employee;
import com.mysql.jdbc.PreparedStatement;

public class EmployeeDao {
	
	Connection connection;
	
	public EmployeeDao() {
		try {
		
		Class c=Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ruchita","root", "mysql");
		System.out.println("conection establish");
		}catch(Exception e){
			System.out.println(e);
			
		}
		
	}
	
	public void save(Employee employee) {
		try {
			
			String sql="insert into emp values (?,?,?,?)";
			
			PreparedStatement statement=(PreparedStatement) connection.prepareStatement(sql);
			statement.setString(1, employee.getFirstname());
			statement.setString(2, employee.getLastname());
			statement.setString(3, employee.getFatherName());
			statement.setString(4, employee.getMotherName());
			
			int i=statement.executeUpdate(sql);
			System.out.println(i);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public Employee find() {
		
		String sql="";
		
		
		return employee;
		
		
	}
	
	
}



