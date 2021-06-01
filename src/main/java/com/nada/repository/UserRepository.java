package com.nada.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nada.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	UserEntity findByEmail(String Email);
	
}
