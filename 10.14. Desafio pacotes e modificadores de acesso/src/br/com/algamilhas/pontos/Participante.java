package br.com.algamilhas.pontos;

import java.util.Objects;

public class Participante {

    private String nome;
    private int saldoDePontos;

    public Participante(String nome){
        this(nome, 10);
    }

    private Participante(String nome, int saldoDePontosInicial){
        Objects.requireNonNull(nome, "O nome não pode ser nulo");
        if (saldoDePontosInicial < 0) {
            throw new IllegalArgumentException("Os pontos devem ser positivos");
        }
        this.nome = nome;
        this.saldoDePontos = saldoDePontosInicial;
    }

    public void creditarPontos(int pontos){
        if (pontos < 0) {
            throw new IllegalArgumentException("Os pontos devem ser positivos");
        } else {
            saldoDePontos += pontos;
        }
    }



}
