package br.com.algaworks.impostos;

import br.com.algaworks.impostos.contribuinte.PessoaFisica;
import br.com.algaworks.impostos.contribuinte.empresa.EmpresaLucroReal;
import br.com.algaworks.impostos.contribuinte.empresa.EmpresaSimples;
import br.com.algaworks.impostos.gestor.GestorDeImpostos;

public class Main {
    public static void main(String[] args) {

        var gestorImpostos = new GestorDeImpostos();

        var joao = new PessoaFisica("Joao da Silva", 45_000);
        var maria = new PessoaFisica("Maria Souza", 180_000);

        gestorImpostos.adicionar(joao);
        gestorImpostos.adicionar(maria);

        System.out.printf("---- Gestor de Impostos ----\n" +
                "Total de impostos: R$: %.2f\n----------------------------\n", gestorImpostos.getValorTotalImpostos());

        var barDoZe = new EmpresaSimples("Bar do zé", 250_000, 160_000);
        var codeConsultoria = new EmpresaLucroReal("Code Consultoria", 8_000_000, 3_000_000);

        gestorImpostos.adicionar(barDoZe);
        gestorImpostos.adicionar(codeConsultoria);

        System.out.printf("---- Gestor de Impostos ----\n" +
                "Total de impostos: R$: %.2f\n----------------------------\n", gestorImpostos.getValorTotalImpostos());


    }
}
