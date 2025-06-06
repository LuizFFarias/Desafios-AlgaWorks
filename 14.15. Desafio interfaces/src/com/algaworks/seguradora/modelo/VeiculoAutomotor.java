package com.algaworks.seguradora.modelo;

import java.util.Objects;

public abstract class VeiculoAutomotor implements BemSeguravel{

    private String modelo;
    private double valorMercado;
    private int anoFabricacao;

    public VeiculoAutomotor(String modelo, double valorMercado, int anoFabricacao) {
        if (modelo.isEmpty() || valorMercado <= 0 || anoFabricacao <= 1950 || anoFabricacao > 2025){
            throw new IllegalArgumentException("Os dados do veiculo estão incorretos.");
        }
        this.modelo = modelo;
        this.valorMercado = valorMercado;
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}
