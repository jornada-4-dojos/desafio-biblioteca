package com.deveficiente.biblioteca.novoemprestimo;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NovoEmprestimoController {

	@PostMapping("/emprestimo")
	public EmprestimoResponse criarEmprestimo(@Valid EmprestimoRequest request) {
		
	}
}
