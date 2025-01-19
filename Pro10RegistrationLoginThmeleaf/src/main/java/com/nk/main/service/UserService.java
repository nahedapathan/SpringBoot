package com.nk.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nk.main.model.User;
import com.nk.main.repository.UserRepository;

@Service
public class UserService implements ServiceInterface {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public boolean registerUser(User user) {
		try
		{
			userRepository.save(user);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public User loginUser(String email, String password) {
		User validUser=userRepository.findByEmail(email);
		
		if(validUser != null && validUser.getPassword().equals(password))
		{
			return validUser;
		}
		return null;
	}

}
