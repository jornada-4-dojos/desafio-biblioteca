package com.deveficiente.biblioteca.novousuario;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NovoUsuarioController {

	@PersistenceContext
	EntityManager manager;
    @PostMapping("/usuarios")
    @Transactional
    public Long novoUsuario(@RequestBody NovoUsuarioRequest request) {
        var usuario = request.toModel();
        
        manager.persist(usuario);
        
        return usuario.getId();
    }

}
