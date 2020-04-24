package com.udemy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.entity.User;


@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, String>{

	/**
	 * 
	 * @param userName
	 * @return
	 */
	User findByUsername(String username);
}
