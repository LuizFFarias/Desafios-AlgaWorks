package br.com.algaworks.impostos.contribuinte;

public class Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }

    public Pessoa(String nome) {
        if(nome.isEmpty()){
            throw new IllegalArgumentException("O nome não pode estar vazio");
        }
        this.nome = nome;
    }

    public double calcularImpostos(){
        return 0;
    }
}
