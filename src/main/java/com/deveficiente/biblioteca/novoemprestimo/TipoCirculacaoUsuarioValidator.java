package com.deveficiente.biblioteca.novoemprestimo;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class TipoCirculacaoUsuarioValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return EmprestimoRequest.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		if(errors.hasErrors())
			return;
		
		EmprestimoRequest request = (EmprestimoRequest)	target;
		
		
	}

}
