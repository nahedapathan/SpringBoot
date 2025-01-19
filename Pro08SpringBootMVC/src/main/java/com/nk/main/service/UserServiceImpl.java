package com.nk.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nk.main.model.User;
import com.nk.main.repository.UserRepository;

import aj.org.objectweb.asm.commons.TryCatchBlockSorter;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userrepository;
	
	@Override
	public boolean registerUser(User user) {
		
		try {
			userrepository.save(user);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public User loginUser(String email, String password) {
		User validUser=userrepository.findByEmail(email);
		if(validUser!=null && validUser.getPassword().equals(password))
		{
			return validUser;
		}
		return null;
	}

}
