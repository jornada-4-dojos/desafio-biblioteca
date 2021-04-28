package com.deveficiente.biblioteca.cadastrolivro;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroLivroController {

	@PostMapping("/livros")
	public Long cria(@RequestBody @Valid NovoLivroRequest request) {

		Livro novoLivro = request.toModel();

		return "cadastro de livro...";

	}
	
}
