package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class CreateDatabase {

	static final String x= "com.mysql.jdbc.Driver";
	static final String y= "jdbc:mysql://localhost/ibm";
	static final String USER="root";
	static final String PASS="snehil";
	public static void main (String[] args){
		Connection conn= null;
		Statement stmt = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database");
			conn= DriverManager.getConnection(y, USER,PASS);
			System.out.println("Creating database..........");
			stmt= conn.createStatement();
			String sql ="CREATE DATABASE IBM310";
			//String sql="select * from emp";
			stmt.execute(sql);
			System.out.println("database created successfully");
		}catch(Exception se) {
			se.printStackTrace();
		}finally {
			try {
				if(stmt!=null)
					stmt.close();
			}catch(Exception se2) {}
			System.out.println("byebye");
		}

	}
}