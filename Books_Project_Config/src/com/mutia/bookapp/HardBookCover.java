package com.mutia.bookapp;

import org.springframework.stereotype.Component;

@Component
public class HardBookCover implements BookCover {

	@Override
	public String getCover() {
		return "This book has a hardcover";
	}

}
