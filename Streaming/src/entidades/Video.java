package entidades;

import java.util.List;

public class Video {
    private String titulo;
    private String diretor;
    private List<String> elenco;
    private String genero;
    private String sinopse;
    private int anoLancamento;
    private int classificacaoIndicativa;

    public Video(String titulo, String diretor, List<String> elenco, String genero, String sinopse, int anoLancamento, int classificacaoIndicativa) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.elenco = elenco;
        this.genero = genero;
        this.sinopse = sinopse;
        this.anoLancamento = anoLancamento;
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public List<String> getElenco() {
        return elenco;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setElenco(List<String> elenco) {
        this.elenco = elenco;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setClassificacaoIndicativa(int classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    // Métodos para representação textual do objeto
    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", diretor='" + diretor + '\'' +
                ", elenco=" + elenco +
                ", genero='" + genero + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", classificacaoIndicativa=" + classificacaoIndicativa +
                '}';
    }
}
