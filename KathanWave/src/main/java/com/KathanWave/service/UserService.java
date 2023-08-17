package com.KathanWave.service;

import org.springframework.http.ResponseEntity;

import com.KathanWave.model.User;

public interface UserService {

	public ResponseEntity<User> addUser(User user);

}
