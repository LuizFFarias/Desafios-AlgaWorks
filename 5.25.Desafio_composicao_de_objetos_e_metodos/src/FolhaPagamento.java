public class FolhaPagamento {
    //Ex1

       /* double calcularSalario(int horasTrabalhadas, int horasExtras, double valorHora, double valorHoraExtra) {
        double resultadoHoraNormal = horasTrabalhadas * valorHora;
        double resultadoHoraExtra = horasExtras * valorHoraExtra;

        double salario = resultadoHoraNormal + resultadoHoraExtra;

        return salario;
    }*/

    //Ex2

    /*double calcular (ContratoTrabalho contratoTrabalho, int horasTrabalhadas, int horasExtras){
        double resultadoHoraNormal = contratoTrabalho.valorHoraNormal * horasTrabalhadas;
        double resultadoHoraExtra = contratoTrabalho.valorHoraExtra * horasTrabalhadas;

        double salario = resultadoHoraNormal + resultadoHoraExtra;

        if (contratoTrabalho.temFilhos()){
            salario += salario * 0.1;
        }

        return salario;
    }*/

    //Ex3

    Holerite calcular(ContratoTrabalho contratoTrabalho, int horasTrabalhadas, int horasExtras) {

        Holerite holerite = new Holerite();

        double resultadoHoraNormal = contratoTrabalho.valorHoraNormal * horasTrabalhadas;
        double resultadoHoraExtra = contratoTrabalho.valorHoraExtra * horasTrabalhadas;

        double salario = resultadoHoraNormal + resultadoHoraExtra;

        if (contratoTrabalho.temFilhos()) {
            double adicionalFilhos = salario * 0.1;
            salario += adicionalFilhos;
            holerite.adicionalFilhos = adicionalFilhos;
        }


        holerite.valorTotalHrsNorm = resultadoHoraNormal;
        holerite.valorTotalHrsExt = resultadoHoraExtra;
        holerite.valorTotal();

        return holerite;
    }
}
