package com.bankapp.controller;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bankapp.model.service.AccountService;

//Spring mvc
public class Main {

	public static void main(String[] args) {
		
		/*ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("banks.xml");
		
		AccountService accountService=
				applicationContext.getBean("as",AccountService.class );
		
		
		accountService.transferFund(1, 2, 1000);*/
		PropertyPlaceholderConfigurer a=new PropertyPlaceholderConfigurer();
		if(a instanceof BeanFactoryPostProcessor)
			System.out.println("y");
		else
			System.out.println("n");
	}
}
