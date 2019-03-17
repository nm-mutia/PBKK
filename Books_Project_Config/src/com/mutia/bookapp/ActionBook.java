package com.mutia.bookapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ActionBook implements Book {
	private BookCover bookCover;
	@Value("${in.title}")
	private String title;
	@Value("${in.writer}")
	private String writer;
	@Value("${in.publisher}")
	private String publisher;
	@Value("${in.year}")
	private int year;
	
	@Override
	public void getGenre() {
		System.out.println("Action!");
	}
	
	public ActionBook() {
	}
	
	public ActionBook(BookCover bookCover) {
		this.bookCover = bookCover;
	}

	public ActionBook(BookCover bookCover, String title, String writer, String publisher, int year) {
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
