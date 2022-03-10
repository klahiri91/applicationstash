package com.spring.test.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.test.api.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByEmail(String email);

	List<User> findByName(String str);

}
