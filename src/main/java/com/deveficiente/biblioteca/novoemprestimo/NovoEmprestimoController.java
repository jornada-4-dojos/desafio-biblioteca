package com.deveficiente.biblioteca.novoemprestimo;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NovoEmprestimoController {

	@PostMapping("/emprestimo")
	public Long criarEmprestimo(@RequestBody @Valid EmprestimoRequest request) {
		var emprestimo = request.toModel();
		return 0L;
	}
}
