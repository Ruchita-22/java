package com.ibm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExampleOnHiddenServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
		response.setContentType("text/html");
		
		//1
		String fname=  request.getParameter("fn");
		String lname = request.getParameter("ln");
		
		PrintWriter out = response.getWriter();
		
		out.println("<form action='ehd2'>");
        //2
		out.println("<input type='hidden' value='"+fname+"' name='fn1' />");
		out.println("<input type='hidden' value='"+lname+"' name='ln1' />");
		//3
		out.println("FatherName : <input type='text' name='ftn' /><br>");
		out.println("MotherName : <input type='text' name='mtn' /><br>");
		out.println("<input type='submit' value='store'/>");
		
		
		
		
		out.println("</form>");
		
		
		
		
		
	}

}
