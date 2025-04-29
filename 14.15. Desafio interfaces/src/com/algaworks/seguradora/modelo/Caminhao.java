package com.algaworks.seguradora.modelo;

public class Caminhao extends VeiculoAutomotor{

    private int quantidadeEixo;

    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeEixo) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeEixo = quantidadeEixo;
    }


    @Override
    public double calcularValorPremio() {
        return (getValorMercado() * 0.02) + (quantidadeEixo * 50);
    }

    @Override
    public String descrever() {
        return String.format("Caminhão %s ano %d, %d eixos, avaliado em R$%.2f", getModelo(), getAnoFabricacao(), quantidadeEixo, getValorMercado());
    }
}
