package com.rollbar.rollbarexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rollbar.notifier.Rollbar;

import lombok.extern.slf4j.Slf4j;

@Slf4j
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
		rollbar.debug("Welcome debug");
		rollbar.critical("welcome critical");
		rollbar.warning("welcome warning");
		rollbar.log("Welcome log");
		return "Welcome";
	}
}
