package com.KathanWave.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.KathanWave.model.User;
import com.KathanWave.service.UserService;

@RestController
@RequestMapping("/KathanWave")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		return userService.addUser(user);
	}

}
