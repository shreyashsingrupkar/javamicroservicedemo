package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstMassage {

	@GetMapping(value="/show")
	String messageShow() {
		return "How are you?";
	}
	
	
	@GetMapping(value="/")
	String messageShow2() {
		return"hello";
	}
}
