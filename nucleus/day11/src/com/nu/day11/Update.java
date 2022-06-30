package com.nu.day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * 1. every class hv code of loading the driver
 * 	would be too bad in web app
 * 
 * 2. we should property file to get db info=> loosly coupled from the change
 * 		change is the only const in life
 * 3. we hv dao/dto
 *
 * 
 */
public class Update {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver is loaded...");
		} catch (ClassNotFoundException ex) {

		}
		// 2. get the conn

		Connection connection = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			connection = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/nu_pr", "root", "root");

			// Java dev ===== Admin(DB)
			// desc table Foo => ResutSetMeta vs 
			
			//DatabaseMetaData vs ResultSetMetaData
			
			stmt=	connection.prepareStatement("update employee set employeeName=? ,employeeSalary=? where employeeId=?");
			
			stmt.setString(1, "foo");
			stmt.setDouble(2, 333377);
			stmt.setInt(3, 2888);
			stmt.executeUpdate();
			
			
			// want to insert
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
