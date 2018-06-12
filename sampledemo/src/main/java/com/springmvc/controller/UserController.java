package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.bean.User;
import com.springmvc.service.UserService;

@Controller
public class UserController {

	public UserController() {
		System.out.println(getClass()+" instantiated.");
	}
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/showRegisterForm")
	public ModelAndView showRegisterForm() {
		ModelAndView registerView = new ModelAndView("registerForm");
		registerView.addObject("user", new User());
		return registerView;
	}
	
	@RequestMapping("/registerUser")
	public ModelAndView registerUser(@ModelAttribute User user) {
		ModelAndView loginView = new ModelAndView("userInfo");
		userService.registerUser(user);
		loginView.addObject("registeredUser", user);
		return loginView;
	}

}
