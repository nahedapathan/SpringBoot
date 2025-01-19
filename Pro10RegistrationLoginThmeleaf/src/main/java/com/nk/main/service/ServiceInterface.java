package com.nk.main.service;

import com.nk.main.model.User;


public interface ServiceInterface {

	public boolean registerUser(User user);
	
	public User loginUser(String email,String password);
}
