public class CalculaArea {

    static double pi = 3.14159265358979323846;

     static double calcularAreaQuadrado(double lado) {
        double area = lado * lado;
         System.out.printf("A area do quadrado é: %.2f\n", area);
        return area;
    }

    static double calcularAreaCirculo(double raio) {
         double area = pi * (raio * raio);
        System.out.printf("A area do circulo é: %.2f", area);
         return area;
    }
}
