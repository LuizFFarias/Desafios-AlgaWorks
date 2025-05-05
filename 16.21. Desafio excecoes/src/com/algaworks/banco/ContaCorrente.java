package com.algaworks.banco;

import com.algaworks.banco.exceptions.AcoesBancoException;
import com.algaworks.banco.exceptions.ContaInativaException;
import com.algaworks.banco.exceptions.SaldoInsuficienteException;
import com.algaworks.banco.exceptions.ValorInsuficienteException;

public class ContaCorrente {

    private String numero;
    private double saldo;
    private boolean ativa;

    public ContaCorrente(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public boolean isInativa() {
        return !isAtiva();
    }

    public void ativar() {
        this.ativa = true;
    }

    public void inativar() {
        this.ativa = false;
    }

    public boolean sacar(double valor) throws AcoesBancoException {

            if (valor <= 0) {
                throw new ValorInsuficienteException("Erro ao sacar: Valor de saque deve ser maior que 0");
            }

            if (valor > this.saldo) {
                throw new SaldoInsuficienteException("Erro ao sacar: Conta sem saldo");
            }

            if (isInativa()) {
                throw new ContaInativaException("Erro ao sacar: Conta inativa");
            }

            this.saldo -= valor;
            return true;

    }

    public boolean depositar(double valor) throws AcoesBancoException{
        if (valor <= 0) {
            throw new ValorInsuficienteException("Erro ao depositar: Valor de depósito deve ser maior que 0");
        }

        if (isInativa()) {
            throw new ContaInativaException("Erro ao depositar: Conta inativa");
        }

        this.saldo += valor;
        return true;
    }

    public boolean transferir(ContaCorrente contaDestino, double valor) throws AcoesBancoException{
        if (contaDestino.isInativa()) {
            throw new ContaInativaException("Erro ao transferir: Conta de destino está inativa");
        }

        if (sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        } else {
            throw new AcoesBancoException("Erro ao transferir: saque negado");
        }
    }

}