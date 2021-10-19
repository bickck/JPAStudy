package com.cos.blog.User;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class UserUpdate {
	
	
	@Autowired
	public UserRepository userRepository;
	
	
	public boolean userUpdate(User user) {
		
		//Optional<User> userList= userRepository.findById(user.getId());
		
		
		return false;
	}

}
