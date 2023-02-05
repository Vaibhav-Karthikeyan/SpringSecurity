package com.masai.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/api")
public class ApiController {
	@GetMapping("/admin/dashboard")
	public String adminDashboard() {
		return "admin dashboard";
	}
	
	@GetMapping("/user/dashboard")
	public String userDashboard() {
		return "user dashboard";
	}
	
	@GetMapping("/admin/new")
	public String admin() {
		return "new admin";
	}
	
	@GetMapping("/user/{userid}")
	public int adminDashboard(@PathVariable int userid) {
		return userid;
	}
}
