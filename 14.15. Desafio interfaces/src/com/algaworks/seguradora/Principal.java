package com.algaworks.seguradora;

import com.algaworks.seguradora.modelo.Caminhao;
import com.algaworks.seguradora.modelo.CarroParticular;
import com.algaworks.seguradora.modelo.ImovelResidencial;
import com.algaworks.seguradora.servico.ServicoPropostaSeguro;

public class Principal {
    public static void main(String[] args) {
        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        ImovelResidencial imovelResidencial = new ImovelResidencial(2_300_000, 320);
        CarroParticular carro = new CarroParticular("HR-V", 150_000, 2022);
        Caminhao caminhao = new Caminhao("Actros", 780_000,2021, 4);

        servicoPropostaSeguro.emitir(imovelResidencial);
        servicoPropostaSeguro.emitir(carro);
        servicoPropostaSeguro.emitir(caminhao);
    }
}
