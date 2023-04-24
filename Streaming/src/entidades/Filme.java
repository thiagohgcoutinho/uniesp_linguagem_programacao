package entidades;

import java.util.List;

public class Filme extends Video {
    private String estudio;

    public Filme(String titulo, String diretor, String[] elenco, String genero, String sinopse, int anoLancamento, int classificacaoIndicativa, String estudio) {
        super(titulo, diretor, List.of(elenco), genero, sinopse, anoLancamento, classificacaoIndicativa);
        this.estudio = estudio;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
