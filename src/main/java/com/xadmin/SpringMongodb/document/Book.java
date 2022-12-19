package com.xadmin.SpringMongodb.document;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Book")
public class Book {

	private int id;
	private String bookName;
	private String author;

	public Book(int id, String bookName, String author) {
		this.id = id;
		this.bookName = bookName;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
