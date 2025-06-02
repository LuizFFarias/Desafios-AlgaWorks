import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CalculadoraParcelas {

    public static final DateTimeFormatter FORMATADOR_DATA_BR = DateTimeFormatter.ofPattern("dd/MM/yyyy")
            .withLocale(new Locale("pt", "BR"));

    public List<LocalDate> calcularDataParcelas(String primeiraParcelaTexto, String qntdParcelasTexto){
        var primeiraParcela = LocalDate.parse(primeiraParcelaTexto, FORMATADOR_DATA_BR);
        var qntdParcelas = Integer.parseInt(qntdParcelasTexto);
        List<LocalDate> parcelas = new ArrayList<>();


        for (int i = 1; i <= qntdParcelas; i++) {
            if ( i == 1){
                parcelas.add(primeiraParcela);
            }
            var parcela = primeiraParcela.plusMonths(i);
            parcelas.add(parcela);
        }
        return parcelas;
    }
}
