package com.ibm.service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the values from login.html
		
	    String uname = request.getParameter("un");
		String password  = request.getParameter("pwd");
		
		//validation
		if(uname.equals("admin") && password.equals("admin")) {
			
		RequestDispatcher rd  = request.getRequestDispatcher("success.html");
		rd.include(request,response);
				
		}else {
			
			RequestDispatcher rd  = request.getRequestDispatcher("failure.html");
			rd.include(request,response);
				
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
