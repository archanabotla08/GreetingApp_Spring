package com.example.demo.greetingapp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.greetingapp.model.User;

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
	
	//	http://localhost:8080/hellorestcontrollerss/param/archana
	@RequestMapping("/param/{fname}")
	public String sayHelloParam(@PathVariable String fname) {
		return "Hello " + fname + "!!" ;
	}
	
	//http://localhost:8080/hellorestcontrollerss/post
	@RequestMapping("/post")
	public String sayHelloPost(@RequestBody User user) {
		return "Hello "+ user.getFirstName() + " " + user.getLastName() + "!!" ;
	}
	
	//http://localhost:8080/hellorestcontrollerss/put/archana/?lastName=happy
	@PutMapping("/put/{firstName}")
	public String sayHelloPut(@PathVariable String firstName,@RequestParam("lastName") String lastName) {
		return "Hello " + firstName + " " + lastName + "!!!" ;
	}
}

