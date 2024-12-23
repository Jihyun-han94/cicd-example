package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CicdExampleApplication {
	
	@GetMapping("/")
	public String helloWorld() {
		return "helloWorld";
	}
	
	@GetMapping("/cicd-example")
	public String cicdExampleHandler() {
		return "Welcome";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(CicdExampleApplication.class, args);
	}

}
