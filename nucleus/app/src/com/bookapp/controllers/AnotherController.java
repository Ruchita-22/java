package com.bookapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
// foo1?un=raja&pw=raja
@Controller
@RequestMapping("/foo1")
public class AnotherController {
	@RequestMapping(method=RequestMethod.GET)
	public void foo(@RequestParam("un")String un, 
			@RequestParam("pw")String pw){
		System.out.println("un"+un);
		System.out.println("pw"+pw);
	}
}
