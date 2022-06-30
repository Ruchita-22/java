package com.bookapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
// hello/delete/121
@Controller
@RequestMapping(value="/hello/*")
public class Hello2Controller {

	@RequestMapping(value="/delete/{sid}", method=RequestMethod.GET)
	public String sayHello(@PathVariable ("sid")String s){
		System.out.println(s);
		return "hello";
	}

}