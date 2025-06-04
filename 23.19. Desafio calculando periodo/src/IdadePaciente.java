import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class IdadePaciente {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String pluralDia = "";
        String pluralAno = "";
        String pluralMes = "";

        Period idade = calculaIdade(formatter);

        if (idade.getYears() > 1){
            pluralAno = "s";
        }
        if (idade.getMonths() > 1){
            pluralMes = "es";
        }
        if (idade.getDays() > 1){
            pluralDia = "s";
        }

        System.out.printf("Paciente tem %d ano%s, %d mes%s e %d dia%s de vida",
                idade.getYears(), pluralAno, idade.getMonths(), pluralMes,
                idade.getDays(), pluralDia);
    }

    private static Period calculaIdade(DateTimeFormatter formatter) {
        Period idade;
        while (true){
            System.out.print("Data de nascimento: ");
            String dataNascTexto = SCANNER.next();
            try {
                LocalDate dataNascimento = LocalDate.parse(dataNascTexto, formatter);
                idade = Period.between(dataNascimento, LocalDate.now());
                if (idade.isNegative()){
                    throw new IllegalStateException("Data inválida. Tente novamente");
                }
                return idade;
            } catch (Exception e){
                System.out.println("Data inválida. Tente novamente");
            }
        }
    }
}
