package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class Proj1Application {
	
	@GetMapping("/")
	public String welcome() {
		return "Test application for OpenShift";
	}
	
	@GetMapping("/{name}")
	public String sayHello(@PathVariable String name) {
		return "Hello"+name;
	}

	public static void main(String[] args) {
		SpringApplication.run(Proj1Application.class, args);
	}
}
