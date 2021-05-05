package com.deveficiente.biblioteca.novousuario;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NovoUsuarioController {

    @PostMapping("/usuarios")
    public Long novoUsuario(@RequestBody NovoUsuarioRequest request) {
        var usuario = request.toModel();
        return null;
    }

}
