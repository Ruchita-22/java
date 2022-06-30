package com.model.persistance;

import java.util.*;

import com.model.persistance.exceptions.BookNotFoundException;
import com.model.persistance.exceptions.DaoException;

public interface BookDao {
	public void addBook(Book book) throws DaoException;

	public List<Book> getAllBooks() throws DaoException;

	public Book getBookByIsbn(String isbn) throws DaoException,
			BookNotFoundException;
}
