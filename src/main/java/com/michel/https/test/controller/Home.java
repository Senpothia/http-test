package com.michel.https.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
	
	@GetMapping("/access")
	public String access() {
		
		return "ok";
	}
	
	@GetMapping("/home")
	public String home() {
		
		return "home";
	}

}
