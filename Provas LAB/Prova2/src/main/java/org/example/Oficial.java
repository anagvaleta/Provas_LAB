package org.example;

public class Oficial extends Soldado implements ItemEspecial, Defesa {
    private String patente;

    public Oficial(String nome, long cpf, String patente) {
        super(nome, cpf);
        this.patente = patente;
    }

    @Override
    public void mostrainfo() {
        System.out.println("ID: " + id + ", Nome: " + nome + ", CPF: " + cpf + ", Patente: " + patente);
    }

    @Override
    public void usandoItem() {
    }

    @Override
    public String getTipo() {
        return "Item de Oficial";
    }

    @Override
    public void defender() {
    }
}
