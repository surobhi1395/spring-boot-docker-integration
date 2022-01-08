package com.sample.springdockerex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerExApplication {

	@GetMapping("/runImage")
	public String printMsg(){
		return "Spring Boot & Docker Integration !";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDockerExApplication.class, args);
	}

}
