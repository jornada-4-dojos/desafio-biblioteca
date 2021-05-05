package com.deveficiente.biblioteca.cadastroexemplar;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deveficiente.biblioteca.cadastrolivro.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

	Livro findByIsbn(String isbn);
}
