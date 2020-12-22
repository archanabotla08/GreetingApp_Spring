package com.example.demo.greetingapp.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.greetingapp.model.Greeting;
import com.example.demo.greetingapp.service.GreetingService;
import com.example.demo.greetingapp.service.IGreetingService;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s ";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	public IGreetingService GreetingService;
	
	//http://localhost:8080/greeting -default
	//http://localhost:8080/greeting/?name=archana -withValue
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name",defaultValue="Hello World") String name) {

		return new Greeting(counter.incrementAndGet(),String.format(template, name));
	}
	
	@GetMapping("/greetingMsg")
	public String greetingService(String msg) {
		return GreetingService.message(msg);
	}
}