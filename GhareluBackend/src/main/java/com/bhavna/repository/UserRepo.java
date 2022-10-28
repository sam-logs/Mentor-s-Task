package com.bhavna.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhavna.model.User;

public interface UserRepo extends JpaRepository<User,Integer> {
	Optional<User> findByEmail(String email);

}
