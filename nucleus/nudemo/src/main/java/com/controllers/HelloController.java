package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//Servlet
@Controller
@RequestMapping(value="foo")
public class HelloController {

	@RequestMapping(value="/bar", method=RequestMethod.GET)
	public void sayHello(){
		System.out.println("hello...");
	}
}
