package entidades;

import interfaces.Imprimivel;

public class Revista implements Imprimivel {

    private String nome;
    private int numero;

    public Revista(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public void imprimir(){
        System.out.println("Revista: " + this.nome +
                " Número: " + this.numero);
    }
}
