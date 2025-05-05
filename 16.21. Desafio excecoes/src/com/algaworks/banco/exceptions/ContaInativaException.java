package com.algaworks.banco.exceptions;

public class ContaInativaException extends AcoesBancoException{
    public ContaInativaException(String message) {
        super(message);
    }

    public ContaInativaException(String message, Throwable cause){
        super(message, cause);
    }
}
