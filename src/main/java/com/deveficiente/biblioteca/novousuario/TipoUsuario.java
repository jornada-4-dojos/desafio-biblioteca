package com.deveficiente.biblioteca.novousuario;

public enum TipoUsuario {
    PADRAO {
        @Override
        public boolean prazoValido(Integer dias) {
            return dias != null && dias <= 60;
        }
    }, PEQUISADOR {
        @Override
        public boolean prazoValido(Integer dias) {
            return dias <= 60;
        }
    };

    public abstract boolean prazoValido(Integer dias);
}
