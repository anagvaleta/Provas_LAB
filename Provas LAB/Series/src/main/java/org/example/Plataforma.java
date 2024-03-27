package org.example;

public class Plataforma {
    String nome;
    Serie [] series;

    public Plataforma (String nome, Serie series){
        this.nome = nome;
        this.series = new Serie[5];
    }
    void mostrainfo(){
        System.out.println("Nome: " +nome);
    }

    void addSerie(Serie serie){

    }

    String SerieMaisLongaFinalizada(Serie series){
        return "a";
    }

    void mediaPorcentagem(){

    }
}
