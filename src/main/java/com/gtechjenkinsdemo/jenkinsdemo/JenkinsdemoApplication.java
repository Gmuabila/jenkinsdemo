package com.gtechjenkinsdemo.jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsdemoApplication {

	@GetMapping
	public String message(){
		return "Welcome to GTech Jenkins Demo for the First Time...";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsdemoApplication.class, args);
	}

}
