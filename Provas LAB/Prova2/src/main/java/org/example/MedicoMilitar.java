package org.example;

public class MedicoMilitar extends Soldado implements Curar {
    private int anosExperiencia;
    private int capacidadeEmergencia;


    public MedicoMilitar(String nome, long cpf, int anosExperiencia, int capacidadeEmergencia) {
        super(nome, cpf);
        this.anosExperiencia = anosExperiencia;
        this.capacidadeEmergencia = capacidadeEmergencia;
    }

    @Override
    public void mostrainfo() {
        System.out.println("Médico Militar ID: " + id + ", Nome: " + nome + ", CPF: " + cpf + ", Anos de Experiência: " + anosExperiencia + ", Capacidade de Emergência: " + capacidadeEmergencia);
    }

    @Override
    public void usandoItem() {
    }

    @Override
    public void curar() {
        if (itemEspecial != 0) {
            capacidadeEmergencia += 100;
        }
        if (capacidadeEmergencia > 920) {
            System.out.println("Médico Militar " + nome + " está curando.");
        } else {
            System.out.println("Médico Militar " + nome + " não consegue curar.");
        }    }
}