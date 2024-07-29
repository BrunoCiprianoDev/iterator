package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RelatorioTest {

    @Test
    void deveContarServicosConcluidos() {
        ServicosRealizados servicosRealizados = new ServicosRealizados(
                new Servico("Serviço 1", true, 150.0),
                new Servico("Serviço 2", true, 200.0),
                new Servico("Serviço 3", false, 100.0),
                new Servico("Serviço 4", true, 250.0)
        );
        assertEquals(3, Relatorio.contarServicosConcluidos(servicosRealizados));
    }

    @Test
    void deveContarTotalServicos() {
        ServicosRealizados servicosRealizados = new ServicosRealizados(
                new Servico("Serviço 1", true, 150.0),
                new Servico("Serviço 2", true, 200.0),
                new Servico("Serviço 3", false, 100.0),
                new Servico("Serviço 4", true, 250.0)
        );
        assertEquals(4, Relatorio.contarTotalServicos(servicosRealizados));
    }

    @Test
    void deveContarServicosComValorMaiorQue150() {
        ServicosRealizados servicosRealizados = new ServicosRealizados(
                new Servico("Serviço 1", true, 150.0),
                new Servico("Serviço 2", true, 200.0),
                new Servico("Serviço 3", false, 100.0),
                new Servico("Serviço 4", true, 250.0)
        );
        assertEquals(2, Relatorio.contarServicosComValorMaiorQue(servicosRealizados, 150.0));
    }
}