package com.rollbar.rollbarexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rollbar.notifier.Rollbar;
import com.rollbar.spring.webmvc.RollbarSpringConfigBuilder;


@Configuration
public class RollbarConfig {
	@Bean
	  public Rollbar rollbar() {

	    // Your ACCESS TOKEN is: a849571ab3d441958add409d54479f3c
	    // Make sure to keep this secure
	    return new Rollbar(RollbarSpringConfigBuilder.withAccessToken("a849571ab3d441958add409d54479f3c")
	            .environment("development")
	            .build());
	  }
}
