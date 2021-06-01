package com.nada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nada.entity.UserEntity;
import com.nada.repository.UserRepository;
import com.nada.service.UserServiceImpl;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserServiceImpl userServiceImpl;

	@PostMapping("/addUser")
	public String addUser(UserEntity user) throws Exception {
		return userServiceImpl.addUser(user);
	}

	@PostMapping("/loginCheck")
	public String loginCheck(UserEntity user) throws Exception {
		return userServiceImpl.loginCheck(user);
	}
	
	@GetMapping("/getUser/{email}")
	public UserEntity getUser(@PathVariable(value="email") String email) throws Exception {
		return userServiceImpl.getUser(email);
	}
	
	@GetMapping("/getUserCheck/{email}")
	public String getUserCheck(@PathVariable(value="email") String email) throws Exception {
		return userServiceImpl.getUserCheck(email);
	}
	
	@GetMapping("/getTest")
	public String getText() {
		return "testtesttest";
	}
	@PostMapping("/updateUser")
	public String updateUser(UserEntity user) throws Exception {
		return userServiceImpl.updateUser(user);
	}
}
