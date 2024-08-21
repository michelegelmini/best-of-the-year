package org.lessons.java.spring.bestoftheyear.controller;


public class Movie {
	private int id;
	private String title;
	
	public Movie(int id, String title) {
		this.title = title;
		this.id = id;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override 
	public String toString() {
		return this.id + " - " + this.title;
	}
	
}
