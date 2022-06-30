package com.ibm;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;

public class HibernateUtil {

	public static StandardServiceRegistry registry;
	public static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();

				Map<String, String> settings = new HashMap();
				settings.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
				settings.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/ibm_spring");
				settings.put("hibernate.connection.username", "root");
				settings.put("hibernate.connection.password", "db2admin");
				settings.put("hibernate.show_sql", "true");
				settings.put("hibernate.hbm2ddl.auto", "update");

				registryBuilder.applySettings(settings);


				registry = registryBuilder.build();


				MetadataSources sources = new MetadataSources(registry).addAnnotatedClass(Customer.class);

				Metadata metadata = sources.getMetadataBuilder().build();

				sessionFactory = metadata.getSessionFactoryBuilder().build();

			}
			catch (Exception  e) {
				System.out.println("Session factory creation failed");
				if(registry!=null) {
					StandardServiceRegistryBuilder.destroy(registry);
				}
			}

			}
		return sessionFactory;
	}}