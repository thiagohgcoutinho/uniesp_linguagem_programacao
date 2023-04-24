package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServicoStreaming {
    private List<Video> listaVideosDisponiveis;
    private List<Usuario> listaUsuariosCadastrados;
    private List<Acesso> listaAcessosRegistrados;

    public ServicoStreaming() {
        listaVideosDisponiveis = new ArrayList<>();
        listaUsuariosCadastrados = new ArrayList<>();
        listaAcessosRegistrados = new ArrayList<>();
    }

    public void adicionarVideo(Video video) {
        listaVideosDisponiveis.add(video);
    }

    public void removerVideo(Video video) {
        listaVideosDisponiveis.remove(video);
    }

    public void cadastrarUsuario(Usuario usuario) {
        listaUsuariosCadastrados.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        listaUsuariosCadastrados.remove(usuario);
    }

    public boolean validarAcesso(Usuario usuario, Video video) {
        ValidadorClassificacao validador = new ValidadorClassificacao();
        if (validador.validar(usuario, video)) {
            Acesso acesso = new Acesso(usuario, video, new Date());
            listaAcessosRegistrados.add(acesso);
            return true;
        }
        return false;
    }

    public List<Video> getListaVideosDisponiveis() {
        return listaVideosDisponiveis;
    }

    public void setListaVideosDisponiveis(List<Video> listaVideosDisponiveis) {
        this.listaVideosDisponiveis = listaVideosDisponiveis;
    }

    public List<Usuario> getListaUsuariosCadastrados() {
        return listaUsuariosCadastrados;
    }

    public void setListaUsuariosCadastrados(List<Usuario> listaUsuariosCadastrados) {
        this.listaUsuariosCadastrados = listaUsuariosCadastrados;
    }

    public List<Acesso> getListaAcessosRegistrados() {
        return listaAcessosRegistrados;
    }

    public void setListaAcessosRegistrados(List<Acesso> listaAcessosRegistrados) {
        this.listaAcessosRegistrados = listaAcessosRegistrados;
    }
}

