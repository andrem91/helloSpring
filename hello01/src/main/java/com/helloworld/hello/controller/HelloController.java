package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello Spring Boot!!"
				+ "A mentalidade que utilizei para realizar este projeto foi de crescimento pois acredito que dei um grande salto em meu aprendizado com este simples Hello World"
				+ "A habilidade utilizada por mim para relizar este projeto foi de atenção aos detalhes pois um erro mínimo poderia resultar um erro.";
	}
}
