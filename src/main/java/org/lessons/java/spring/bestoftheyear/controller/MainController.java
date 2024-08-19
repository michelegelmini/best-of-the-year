package org.lessons.java.spring.bestoftheyear.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")

public class MainController {

		@GetMapping("/homepage")
		public String greeting(@RequestParam(name = "name") String name, Model model) {
			model.addAttribute("name", name);
			
			return "homepage";
		}
		
		private static ArrayList<Movie> getBestMovies() {
			ArrayList<Movie> movieList = new ArrayList<Movie>();
			movieList.add(new Movie("Inception"));
			movieList.add(new Movie("Iron Man"));
			movieList.add(new Movie("Harry Potter"));
			movieList.add(new Movie("Deadpool & Wolverine"));			
			return movieList;
			
		}
		
		private static ArrayList<Song> getBestSongs(){
			ArrayList<Song> songList = new ArrayList<Song>();
			songList.add(new Song("I Don't Miss You At All", "Finneas"));
			songList.add(new Song("Prawn Song", "Superorganism"));
			songList.add(new Song("Back in Black", "AC/DC"));
			songList.add(new Song("Naked", "Antibes"));	
			return songList;
		}
		
		
		@GetMapping("/movies")
		public String movies(@RequestParam(name = "name") String name, Model model) {			
			model.addAttribute("name", name);
			model.addAttribute("movieList", getBestMovies());
			return "movies";
		}
		
		@GetMapping("/songs")
		public String songs(@RequestParam(name = "name") String name, Model model) {			
			model.addAttribute("name", name);
			model.addAttribute("songList", getBestSongs());
			return "songs";
		}
	}

