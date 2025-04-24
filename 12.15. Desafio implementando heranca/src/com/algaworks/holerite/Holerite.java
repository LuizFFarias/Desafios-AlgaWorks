package com.algaworks.holerite;

public record Holerite(String nome, String mesAno, double valorSalario) {

    public void imprimir(){
        System.out.println(" ---- Holerite ----");
        System.out.printf("Nome: %s\nData: %s\nSalário: %.2f", nome, mesAno, valorSalario);
    }
}
