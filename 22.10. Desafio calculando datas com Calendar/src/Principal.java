import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        CalculadoraParcelas calculadora = new CalculadoraParcelas();
        DateFormat format = new SimpleDateFormat("dd/MM/yy");

        System.out.print("Data da primeira parcela: ");
        String dataTexto = scanner.next();

        System.out.print("Quantidade de parcelas: ");
        String qntdParcelasStr = scanner.next();

        int qntdParcelas = Integer.parseInt(qntdParcelasStr);

        Date data = format.parse(dataTexto);
        calculadora.calculaParcelas(data, qntdParcelas);


    }
}