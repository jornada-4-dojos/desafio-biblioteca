package com.deveficiente.biblioteca.cadastroexemplar;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class NovoExemplarController {

	/*
	 * 
    O ISBN do livro que vai ter o exemplar cadastrado é obrigatório
    O ISBN deve existir no sistema
    O tipo de circulação(restrita ou livre) é obrigatória

	 */

	@PostMapping("/livros/{isbn}/exemplares")
	public String cria(@PathVariable @RequestBody @Valid NovoExemplarRequest request) {
		//TODO: process POST request

		return "craindo";
	}
	
}
