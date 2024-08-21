package org.lessons.java.spring.bestoftheyear.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")

public class MainController {

		@GetMapping("/homepage")
		public String greeting(String name, Model model) {
			model.addAttribute("name", "Mich");
			
			return "homepage";
		}
		
		private static ArrayList<Movie> getBestMovies() {
			ArrayList<Movie> movieList = new ArrayList<Movie>();
			movieList.add(new Movie(0, "Inception", "YoHD9XEInc0?si=UTNIMUPCpcu2VQQD"));
			movieList.add(new Movie(1, "Iron Man", "8ugaeA-nMTc?si=0Wy7IsWIhKBmcVxu"));
			movieList.add(new Movie(2, "Harry Potter", "6iWegeSeLh4?si=KZqFLTBT3OOdlLpE"));
			movieList.add(new Movie(3, "Deadpool & Wolverine", "rExHNVA5qgg?si=q25__Fzi3nRnsJxp"));			
			return movieList;
			
		}
		
		private static ArrayList<Song> getBestSongs(){
			ArrayList<Song> songList = new ArrayList<Song>();
			songList.add(new Song(0, "I Don't Miss You At All", "Finneas", "C62ApusprBA?si=Aw1sqhPwIKoyZNQl"));
			songList.add(new Song(1, "Prawn Song", "Superorganism", "VGgaRmRP1ck?si=YHfmO3hsMcVlto_V"));
			songList.add(new Song(2, "Back in Black", "AC/DC", "pAgnJDJN4VA?si=LUnUb4mEK8_H1tvO"));
			songList.add(new Song(3, "Naked", "Antibes", "bZIJfmF7WpM?si=r8Y305zkvgTL8gnk"));	
			return songList;
		}
		
		
		@GetMapping("/movies")
		public String movies(String name, String title, Model model) {			
			model.addAttribute("title", "movies");
			model.addAttribute("name", "Mich");
			model.addAttribute("list", getBestMovies());
			return "listpage";
		}
		
		@GetMapping("/movies/{id}")
		public String movieDetails(@PathVariable("id") Integer movieId, Model model) {
			String title = "movies";
			String selectedItem = null;
			String link = null;
			
			for(Movie movie: getBestMovies()) {
				if(movieId.equals(movie.getId())){
					selectedItem = movie.getTitle();
					link = movie.getLink();
					break;
				}
			}
			model.addAttribute("title", title);
			model.addAttribute("selectedItem", selectedItem);
			model.addAttribute("link", link);
			
			return "detailspage";
		}
		
		@GetMapping("/songs")
		public String songs(String name, String title, Model model) {	
			model.addAttribute("title", "songs");
			model.addAttribute("name", "Mich");
			model.addAttribute("list", getBestSongs());
			return "listpage";
		}
		
		@GetMapping("/songs/{id}")
		public String songDetails(@PathVariable("id") Integer songId, Model model) {
			String title = "songs";
			String selectedItem = null;
			String link = null;
			
			for(Song song: getBestSongs()) {
				if(songId.equals(song.getId())){
					selectedItem = song.getTitle();
					link = song.getLink();
					break;
				}
			}
			model.addAttribute("title", title);
			model.addAttribute("selectedItem", selectedItem);
			model.addAttribute("link", link);
			
			
			return "detailspage";
		}
	}

