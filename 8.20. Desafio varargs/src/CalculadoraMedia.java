public class CalculadoraMedia {

    double resultado;
    double soma;
    double[] numeros;

    double calcularMedia (double... numeros){
        this.numeros = numeros;
        if (numeros.length < 2){
            throw new IllegalArgumentException("É necessário no mínimo 2 números!");
        }
        for (double numero : numeros) {
            soma += numero;
        }
        resultado = soma / numeros.length;
        return resultado;
    }

    void imprimirResultado(double media){
        for (double numero : numeros) {
            System.out.println(numero);
        }
        System.out.printf("/ %d = %.2f", numeros.length, media);
    }
}
