package com.ibm.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ExampleOnCookie2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();

		  Cookie ck[] = request.getCookies();
		  
		   out.println("Displaying the usrname from the cookie object"+"<br>");
		 
		out.println(ck[0].getName()+"  "+ck[0].getValue());
		
		
		
		
		
		
	}

}
