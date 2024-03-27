package org.example;

public class Plataforma {
    String nome;
    String criador;
    Jogo [] jogos = new Jogo [5];
    Jogo jogo;


    //criando objetos da classe computador
    public Plataforma (String nome, String criador, Jogo jogos,
                       String nome_jogo, String genero_jogo, double preco_jogo, boolean dlc_jogo){
        this.nome = nome;
        this.criador = criador;
    }

    void adicionarJogo(Jogo jogo){
        this.jogo = jogo;
    }

    void MostraMaisCaroBarato (){

    }

    void Calculadlc(){

    }
}
