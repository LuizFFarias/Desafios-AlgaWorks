package com.algaworks.seguradora.servico;

import com.algaworks.seguradora.modelo.BemSeguravel;

public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bem){
        System.out.println("\n------------\nProposta de seguro\n------------");
        System.out.println(bem.descrever());
        System.out.printf("Prêmio: R$%.2f", bem.calcularValorPremio());


    }
}
