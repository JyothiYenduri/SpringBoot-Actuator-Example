package com.example.springbootactuatordemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/hello")
	public String demo() {
		return "This is my first demo application using actuator";
		
	}
}
