public class Main {
    public static void main(String[] args) {

        CalculadoraMedia calculadoraMedia = new CalculadoraMedia();


        double media = calculadoraMedia.calcularMedia(10, 8.5, 3.2, 5, 9);
        calculadoraMedia.imprimirResultado(media);

    }
}