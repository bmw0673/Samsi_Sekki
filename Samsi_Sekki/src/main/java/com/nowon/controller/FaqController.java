package com.nowon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FaqController {
	@GetMapping("/faq")
	public String faq() {
	return "views/FAQ_board";
	}
	@GetMapping("/notic")
	public String notic() {
	return "views/notice_board";
	}
	@GetMapping("/one")
	public String one() {
	return "views/one_board";
	}
	
}
