package entidades;

import java.util.ArrayList;

public class Proprietarios extends Usuarios{

    private ArrayList<Propriedade> propriedades;

    public Proprietarios(String nome, String email, String telefone) {
        super(nome, email, telefone);
        this.propriedades = new ArrayList<>();
    }

    public ArrayList<Propriedade> getPropriedades() {
        return propriedades;
    }

    @Override
    public void adicionarPropriedade(Propriedade propriedade) {
        this.propriedades.add(propriedade);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Propriedades: ");
        for (Propriedade propriedade : propriedades) {
            propriedade.mostrarDetalhes();
        }
    }
}
