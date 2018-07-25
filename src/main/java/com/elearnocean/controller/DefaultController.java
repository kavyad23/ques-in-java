package com.elearnocean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

	@GetMapping("/")
	public String login1() {
		return "/login";
	}

	@GetMapping("/login")
	public String login() {
		return "/login";
	}

	@GetMapping("/index")
	public String index() {
		return "/index";
	}

	@GetMapping("/addQuestion")
	public String question() {
		return "/addQuestion";
	}

	@GetMapping("/generateQuestion")
	public String generateQuestion() {
		return "/generateQuestion";
	}

	@GetMapping("/importQuestion")
	public String importQuestion() {
		return "/importQuestion";
	}

	@GetMapping("/downloadQuestion")
	public String downloadQuestion() {
		return "/downloadQuestion";
	}

	@GetMapping("/editQuestion")
	public String editQuestion() {
		return "/editQuestion";
	}

	@GetMapping("/error")
	public String error403() {
		return "/error/403";
	}

}
