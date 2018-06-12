package com.springmvc.dao;

import com.springmvc.bean.User;

public interface UserDaoInterface {
	
	public Object createUser(User user);
	
	public void updateUser(User user);
	
	public User readUser(String name, String pwd);
	
}
