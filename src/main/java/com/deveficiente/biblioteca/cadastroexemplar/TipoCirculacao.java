package com.deveficiente.biblioteca.cadastroexemplar;

import com.deveficiente.biblioteca.novousuario.TipoUsuario;
import org.springframework.util.Assert;

public enum TipoCirculacao {
    LIVRE {
        @Override
        public boolean aceitaEmprestimo(TipoUsuario tipoUsuario) {
            return true;
        }
    }, RESTRITO {
        @Override
        public boolean aceitaEmprestimo(TipoUsuario tipoUsuario) {
            Assert.notNull(tipoUsuario, "O tipo usuário não pode ser nulo");
            return TipoUsuario.PESQUISADOR.equals(tipoUsuario);
        }
    };

    public abstract boolean aceitaEmprestimo(TipoUsuario tipoUsuario);
}
