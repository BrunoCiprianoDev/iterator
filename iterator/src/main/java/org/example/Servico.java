package org.example;

public class Servico {
    private String nome;
    private boolean concluido;
    private double valor;

    public Servico(String nome, boolean concluido, double valor) {
        this.nome = nome;
        this.concluido = concluido;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}