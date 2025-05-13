package com.algaworks.agencia;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        CadastroPacoteViagem cadastro = new CadastroPacoteViagem();
        cadastro.adicionar("Istambul e Capadócia (20 noites)", 18_000);
        cadastro.adicionar("Neve em Bariloche (10 noites)", 11_000);
        cadastro.adicionar("Disney (10 noites)", 20_000);
        cadastro.adicionar("Natal Luz em Gramado (5 noites)", 8_500);

        aasda.Pessoa pessoa;
//        cadastro.removerPorDescricao("Disney (10 noites)");

//        cadastro.ordenar();
//        cadastro.ordenarPorPrecoDecrescente();

//        PacoteViagem pacoteEncontrado = cadastro.buscarPorDescricao("Disney (10 noites)");
//        System.out.println(pacoteEncontrado);

        imprimirPacotes(cadastro.obterTodos());
    }

    private static void imprimirPacotes(List<PacoteViagem> pacotes) {
        int i = 0;
        System.out.println("------- Pacotes de Viagem -------");
        for (PacoteViagem pacote : pacotes) {
            i ++;
            System.out.printf("%d° %s, Preço por pessoa R$:%.2f\n", i, pacote.getDescricao(), pacote.getPrecoPorPessoa());
        }
    }

}