package com.bankapp.model.persistance;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


public class AccountDaoImpUsingJdbc implements AccountDao{
	
	private DataSource datasource;
	
	public AccountDaoImpUsingJdbc(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public void addAccount(Account account) {
		try {
			Connection connection=datasource.getConnection();
			if(connection!=null)
			System.out.println("conn is done");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Account account) {
		
	}

	@Override
	public Account find(int id) {

		return null;
	}

	@Override
	public List<Account> getAllAccounts() {
		return null;
	}

}
