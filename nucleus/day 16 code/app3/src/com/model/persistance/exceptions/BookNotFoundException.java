package com.model.persistance.exceptions;

public class BookNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;

	public BookNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
