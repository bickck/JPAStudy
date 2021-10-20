package com.cos.blog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(path = "/homeController")
	public String Home() {
		
		return "test";
	}
}
