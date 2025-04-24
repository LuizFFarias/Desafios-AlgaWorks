package com.algaworks.funcionarios;

public class Programador extends Funcionario{

    private double valorBonus;

    public Programador(String nome, double valorHora) {
        super(nome, valorHora);
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        this.valorBonus = valorBonus;
    }

    @Override
    public double calcularSalario(int horasTrabalhadas){
        if (getValorHora() <= 0){
            throw new IllegalArgumentException("O valor da hora é negativo ou é 0");
        }
        if (valorBonus < 0){
            throw new IllegalArgumentException("O valor do bônus é negativo");
        }

        double salario = (horasTrabalhadas * getValorHora()) + valorBonus;

        return salario;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "valorBonus=" + valorBonus +
                ", nome='" + getNome() + '\'' +
                ", valorHora=" + getValorHora() +
                '}';
    }
}
