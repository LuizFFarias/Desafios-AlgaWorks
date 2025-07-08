import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class Principal {

    public static void main(String[] args) {
        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario("João", new BigDecimal("19000"), true));
        funcionarios.add(new Funcionario("Maria", new BigDecimal("5000"), true));
        funcionarios.add(new Funcionario("Manoel", new BigDecimal("13000"), true));
        funcionarios.add(new Funcionario("Sebastião", new BigDecimal("12000"), false));
        // TODO remover funcionários inativos
        Predicate<Funcionario> removerInativos = Funcionario::isInativo;
        funcionarios.removeIf(removerInativos);

        // TODO ordenar funcionários pelo valor do salário
        funcionarios.sort(Comparator.comparing(Funcionario::getSalario));

        // TODO iterar e imprimir funcionários usando o método estático imprimir
        Consumer<Funcionario> imprimirFuncionarios = Principal::imprimir;
        funcionarios.forEach(imprimirFuncionarios);
    }

    private static void imprimir(Funcionario funcionario) {
        // TODO implementar a impressão do nome, salário e impostos (20%)
        System.out.printf("%n-----%n Nome: %s%n Salário: R$%s%n Impostos: %s", funcionario.getNome(), funcionario.getSalario(),
                funcionario.getSalario().multiply(BigDecimal.valueOf(0.2)));
    }

}