package org.lessons.java.spring.bestoftheyear.controller;

import java.util.Random;

public class Movie {
	private String id;
	private String title;
	
	public Movie(String title) {
		this.setTitle(title);
		this.setId(generateID());
	}
	
	static String generateID() {
		Random r = new Random();
		int max = 10000000;
		int result = r.nextInt(max);
		return (String.format("%08d", result));
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Override 
	public String toString() {
		return this.id + this.title;
	}
	
}
