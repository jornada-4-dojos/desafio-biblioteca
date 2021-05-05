package com.deveficiente.biblioteca.cadastrolivro;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String titulo;
    private String isbn;
    private BigDecimal preco;

    public Livro(String titulo, BigDecimal preco, String isbn) {
        this.titulo = titulo;
        this.preco = preco;
        this.isbn = isbn;
    }

    @Deprecated
    public Livro() {
    }

    public Long getId() {
    	return id;
    }
}
