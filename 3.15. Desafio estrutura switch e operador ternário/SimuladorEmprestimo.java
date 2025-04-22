/*
O cliente também te informou que a taxa de juros da financeira depende da quantidade de parcelas:

1 ou 2 parcelas: 1,99% ao mês
3 parcelas: 2,99% ao mês
Outras quantidades de parcelas: 3,99% ao mês
Além disso, caso o valor do empréstimo seja maior ou igual a 100, uma tarifa fixa será cobrada no valor de R$1,50.
*/

import java.util.Scanner;

public class SimuladorEmprestimo {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Valor do empréstimo: ");
    double valorEmprestimo = entrada.nextDouble();

    System.out.print("Quantidade de parcelas: ");
    int quantidadeParcelas = entrada.nextInt();

    double taxaJuros = switch (quantidadeParcelas) {
		case 1, 2 -> 1.99;
		case 3 -> 2.99;
		default -> 3.99;
	};

    double tarifaFixa = valorEmprestimo >= 100 ? 1.5 : 0; 
    double totalJuros = valorEmprestimo * (taxaJuros / 100 * quantidadeParcelas);
    double custoTotal = valorEmprestimo + tarifaFixa + totalJuros;

    System.out.printf("Tarifa fixa: R$%.2f%n", tarifaFixa);
    System.out.printf("Total de juros: R$%.2f%n", totalJuros);
    System.out.printf("Custo total: R$%.2f%n", custoTotal);
  }

}