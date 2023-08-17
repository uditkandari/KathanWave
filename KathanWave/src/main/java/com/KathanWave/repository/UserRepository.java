package com.KathanWave.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.KathanWave.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
