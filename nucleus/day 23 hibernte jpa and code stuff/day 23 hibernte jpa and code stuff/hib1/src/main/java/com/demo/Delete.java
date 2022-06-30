package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Delete {

	public static void main(String[] args) {
		SessionFactory factory = new AnnotationConfiguration().configure(
				"foo.cfg.xml").buildSessionFactory();

		Session session = factory.openSession(); // openSess vs getCurrSess

		session.getTransaction().begin();

		Customer customer = (Customer) session.get(Customer.class, 2);// get vs
																		// load
		session.delete(customer);

		session.getTransaction().commit();

		session.close();

		factory.close();
	}
}
