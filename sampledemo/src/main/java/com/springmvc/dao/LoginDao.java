package com.springmvc.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDao extends JdbcDaoSupport {

	/*
	 * @Autowired DataSource dataSource;
	 */
	@Autowired
	public LoginDao(DataSource dataSource) {
		System.out.println("in LoginDAO constructor.");
		setDataSource(dataSource);
	}

	/*
	 * @PostConstruct private void initialize() {
	 * System.out.println("postconstruct "+dataSource); setDataSource(dataSource); }
	 */
	public boolean isValidUser(String userName, String password) {
		boolean isValid = false;
		int cnt = getJdbcTemplate().queryForObject("SELECT COUNT(1) FROM users WHERE first_name = ? AND pwd = ?", 
				new Object[] {userName,password}, Integer.class);
		if (cnt > 0) {
			isValid = true;
		}
		System.out.println(userName +" "+ password +" "+ cnt +" isValid : " +isValid);
		return isValid;
	}

	public String getCurrentTimeStamp() {
		String time = getJdbcTemplate().queryForObject("SELECT current_timestamp() from dual;", String.class);
		System.out.println("current time is : " + time);
		return time;
	}
}
