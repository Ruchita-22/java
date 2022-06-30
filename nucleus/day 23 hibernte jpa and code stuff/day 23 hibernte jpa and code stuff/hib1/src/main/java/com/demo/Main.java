package com.demo;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	/*
	 * crud operation: showAll ,add delete, findOne, update
	 */
	public static void main(String[] args) {
		SessionFactory factory=
			new AnnotationConfiguration().configure("foo.cfg.xml").buildSessionFactory();
		
		Session session=factory.openSession(); // openSess vs getCurrSess
			
		Customer customer=new Customer("umesh"	, "noida");// tr
		
		session.getTransaction().begin();
		Integer save = (Integer) session.save(customer);
		System.out.println(save);
		session.getTransaction().commit();
		
		session.close();
		
		
		factory.close();
	}
}
