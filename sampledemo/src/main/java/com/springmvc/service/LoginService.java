package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springmvc.dao.LoginDao;

@Service
public class LoginService {

	@Autowired
	@Qualifier(value = "loginDao")
	private LoginDao loginDao;

	public String getCurrentTimeStamp() {
		return loginDao.getCurrentTimeStamp();
	}

	public boolean validateUser(String username, String password) {
		return loginDao.isValidUser(username, password);
	}

}
