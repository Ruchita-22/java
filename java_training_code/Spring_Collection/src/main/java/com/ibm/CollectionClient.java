package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring_Config.xml");
		
		CollectionBean collectionBean=(CollectionBean) applicationContext.getBean("collectionExample");
		
		System.out.println(collectionBean.getTheList());
		System.out.println(collectionBean.getTheSet());
		System.out.println(collectionBean.getTheMap());
		System.out.println(collectionBean.getTheProperties());
		
		

	}

}
