package com.controllers.listners;

import java.sql.Connection;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.model.persistance.ConnectionFactory;

public class ConnectionInitListner implements ServletContextListener {
	private Connection connection=null;
	public void contextInitialized(ServletContextEvent event) {
		connection=ConnectionFactory.getConnection();
		event.getServletContext().setAttribute("connection",connection);
	}

	public void contextDestroyed(ServletContextEvent event) {
		ConnectionFactory.getConnection();
		event.getServletContext().removeAttribute("connection");
		connection=null;
	}

}
