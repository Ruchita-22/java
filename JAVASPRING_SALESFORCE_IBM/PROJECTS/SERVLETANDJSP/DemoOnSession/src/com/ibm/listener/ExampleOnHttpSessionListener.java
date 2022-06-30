package com.ibm.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class ExampleOnHttpSessionListener implements HttpSessionListener {

	ServletContext ctx=null;
	int totalUsers=0;
	int currentUser=0;
	
	@Override
	public void sessionCreated(HttpSessionEvent he) {
		
		totalUsers++;
		currentUser++;
		
		ctx = he.getSession().getServletContext();
		
		ctx.setAttribute("total",totalUsers);
		ctx.setAttribute("current",currentUser);
		
       System.out.println("session object is created ");
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent he) {
		
		currentUser--;
		
		ctx.setAttribute("current",currentUser);
		System.out.println("session object is destroyed");
		
		
	}

}
