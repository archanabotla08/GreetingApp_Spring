package com.example.demo.greetingapp.service;

import com.example.demo.greetingapp.model.Greeting;
import com.example.demo.greetingapp.model.User;

public interface IGreetingService {
	
	Greeting addGreeting(User user);
	Greeting getGreetingById(long id);
	public String message(String message);
}
