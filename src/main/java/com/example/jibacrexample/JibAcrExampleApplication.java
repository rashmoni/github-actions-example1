package com.example.jibacrexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JibAcrExampleApplication {

	@GetMapping("/mesasage")
	public String message(){
		return "Welcome to Jib-acr-example application new";
	}

	public static void main(String[] args) {
		SpringApplication.run(JibAcrExampleApplication.class, args);
	}

}
