package com.algaworks.funcionarios;

import com.algaworks.holerite.Holerite;

public class Funcionario {

    private String nome;
    private double valorHora;

    public Funcionario (String nome, double valorHora){
        this.nome = nome;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    protected double calcularSalario(int horasTrabalhadas){
        if (valorHora <= 0){
            throw new IllegalArgumentException("O valor da hora é negativo ou é 0");
        }

        double salario = horasTrabalhadas * valorHora;

        return salario;
    }

    public Holerite gerarHolerite(int horasTrabalhadas, String mesAno){
        if (nome.isEmpty()){
            throw new IllegalArgumentException("O nome não pode estar vazio");
        }
        if (horasTrabalhadas <= 0){
            throw new IllegalArgumentException("As horas trabalhadas estão incorretas ou são insuficientes");
        }
        if (mesAno.isEmpty()){
            throw new IllegalArgumentException("O mes/ano não pode estar vazio");
        }

        var salario = calcularSalario(horasTrabalhadas);

        return new Holerite(nome, mesAno, salario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", valorHora=" + valorHora +
                '}';
    }
}
