package com.nu.day11;
import java.sql.*;

import com.nu.customerapp.model.persistance.ConnectionFactory;

public class HelloStoreProcedure {
	
	public static void main(String[] args) {
	
		Connection con=ConnectionFactory.getConnection();
		
		
		CallableStatement cstmt;
		try {
			cstmt = con.prepareCall("call Test(?,?,?)");
			cstmt.setInt(1, 3);
			cstmt.setInt(2, 44);
			cstmt.registerOutParameter(3, Types.INTEGER);
			cstmt.execute();
			System.out.println("Result:"+cstmt.getInt(3));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
