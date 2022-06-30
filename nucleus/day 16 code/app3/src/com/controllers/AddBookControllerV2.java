package com.controllers;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.persistance.Book;
import com.model.persistance.BookDao;
import com.model.persistance.BookDaoImp;
import com.model.persistance.ConnectionFactory;
import com.model.persistance.exceptions.DaoException;

public class AddBookControllerV2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection connection;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		connection = (Connection) config.getServletContext().getAttribute("connection");
	}

	protected void doPost(HttpServletRequest request,

	HttpServletResponse response) throws ServletException, IOException {

		String isbn = request.getParameter("isbn");
		String author = request.getParameter("author");
		String title = request.getParameter("title");
		Float price = Float.parseFloat(request.getParameter("price"));

		Book book = new Book(isbn, author, title, price);//Dto
		// KISS: keep it simple stupid
		BookDao bookDao = new BookDaoImp(connection);
		try {
			bookDao.addBook(book);
			
			System.out.println("book is added..");
			
		} catch (DaoException e) {
			e.printStackTrace();
		}

	}

}











