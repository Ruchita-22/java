package com.bankapp.model.service;

import java.util.List;

import com.bankapp.model.persistance.Account;

// per layer vs service layer
public interface AccountService {
	
	public void transferFund(int from, int to , int amount);
}
