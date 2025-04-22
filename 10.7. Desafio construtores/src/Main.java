public class Main {
    public static void main(String[] args) {

        Participante participante = new Participante("Luiz");
        Participante participante1 = new Participante("Luiz", 20);

        System.out.printf("Nome: %s\nPontos: %d\n-----\n", participante.nome, participante.saldoDePontos);
        System.out.printf("Nome: %s\nPontos: %d", participante1.nome, participante1.saldoDePontos);


    }
}