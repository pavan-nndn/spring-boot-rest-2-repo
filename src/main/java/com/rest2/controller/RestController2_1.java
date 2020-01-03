package com.rest2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController2_1 {
	
	@GetMapping("/getname")
	public String getName() {
		return "hi this is pavan";
	}
	@GetMapping("/getage")
	public String getAge() {
		return "30";
	}
}
