/*
5) Desafio da estrutura do-while
Escreva um programa que solicita números inteiros para o usuário de forma 
"infinita", até que o usuário escolha não digitar mais nenhum número (pergunte 
ao usuário após informar cada número).

Some todos os números ímpares e todos os números pares e imprima na saída o resultado.
*/

import java.util.Scanner;

public class Desafio5 {
	public static void main(String[] args){
	int numero;
	int pares = 0;
	int impares = 0;
	boolean continuar = true;
	boolean fstTime = true;
	Scanner ent = new Scanner(System.in);

	do {

	System.out.print("Digite um numero: ");
	numero = ent.nextInt();

	if (numero % 2 == 0){
		pares += numero;
	 } else {
		impares += numero; 
	 }
	 System.out.print("Deseja continuar?: ");
	 continuar = ent.nextBoolean();
	  
	} while (continuar == true);

	System.out.printf("Soma dos pares: %d%nSoma dos impares: %d", pares, impares);
			
	}
}