package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Calculator;

public class CalculatorController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// response.sendRedirect("/WEB-INF/views/cal.jsp");
		request.getRequestDispatcher("/WEB-INF/views/cal.jsp").forward(request,
				response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		String first = request.getParameter("x");
		String sec = request.getParameter("y");

		try {
			int x = Integer.parseInt(first);
			int y = Integer.parseInt(sec);
			int sum = Calculator.add(x, y);
			request.setAttribute("sum", sum);
		} catch (Exception ex) {
			request.setAttribute("validationerror", "data is bad");
		}

		// parameter (web.xml aka contstnst) vs attributes(dyn, key -> object)

		RequestDispatcher rd = request
				.getRequestDispatcher("/WEB-INF/views/result.jsp");
		rd.forward(request, response);

		/*
		 * //RequestDips vs Redirect PRG => PrintWriter
		 * out=response.getWriter(); out.print("result is:"+ sum+"<br/>");
		 */

	}

}
