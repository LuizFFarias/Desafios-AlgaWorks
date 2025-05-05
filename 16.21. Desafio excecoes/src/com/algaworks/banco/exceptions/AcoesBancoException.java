package com.algaworks.banco.exceptions;

public class AcoesBancoException extends RuntimeException {
    public AcoesBancoException(String message) {
        super(message);
    }

    public AcoesBancoException(String message, Throwable cause){
        super(message, cause);
    }
}
