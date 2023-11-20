package com.nowon.domain.entity.DTO;

import java.time.LocalDateTime;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.nowon.domain.entity.UserEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserDTO {
	
	
	private String email;
	
	private String pass;
	
	private String recommend;
	
	private long shoesSize;
	
	private LocalDateTime createdDate;
	
	PasswordEncoder passwordEncoder;
	
	
	public UserEntity toUserEntity(PasswordEncoder pe) {
		return UserEntity.builder()
				.email(email)
				.pass(pe.encode(pass))
				.recommend(recommend).shoesSize(shoesSize)
				.build();
	}
	
}
