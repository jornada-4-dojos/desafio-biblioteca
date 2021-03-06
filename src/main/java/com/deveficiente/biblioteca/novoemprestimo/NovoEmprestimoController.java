package com.deveficiente.biblioteca.novoemprestimo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NovoEmprestimoController {

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private ChecaPrazoValidator checaPrazoValidator;

	@Autowired
	private ChecaDisponibilidadeLivroValidator checaDisponibilidadeLivroValidator;
	
	@Autowired
	private TipoCirculacaoUsuarioValidator tipoCirculacaoUsuarioValidator;

	@InitBinder
	public void init(WebDataBinder binder) {
		binder.addValidators(this.checaPrazoValidator, this.checaDisponibilidadeLivroValidator,
				this.tipoCirculacaoUsuarioValidator);
	}

	@PostMapping("/emprestimos")
	@Transactional
	public String criarEmprestimo(@RequestBody @Valid EmprestimoRequest request) {
		var emprestimo = request.toModel(this.entityManager);
		return request.toString();
	}

}
