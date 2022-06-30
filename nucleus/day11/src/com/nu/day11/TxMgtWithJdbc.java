package com.nu.day11;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.nu.customerapp.model.persistance.ConnectionFactory;

public class TxMgtWithJdbc {

	public static void main(String[] args) {
		// bank=> customer table=> A B 50

		Connection connection = ConnectionFactory.getConnection();

		Statement statement;
		try {
			connection.setAutoCommit(false);

			statement = connection.createStatement();

			statement
					.addBatch("update account set currentBalance = currentBalance - 100 where id=1");
			statement
					.addBatch("update account set savingBalance = savinBalance + 100 where id=1");

			statement.executeBatch();
			
			/*
			 * let say we hv 1 lac rec
			 * 
			 * while( till rec last){
			 * 	create batch of 100 job at a time
			 *  hti the database for that batch in case i get ahead  commit
			 *  
			 * 
			 * }
			 * 
			 * 
			 */
			connection.commit();

		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {

				e1.printStackTrace();
			}

			e.printStackTrace();
		} finally {

			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
