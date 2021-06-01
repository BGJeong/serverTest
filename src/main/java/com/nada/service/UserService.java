package com.nada.service;

import com.nada.entity.UserEntity;

public interface UserService {
	public String addUser(UserEntity user) throws Exception;
	public String loginCheck(UserEntity user) throws Exception;
	public UserEntity getUser(String email) throws Exception;
	public String getUserCheck(String email) throws Exception;
}
