package entidades;

public class ValidadorClassificacao {
    public boolean validar(Usuario usuario, Video video) {
        if (usuario.getIdade() >= video.getClassificacaoIndicativa()) {
            return true;
        }
        return false;
    }
}
