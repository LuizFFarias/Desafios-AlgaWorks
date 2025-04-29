package com.algaworks.seguradora.modelo;

public class ImovelResidencial implements BemSeguravel{

    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        if(valorMercado <= 0 || areaConstruida <= 0){
            throw new IllegalArgumentException("Valor de mercado e/ou área construída não podem ser 0 ou negativos.");
        }
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        return (valorMercado * 0.001) + (0.3 * areaConstruida);
    }

    @Override
    public String descrever() {
        //TODO descrever imovel
        return String.format("Imóvel residencial com %sm2 de área avaliado em R$%.2f", areaConstruida, valorMercado);
    }
}
