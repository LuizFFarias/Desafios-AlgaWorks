import java.util.Scanner;

public class CalculaPagamento {

 public static void main (String[] args) {
	  
	String nome;
	double valorHora;
	int horasTrabalhadas;
	double desconto;

	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Nome: ");
	nome = entrada.nextLine();

	System.out.print("Valro da hora trabalhada: ");
	valorHora = entrada.nextDouble();	

	System.out.print("Horas trabalhadas: ");
	horasTrabalhadas = entrada.nextInt();

 	System.out.print("Valor dos descontos: ");
	desconto = entrada.nextDouble();

	double resultValorHoras = valorHora * horasTrabalhadas;
	double totalDevido = resultValorHoras - desconto;

	System.out.printf("Folha de pagamento: %s%n %d Horas x R$%.2f = %.2f%n Descontos: %.2f%n Total devido: %.2f", nome, horasTrabalhadas, valorHora, resultValorHoras, desconto, totalDevido);

	

	
 }

}