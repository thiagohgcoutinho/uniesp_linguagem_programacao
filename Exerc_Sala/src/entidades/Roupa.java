package entidades;

import interfaces.Produto;

public class Roupa implements Produto {

    private String nome;
    private String descricao;
    private double preco;
    private String tamanho;
    private String cor;

    public Roupa(String nome, String descricao, double preco, String tamanho, String cor) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.cor = cor;
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
