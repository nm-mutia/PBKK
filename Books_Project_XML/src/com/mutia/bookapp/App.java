package com.mutia.bookapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bookconfig.xml");
		
		System.out.println("1");
		Book book = context.getBean("myBookFantasy", Book.class);
		book.getGenre();
		
		FantasyBook fantasyB = (FantasyBook)book;
		FantasyBook fantasyB2 = (FantasyBook)book;
		System.out.println(fantasyB.getBookCover().getCover());
		System.out.println("Title    : " + fantasyB.getTitle());
		System.out.println("Writer   : " + fantasyB.getWriter());
		System.out.println("Publisher: " + fantasyB.getPublisher());
		System.out.println("Year 	 : " + fantasyB.getYear());
		
		System.out.println("2");
		Book book2 = context.getBean("myBookEncyclo", Book.class);
		book2.getGenre();
		
		EncyclopaediaBook eb = context.getBean("myBookEncyclo", EncyclopaediaBook.class);;
		EncyclopaediaBook eb3 = context.getBean("myBookEncyclo", EncyclopaediaBook.class);
		System.out.println(eb.getBookCover().getCover());
		System.out.println("Title    : " + eb.getTitle());
		System.out.println("Writer   : " + eb.getWriter());
		System.out.println("Publisher: " + eb.getPublisher());
		System.out.println("Year 	 : " + eb.getYear());
				
		FantasyBook fb2 = context.getBean("myBookFantasy2", FantasyBook.class);
		EncyclopaediaBook eb2 = context.getBean("myBookEncyclo2", EncyclopaediaBook.class);
		System.out.println("3");
		System.out.println(fb2.getBookCover().getCover());
		System.out.println("Title    : " + fb2.getTitle());
		System.out.println("Writer   : " + fb2.getWriter());
		System.out.println("Publisher: " + fb2.getPublisher());
		System.out.println("Year 	 : " + fb2.getYear());
		System.out.println("4");
		System.out.println(eb2.getBookCover().getCover());
		System.out.println("Title    : " + eb2.getTitle());
		System.out.println("Writer   : " + eb2.getWriter());
		System.out.println("Publisher: " + eb2.getPublisher());
		System.out.println("Year 	 : " + eb2.getYear());
		
		System.out.println("Singleton");
		System.out.println("FantasyBook : " + fantasyB);
		System.out.println("FantasyBook2: " + fantasyB2);
		System.out.println("Prototype");
		System.out.println("EncycloBook3 : " + eb);
		System.out.println("EncycloBook4 : " + eb3);
		
		context.close();
	}

}
