package com.instructorrob.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/hello")
public class HomeController {
	@RequestMapping("")
	public String hello() {
		return "Hello world";
	}
	
	@RequestMapping("/randomdoe")
	public String random() {
		return "Did you know enthusiasm comes from the greek word entheos?";
	}

	@RequestMapping("/world")
	public String world() {
		return "Class level annotations are cool too!!";
	}
}
