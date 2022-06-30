package com.demo.collection;
import java.util.*;
public class Bank {
	private String bankName;
	private List<Account> accounts=new ArrayList<Account>();
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	public void printBankDetails(){
		System.out.println("bank name:"+ bankName);
		for(Account account: accounts)
			System.out.println(account);
	}
	
}
