package com.nada.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nada.entity.UserEntity;
import com.nada.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;

	@Override
	public String addUser(UserEntity user) {
		UserEntity findUser = userRepo.findByEmail(user.getEmail().toString());
		if (findUser == null) {
			UserEntity uEntity = userRepo.save(user);
			if (uEntity != null) {
				return "success";
			} else {
				return "save failed";
			}
		} else {
			return "already exist email";
		}
	}

	@Override
	public String loginCheck(UserEntity user) {
		UserEntity uEntity = (UserEntity) userRepo.findByEmail(user.getEmail().toString());
		if (uEntity != null) {
			if (user.getPassword().equals(uEntity.getPassword())) {
				return "Login OK";
			} else {
				return "invalid password";
			}
		} else {
			return "not exist email";
		}
	}
	
	@Override
	public UserEntity getUser(String email) {
		UserEntity uEntity = userRepo.findByEmail(email);
		if(uEntity != null) {
			return uEntity;
		} else {
			return null;
		}
		
	}
	
	@Override
	public String getUserCheck(String email) {
		UserEntity uEntity = userRepo.findByEmail(email);
		if(uEntity != null) {
			return "user already existing";
		} else {
			return "user not existing";
		}
	}
	public String updateUser(UserEntity user) {
		UserEntity findUser = userRepo.findByEmail(user.getEmail());
		findUser.setId(user.getId().toString());
		userRepo.save(findUser);

		return "success";
	}

}
