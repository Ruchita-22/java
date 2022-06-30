package com.ibm.controller;

	import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ibm.domain.Game;
import com.ibm.domain.GameRepository;

	@Controller
	public class IndexController {

	    @Autowired
	    private GameRepository repository;

	    @GetMapping("/home")
		public String home(Map<String, Object> model) {
	    	List<Game> games = (ArrayList<Game>) repository.findAll();
			model.put("games", games);
			return "home";
		}
	    
	    @RequestMapping(value = "/addGame", method = RequestMethod.POST)
		public String addCar(@ModelAttribute Game game) {
			repository.save(game);
			return "redirect:home";
		}
	    
	    
}
