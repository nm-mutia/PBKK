package com.mutia.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EncyclopaediaBook implements Book {
	@Autowired
	@Qualifier("brightBookCover")
	private BookCover bookCover;
	private String title;
	private String writer;
	private String publisher;
	private int year;
	
	@Override
	public void getGenre() {
		System.out.println("Let's study the universe!");
	}
	
	public EncyclopaediaBook() {
	}

	public EncyclopaediaBook(BookCover bookCover, String title, String writer, String publisher, int year) {
		this.bookCover = bookCover;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.year = year;
	}

	public BookCover getBookCover() {
		return bookCover;
	}

	public void setBookCover(BookCover bookCover) {
		this.bookCover = bookCover;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
