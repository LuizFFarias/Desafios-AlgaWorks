public class ContratoTrabalho {

    double valorHoraNormal;
    double valorHoraExtra;
    Funcionario funcionario;

    boolean temFilhos(){
        return funcionario.qntdFilhos > 0;
    }
}
