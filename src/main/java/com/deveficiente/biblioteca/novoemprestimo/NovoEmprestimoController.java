package com.deveficiente.biblioteca.novoemprestimo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NovoEmprestimoController {

	@PersistenceContext
	private EntityManager entityManager;

	@PostMapping("/emprestimos")
	@Transactional
	public String criarEmprestimo(@RequestBody @Valid EmprestimoRequest request) {
		var emprestimo = request.toModel(this.entityManager);
		return request.toString();
	}

}
