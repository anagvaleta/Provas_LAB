package org.example;

public class Main {
    public static void main(String[] args) {

        //criar o exercito
        Exercito exercito = new Exercito("Exercito",100);

        //criar as pessoas
        Soldado sargento1 = new Sargento(1, "Sargento 1", 12345678901L, "Infantaria", 5);
        Soldado sargento2 = new Sargento(2, "Sargento 2", 12345678902L, "Artilharia", 8);
        Soldado oficial1 = new Oficial("Oficial 1", 12345678903L, "Capitão");
        Soldado oficial2 = new Oficial("Oficial 2", 12345678904L, "Tenente");
        Soldado medicoMilitar1 = new MedicoMilitar( "Médico Militar 1", 12345678905L, 10, 20);

        //adicioanr ao exercito
        exercito.addSoldado(sargento1);
        exercito.addSoldado(sargento2);
        exercito.addSoldado(oficial1);
        exercito.addSoldado(oficial2);
        exercito.addSoldado(medicoMilitar1);

        //mostrar as infos do exercito
        exercito.mostraInfo();
    }
}