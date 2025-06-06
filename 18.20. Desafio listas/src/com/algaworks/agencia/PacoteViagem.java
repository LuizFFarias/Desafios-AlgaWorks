package com.algaworks.agencia;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

public class PacoteViagem implements Comparable<PacoteViagem>{

    private String descricao;
    private double precoPorPessoa;

    public PacoteViagem(String descricao, double precoPorPessoa) {
        Objects.requireNonNull(descricao);

        if (precoPorPessoa < 0) {
            throw new IllegalArgumentException("Preço por pessoa não pode ser negativo");
        }

        this.descricao = descricao;
        this.precoPorPessoa = precoPorPessoa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoPorPessoa() {
        return precoPorPessoa;
    }

    public void setPrecoPorPessoa(double precoPorPessoa) {
        this.precoPorPessoa = precoPorPessoa;
    }

    @Override
    public String toString() {
        return "PacoteViagem{" +
                "descricao='" + descricao + '\'' +
                ", precoPorPessoa=" + precoPorPessoa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PacoteViagem that = (PacoteViagem) o;
        return Double.compare(precoPorPessoa, that.precoPorPessoa) == 0 && Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(descricao);
        result = 31 * result + Double.hashCode(precoPorPessoa);
        return result;
    }

    @Override
    public int compareTo(PacoteViagem o) {
        return descricao.compareTo(o.getDescricao());
    }


}