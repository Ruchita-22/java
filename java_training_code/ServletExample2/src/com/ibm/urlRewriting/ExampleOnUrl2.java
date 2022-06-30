package com.ibm.urlRewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExampleOnUrl2
 */
public class ExampleOnUrl2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		
		
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		out.println("firstname: "+fname+" lastname:"+lname);
		
	}
       
   
}
