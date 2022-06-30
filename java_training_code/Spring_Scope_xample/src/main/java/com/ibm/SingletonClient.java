package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springConfig.xml");
		
		for (int i = 0; i < 5; ++i) {
			TestBean testBean=(TestBean) applicationContext.getBean("singleton1");
			testBean.printCount();
			
		}
		for (int i = 0; i < 5; ++i) {
			TestBean testBean=(TestBean) applicationContext.getBean("prototype1");
			testBean.printCount();
			
		}
		for (int i = 0; i < 5; ++i) {
			TestBean testBean=(TestBean) applicationContext.getBean("singleton2");
			testBean.printCount();
			
		}

	}

}
