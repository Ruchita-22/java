package com.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf=
				Persistence.createEntityManagerFactory("jpa");
		
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		
		Book book=new Book("121", "java is kava", "college prof", 555.88);
		em.persist(book);
		System.out.println(em);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
