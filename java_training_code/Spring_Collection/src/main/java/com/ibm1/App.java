package com.ibm1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring_Config.xml");
		Customer customer=(Customer) applicationContext.getBean("CustomerBean");
		
		System.out.println(customer);
		
		

	}

}
