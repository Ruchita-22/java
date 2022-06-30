package com.ibm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ExampleOnUrl1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String fn = request.getParameter("fn");
		String ln = request.getParameter("ln");
		
		PrintWriter out = response.getWriter();
		
		out.println("<a href='eurl2?fname="+fn+"&lname="+ln+"'>ClickHeretoDisplay</a>");
		
		
		
		
		
	}

	
}
