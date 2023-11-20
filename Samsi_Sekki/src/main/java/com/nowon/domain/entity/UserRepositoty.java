package com.nowon.domain.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoty extends JpaRepository<UserEntity, Long>{

	UserEntity findByEmail(String email);

	

}
