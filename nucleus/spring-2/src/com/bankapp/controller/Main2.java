package com.bankapp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bankapp.AppConfig;
import com.bankapp.model.service.AccountService;

public class Main2 {

	public static void main(String[] args) {
		ApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		AccountService accountService=
				ctx.getBean("as",AccountService.class );
		
		
		accountService.transferFund(1, 2, 1000);
	}
}

