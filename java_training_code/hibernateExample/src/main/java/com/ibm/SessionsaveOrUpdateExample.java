package com.ibm;

import javax.transaction.Transaction;

import org.hibernate.Session;

public class SessionsaveOrUpdateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session=null;
		Transaction transaction=null;
		try {
			session= HibernateUtil.getSessionFactory().openSession();
			transaction=(Transaction) session.getTransaction();
			transaction.begin();
			
			
		}catch (Exception e) {
			// TODO: handle exception
			
		}

	}
}
