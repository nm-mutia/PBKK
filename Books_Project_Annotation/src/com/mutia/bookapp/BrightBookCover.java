package com.mutia.bookapp;

import org.springframework.stereotype.Component;

@Component
public class BrightBookCover implements BookCover {

	@Override
	public String getCover() {
		return "This book's cover is bright with eyecatching color";
	}

}
