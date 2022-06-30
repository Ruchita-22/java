package com.bankapp.model.persistance;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
//@Repository //@Component + exception wrapper*
public class AccountDaoImpUsingCollection implements AccountDao {

	private Map<Integer, Account> accouts = new HashMap<Integer, Account>();

	{
		accouts.put(1, new Account(1, "raja", 5000));
		accouts.put(2, new Account(2, "ravi", 1000));
	}

	@Override
	public void update(Account account) {
		accouts.put(account.getId(), account);
	}

	@Override
	public Account find(int id) {
		return accouts.get(id);
	}
}
