package com.deveficiente.biblioteca.novoemprestimo;

import com.deveficiente.biblioteca.novousuario.Usuario;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class ChecaPrazoValidator implements Validator {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean supports(Class<?> clazz) {
        return EmprestimoRequest.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        if (errors.hasErrors())
            return;

        EmprestimoRequest request = (EmprestimoRequest) target;
        Usuario usuario = entityManager.find(Usuario.class, request.getIdUsuario());

        if (!usuario.getTipoUsuario().prazoValido(request.getDias())) {
            errors.rejectValue("dias", "campo 'dias' está inválido");
        }

    }

}
