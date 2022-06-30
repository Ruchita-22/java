package com.nu.day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class AddNewRecord {

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

			
			stmt=connection
					.prepareStatement
					("insert into employee(employeeId ,employeeName ,employeeSalary) values(?,?,?)");

			stmt.setInt(1, 2888);
			stmt.setString(2, "rajiv");
			stmt.setDouble(3, 3333.6);
			
			int noOfRowsEffecteted=stmt.executeUpdate();
			System.out.println(noOfRowsEffecteted);
			
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
