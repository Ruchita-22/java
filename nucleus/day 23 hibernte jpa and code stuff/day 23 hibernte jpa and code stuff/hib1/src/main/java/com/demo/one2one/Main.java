package com.demo.one2one;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import java.util.*;
public class Main {

	
	public static void main(String[] args) {
		SessionFactory factory=
			new AnnotationConfiguration().configure("foo.cfg.xml").buildSessionFactory();
		
		Session session=factory.openSession();
		session.getTransaction().begin();
		Parking parking=new Parking("loc E");
		Employee employee=new Employee("E");
		
		parking.setEmployee(employee);
		
		session.save(employee);
		session.flush();
		session.save(parking);
		
		
	
		
		
		/*Parking parking2=new Parking("loc B");
		Employee employee2=new Employee("B");
		
		parking2.setEmployee(employee2);
		employee2.setParking(parking2);
		
		session.save(employee2);
		session.save(parking2);
		
		
		Parking parking3=new Parking("loc C");
		Employee employee3=new Employee("C");
		
		parking3.setEmployee(employee3);
		employee3.setParking(parking3);
		
		session.save(employee3);
		session.save(parking3);*/
		
		
		
		session.getTransaction().commit();
		
		session.close();
		
		
		factory.close();
	}
}
