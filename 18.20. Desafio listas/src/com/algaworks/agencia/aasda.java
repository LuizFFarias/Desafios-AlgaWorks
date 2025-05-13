package com.algaworks.agencia;

import java.util.Comparator;

public class aasda {



    public class Pessoa implements Comparable<Pessoa> {
        private String nome;
        private int idade;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        @Override
        public int compareTo(Pessoa outra) {
            return Integer.compare(this.idade, outra.idade); // ordena por idade
        }
    }

    public class ComparadorPorNome implements Comparator<Pessoa> {
        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return p1.getNome().compareTo(p2.getNome()); // ordena por nome
        }
    }

}
