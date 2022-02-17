package com.rollbar.rollbarexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
    "com.rollbar.rollbarexample",
    "com.rollbar.spring",
})
public class RollbarexampleApplication {

//adding
	public static void main(String[] args) {
		SpringApplication.run(RollbarexampleApplication.class, args);
	}

}
