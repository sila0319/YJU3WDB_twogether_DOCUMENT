package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.users.Users;
import com.example.users.UsersDAO;


@RestController
@CrossOrigin(origins = "http://172.26.6.65:3000")
@RequestMapping("/")
public class UserController {
	final UsersDAO dao = new UsersDAO();
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/join")
	public String join() {
		return  "join";
	}
	
	@PostMapping("/add")
	public String addUsers(@RequestBody Users user, Model m) {
	   
	   try {
	      dao.addUsers(user);
	   } catch (Exception e) {
	      e.printStackTrace();
	   }
	   return "redirect:/login";
	}

}
