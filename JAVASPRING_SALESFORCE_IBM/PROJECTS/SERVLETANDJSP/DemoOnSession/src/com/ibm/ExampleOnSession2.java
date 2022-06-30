package com.ibm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ExampleOnSession2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
       HttpSession session = request.getSession(false);
       
      /* System.out.println("id is"+session.getId());
       
      Object o =  session.getAttribute("username");
      
      String uname=(String)o;
      
      PrintWriter out  = response.getWriter();
      
      out.println("username is "+uname);
       */
       session.invalidate(); //to remove session object
		
       PrintWriter out  = response.getWriter();
       out.println("<a href='login.html'>Click Here to Login Again</a>");	
		
	}

}
