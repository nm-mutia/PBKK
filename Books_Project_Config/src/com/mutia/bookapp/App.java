package com.mutia.bookapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BookConfig.class);
		
		ActionBook abook = context.getBean("actionBook", ActionBook.class);	
		abook.getGenre();
		System.out.println(abook.getBookCover().getCover());
		System.out.println("Title    : " + abook.getTitle());
		System.out.println("Writer   : " + abook.getWriter());
		System.out.println("Publisher: " + abook.getPublisher());
		System.out.println("Year     : " + abook.getYear());
		
		ActionBook abook2 = context.getBean("actionBook2", ActionBook.class);	
		abook.getGenre();
		System.out.println(abook2.getBookCover().getCover());
		System.out.println("Title    : " + abook2.getTitle());
		System.out.println("Writer   : " + abook2.getWriter());
		System.out.println("Publisher: " + abook2.getPublisher());
		System.out.println("Year     : " + abook2.getYear());
		
		context.close();
	}

}
