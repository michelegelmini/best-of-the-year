package org.lessons.java.spring.bestoftheyear.controller;


public class Song {
	private int id;
	private String title;
	private String artist;
private String link;
	
	public Song(int id, String title,  String artist, String link) {
		this.title = title;
		this.id = id;
		this.artist = artist;
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
	

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	@Override 
	public String toString() {
		return this.id + " - " + 
		this.title +  " by " + 
		this.artist;
	}
}

