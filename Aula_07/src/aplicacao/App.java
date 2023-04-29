package aplicacao;

import entidades.Livro;
import entidades.Revista;
import interfaces.Imprimivel;

public class App {
    public static void main(String[] args) {

        Imprimivel[] listaImprimivel = new Imprimivel[2];

        listaImprimivel[0] = new Livro(
                "Linux, um Guia Prático",
                "Sobell");

        listaImprimivel[1] = new Revista(
                "Actia Sentia",
                1234);

        for (Imprimivel item: listaImprimivel){
            item.imprimir();
        }
    }
}
