package com.ibm.threadExample;

class Customer{  
	int amount=10000;  

	synchronized void withdraw(int amount){  
		System.out.println("going to withdraw...");  
	
		if(this.amount<amount){  
		System.out.println("Less balance; waiting for deposit...");  
		System.out.println(this.amount);
		try{
			wait();
			}catch(Exception e){}  
		}  
		this.amount-=amount;  
		System.out.println(this.amount);
		System.out.println("withdraw completed...");  
	}  
	
	synchronized void deposit(int amount){  
	System.out.println("going to deposit...");  
	System.out.println(this.amount);
	this.amount+=amount;  
	System.out.println(this.amount);
	System.out.println("deposit completed... ");  
	notify();  
	}  
}  

