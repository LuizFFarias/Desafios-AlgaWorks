package com.algaworks;

import com.algaworks.funcionarios.Funcionario;
import com.algaworks.funcionarios.Programador;
import com.algaworks.holerite.Holerite;

public class Principal {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Luiz Fillipe", 10);
        System.out.println(funcionario.toString());

        Holerite holeriteFuncionario = funcionario.gerarHolerite(40, "02/2025");
        holeriteFuncionario.imprimir();

        Programador programador = new Programador("Luiz Farias", 15);
        System.out.println("\n" + programador.toString());

        Holerite holeriteProgramador = programador.gerarHolerite(40, "03/2025");
        holeriteProgramador.imprimir();


    }
}
