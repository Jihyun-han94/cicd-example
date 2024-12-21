package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class CicdExampleApplication {
	
	@GetMapping("/")
	public String helloWorld() {
		return "helloWorld";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CicdExampleApplication.class, args);
	}

}
