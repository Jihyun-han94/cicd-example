package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

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
	
	//webhook 테스트2
	@GetMapping("/notice")
	public String notice() {
		return "notice list";
	}
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CicdExampleApplication.class);
    }
    
	@Override
	protected WebApplicationContext run(SpringApplication application) {
		return super.run(application);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CicdExampleApplication.class, args);
	}

}
