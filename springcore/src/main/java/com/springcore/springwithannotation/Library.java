package com.springcore.springwithannotation;

import org.springframework.stereotype.Component;

@Component
public class Library implements LibraryInterface{

	public void bookRecord() {
		System.out.println("Available books");
		
	}

	
}
