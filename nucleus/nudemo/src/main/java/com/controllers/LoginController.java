package com.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "login")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView showLoginPage(ModelAndView mv) {
		mv.addObject("ui", new UserUi());
		mv.setViewName("login");
		return mv;
	}

	@RequestMapping(method=RequestMethod.POST)
	public String submittedLoginForm(@ModelAttribute(value = "ui")
	@Valid UserUi ui, BindingResult result, ModelAndView mv){
		if (result.hasErrors()) {
			return "login";
		} 
		else{
		return "sucess";
		}
	}
	
	/*@RequestMapping(method = RequestMethod.POST)
	public ModelAndView submitLoginPage(
			 @ModelAttribute(value = "ui") @Valid UserUi ui, ModelAndView mv,
			BindingResult result) {

		if (result.hasErrors()) {
			mv.setViewName("login");
			return mv;
		} else {
			mv.setViewName("sucess");
			mv.addObject("userUi", ui);
			return mv;
		}

	}*/
}
