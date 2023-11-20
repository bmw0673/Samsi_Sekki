package com.nowon;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.nowon.domain.entity.UserEntity;
import com.nowon.domain.entity.UserRepositoty;

@SpringBootTest
class SpringBootWeb04RayoutApplicationTests {

	@Autowired
	UserRepositoty repo;	
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Test
	void 회원가입() {
		repo.save(	UserEntity.builder()
				.email("Test777@naver.com").pass(passwordEncoder.encode("1234"))
				.build());
	
	}
	
}
