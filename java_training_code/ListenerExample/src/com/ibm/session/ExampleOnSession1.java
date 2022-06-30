package com.ibm.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class ExampleOnSession1
 */
public class ExampleOnSession1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		 HttpSession session = request.getSession(true);
	     
	     ServletContext application=getServletContext();
	     Integer totalUser= (Integer) application.getAttribute("totalUser");
	     Integer currentUser= (Integer) application.getAttribute("currentUser");
	     out.println("total user logged in:"+totalUser+"<br>");
	     out.println("Current User logged in:"+currentUser+"<br>");
	     out.println("<a href='ExampleOnSession2'>Click here to logout</a>");
	     
	     
	     
	     
		}

}