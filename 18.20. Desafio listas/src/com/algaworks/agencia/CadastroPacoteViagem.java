package com.algaworks.agencia;

import java.awt.*;
import java.util.*;
import java.util.List;

public class CadastroPacoteViagem {

    private ArrayList<PacoteViagem> pacotes = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {
        PacoteViagem novoPacote = new PacoteViagem(descricao, precoDiaria);

        if(pacotes.contains(novoPacote)){
            throw new PacoteJaExistenteException("O pacote já existe");
        }
        pacotes.add(novoPacote);
    }

    public List<PacoteViagem> obterTodos() {
        return pacotes;
    }

    public void ordenar() {
        Collections.sort(pacotes);

    }

    public void ordenarPorPrecoDecrescente() {
        Collections.sort(pacotes, new PacoteViagemComparator());

    }

    public void removerPorDescricao(String descricao) {
        Iterator<PacoteViagem> pacoteViagemIterator = pacotes.iterator();
        boolean pacoteRemovido = false;
        while (pacoteViagemIterator.hasNext()) {
            if (pacoteViagemIterator.next().getDescricao().equals(descricao)) {
                pacoteViagemIterator.remove();
                pacoteRemovido = true;
            }
        }
        if (!pacoteRemovido){
            throw new PacoteNaoEncontradoException("Erro ao remover: Pacote não encontrado");
        }
    }

    public PacoteViagem buscarPorDescricao(String descricao) {
        for (PacoteViagem pacote : pacotes) {
            if (pacote.getDescricao().equals(descricao)){
                return pacote;
            }
        }
        throw new PacoteNaoEncontradoException("Erro ao buscar: Pacote não encontrado!");
    }

}