package com.ibm.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springConfig.xml");
		CustomerService customerService=(CustomerService) applicationContext.getBean("customerService");
		
		customerService.setMessage("Message by custA");
		System.out.println("Message:"+customerService.getMessage());
		
		CustomerService customerService2=(CustomerService) applicationContext.getBean("customerService");
		System.out.println("Message:"+customerService2.getMessage());
		

	}

}
