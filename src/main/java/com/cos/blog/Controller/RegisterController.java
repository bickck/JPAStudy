package com.cos.blog.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.User.User;
import com.cos.blog.UserManagment.UserRegister;

//import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
	
	//@Autowired
	//UserRegister userRegister;

	@PostMapping(path = "/postUserRegister")
	public String postInsert(@RequestBody String user) {

		System.out.println(user);
		
		
		return "insert sucess";
	}

}
