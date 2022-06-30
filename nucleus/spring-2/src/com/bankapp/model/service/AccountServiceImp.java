package com.bankapp.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.model.persistance.Account;
import com.bankapp.model.persistance.AccountDao;

public class AccountServiceImp implements AccountService{
	
	private AccountDao accountDao;
	
	public AccountServiceImp() {}

	public AccountServiceImp(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	@Override
	public void transferFund(int from, int to, int amount) {
		if(accountDao!=null)
		System.out.println("fund is transferd...");
	}
}
