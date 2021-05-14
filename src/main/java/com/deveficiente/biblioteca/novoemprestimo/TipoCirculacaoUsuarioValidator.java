package com.deveficiente.biblioteca.novoemprestimo;

import com.deveficiente.biblioteca.novousuario.Usuario;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class TipoCirculacaoUsuarioValidator implements Validator {

	@PersistenceContext
	private EntityManager manager;

    @Override
    public boolean supports(Class<?> clazz) {
        return EmprestimoRequest.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        if (errors.hasErrors())
            return;

        EmprestimoRequest request = (EmprestimoRequest) target;

        Usuario usuario = this.manager.find(Usuario.class, request.getIdUsuario());
		Assert.notNull(usuario, "O usuário não pode ser nulo");

        if (!request.getTipoCirculacao().aceitaEmprestimo(usuario.getTipoUsuario())) {
			errors.rejectValue("tipoCirculacao", null, "O usuário não pode pedir empréstimo para o tipo de circulação enviada");
        }

    }

}
