package com.ibm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ExampleOnServletContext extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

   ServletContext application = getServletContext();
   
   String driver = application.getInitParameter("drv");
		
   String url = application.getInitParameter("url");
   
   String username= application.getInitParameter("username");
   

	PrintWriter out = response.getWriter();
	
	out.println("Connection details using ServletContext object"+"<br>");
	out.println("driver class name is :"+driver+"<br>");
	out.println("url  is :"+url+"<br>");
	out.println("username is :"+username+"<br>");	
		
   
   
		
		
	}

}
