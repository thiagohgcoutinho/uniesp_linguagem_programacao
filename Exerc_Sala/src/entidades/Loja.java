package entidades;

import interfaces.Produto;

import java.util.ArrayList;

public class Loja {

    private ArrayList<Produto> listaProdutos;

    public Loja(){
        this.listaProdutos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto p){
        this.listaProdutos.add(p);
    }
    public void listarProdutos() {
        for (Produto produto: this.listaProdutos){
            System.out.println(produto.getNome());
        }
    }

}
