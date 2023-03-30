package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class UserController {

	@GetMapping("/join")
	public String join() {
		return "join";
	}
	
	@PostMapping("/join/users")
	public String adduser() {
		return "login";
	}
}
