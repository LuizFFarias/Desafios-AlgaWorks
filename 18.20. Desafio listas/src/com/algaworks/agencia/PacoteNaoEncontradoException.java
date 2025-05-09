package com.algaworks.agencia;

public class PacoteNaoEncontradoException extends RuntimeException {
    public PacoteNaoEncontradoException(String message) {
        super(message);
    }

    public PacoteNaoEncontradoException(String message, Throwable cause) {
        super(message, cause);
    }
}
