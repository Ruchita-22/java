package com.demo.composite;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory=
				new AnnotationConfiguration().configure("foo.cfg.xml")
				.buildSessionFactory();
			
			Session session=factory.openSession(); // openSess vs getCurrSess
				
			CustomerKey customerKey=new CustomerKey(192, "bac 123");
			
			Customer customer=new Customer(customerKey, "raja", "delhi");
			session.getTransaction().begin();
			session.save(customer);
			
			session.getTransaction().commit();
			
			session.close();
		
			factory.close();
	}
}
