package br.com.algaworks.impostos.gestor;

import br.com.algaworks.impostos.contribuinte.Pessoa;

public class GestorDeImpostos {

    private double valorTotalImpostos;

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }

    public void adicionar(Pessoa pessoa){
        var impostos = pessoa.calcularImpostos();
        valorTotalImpostos += impostos;
        System.out.printf("Impostos de %s: R$: %.2f\n", pessoa.getNome(), impostos);
    }
}
