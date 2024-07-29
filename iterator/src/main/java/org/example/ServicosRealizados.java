package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ServicosRealizados implements Iterable<Servico> {

    private List<Servico> servicos = new ArrayList<Servico>();

    public ServicosRealizados(Servico... servicos) {
        this.servicos = Arrays.asList(servicos);
    }

    @Override
    public Iterator<Servico> iterator() {
        return servicos.iterator();
    }
}