package com.cos.blog.UserManagment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cos.blog.User.User;
import com.cos.blog.User.UserRepository;

public class UserUpdate {
	
	
	@Autowired
	public UserRepository userRepository;
	
	
	public boolean userUpdate(User user) {
		
		//Optional<User> userList= userRepository.findById(user.getId());
		
		
		return false;
	}

}
