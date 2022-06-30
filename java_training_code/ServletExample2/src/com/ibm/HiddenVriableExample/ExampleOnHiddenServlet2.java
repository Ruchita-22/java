package com.ibm.HiddenVriableExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.LASTORE;

import sun.launcher.resources.launcher;

/**
 * Servlet implementation class ExampleOnHiddenServlet2
 */
public class ExampleOnHiddenServlet2 extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		String fname=request.getParameter("fn1");
		String lname=request.getParameter("ln1");
		String fathername=request.getParameter("ftn");
		String mothername=request.getParameter("ftn1");
		
		out.println("FirstName is:"+fname+"<br");
		out.println("LastName is:"+lname+"<br>");
		out.println("Father Name:"+fathername+"<br>");
		out.println("Mother Name:"+mothername+"<br>");
		out.println("</form>");
		
	}

}

