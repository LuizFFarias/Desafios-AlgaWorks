/*
2) Desafio da estrutura for (intermediário)
Escreva um programa que solicita um número inteiro positivo para o 
usuário e imprime na saída uma mensagem dizendo se o número digitado 
é um número primo ou não.

Números primos são números naturais que possuem dois divisores: 1 e 
ele mesmo.

Por exemplo, o número 1 não é um número primo, porque ele tem apenas 
o número 1 (ele mesmo) como divisor. O número 2 é primo, porque ele é 
divisível por 1 e ele mesmo. O número 4 não é primo, porque ele é divisível 
por 1, 2 e 4.

Para saber se um número é divisível por outro, basta usar o operador de 
módulo (resto) e avaliar se é igual a 0.
*/

import java.util.Scanner;

public class Desafio2 {
	public static void main(String[] args){
		int numero;
		boolean isPrimo = false;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um numero: ");
		numero = entrada.nextInt();

		for (int i = 2; i < numero; i++){
		  if (numero % i == 0){
			 System.out.printf("O numero %d nao e primo.", numero);
			 isPrimo = false;
			 break;
			} else {
			 isPrimo = true;
			}
		}
		
		if (isPrimo){
		 System.out.printf("O numero %d e primo", numero);
		}
		

		
	}
}