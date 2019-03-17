package com.mutia.bookapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.mutia.bookapp")
@PropertySource("book.attributes")
public class BookConfig {
	@Bean
	public Book actionBook(){
		ActionBook ab1 = new ActionBook(bookCover());
		return ab1;
	}
	
	@Bean
	public ActionBook actionBook2() {
		ActionBook ab2 = new ActionBook(bookCover2());
		return ab2;
	}
	
	@Bean
	public BookCover bookCover() {
		return new HardBookCover();
	}
	
	@Bean
	public BookCover bookCover2() {
		return new DarkBookCover();
	}
}
