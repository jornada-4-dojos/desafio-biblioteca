package com.deveficiente.biblioteca.cadastroexemplar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exemplar {

	private final TipoCirculacao tipoCirculacao;
	private final String isbn;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	public Exemplar(TipoCirculacao tipoCirculacao, String isbn) {
		this.tipoCirculacao = tipoCirculacao;
		this.isbn = isbn;
	}
}
