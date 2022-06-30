package com.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {

		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String isbn = request.getParameter("isbn");
		String author = request.getParameter("author");
		String title = request.getParameter("title");
		String priceStr = request.getParameter("price");

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/nu_pr", "root", "root");

			PreparedStatement pstmt = connection
					.prepareStatement("insert into books(isbn, author, title, price)values (?,?,?,?)");

			pstmt.setString(1, isbn);
			pstmt.setString(2, author);
			pstmt.setString(3, title);
			pstmt.setFloat(4, Float.parseFloat(priceStr));

			pstmt.executeUpdate();
			

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {

			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
