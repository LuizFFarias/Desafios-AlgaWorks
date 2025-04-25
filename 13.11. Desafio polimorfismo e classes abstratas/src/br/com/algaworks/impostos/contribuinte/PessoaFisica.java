package br.com.algaworks.impostos.contribuinte;

public class PessoaFisica extends Pessoa{

    public final double RECEITA_ANUAL_ISENCAO = 50000;
    public final double ALIQUOTA_IMPOSTO_RENDA = 0.20;

    private double receitaAnual;

    public double getReceitaAnual() {
        return receitaAnual;
    }

    public PessoaFisica(String nome, double receitaAnual) {
        super(nome);
        if (receitaAnual <= 0){
            throw new IllegalArgumentException("a receita não pode ser 0 ou negativa");
        }
        this.receitaAnual = receitaAnual;
    }

    @Override
    public double calcularImpostos(){
        //TODO calcular imposto pessoa fisica
        double impostos;
        if (receitaAnual < RECEITA_ANUAL_ISENCAO) {
            impostos = 0;
        } else {
            impostos = receitaAnual * ALIQUOTA_IMPOSTO_RENDA;
        }
        return impostos;
    }



}
