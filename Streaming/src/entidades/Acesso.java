package entidades;

import java.util.Date;

public class Acesso {
    private Usuario usuario;
    private Video video;
    private Date data;

    public Acesso(Usuario usuario, Video video, Date data) {
        this.usuario = usuario;
        this.video = video;
        this.data = data;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
