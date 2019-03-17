package com.mutia.bookapp;

import org.springframework.stereotype.Component;

@Component
public class DarkBookCover implements BookCover {

	@Override
	public String getCover() {
		return "This book's cover is dark with elegant color";
	}

}
