package com.deveficiente.biblioteca.novousuario;

import javax.validation.constraints.NotNull;

public class NovoUsuarioRequest {

    @NotNull
    private TipoUsuario tipoUsuario;

    public NovoUsuarioRequest(@NotNull TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }


}
