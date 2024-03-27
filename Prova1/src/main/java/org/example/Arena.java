package org.example;

public class Arena {
    String nome;
    String lugar;
    Rapper [] R1 = new Rapper [10];
    int a=0;

    //construtor
    public Arena (String nome, String lugar) {
        this.nome = nome;
        this.lugar = lugar;
    }

    //adicionar um rapper
    void addRaper(Rapper NovoRapper){
        for (int i = 0; i < R1.length; i++) {
            if(R1[i] == null){
                R1[i] = NovoRapper;
                break;
            }
        }
    }

    //mostrar as informações do rapper
    void mostraInfo(){
            System.out.println(nome);
            System.out.println(lugar);
        for (int i = 0; i < R1.length; i++) {
            System.out.println(R1[i].nome);
            System.out.println(R1[i].nota);
            System.out.println(R1[i].idade);
            }
        }
    void MicrofoneDou(){
        for (int i = 0; i < R1.length; i++) {
                if (R1[i].microfone.equals("Dourado")){
                    a++;
                }
            }
        System.out.println(+a);
    }
    void Ranking (){

    }
    }

