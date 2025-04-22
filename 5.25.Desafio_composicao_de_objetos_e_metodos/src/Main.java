public class Main {
    public static void main(String[] args) {


     //Ex3
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        Funcionario funcionario = new Funcionario();
        ContratoTrabalho contrato = new ContratoTrabalho();

        int horasTrabalhadas = 10;
        int horasExtras = 16;

        funcionario.nome = "Jorge";
        funcionario.qntdFilhos = 2;

        contrato.valorHoraExtra = 30.5;
        contrato.valorHoraNormal= 21.5;
        contrato.funcionario = funcionario;

        folhaPagamento.calcular(contrato, horasTrabalhadas, horasExtras);



    // EX2
   /* FolhaPagamento folhaPagamento = new FolhaPagamento();
    Funcionario funcionario = new Funcionario();
    ContratoTrabalho contrato = new ContratoTrabalho();

    int horasTrabalhadas = 10;
    int horasExtras = 16;

    funcionario.nome = "Jorge";
    funcionario.qntdFilhos = 2;

    contrato.valorHoraExtra = 30.5;
    contrato.valorHoraNormal= 21.5;
    contrato.funcionario = funcionario;

    double salario = folhaPagamento.calcular(contrato, horasTrabalhadas, horasExtras);
    System.out.printf("O salário é de: %.2f", salario);*/

   /* EX1

    int horasTrabalhadas = 10;
    int horasExtras = 16;
    double valorHora = 21.50;
    double valorHoraExtra = 30.50;

    double salario = folhaPagamento.calcularSalario(horasTrabalhadas, horasExtras, valorHora, valorHoraExtra );

        System.out.printf("O salário é de: %.2f", salario);
    */
    }
}