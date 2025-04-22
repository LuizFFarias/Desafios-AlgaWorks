import java.util.Scanner;

public class IMC {

	public static void main (String[] agrs) {
		
		double peso;
		double altura;
		char sexo;
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu peso: ");
		peso = entrada.nextDouble();
		
		System.out.print("Digite sua altura: ");
		altura = entrada.nextDouble();

		System.out.print("Digite seu sexo (F/M): ");
		sexo = entrada.next().charAt(0);
		
		double result = peso / (altura * altura);
		
		if (result < 19.1 && sexo == 'F' || result < 20.7 && sexo == 'M'){
			System.out.printf("Seu IMC: %.2f%nAbaixo do peso!", result);
		} else if ((result >= 19.1 && result <= 25.8) && sexo == 'F' || (result >= 20.8 && result <= 26.4) && sexo == 'M'){
			System.out.printf("Seu IMC: %.2f%nNo peso ideal!", result);
		} else if ((result >= 25.9 && result <= 27.3) && sexo == 'F' || (result >= 26.5 && result <= 27.8) && sexo == 'M'){
			System.out.printf("Seu IMC: %.2f%nUm pouco acima do peso!", result);
		} else if ((result >= 27.4 && result <= 32.3) && sexo == 'F' || (result >= 27.9 && result <= 31.1) && sexo == 'M'){
			System.out.printf("Seu IMC: %.2f%nNo peso ideal!", result);
		} else if(result > 32.3 && sexo == 'F' || result > 31.1 && sexo == 'M'){
			System.out.printf("Seu IMC: %.2f%nObeso!", result);
		}			

		
	}
}