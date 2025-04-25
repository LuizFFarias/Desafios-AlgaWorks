package br.com.algaworks.impostos.contribuinte.empresa;

import br.com.algaworks.impostos.contribuinte.Pessoa;

public class PessoaJuridica extends Pessoa {

    private double faturamentoAnual;
    private double despesaAnual;

    public double getFaturamentoAnual() {
        return faturamentoAnual;
    }

    public double getDespesaAnual() {
        return despesaAnual;
    }

    public PessoaJuridica(String nome, double faturamentoAnual, double despesaAnual) {
        super(nome);
        if (faturamentoAnual <= 0 || despesaAnual <= 0){
            throw  new IllegalArgumentException("O faturamento e despensa não pode ser 0 ou negativo");
        }
        this.faturamentoAnual = faturamentoAnual;
        this.despesaAnual = despesaAnual;
    }

    public double getLucroAnual(){
        return faturamentoAnual - despesaAnual;
    }
}
