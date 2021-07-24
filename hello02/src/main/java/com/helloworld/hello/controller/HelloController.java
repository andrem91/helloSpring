package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello Spring Boot!!!"
				+ "Meus objetivos de aprendizagem para a próxima semana é aprender a dominar o Spring Boot para construir minhas aplicações Back End";
	}
	
}
