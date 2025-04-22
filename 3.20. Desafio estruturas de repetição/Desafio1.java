/*
1) Desafio da estrutura for
Escreva um programa que solicita 10 números para o 
usuário e imprime na saída a soma dos números digitados.

Permita que o usuário digite apenas números pares. Caso um 
número ímpar seja informado, ignore e solicite um novo número ao usuário.
*/
import java.util.Scanner;

public class Desafio1 {
	public static void main(String[] args){
		int numero;
		int soma = 0;
		Scanner entrada = new Scanner(System.in);

		for (int i = 1; i <= 10; i++){
			System.out.printf("%d° numero par: ", i);
			numero = entrada.nextInt();
			if (numero % 2 == 0){
			  soma += numero;
			} else {
			  System.out.println("Numeros impares nao serao somados");
			  i--;
			}
			
			
		}
		System.out.printf("A soma é: %d", soma);
		
	}
}