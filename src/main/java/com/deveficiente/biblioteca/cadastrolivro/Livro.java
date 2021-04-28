package com.deveficiente.biblioteca.cadastrolivro;

import java.math.BigDecimal;

public class Livro {

    private String titulo;
    private String isbn;
    private BigDecimal preco;

    public Livro(String titulo, BigDecimal preco, String isbn) {
        this.titulo = titulo;
        this.preco = preco;
        this.isbn = isbn;
    }
}
