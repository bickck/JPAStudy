package com.cos.blog.UserTest;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cos.blog.User.User;
import com.cos.blog.User.UserRepository;


public class UserTest {

	@Autowired
	public UserRepository userRepository;
	
	@Test
	public void userTest() {
		
		//List<User> userlist = userRepository.findAll();
		
	
		assertThat(userRepository, is(null));
	}
}
