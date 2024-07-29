package org.example;

import java.util.Iterator;

public class Relatorio {

    public static Integer contarServicosConcluidos(ServicosRealizados servicosRealizados) {
        int quantidade = 0;
        for (Servico servico : servicosRealizados) {
            if (servico.isConcluido()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalServicos(ServicosRealizados servicosRealizados) {
        int quantidade = 0;
        for (Iterator<Servico> it = servicosRealizados.iterator(); it.hasNext(); ) {
            quantidade++;
            it.next();
        }
        return quantidade;
    }

    public static Integer contarServicosComValorMaiorQue(ServicosRealizados servicosRealizados, double valor) {
        int quantidade = 0;
        for (Servico servico : servicosRealizados) {
            if (servico.getValor() > valor) {
                quantidade++;
            }
        }
        return quantidade;
    }
}