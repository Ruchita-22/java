package com.controllers.listners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
// for app monitoring
public class DemoServletContextAttributeListner implements
		ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
			System.out.println("added");
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		System.out.println("removed");
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		System.out.println("replace");
	}

}
