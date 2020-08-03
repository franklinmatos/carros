package com.example.carros.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

	@GetMapping
	public String get() {
		return "Get Spring Boot";
	}

//	@GetMapping("/login")
//	public String login(@RequestParam("user") String login, @RequestParam("password") String senha) {
//		return "Login: " + login + " Senha: " + senha;
//	}

	@GetMapping("/login/{user}/senha/{password}")
	public String login(@PathVariable("user") String login, @PathVariable("password") String senha) {
		return "Login: " + login + " Senha: " + senha;
	}
	
	@GetMapping("/carros/{id}")
	public String getCarroById(@PathVariable("id") Long id) {
		return "Carro By id "+ id;
	}
	
	@GetMapping("/carros/tipo/{tipo}")
	public String getCarroByTipo(@PathVariable("tipo") String tipo) {
		return "Lista de carros "+ tipo;
	}
	

}
