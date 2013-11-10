package com.kok.jee.service;

import java.util.HashMap;

import com.kok.jee.dto.User;

public class LoginService {
	
	HashMap<String, String> users = new HashMap<String, String>();
	
	public LoginService(){
		users.put("kostya", "Kostya");
		users.put("john", "John");
		users.put("tom", "Tom");
		
	}
	
	public boolean authenticate(String userid, String password){
		
		if (password==null || password.trim()==""){
			return false;
		}
	return true;	
	}

	public User getUserDetails (String userid){
		User user = new User();
		user.setUserName(users.get(userid));
		user.setUserId(userid);
		
		return user;
		
	}
	
}
