package entidades;

import java.util.ArrayList;

public class Hospedes extends Usuarios{

    private ArrayList<Propriedade> propriedades;

    public Hospedes(String nome, String email, String telefone) {
        super(nome, email, telefone);
        this.propriedades = new ArrayList<>();
    }

    public ArrayList<Propriedade> getPropriedades() {
        return propriedades;
    }

    @Override
    public void adicionarPropriedade(Propriedade propriedades) {
        this.propriedades.add(propriedades);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Lista de Desejos: ");
        for (Propriedade propriedade : propriedades) {
            propriedade.mostrarDetalhes();
        }
    }
}
