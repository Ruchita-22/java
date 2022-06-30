package com.ibm.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ExampleOnServletContextListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("Servlet Context object is destroy");
    }

	
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("Servlet Context object is created");
    }
	
}
