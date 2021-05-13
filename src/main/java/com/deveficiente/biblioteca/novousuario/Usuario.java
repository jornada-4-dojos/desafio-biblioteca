package com.deveficiente.biblioteca.novousuario;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private TipoUsuario tipoUsuario;

    @Deprecated
	public Usuario() {
	}

	public Usuario(TipoUsuario tipoUsuario) {
		super();
		this.tipoUsuario = tipoUsuario;
	}
    
	public Long getId() {
		return id;
	}
	
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

}
