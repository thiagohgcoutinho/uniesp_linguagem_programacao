package entidades;

import interfaces.Produto;

public class Eletronico implements Produto {

    private String nome;
    private String descricao;
    private double preco;
    private String marca;
    private String modelo;

    public Eletronico(String nome, String descricao, double preco, String marca, String modelo) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.marca = marca;
        this.modelo = modelo;
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
