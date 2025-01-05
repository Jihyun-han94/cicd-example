package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CicdExampleApplication  extends SpringBootServletInitializer {
	
	@GetMapping("/")
	public String helloWorld() {
		return "helloWorld";
	}
	
	@GetMapping("/cicd-example")
	public String cicdExampleHandler() {
		return "Welcome";
	}
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CicdExampleApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(CicdExampleApplication.class, args);
	}

}
