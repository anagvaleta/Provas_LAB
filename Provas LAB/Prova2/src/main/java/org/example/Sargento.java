package org.example;

public class Sargento extends Soldado implements ItemEspecial, Defesa {
        private String especializacao;
        private int experienciaCombate;


    public Sargento(int id, String nome, long cpf, String especializacao, int experienciaCombate) {
            super(id, nome, cpf);
            this.especializacao = especializacao;
            this.experienciaCombate = experienciaCombate;
        }

    @Override
        public void mostrainfo() {
            System.out.println("ID: " + id + ", Nome: " + nome + ", CPF: " + cpf + ", Especialização: " + especializacao + ", Experiência em Combate: " + experienciaCombate);
        }

        @Override
        public void usandoItem() {
        }

        @Override
        public String getTipo() {
        }

        @Override
        public void defender() {
        }
    }
}
