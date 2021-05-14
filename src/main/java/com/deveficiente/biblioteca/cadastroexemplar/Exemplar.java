package com.deveficiente.biblioteca.cadastroexemplar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.deveficiente.biblioteca.cadastrolivro.Livro;

@Entity
public class Exemplar {

	private TipoCirculacao tipoCirculacao;

	@ManyToOne
	private Livro livro;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Deprecated
	public Exemplar() {
	}

	public Exemplar(@NotNull TipoCirculacao tipoCirculacao, @NotNull Livro livro) {
		this.tipoCirculacao = tipoCirculacao;
		this.livro = livro;
	}

	public Long getId() {
		return id;
	}

	public TipoCirculacao getTipoCirculacao() {
		return tipoCirculacao;
	}

	public boolean mesmaCirculacao(TipoCirculacao tipoCirculacao) {
		return this.tipoCirculacao.equals(tipoCirculacao);
	}

	public boolean estaDisponivel(){
		return true;
	}

}
