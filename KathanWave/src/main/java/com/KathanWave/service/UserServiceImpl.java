package com.KathanWave.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.KathanWave.model.User;
import com.KathanWave.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;

	@Override
	public ResponseEntity<User> addUser(User user) {
		User addedUser = userRepo.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(addedUser);
	}

}
