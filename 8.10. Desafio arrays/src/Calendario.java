public class Calendario {
    static String obterNomeMes(int numeroMes) {
        String[] meses = new String[12];{
            meses[0] = "Janeiro";
            meses[1] = "Fevereiro";
            meses[2] = "Março";
            meses[3] = "Abril";
            meses[4] = "Maio";
            meses[5] = "Junho";
            meses[6] = "Julho";
            meses[7] = "Agosto";
            meses[8] = "Setembro";
            meses[9] = "Outubro";
            meses[10] = "Novembro";
            meses[11] = "Dezembro";
        }

        return meses[numeroMes + 1];
    }

    public static void main(String[] args) {
        String mes = Calendario.obterNomeMes(9);
        System.out.println(mes);
    }
}
