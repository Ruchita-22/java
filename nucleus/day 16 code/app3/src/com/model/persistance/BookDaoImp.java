package com.model.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.model.persistance.exceptions.BookNotFoundException;
import com.model.persistance.exceptions.DaoException;

public class BookDaoImp implements BookDao {
	private Connection connection;
	
	public BookDaoImp(Connection connection){
		this.connection=connection;
	}
	
	@Override
	public void addBook(Book book) throws DaoException {
		PreparedStatement pstmt;
		try {
			pstmt = connection
					.prepareStatement("insert into books(isbn, author, title, price)values (?,?,?,?)");
			pstmt.setString(1, book.getIsbn());
			pstmt.setString(2, book.getAuthor());
			pstmt.setString(3, book.getTitle());
			pstmt.setFloat(4, book.getPrice());

			pstmt.executeUpdate();
		
		} catch (SQLException e) {
			throw new DaoException("SQL hall", e);
		}

		

	}

	@Override
	public List<Book> getAllBooks() throws DaoException {

		return null;
	}

	@Override
	public Book getBookByIsbn(String isbn) throws DaoException,
			BookNotFoundException {

		return null;
	}

}
