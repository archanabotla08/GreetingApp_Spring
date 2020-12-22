package com.example.demo.greetingapp.service;

import org.springframework.stereotype.Service;

import com.example.demo.greetingapp.model.Greeting;
import com.example.demo.greetingapp.model.User;

@Service
public class GreetingService implements IGreetingService{

	@Override
	public Greeting addGreeting(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Greeting getGreetingById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public  String message(String message) {
		// TODO Auto-generated method stub
		return "Hello World";
	}

}
