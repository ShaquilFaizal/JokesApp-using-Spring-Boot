package com.shaquilfaizal.JokesApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shaquilfaizal.JokesApp.services.JokesService;

@Controller
public class JokeController {

	@Autowired
	private JokesService jokeService;
	
	/*@Autowired
	public JokeController(JokesService jokeService) {
		
		this.jokeService = jokeService;
	}
	*/
	@RequestMapping({"/",""})
	public String showJoke(Model model){
		model.addAttribute("joke",jokeService.getJoke());
		return "chucknorris";
	}
	
	
}
