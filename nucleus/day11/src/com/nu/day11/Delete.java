package com.nu.day11;

import java.sql.*;

public class Delete {

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
			
			stmt=connection.
					prepareStatement("delete from employee where employeeId=?");
			stmt.setInt(1, 2);
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
