package com.deveficiente.biblioteca.cadastroexemplar;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NovoExemplarController {

	@Autowired
	private LivroRepository livroRepository;

	@PersistenceContext
	private EntityManager manager;

	@PostMapping("/livros/exemplares")
	@Transactional
	public Long cria(@RequestBody @Valid NovoExemplarRequest request) {
		Exemplar novoExemplar = request.toModel(livroRepository);
		this.manager.persist(novoExemplar);
		return novoExemplar.getId();
	}
	
}
