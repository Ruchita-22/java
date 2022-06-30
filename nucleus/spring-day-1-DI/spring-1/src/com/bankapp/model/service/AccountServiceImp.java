package com.bankapp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.model.persistance.Account;
import com.bankapp.model.persistance.AccountDao;
//@Service //@Component
public class AccountServiceImp implements AccountService{

	
	@Autowired
	private AccountDao accountDao;
	
	public AccountServiceImp(AccountDao accountDao) {
		this.accountDao = accountDao;
	}



	//BL= logic of business ie is imp using crud op + ccc(sec tx logging caching)+ jms email ws
	// service laye is 80% of project ie brain of the project 
	@Override
	public void transferFund(int from, int to, int amount) {
		
		Account fromAccount=accountDao.find(from);
		Account toAccount=accountDao.find(to);
		
		fromAccount.setBalance(fromAccount.getBalance()-amount);
		toAccount.setBalance(toAccount.getBalance()+amount);
		
		accountDao.update(fromAccount);
		accountDao.update(toAccount);
		
		System.out.println("fund is transferd...");
	}
}
