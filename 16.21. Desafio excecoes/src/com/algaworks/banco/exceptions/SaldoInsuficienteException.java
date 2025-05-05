package com.algaworks.banco.exceptions;

public class SaldoInsuficienteException extends AcoesBancoException{
    public SaldoInsuficienteException(String message) {
        super(message);
    }

    public SaldoInsuficienteException(String message, Throwable cause){
        super(message, cause);
    }
}
