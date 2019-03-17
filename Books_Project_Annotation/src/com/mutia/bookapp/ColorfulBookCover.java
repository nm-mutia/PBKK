package com.mutia.bookapp;

import org.springframework.stereotype.Component;

@Component
public class ColorfulBookCover implements BookCover {

	@Override
	public String getCover() {
		return "This book's cover is colorful";
	}

}
