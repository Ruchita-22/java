package com.ibm.redirectExample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDispatcher
 */
public class RequestDispatcherExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		if(username.equals("ruchita")&& password.equals("ruchita")) {
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("WEB-INF/success.html");
			requestDispatcher.include(request, response);
		}
		else {
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("error.html");
			requestDispatcher.include(request, response);
		}
		
		
	}

}
