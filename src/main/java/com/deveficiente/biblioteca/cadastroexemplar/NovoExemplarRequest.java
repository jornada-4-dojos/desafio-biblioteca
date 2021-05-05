package com.deveficiente.biblioteca.cadastroexemplar;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.deveficiente.biblioteca.cadastrolivro.Livro;
import com.deveficiente.biblioteca.validator.ExistsValue;
import org.springframework.util.Assert;

public class NovoExemplarRequest {

	@NotNull
    private TipoCirculacao tipoCirculacao;

    @NotBlank
	@ExistsValue(entity = Livro.class, field = "isbn")
    private String isbn;

	public NovoExemplarRequest(@NotNull TipoCirculacao tipoCirculacao, @NotBlank String isbn) {
		this.tipoCirculacao = tipoCirculacao;
		this.isbn = isbn;
	}

	public Exemplar toModel(LivroRepository livroRepository) {
		var livro = livroRepository.findByIsbn(isbn);
		Assert.notNull(livro, "Um exemplar não pode ser criado com um livro nulo");
		return new Exemplar(tipoCirculacao, livro);
	}
    
}
