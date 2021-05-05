package com.deveficiente.biblioteca.cadastroexemplar;

import javax.transaction.Transactional;
import javax.validation.Valid;

import com.deveficiente.biblioteca.cadastrolivro.Livro;
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
	@Transactional
	public String cria(@RequestBody @Valid NovoExemplarRequest request) {
		Exemplar novoExemplar = request.toModel();
		return novoExemplar.toString();
	}
	
}
