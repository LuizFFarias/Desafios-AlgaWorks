public class Participante {

    String nome;
    int saldoDePontos;
    static final int SALDO_DE_PONTOS_INICIAL = 10;

    Participante(String nome){
        this(nome, SALDO_DE_PONTOS_INICIAL);
    }

    Participante(String nome, int saldoDePontosInicial){
        this.nome = nome;
        this.saldoDePontos = saldoDePontosInicial;
    }
}
