package com.ibm.cookieExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExampleOfCookieTwo
 */
public class ExampleOfCookieTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Cookie ck=new Cookie("username", username);
		response.addCookie(ck);
		out.println("<form action='ExampleOnCookieOne'>");
		out.println("<input type='submit' value='click'/>");
		out.println("</form>");
		
	}

}
