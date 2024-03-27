package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Inicio da arena
        Arena A1 = new Arena ("Primeira Arena", "Minas Gerais");

        // variaveis para o rapper
        String nome;
        float nota;
        int idade;
        String mic;


        //sout do menu
        System.out.println("-----------------------Bem-vindo a Arena (o˘◡˘o)-----------------------");
        System.out.println("1. Adicionar um rapper");
        System.out.println("2. Informações da arena e dos rappers");
        System.out.println("3. Rappers com microfone dourado");
        System.out.println("4. Vencedor e perdedor da batalha");
        System.out.println("5. Sair");

        //Inicio do menu
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        while (opcao!=5){
            opcao = sc.nextInt();
            //opções para controle do menu
            switch (opcao){
                //adicionar os rappers
                case 1:
                    System.out.println("Digite o nome do rapper: ");
                    nome = sc.nextLine();
                    System.out.println("Digite a nota do rapper: ");
                    nota = sc.nextFloat();
                    System.out.println("Digite a idade do rapper: ");
                    idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o tipo de microfone: ");
                    mic = sc.nextLine();

                    Rapper NovoRapper = new Rapper(nome, nota, idade, mic);
                    A1.addRaper(NovoRapper);
                    break;

                //mostrar os cadastros
                case 2:
                    A1.mostraInfo();
                    break;
                case 3:
                    A1.microfoneDou();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Você não digitou uma opção válida, caso queira sair digite 5.");
                    break;
            }
        }
    }
}