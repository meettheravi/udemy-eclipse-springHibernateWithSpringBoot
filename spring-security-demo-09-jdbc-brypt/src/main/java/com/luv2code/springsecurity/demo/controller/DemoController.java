package com.luv2code.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/")
	public String home() {
		
		return "home";
	}

	// add request mapping for /leaders
	@GetMapping("/leaders")
	public String showLeaders() {
		
		return "leaders";
	}

	// add request mapping for /systems
	@GetMapping("/systems")
	public String showSystems() {
		
		return "systems";
	}
}
