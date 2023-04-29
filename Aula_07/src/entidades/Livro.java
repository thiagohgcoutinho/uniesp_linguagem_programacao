package entidades;

import interfaces.Imprimivel;

public class Livro implements Imprimivel{

    private String titulo;
    private String autor;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public void imprimir() {
        System.out.println("Título: " + this.titulo +
                " Autor: " + this.autor);
    }
}