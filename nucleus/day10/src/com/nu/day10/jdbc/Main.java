package com.nu.day10.jdbc;

import java.sql.*;

public class Main {

	public static void main(String[] args) {

		
		/*
		 * <property value="jdbc:oracle:thin:@finn:1521:orcl" name="url"/>
 
<property value="oracle.jdbc.driver.OracleDriver" name="driverClassName"/>
 
<property value="hr" name="username"/>
 
<property value="hr" name="password"/>
 
</bean>
 
 
 
 
OR
 
<property value="jdbc:oracle:thin:@10.1.50.198:1521:orcl" name="url"/>
 
<property value="oracle.jdbc.driver.OracleDriver" name="driverClassName"/>
 
<property value="sh" name="username"/>
 
<property value="sh" name="password"/>
 
</bean>

F
		 */
		// load the driver
		Connection connection =null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// log4j ?
			System.out.println("code yaha tal chal raha");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}

		try {
			 connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@finn:1521:orcl", "hr", "hr");
			System.out.println("conn is done");

			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
			while (rs.next()) {
				System.out.print(rs.getInt("employeeId") + " ");
				System.out.print(rs.getString("employeeName") + " ");
				System.out.println(rs.getDouble("employeeSalary"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				if(connection!=null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		/*
		 * 1. load the driver 2. get conn object simple powerful then simple
		 * statement stored proc.
		 * 
		 * 3. get Statement | preparedStement | callableStatemnt
		 * 
		 * preparedStement: more faster, use precompiled set of quaries Driver
		 * can cache the quaries
		 * 
		 * more secure: avoid sql injection
		 * 
		 * select * from emp where id=6655 or 1=1;
		 */
	}
}
