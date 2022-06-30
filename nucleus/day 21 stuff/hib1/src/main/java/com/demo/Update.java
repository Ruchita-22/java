package com.demo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Update {

	public static void main(String[] args) {
		SessionFactory factory=
				new AnnotationConfiguration().configure("foo.cfg.xml").buildSessionFactory();
		
		Session session=factory.openSession(); // openSess vs getCurrSess
	
		Transaction tx=null;
		
		// servlet jsp and hibernate crud application!
		try{
			tx=session.beginTransaction();
			
			
			tx.commit();
		}catch(HibernateException ex){
			if(tx!=null){
				tx.rollback();
			}
		}
		
		

		Customer customer=(Customer) session.get(Customer.class, 3);
		//
		//
		session.clear();// is almost same as evictAll
		Customer customer2=(Customer) session.get(Customer.class, 3);
		
		System.out.println(customer);
		
		
		session.getTransaction().commit();
		
		session.close();
		
		
		factory.close();
	}
}
