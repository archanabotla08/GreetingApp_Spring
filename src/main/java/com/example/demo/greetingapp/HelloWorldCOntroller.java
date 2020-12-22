package com.example.demo.greetingapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworldrestcontrollerss")
public class HelloWorldCOntroller {
	
	@RequestMapping(value= {"","/","/home"})
	public String sayHello() {
		return "HelloWorld";
	}
	
}