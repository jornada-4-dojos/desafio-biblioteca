package com.deveficiente.biblioteca.novoemprestimo;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.deveficiente.biblioteca.cadastroexemplar.TipoCirculacao;

public class EmprestimoRequest {

	@NotNull
	private Long idUsuario;
	@NotNull
	private Long idLivro;
	@Positive
	@Max(value = 60)
	private int dias;
	private TipoCirculacao tipoCirculacao;
}
