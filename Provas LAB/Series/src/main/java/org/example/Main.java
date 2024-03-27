package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                // Inicio da plataforma
                Plataforma netflix = new Plataforma("Netflix", );

                // Menu
                boolean saida = false;
                while (!saida) {
                    System.out.println("Select a menu option:");
                    System.out.println("1. Adicionar uma série");
                    System.out.println("2. Séries registradas");
                    System.out.println("3. Série finalizada com maior numero de temporadas");
                    System.out.println("4. Notas de séries");
                    System.out.println("5. Sair");

                    //Entrada de dados
                    Scanner scanner = new Scanner(System.in);
                    int opcao = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcao) {
                        case 1:
                            System.out.print("Enter the series name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter the number of seasons: ");
                            int seasons = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Has the series been finished? (yes/no): ");
                            String finished = scanner.nextLine();
                            boolean isFinished = finished.equalsIgnoreCase("yes");
                            System.out.print("Enter the series rating: ");
                            double rating = scanner.nextDouble();
                            scanner.nextLine();
                            netflix.addSerie(new Serie(name, seasons, isFinished, rating));
                            break;
                        case 2:
                            netflix.mostrainfo();
                            break;
                        case 3:
                            // Série mais longa finalizada
                            System.out.println("A série mais longa terminada é: " + netflix.serieMaisLongaFinalizada());
                            break;
                        case 4:
                            // Percentagem e dados
                            netflix.mediaPorcentagem();
                            break;
                        case 5:
                            // Sair do menu
                            saida = true;
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }
                }

            }
        }
    }
}