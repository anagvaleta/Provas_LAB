package org.example;

public class Ninja {
    String nome;
    int idade;
    String titulo;
    String ranking;

    public Ninja (String nome, int idade, String titulo, String ranking){
        this.nome = nome;
        this.idade = idade;
        this.titulo = titulo;
        this.ranking = ranking;
    }
    void mostraInfo(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.titulo);
        System.out.println(this.ranking);
    }
}
