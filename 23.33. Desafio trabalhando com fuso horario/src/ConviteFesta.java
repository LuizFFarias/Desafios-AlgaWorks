import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class ConviteFesta {
    static Scanner scanner = new Scanner(System.in);
    static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy 'às' HH:mm");

    public static void main(String[] args) {
        LocalDate dataLocal = null;
        LocalTime horarioLocal = null;
        LocalDateTime horarioDataLocal;

        dataLocal = getLocalDate(dataLocal);
        horarioLocal = getLocalTime(horarioLocal);
        horarioDataLocal = LocalDateTime.of(dataLocal, horarioLocal);

        var horarioPadraoLocal = ZonedDateTime.of(horarioDataLocal, ZoneId.systemDefault());
        var horarioNoJapao = horarioPadraoLocal.withZoneSameInstant(ZoneId.of("Japan"));
        var horarioVeroaNoPacifico = horarioPadraoLocal.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        imprimirResposta(horarioDataLocal.format(dateTimeFormatter), horarioVeroaNoPacifico.format(dateTimeFormatter),
                horarioNoJapao.format(dateTimeFormatter));


    }

    private static LocalTime getLocalTime(LocalTime horarioLocal) {
        boolean transformado = false;
        while (!transformado) {
            try {
                System.out.print("Horário local da festa: ");
                String horarioLocalString = scanner.next();
                horarioLocal = LocalTime.parse(horarioLocalString, timeFormatter);
                transformado = true;
            } catch (RuntimeException e) {
                System.out.println("Horário inválido. Tente novamente");
            }
        }
        return horarioLocal;
    }

    private static LocalDate getLocalDate(LocalDate dataLocal) {
        boolean transformado = false;
        while (!transformado){
            try {
                System.out.print("Data local da festa: ");
                String dataLocalString = scanner.next();
                dataLocal =  LocalDate.parse(dataLocalString, dateFormatter);
                transformado = true;
            } catch (RuntimeException e) {
                System.out.println("Data inválida. Tente novamente");
            }

        }
        return dataLocal;
    }

    private static void imprimirResposta(String horarioDataLocal, String horarioVeroaNoPacifico, String horarioNoJapao) {
        System.out.printf("%s (Horário Padrão de Brasília) \n", horarioDataLocal);
        System.out.printf("%s (Horário de Verão no Pacífico) \n", horarioVeroaNoPacifico);
        System.out.printf("%s (Horário Padrão do Japão)", horarioNoJapao);
    }
}
