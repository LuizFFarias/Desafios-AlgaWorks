package com.algaworks.seguradora.modelo;

public class CarroParticular extends VeiculoAutomotor{

    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio = getValorMercado() * 0.04;
        if (getAnoFabricacao() <= 1999){
            valorPremio += valorPremio * 0.5;
        }
        return valorPremio;
    }

    @Override
    public String descrever() {
        return String.format("Carro particular %s ano %d, avaliado em R$%.2f", getModelo(), getAnoFabricacao(), getValorMercado());
    }
}
