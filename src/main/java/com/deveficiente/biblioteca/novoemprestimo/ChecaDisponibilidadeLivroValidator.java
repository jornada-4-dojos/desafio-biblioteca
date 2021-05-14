package com.deveficiente.biblioteca.novoemprestimo;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.deveficiente.biblioteca.cadastrolivro.Livro;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class ChecaDisponibilidadeLivroValidator implements Validator {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean supports(Class<?> aClass) {
        return EmprestimoRequest.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        if (errors.hasErrors()) {
            return;
        }
        
        EmprestimoRequest request = (EmprestimoRequest) o;
        
        var livro = entityManager.find(Livro.class, request.getIdLivro());
        
        boolean temExemplarDisponivel = livro.temExemplarDisponivel(request.getTipoCirculacao());


    }
}
