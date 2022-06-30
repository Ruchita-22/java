package com.bankapp.ui.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bankapp.model.service.AccountService;

public class AccountController {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("banks.xml");
		
		AccountService accountService=
				applicationContext.getBean("as",AccountService.class );
		
		
		accountService.transferFund(1, 2, 1000);
	}
}
