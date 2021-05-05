package com.deveficiente.biblioteca.cadastroexemplar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.deveficiente.biblioteca.cadastrolivro.Livro;

@Entity
public class Exemplar {

	private final TipoCirculacao tipoCirculacao;
	private final Livro livro;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	public Exemplar(TipoCirculacao tipoCirculacao, Livro livro) {
		this.tipoCirculacao = tipoCirculacao;
		this.livro = livro;
	}
}
