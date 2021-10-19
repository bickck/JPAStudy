package com.cos.blog.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegister {
	
	@Autowired
	public UserRepository userRepository;
	
	
	@PostMapping(path = "/postUserRegister")
	public String postInsert(@RequestBody String user) {
		
		//System.out.println(user.getName() + user.getUser_id() + user.getUser_pw());
		return "insert sucess";
	}
	@GetMapping(path = "/userRegister")
	public  String getPost() {
		return "success";
	}

	
	@Transactional
	public boolean UserInsert(User user) {
		
		if(user.equals(null)) {	
			return false;
		}
		userRepository.save(user);	
		return true;	
	}
	
	
}
