package com.example.demo.greetingapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellorestcontrollerss")
public class HelloRestController {
	
	@RequestMapping(value= {"","/","/home"})
	public String sayHello() {
		return "HelloWorld from rest";
	}
	
}
