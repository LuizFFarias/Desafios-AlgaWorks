import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraParcelas calculadoraParcelas = new CalculadoraParcelas();

        System.out.print("Data da primeira parcela: ");
        String dataTexto = scanner.next();

        System.out.print("Quantidade de parcelas: ");
        String qntdParcelasTexto = scanner.next();

        var parcelas = calculadoraParcelas.calcularDataParcelas(dataTexto, qntdParcelasTexto);
        imprimirParcelas(parcelas);
    }

    public static void imprimirParcelas(List<LocalDate> parcelas){
        int i = 1;
        for (LocalDate parcela : parcelas) {
            System.out.printf("Parcela #%d = %s\n", i, parcela.format(CalculadoraParcelas.FORMATADOR_DATA_BR));
            i++;
        }
    }
}