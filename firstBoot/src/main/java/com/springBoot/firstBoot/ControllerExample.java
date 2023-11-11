package com.springBoot.firstBoot;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerExample implements ErrorController {

	private static final String PATH="/error";
	
	@RequestMapping(value="/msg",method = RequestMethod.GET)
	public String getMessage() {
		
		return "Hello Spring Boot Application";
	}
	
	@GetMapping(value="/msg1")
	public String getMsg() {
		return "Welcome to Spring Boot";
		
	}
	
	@RequestMapping(value=PATH)
	public String getErrorMessage() {
		return "Requested Page not found";
		
	}
	
	public String getErrorPath() {
		return PATH;
		
	}
	
	
	
}
