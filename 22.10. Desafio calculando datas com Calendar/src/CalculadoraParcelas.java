import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class CalculadoraParcelas {

    DateFormat format = new SimpleDateFormat("dd/MM/yy");

    public List<Date> calculaParcelas(Date date, int qntdParcelas){


        Calendar dataInicio = Calendar.getInstance();
        List<Date> datasParcela = new ArrayList<>();

        for (int i = 1; i <= qntdParcelas; i++) {

            dataInicio.setTime(date);
            int dia = dataInicio.get(Calendar.DAY_OF_MONTH);
            int mes = dataInicio.get(Calendar.MONTH);
            int ano = dataInicio.get(Calendar.YEAR);
            dataInicio.add(Calendar.MONTH, i);

            if (dataInicio.getActualMaximum(mes) > dia){
                dataInicio.set(ano, mes, dataInicio.getActualMaximum(mes));
            }
            datasParcela.add(dataInicio.getTime());
        }
        imprimirDatas(datasParcela);
        return datasParcela;
    }

    private void imprimirDatas(List<Date> datas){
        int i = 0;
        for (Date data : datas) {
            i++;
            System.out.printf("Parcela %d# - %s\n", i ,format.format(data.getTime()));
        }
    }

}
