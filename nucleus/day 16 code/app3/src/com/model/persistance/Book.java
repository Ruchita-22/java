package com.model.persistance;

public class Book {
	private String isbn;
	private String author;
	private String title;
	private float price;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Book(String isbn, String author, String title, float price) {

		this.isbn = isbn;
		this.author = author;
		this.title = title;
		this.price = price;
	}

	public Book() {
	}

}
