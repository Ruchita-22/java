package com.ibm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeDetails extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  response.setContentType("text/html");

	        PrintWriter out = response.getWriter();
	        
	        
	        String fname =  request.getParameter("fn");
	        String lname = request.getParameter("ln");
	        String gender = request.getParameter("rd1");
	        
	        String checkbox[] = request.getParameterValues("chk");

	        out.println("EMployeeDetails: "+"<br>");

	        out.println("FirstName is :"+fname+"<br>");
	        out.println("LastName is :"+lname+"<br>");
	        out.println("Gender is :"+gender+"<br>");
	        
	        out.println("Hobbies are : ");
	        
	        for(String ck :checkbox) {
	        out.println(ck);
	        }
		
		
		
		
	}
	
	
	
	
	
	
}
