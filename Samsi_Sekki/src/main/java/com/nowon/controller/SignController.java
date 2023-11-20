package com.nowon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.core.sym.Name;
import com.nowon.domain.entity.DTO.UserDTO;
import com.nowon.service.SignService;

@Controller
public class SignController {
	
	@Autowired
	private  SignService service;
	
	@GetMapping("/login")
	public String login() {
		return "views/login";
	}
	
	@GetMapping("/signup")
	public String signup() {
		return "views/join";
	}
	
	@GetMapping("/Per")
	public String Per() {
		return "views/PersonalInformationProcessingPolicy";
	}
	
	@GetMapping("/Agree")
	public String Agree() {
		return "views/Agreement";
	}
	
	@PostMapping("/signup/new")
	public String signupNew(UserDTO dto) {
		service.saveUser(dto);
		return "redirect:/login";
	}
	
	@GetMapping("/find_email")
	public String find_email() {
		return "views/find_email";
	}
	
	@GetMapping("/find_password")
	public String find_password() {
		return "views/find_password";
	}
	
	@PostMapping("/login")
	public String register(String email, String password) {
		System.out.println(email);
		System.out.println(password);
		return "/";
	}
	
	@PostMapping("/find_email")
	public String register(String tell_num) {
		System.out.println(tell_num);
		return "views/find_email_after";
	}
	
	@PostMapping("/find_password")
	public String register1(String tell_num_pass, String email_pass) {
		System.out.println(tell_num_pass);
		System.out.println(email_pass);
		return "views/find_password_after";
	}
	
	@PostMapping("/join")
	public String join(UserDTO dto) {
		service.saveUser(dto);
		return "/views/login";
	}
	
	@PostMapping("/logout")
	public String loguot() {
		System.out.println("로그아웃이 될까요????");
		return "index";
	}
	
}
