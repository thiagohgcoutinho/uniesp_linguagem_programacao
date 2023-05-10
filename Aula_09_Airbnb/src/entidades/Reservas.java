package entidades;

import java.util.Date;

public class Reservas {

    Propriedade propriedade;
    Usuarios usuarios;
    Date dataCheckIn;
    Date dataCheckOut;

    public Reservas (Propriedade propriedade, Usuarios usuarios, Date dataCheckIn, Date dataCheckOut){
        this.propriedade = propriedade;
        this.usuarios = usuarios;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
    }

    public Propriedade getPropriedade() {
        return propriedade;
    }

    public void setPropriedade(Propriedade propriedade) {
        this.propriedade = propriedade;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public Date getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(Date dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public Date getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(Date dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }

    public void mostrarDetalheReserva(){
        System.out.println("Usuário: ");
        getUsuarios().getNome();
        System.out.println("Propriedade: ");
        getPropriedade().getId();
        System.out.println("Data de Check In: " + getDataCheckIn());
        System.out.println("Data de Check Out: " + getDataCheckOut());
    }
}
