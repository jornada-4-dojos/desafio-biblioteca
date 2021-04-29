package com.deveficiente.biblioteca.cadastrolivro;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroLivroController {

	@PersistenceContext
	private EntityManager manager;
	
	@Transactional
	@PostMapping("/livros")
	public Long cria(@RequestBody @Valid NovoLivroRequest request) {
		Livro novoLivro = request.toModel();
		manager.persist(novoLivro);

		return novoLivro.getId();

	}
	
}
