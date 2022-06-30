package com.demo.one2one;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class GettingListOfAllEmployeeWithParking {

	public static void main(String[] args) {
		SessionFactory factory = new AnnotationConfiguration().configure(
				"foo.cfg.xml").buildSessionFactory();

		Session session = factory.openSession();
		session.getTransaction().begin();

		List<Parking> list = session.createQuery("from Parking").list();

		for (Parking parking : list) {
			s
			System.out.println(parking.getParkingLocation());
			System.out.println(parking.getEmployee().getEmpName());
		}

		/*
		 * List<Parking> list=session
		 * .createQuery("from Parking p join fetch p.employee Employee").list();
		 */

		// "from MobileVendor mobileVendor join fetch mobileVendor.phoneModel PhoneModels"

		// Criteria criteria = session.createCriteria(Parking.class);
		// criteria.setFetchMode("employee",FetchMode.EAGER);

		// List<Parking> list=session.createQuery("from Parking").list();

		/*
		 * for(Parking parking: list) {
		 * System.out.println(parking.getParkingLocation());
		 * System.out.println(parking.getEmployee().getEmpName()); }
		 */
		/*
		 * Employee employee1=new Employee("A"); Employee employee2=new
		 * Employee("A"); Employee employee3=new Employee("A");
		 * 
		 * Parking parking1=new Parking("loc a"); Parking parking2=new
		 * Parking("loc b"); Parking parking3=new Parking("loc c");
		 * 
		 * parking1.setEmployee(employee1); parking2.setEmployee(employee2);
		 * parking3.setEmployee(employee3);
		 * 
		 * session.save(parking1); session.save(parking2);
		 * session.save(parking3);
		 * 
		 * session.save(employee1); session.save(employee2);
		 * session.save(employee3);
		 */

		session.getTransaction().commit();

		/*
		 * List<Parking> list=session.createQuery("from Parking").list();
		 * 
		 * 
		 * List<Parking> list=session.createQuery("from Parking").list();
		 * 
		 * 
		 * 
		 * session.getTransaction().commit();
		 * 
		 * 
		 * session.getTransaction().commit();
		 */
		session.close();

		for (Parking parking : list) {
			System.out.println(parking.getParkingLocation());
			System.out.println(parking.getEmployee().getEmpName());
		}

		factory.close();
	}
}
