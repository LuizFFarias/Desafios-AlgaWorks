import java.io.IOException;
import java.math.BigDecimal;
import java.text.*;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class Cambio {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Preço do produto em dólares: ");
        String precoDolar = scanner.next();

        Locale.setDefault(new Locale("pt", "BR"));
        System.out.print("Preço de 1 dolar em real: ");
        String precoReal = scanner.next();

        DecimalFormat decimalFormatDolar = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(Locale.US));
        decimalFormatDolar.setParseBigDecimal(true);

        DecimalFormat decimalFormatReal = new DecimalFormat("#,##0.00", new DecimalFormatSymbols
                (new Locale("pt", "BR")));
        decimalFormatReal.setParseBigDecimal(true);

        DecimalFormat decimalFormatRealMoeda = new DecimalFormat("¤ #,##0.00", new DecimalFormatSymbols
                (new Locale("pt", "BR")));

        BigDecimal precoDolarFormatado = (BigDecimal) decimalFormatDolar.parse(precoDolar);
        BigDecimal precoRealFormatado = (BigDecimal) decimalFormatReal.parse(precoReal);

        BigDecimal valorTotal = precoDolarFormatado.multiply(precoRealFormatado);

        System.out.printf("Preço do produto em reais: %s", decimalFormatRealMoeda.format(valorTotal));







    }
}
