package com.deveficiente.biblioteca.novoemprestimo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.deveficiente.biblioteca.novousuario.TipoUsuario;
import com.deveficiente.biblioteca.novousuario.Usuario;

@Component
public class ChecaPrazoValidator implements Validator{
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public boolean supports(Class<?> clazz) {
		return EmprestimoRequest.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		if(errors.hasErrors()) 
			return;
		
		EmprestimoRequest request = (EmprestimoRequest)target;
		Usuario usuario = entityManager.find(Usuario.class, request.getIdUsuario());
		
		if(TipoUsuario.PADRAO.equals(usuario.getTipoUsuario())) {
			if(request.getDias() == null) {
				errors.rejectValue("dias", "campo 'dias' precisa estar preenchido para usuário padrão");
			}
		}
		
	}

}
