package com.algaworks.agencia;

import java.util.Comparator;

public class PacoteViagemComparator implements Comparator<PacoteViagem>{

    @Override
    public int compare(PacoteViagem o1, PacoteViagem o2) {
        if (o1.getPrecoPorPessoa() < o2.getPrecoPorPessoa()){
            return -1;
        } else if (o1.getPrecoPorPessoa() > o2.getPrecoPorPessoa()){
            return 1;
        }
        return 0;
    }
}
