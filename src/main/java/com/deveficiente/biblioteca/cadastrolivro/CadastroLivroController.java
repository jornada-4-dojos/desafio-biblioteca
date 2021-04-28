package com.deveficiente.biblioteca.cadastrolivro;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroLivroController {

	@GetMapping("/novolivro")
	public String cria(@RequestBody @Valid NovoLivroRequest request) {
		return "cadastro de livro...";
		
	}
	
}
