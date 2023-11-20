package com.nowon.security;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public enum UserRole {
	USER("일반유저"),
	ADMIN("관리자");
	private final String roleName;
}
