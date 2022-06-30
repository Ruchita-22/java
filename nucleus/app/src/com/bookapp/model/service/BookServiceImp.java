package com.bookapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bookapp.model.persistance.Book;
import com.bookapp.model.persistance.BookDao;

//@Service(value="bs")
@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
public class BookServiceImp implements BookService {

	@Autowired 
	private BookDao dao;
	
	public void setDao(BookDao dao) {
		this.dao = dao;
	}

	
	@Override
	public List<Book> getAllBooks() {
		return dao.getAllBooks();
	}

	@Override
	public Book getBookById(int bookId) {
		return dao.getBookById(bookId);
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, timeout = 100)
	@Override
	public Book addBook(Book book) {
		return dao.addBook(book);
	}

	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, timeout=100)
	@Override
	public Book updateBook(Book book) {
		return dao.updateBook(book);
	}

	@Transactional(readOnly=false, propagation=Propagation.REQUIRED, timeout=100)
	@Override
	public Book removeBook(int bookId) {
		return dao.removeBook(bookId);
	}

}
