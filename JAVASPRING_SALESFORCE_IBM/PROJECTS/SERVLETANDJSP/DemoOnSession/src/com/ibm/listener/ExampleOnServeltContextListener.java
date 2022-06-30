package com.ibm.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ExampleOnServeltContextListener  implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("servlet context object is destroyed");
		
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Servelt context object is initialized or created");
		
	}

}
