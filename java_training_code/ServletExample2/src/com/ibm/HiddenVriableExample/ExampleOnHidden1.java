package com.ibm.HiddenVriableExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExampleOnHidden1
 */
public class ExampleOnHidden1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		String firstname=request.getParameter("fname");
		String lastname=request.getParameter("lname");
		
		out.println("<form action='ExampleOnHiddenServlet2'>");
			out.println("<input type='hidden' value='"+firstname+"' name='fn1'/>");
			out.println("<input type='hidden' value='"+lastname+"' name='ln1'/>");
			out.println("FatherName:<input type='text' name='ftn'/><br>");
			out.println("Mothername:<input type='text' name='ftn1'>");
			out.print("<input type='submit' value='store'>");
		out.println("</form>");
		
	}

}
