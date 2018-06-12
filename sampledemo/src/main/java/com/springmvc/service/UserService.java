package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.bean.User;
import com.springmvc.dao.UserDaoInterface;

@Service
public class UserService {

	@Autowired
	private UserDaoInterface userDao;
	
	public UserService() {
		System.out.println(getClass() +" instantiated.");
	}

	public void registerUser(User user) {
		userDao.createUser(user);
	}
	
	
	

}
