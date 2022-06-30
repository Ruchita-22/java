package com.ibm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExampleOnServletConfig
 */
public class ExampleOnServletConfig extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
	ServletConfig config = getServletConfig();
	
	String driver =  config.getInitParameter("drv");
	String url = config.getInitParameter("url");
	String username = config.getInitParameter("username");
	
	
	PrintWriter out = response.getWriter();
	
	out.println("Connection details using ServletConfig object"+"<br>");
	out.println("driver class name is :"+driver+"<br>");
	out.println("url  is :"+url+"<br>");
	out.println("username is :"+username+"<br>");	
		
	
		
	}

}
