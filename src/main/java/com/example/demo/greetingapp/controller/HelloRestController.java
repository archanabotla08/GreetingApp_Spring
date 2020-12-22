package com.example.demo.greetingapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellorestcontrollerss")
public class HelloRestController {
	
	@RequestMapping(value= {"","/","/home"})
	public String HelloWorld() {
		return "HelloWorld from rest";
	}
	//http://localhost:8080/hellorestcontrollerss/query/?fname=archana&lname=botla
		@RequestMapping(value = { "/queryName" }, method = RequestMethod.GET)
		public String sayHelloName(@RequestParam("fname") String fname, @RequestParam("lname") String lname) {
			return "Hello " + fname + " " + lname;
		}
	
	//http://localhost:8080/hellorestcontrollerss/query/?fname=archana&lname=botla
	@RequestMapping(value = { "/query" }, method = RequestMethod.GET)
	public String sayHello(@RequestParam("fname") String fname, @RequestParam("lname") String lname) {
		return "Hello " + fname + " " + lname;
	}
}
