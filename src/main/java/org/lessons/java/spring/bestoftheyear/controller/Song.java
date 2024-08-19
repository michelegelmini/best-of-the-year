package org.lessons.java.spring.bestoftheyear.controller;

import java.util.Random;

public class Song {
	private String id;
	private String title;
	private String artist;
	
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
		this.setId(generateID());
	}
	
	static String generateID() {
		Random r = new Random();
		int max = 10000;
		int result = r.nextInt(max);
		return (String.format("%04d", result));
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
	

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	@Override 
	public String toString() {
		return this.id + " - " + this.title +  " by " + this.artist;
	}
}

