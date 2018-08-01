package com.qa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.qa.service.UserService;
import com.qa.utility.JSONUtility;

@SpringBootApplication 
public class Application {

	@Bean
	UserService userServive() {
		return new UserService();
	}
	
	@Bean
	JSONUtility JSONUtil() {
		return new JSONUtility();
	}
	

	public static void main(String args[]) throws Exception {
		SpringApplication.run(Application.class, args);
	}

}
