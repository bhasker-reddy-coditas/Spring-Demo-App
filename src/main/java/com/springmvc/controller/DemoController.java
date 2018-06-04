package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api")
public class DemoController {
	
	@RequestMapping("/home")
	public String getHomePage() {
		return "home";
	}

	@RequestMapping("/login")
	public ModelAndView getLoginPage(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView loginView = new ModelAndView("login");
		System.out.println("returning model and view");
		loginView.addObject("message", "Login Page!");
		return loginView;
		//return "login";
	}
}
