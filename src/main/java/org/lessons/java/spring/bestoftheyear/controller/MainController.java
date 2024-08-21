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
			movieList.add(new Movie(0, "Inception"));
			movieList.add(new Movie(1, "Iron Man"));
			movieList.add(new Movie(2, "Harry Potter"));
			movieList.add(new Movie(3, "Deadpool & Wolverine"));			
			return movieList;
			
		}
		
		private static ArrayList<Song> getBestSongs(){
			ArrayList<Song> songList = new ArrayList<Song>();
			songList.add(new Song(0, "I Don't Miss You At All", "Finneas"));
			songList.add(new Song(1, "Prawn Song", "Superorganism"));
			songList.add(new Song(2, "Back in Black", "AC/DC"));
			songList.add(new Song(3, "Naked", "Antibes"));	
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
			
			for(Movie movie: getBestMovies()) {
				if(movieId.equals(movie.getId())){
					selectedItem = movie.getTitle();
					break;
				}
			}
			model.addAttribute("title", title);
			model.addAttribute("selectedItem", selectedItem);
			
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
			
			for(Song song: getBestSongs()) {
				if(songId.equals(song.getId())){
					selectedItem = song.getTitle();
					break;
				}
			}
			model.addAttribute("title", title);
			model.addAttribute("selectedItem", selectedItem);
			
			
			return "detailspage";
		}
	}

