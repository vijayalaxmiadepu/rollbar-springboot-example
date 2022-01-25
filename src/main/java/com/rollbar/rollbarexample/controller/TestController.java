package com.rollbar.rollbarexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rollbar.notifier.Rollbar;

@RestController
public class TestController {
	
	@Autowired
	Rollbar rollbar;

	@GetMapping("/testRollbar")
	public String testRollbar() {
		rollbar.info("Test Rollbar Logs");
		rollbar.debug("Test Debug Rollbar logs");
		return "Test Rollbar logs";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		rollbar.info("Welcome Rollbar Logs");
		return "Welcome";
	}
}
