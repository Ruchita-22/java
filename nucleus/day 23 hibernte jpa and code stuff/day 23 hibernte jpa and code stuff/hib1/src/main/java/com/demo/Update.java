package com.demo;

import org.hibernate.HibernateException;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Update {

	public static void main(String[] args) {
		SessionFactory factory=
				new AnnotationConfiguration().configure("foo.cfg.xml").buildSessionFactory();
		
		
		//first level cache by default and u cant disable them
		//scope of 1st level cache=session
		
		// if u try to load same object in two different session
		// then object is gona to be loaded twice
		
		// what is the effect of get vs load
		
		/*
		 * --------------------------
		 * anntations, reflection: u create ur own small framework!
		 * JVM, durga sir videos on jvm
		 * -----------------------------------
		 * 
		 */
		
		Class c=Customer.class;
		
		// 1 st session
		Session session=factory.openSession(); // openSess vs getCurrSess
		session.getTransaction().begin();
		Customer customer=(Customer) session.get(Customer.class, 1);
		System.out.println(customer);
		customer.setCustomerName("foo");
		session.getTransaction().commit();
		session.close();
	
		
		// 2 st session
		Session session2=factory.openSession(); // openSess vs getCurrSess
		session2.getTransaction().begin();
		Customer customer3=(Customer) session2.get(Customer.class, 1);
		
		customer3.setCustomerAddess("banglore A");
		session2.merge(customer3);
		customer3.setCustomerAddess("banglore B");
		session2.getTransaction().commit();
		session2.close();
		
		factory.close();
		
		
		/*Session session=factory.openSession(); // openSess vs getCurrSess

		session.getTransaction().begin();
		
		Customer customer=(Customer) session.get(Customer.class, 1);
	
		
		Customer customer2=(Customer) session.get(Customer.class, 1);
		
		System.out.println(customer);
		
		
		session.getTransaction().commit();
		
		session.close();
		
		
		Session session2=factory.openSession(); // openSess vs getCurrSess

		session2.getTransaction().begin();
		
		Customer customer3=(Customer) session2.get(Customer.class, 1);
	
		
		System.out.println(customer3);
		
		
		session2.getTransaction().commit();
		
		session2.close();
		
		
		
		factory.close();
		
		*/
		
		
/*Transaction tx=null;
		
		// servlet jsp and hibernate crud application!
		try{
			tx=session.beginTransaction();
			
			
			tx.commit();
		}catch(HibernateException ex){
			if(tx!=null){
				tx.rollback();
			}
		}*/
	}
}
