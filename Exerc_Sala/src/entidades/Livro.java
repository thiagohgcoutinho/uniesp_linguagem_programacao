package entidades;

import interfaces.Produto;

public class Livro implements Produto {

    private String nome;
    private String descricao;
    private double preco;
    private String autor;
    private int numeroPagina;

    public Livro(String nome, String descricao, double preco, String autor, int numeroPagina){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }
}
