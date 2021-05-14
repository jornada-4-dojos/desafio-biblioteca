package com.deveficiente.biblioteca.cadastrolivro;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.deveficiente.biblioteca.cadastroexemplar.Exemplar;
import com.deveficiente.biblioteca.cadastroexemplar.TipoCirculacao;

@Entity
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String titulo;
    private String isbn;
    private BigDecimal preco;
    @OneToMany(mappedBy = "livro")
    private List<Exemplar> exemplates = new ArrayList<Exemplar>();

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

	public boolean temExemplarDisponivel(TipoCirculacao tipoCirculacao) {
		return false;
	}
}
