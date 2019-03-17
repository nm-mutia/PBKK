package com.mutia.bookapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bookconfig.xml");
		
		Book book = context.getBean("fantasyBook", Book.class);
		Book book2 = context.getBean("encyclopaediaBook", Book.class);
		FantasyBook fbook = context.getBean("fantasyBook", FantasyBook.class);
		EncyclopaediaBook epbook = context.getBean("encyclopaediaBook", EncyclopaediaBook.class);		
		
		book.getGenre();
		System.out.println(fbook.getBookCover().getCover());
		fbook.setTitle("Harry Potter");
		System.out.println(fbook.getTitle());
		book2.getGenre();
		System.out.println(epbook.getBookCover().getCover());
		epbook.setTitle("Big Bang");
		System.out.println(epbook.getTitle());
		
		context.close();
	}

}
