package com.ibm.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExampleOnCookie1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
		response.setContentType("text/html");
		
	  //1 get the form field values from the login.html
      String uname=  request.getParameter("un");
      String password = request.getParameter("pwd");
      
      
      
      //2) write a code to store the username inside the cookie object
      //and append this cookie object inside browser using response .
      
        Cookie ck = new Cookie("username",uname);
        
        response.addCookie(ck);
        
      //3) create html form it contain one button click  
        
      PrintWriter  out = response.getWriter();
      
      out.println("<form action='eck2'>");
      
      out.println("<input type='submit' value='click' />");
      out.println("</form>");
        
       
      
      
      
		
		
		
		
	}

}
