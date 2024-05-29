package com.example.holamundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HolaMundoApplication {

	public static void main(String[] args) {

		SpringApplication.run(HolaMundoApplication.class, args);
	}

	@GetMapping("/hola")
	public String holaMundo(){
		return "Hola Mundo!!";
	}
	@GetMapping("/chau")
	public String chau(){
		return "Chau!!";
	}


}
