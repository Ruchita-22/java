package com.demo;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class ShowAll {
	
	public static void main(String[] args) {
		SessionFactory factory=
		new AnnotationConfiguration().configure("foo.cfg.xml").buildSessionFactory();
		
		Session session=factory.openSession(); // openSess vs getCurrSess
		
		// transient <--------> persistance<-------------->detached
		
		Customer customer=new Customer( "umesh"	, "noida");// tr
		
		//from Customer => HQL=> Query parser=> sql=> database=> rs=> get all tuples => wrap then in customer object
		List<Customer> customers=session.createQuery("from Customer").list();
		
		for(Customer customer2:customers)
			System.out.println(customer2.getCustomerName());
	
		
		session.close();
		
		
		factory.close();
	}

}
