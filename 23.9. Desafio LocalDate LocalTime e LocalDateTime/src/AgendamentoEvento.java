import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class AgendamentoEvento {

    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        boolean futuro = false;
        LocalDateTime dataHoraEvento = null;

        while (!futuro) {
            LocalDate dataEvento = getLocalDate();
            LocalTime horarioEvento = getLocalTime();
            dataHoraEvento = LocalDateTime.of(dataEvento, horarioEvento);

            if (dataHoraEvento.isBefore(LocalDateTime.now()) || dataEvento.equals(LocalDate.now())) {
                System.out.println("A data e hora devem ser futuras");
            } else {
                futuro = true;
            }
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT)
                .withLocale(new Locale("pt", "BR"));

        System.out.printf("Evento agendado para %s", formatter.format(dataHoraEvento));


    }

    private static LocalTime getLocalTime() {
        boolean convertido = false;
        LocalTime horarioEvento = null;
        while (!convertido) {
            try {
                System.out.print("Horário do evento: ");
                String horarioEventoTexto = SCANNER.next();
                horarioEvento = LocalTime.parse(horarioEventoTexto, DateTimeFormatter.ISO_TIME);
                convertido = true;
            } catch (DateTimeParseException e) {
                System.out.println("Horário inválido. Tente novamente");
            }
        }
        return horarioEvento;
    }

    private static LocalDate getLocalDate() {
        boolean convertido = false;
        LocalDate dataEvento = null;
        while (!convertido) {
            try {
                System.out.print("Data do evento: ");
                String dataEventoTexto = SCANNER.next();

                dataEvento = LocalDate.parse(dataEventoTexto, DateTimeFormatter.
                        ofPattern("dd/MM/yyyy", new Locale("pt", "BR")));
                convertido = true;

                if (dataEvento.isBefore(LocalDate.now())) {
                    convertido = false;
                    throw new DateTimeException("Data inválida. Tente novamente");
                }
            } catch (Exception e) {
                System.out.println("Data inválida. Tente novamente");
            }
        }
        return dataEvento;
    }
}
