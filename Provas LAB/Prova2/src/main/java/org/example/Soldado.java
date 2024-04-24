package org.example;

abstract class Soldado {
    private static int qtdSoldados = 0;
    protected int id;
    protected String nome;
    protected long cpf;
    private boolean possuiItem;
    private ItemEspecial item;

    public Soldado(int id, String nome, long cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.possuiItem = false;
    }

    public void TemItem(ItemEspecial item) {
        this.item = item;
        this.possuiItem = true;
    }

    public void usandoItem() {
        if (possuiItem) {
            System.out.println(nome + " utilizando item especial: " + item.getTipo());
        } else {
            System.out.println(nome + " não tem item especial para utilizar.");
        }
    }

    public abstract void mostrainfo();
}
