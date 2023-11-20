package com.nowon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.nowon.domain.entity.UserRepositoty;
import com.nowon.domain.entity.DTO.UserDTO;
import com.nowon.security.UserRole;
import com.nowon.service.SignService;


@Service
public class SignServiceProcess implements SignService{
	
	@Autowired
	private UserRepositoty repo;
	
	@Autowired
	private 
	PasswordEncoder passwordEncoder;
	
	
	@Override
    public void saveUser(UserDTO dto) {
		repo.save(dto.toUserEntity(passwordEncoder).addRole(UserRole.ADMIN));
	}
	
}