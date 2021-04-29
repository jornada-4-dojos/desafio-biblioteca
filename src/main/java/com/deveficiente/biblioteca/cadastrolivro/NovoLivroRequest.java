package com.deveficiente.biblioteca.cadastrolivro;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.deveficiente.biblioteca.validator.UniqueValue;

public class NovoLivroRequest {

	@NotBlank
	private String titulo;
	
	@NotNull
	private BigDecimal preco;
	
	@NotBlank
	@UniqueValue(entity = Livro.class, field = "isbn")
	private String isbn;

	public NovoLivroRequest(@NotNull String titulo, @NotNull BigDecimal preco, @NotBlank String isbn) {
		super();
		this.titulo = titulo;
		this.preco = preco;
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "NovoLivroRequest [titulo=" + titulo + ", preco=" + preco + ", isbn=" + isbn + "]";
	}


	public Livro toModel() {
		return  new Livro(titulo, preco, isbn);
	}
}
