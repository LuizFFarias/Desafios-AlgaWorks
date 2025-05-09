package com.algaworks.agencia;

public class PacoteJaExistenteException extends RuntimeException {
    public PacoteJaExistenteException(String message) {

      super(message);
    }

    public PacoteJaExistenteException(String message, Throwable cause){
      super(message, cause);
    }
}
