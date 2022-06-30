package com.ibm.listeners;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class ExampleOnHttpSessionListener implements HttpSessionListener {

    ServletContext ctx=null;
    int totalUser=0;
    int currentUser=0;
    
    public void sessionCreated(HttpSessionEvent httpSessionEvent)  { 
         // TODO Auto-generated method stub
    	totalUser++;
    	currentUser++;
    	ctx=httpSessionEvent.getSession().getServletContext();
    	ctx.setAttribute("totalUser", totalUser);
    	ctx.setAttribute("currentUser", currentUser);
    	System.out.println("session object is created");
    }


    public void sessionDestroyed(HttpSessionEvent httpSessionEvent)  { 
         // TODO Auto-generated method stub
    	currentUser--;
    	ctx.setAttribute("currentUser", currentUser);
    	System.out.println("session object is destroy");
    	
    }
	
}
