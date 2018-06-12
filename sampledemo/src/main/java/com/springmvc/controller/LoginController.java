package com.springmvc.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.bean.Hello;
import com.springmvc.bean.Login;
import com.springmvc.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired(required=false) //default true
	MessageSource msgsrc;
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	Hello helloBean;
	
	
	@RequestMapping("/home")
	public ModelAndView getHomePage() {
		ModelAndView homeView = new ModelAndView("home");
		homeView.addObject("login", new Login());
		return homeView;
	}
	
	@RequestMapping("/login")
	public ModelAndView validateUserLogin(@ModelAttribute Login login, Locale locale) {
		String viewName = "welcome";
		String message =msgsrc.getMessage("lbl.loginSuccess", new Object[] {login.getUsername()}, "Login Successful!", locale );
		boolean isValid = loginService.validateUser(login.getUsername(),login.getPassword());
		
		if(!isValid) {
			viewName = "home";
			message = msgsrc.getMessage("lbl.loginFailed", null, "(DM) Login Failed! Please Retry.", locale );
		}
		ModelAndView loginView = new ModelAndView(viewName);
		loginView.addObject("usrName", login.getUsername());
		loginView.addObject("message", message);
		return loginView;
	}
	
	@RequestMapping("/getCurrentTime")
	public @ResponseBody Object getCurrentTimeStamp() {
		return loginService.getCurrentTimeStamp();
	}
}
