package org.example;

public class Exercito {
    private Soldado[] soldados;
    private int indiceSoldados;

    public Exercito(String nome, int capacidade) {
        this.soldados = new Soldado[capacidade];
        this.indiceSoldados = 0;
    }

    public void addSoldado(Soldado soldado) {
        if (indiceSoldados < soldados.length) {
            soldados[indiceSoldados] = soldado;
            indiceSoldados++;
        } else {
            System.out.println("Exército cheio!");
        }
    }

    public void  mostraInfo() {
        for (int i = 0; i < indiceSoldados; i++) {
            soldados[i].mostrainfo();
        }
    }
}
