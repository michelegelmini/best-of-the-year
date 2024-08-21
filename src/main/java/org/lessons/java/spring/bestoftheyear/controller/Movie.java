package org.lessons.java.spring.bestoftheyear.controller;


public class Movie {
	private int id;
	private String title;
	private String link;
	
	public Movie(int id, String title, String link) {
		this.title = title;
		this.id = id;
		this.link = link;
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
	
	public String getLink() {
		return link;
	}
	
	
	public void setLink(String link) {
		this.link = link;
	}
	
	@Override 
	public String toString() {
		return this.id + " - " + this.title;
	}

	
}
