package com.deveficiente.biblioteca.novoemprestimo;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.deveficiente.biblioteca.cadastroexemplar.TipoCirculacao;
import com.deveficiente.biblioteca.cadastrolivro.Livro;
import com.deveficiente.biblioteca.novousuario.Usuario;
import com.deveficiente.biblioteca.validator.ExistsValue;

public class EmprestimoRequest {

	@NotNull
	@ExistsValue(field = "id", entity = Usuario.class)
	private Long idUsuario;
	@NotNull
	@ExistsValue(field = "id", entity = Livro.class)
	private Long idLivro;
	@Positive
	@Max(value = 60)
	private Integer dias;
	@NotNull
	private TipoCirculacao tipoCirculacao;

	public EmprestimoRequest(@NotNull Long idUsuario,
							 @NotNull Long idLivro,
							 @Positive @Max(value = 60) Integer dias,
							 @NotNull TipoCirculacao tipoCirculacao) {
		this.idUsuario = idUsuario;
		this.idLivro = idLivro;
		this.dias = dias;
		this.tipoCirculacao = tipoCirculacao;
	}

	@Override
	public String toString() {
		return "EmprestimoRequest{" +
				"idUsuario=" + idUsuario +
				", idLivro=" + idLivro +
				", dias=" + dias +
				", tipoCirculacao=" + tipoCirculacao +
				'}';
	}

	public Emprestimo toModel(EntityManager entityManager) {
		return null;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public Optional<Integer> getDias() {
		return Optional.ofNullable(dias);
	}

	public Long getIdLivro() {
		return idLivro;
	}

	public TipoCirculacao getTipoCirculacao() {
		return tipoCirculacao;
	}
}
