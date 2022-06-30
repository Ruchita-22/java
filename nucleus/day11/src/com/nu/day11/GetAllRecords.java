package com.nu.day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

// hello world
public class GetAllRecords {
	// LAMP=> mysql : 127.0.0.1:3306, ui
	public static void main(String[] args) {

		/*
		 * try { Class.forName("com.nu.day11.Foo"); } catch
		 * (ClassNotFoundException e) { e.printStackTrace(); }
		 */
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver is loaded...");
		} catch (ClassNotFoundException ex) {

		}
		// 2. get the conn

		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		try {
			connection = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/nu_pr", "root", "root");
			System.out.println("conn is done");
			
			statement=connection.createStatement();
			rs=statement.executeQuery("select * from employee");
			while(rs.next()){
				System.out.print(rs.getInt("employeeId")+" ");
				System.out.print(rs.getString("employeeName")+" ");
				System.out.println(rs.getDouble("employeeSalary"));
				
		        }
			
			ResultSetMetaData rsMeta=rs.getMetaData();
			System.out.println("No of column:"+rsMeta.getColumnCount());
			
			for(int i=1;i<=rsMeta.getColumnCount();i++){
				System.out.println(rsMeta.getColumnClassName(i));
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		finally{
			try {
				if(connection!=null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}










