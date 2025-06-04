import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class AgendaReuniao {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ano: ");
        String anoTexto = scanner.next();

        System.out.print("Mês inicial: ");
        String mesTexto = scanner.next();

        Year ano = Year.parse(anoTexto);
        Month mesInicial = Month.of(Integer.parseInt(mesTexto));

        LocalDate primeiraSegunda = LocalDate.of(ano.getValue(), mesInicial, 1)
                .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy");
        LocalDate segundaProxMes = primeiraSegunda;

        while (segundaProxMes.isBefore(LocalDate.of(primeiraSegunda.getYear() + 1, 1, 1))){

            if (segundaProxMes.getMonth().equals(mesInicial)){
                System.out.println(formatter.format(segundaProxMes));
            }
            
            System.out.println(formatter.format(segundaProxMes));

            segundaProxMes = segundaProxMes.plusMonths(1)
                    .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

        }
    }
}
