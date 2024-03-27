package org.example;

public class Rapper {
    String nome;
    float nota;
    int idade;
    Microfone microfone;

    public Rapper (String nome, float nota, int idade, String material){
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
        this.microfone = new Microfone(material);
    }

    void mostrainfo(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Nome: " + this.nome);
            System.out.println("Nota: " + this.nota);
            System.out.println("Idade " +this.idade);
        }
    }
}
