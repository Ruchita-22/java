package com.demo.many2many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new AnnotationConfiguration().configure(
				"foo.cfg.xml").buildSessionFactory();

		Session session = factory.openSession(); // openSess vs getCurrSess

		session.getTransaction().begin();

		Employee employee=(Employee) session.get(Employee.class, 1);
		session.delete(employee);
		/*Employee employee = new Employee();
		
		Project project = new Project();
		Project project2 = new Project();
		
		employee.setEmpName("amit");
		employee.getProjects().add(project);

		project.setProjectName("training");
		project.getEmployees().add(employee);

		project2.setProjectName("yet another training");
		project2.getEmployees().add(employee);

		session.save(employee);*/
		//session.save(project2);
		//session.save(project);
		session.getTransaction().commit();

		session.close();
		factory.close();
	}

}
