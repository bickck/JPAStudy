package com.cos.blog.UserManagment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.cos.blog.User.User;
import com.cos.blog.User.UserRepository;


public class UserRegister {
	
	@Autowired
	public UserRepository userRepository;
		
	
	//@Bean
	public UserRegister userRegister() {
		return new UserRegister();
	}

	@Transactional
	public boolean userSave(User user) {
		
		
		userRepository.save(user);	
		return true;	
	}
	
	public boolean validEmaildupCheck()	{
		
		return true;
	}
}
