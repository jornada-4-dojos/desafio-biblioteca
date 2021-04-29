package com.deveficiente.biblioteca.cadastroexemplar;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NovoExemplarController {

	/*
	 * 
    O ISBN do livro que vai ter o exemplar cadastrado é obrigatório
    O ISBN deve existir no sistema
    O tipo de circulação(restrita ou livre) é obrigatória

	 */

	@PostMapping("/livros/exemplares")
	public String cria(@RequestBody @Valid NovoExemplarRequest request) {
		var novoLivro = request.toModel(); 

		return "craindo";
	}
	
}
