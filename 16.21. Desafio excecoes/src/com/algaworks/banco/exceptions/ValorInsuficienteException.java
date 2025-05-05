package com.algaworks.banco.exceptions;

public class ValorInsuficienteException extends AcoesBancoException {
    public ValorInsuficienteException(String message) {
        super(message);
    }

    public ValorInsuficienteException(String message, Throwable cause){
        super(message, cause);

    }
}
