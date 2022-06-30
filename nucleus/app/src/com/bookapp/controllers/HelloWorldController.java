package com.bookapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
// replace of servlet : doGet doPost=>
@Controller //@Component => 3 type
@RequestMapping("/foo")
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView foo(ModelAndView mv) {
		System.out.println("HelloWorldController....");
		mv.addObject("greeting", "greeting to the world");
		mv.setViewName("welcome");
		return mv;

	}
	
}

















