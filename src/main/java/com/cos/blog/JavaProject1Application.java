package com.cos.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cos.blog.User.User;
import com.cos.blog.User.UserRepository;

@SpringBootApplication
public class JavaProject1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(JavaProject1Application.class, args);
		
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		userRepository.save(new User(1,"dong","1234","1234"));
		User user = userRepository.findUser("dong");
	}

}
