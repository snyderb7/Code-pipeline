package com.pipeline.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.pipeline.entities.Greeting;

@EnableWebMvc
@RestController
public class HelloController {

	@RequestMapping(path = "/greeting", method = RequestMethod.GET)
	public Greeting sayHello(@RequestParam String name) {
		String message = "Welcome to Amazon " + name;
		Greeting dto = new Greeting();
		dto.setMessage(message);
		return dto;
	}
}
