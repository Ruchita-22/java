package com.bankapp.model.persistance;
import java.util.*;
public interface AccountDao {
	public void addAccount(Account account);
	public void update(Account account);
	public Account find(int id);
	public List<Account> getAllAccounts();
}
