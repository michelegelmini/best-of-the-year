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
		
		private static String getBestMovies() {
			ArrayList<Movie> movieList = new ArrayList<Movie>();
			movieList.add(new Movie("Inception"));
			movieList.add(new Movie("Iron Man"));
			movieList.add(new Movie("Harry Potter"));
			movieList.add(new Movie("Deadpool & Wolverine"));
						
			return movieList.toString();
			
		}
		
		@GetMapping("/movies")
		public String movies(Model model) {
			
						
			model.addAttribute("movieList", getBestMovies());
			return "movies";
		}
	}

