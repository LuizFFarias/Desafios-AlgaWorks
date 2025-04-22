public class Holerite {

    double valorTotalHrsNorm;
    double valorTotalHrsExt;
    double adicionalFilhos;

    double valorTotal (){
        double salariO = valorTotalHrsExt + valorTotalHrsNorm + adicionalFilhos;
        System.out.printf("Valor das Horas trabalhadas: %.2f\nValor das Horas Extras:  %.2f\nTotal:  %.2f",
                valorTotalHrsNorm, valorTotalHrsExt, salariO);
        return salariO;
    }


}
