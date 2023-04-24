package entidades;

import java.util.ArrayList;

public class Favoritos {
    private ArrayList<Video> listaFavoritos;

    public Favoritos() {
        this.listaFavoritos = new ArrayList<>();
    }

    public void adicionar(Video video) {
        if (listaFavoritos.contains(video)) {
            listaFavoritos.add(video);
            System.out.println("Video adicionado aos favoritos!");
        } else {
            System.out.println("Video já está nos favoritos!");
        }
    }

    public void remover(Video video) {
        if (listaFavoritos.contains(video)) {
            listaFavoritos.remove(video);
            System.out.println("Video removido dos favoritos!");
        } else {
            System.out.println("Video não está nos favoritos!");
        }
    }

    public void exibir() {
        if (listaFavoritos.isEmpty()) {
            System.out.println("Nenhum video nos favoritos!");
        } else {
            System.out.println("Videos nos favoritos:");
            for (Video video : listaFavoritos) {
                System.out.println(video.getTitulo());
            }
        }
    }
}