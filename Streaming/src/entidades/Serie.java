package entidades;

import java.util.List;

public class Serie extends Video {
    private int numTemporadas;
    private int numEpisodios;

    public Serie(String titulo, String diretor, String[] elenco, String genero, String sinopse, int anoLancamento, int classificacaoIndicativa, int numTemporadas, int numEpisodios) {
        super(titulo, diretor, List.of(elenco), genero, sinopse, anoLancamento, classificacaoIndicativa);
        this.numTemporadas = numTemporadas;
        this.numEpisodios = numEpisodios;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public int getNumEpisodios() {
        return numEpisodios;
    }

    public void setNumEpisodios(int numEpisodios) {
        this.numEpisodios = numEpisodios;
    }
}

