package com.deveficiente.biblioteca.novousuario;

import java.util.Optional;

public enum TipoUsuario {
    PADRAO {
        @Override
        public boolean prazoValido(Optional<Integer> dias) {
        	return dias.map(valor -> valor <= 60).orElse(false);
            
        }
    }, PESQUISADOR {
        @Override
        public boolean prazoValido(Optional<Integer> dias) {
        	return dias.map(valor -> valor <= 60).orElse(true);
        }
    };

    public abstract boolean prazoValido(Optional<Integer> dias);
}
