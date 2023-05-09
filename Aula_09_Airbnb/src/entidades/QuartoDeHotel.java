package entidades;

public class QuartoDeHotel extends Propriedade{

    private boolean possuiVista;

    public QuartoDeHotel(int id, String endereco, int numQuarto, double valorAluguel, boolean possuiVista) {
        super(id, endereco, numQuarto, valorAluguel);
        this.possuiVista = possuiVista;
    }

    public boolean isPossuiVista() {
        return possuiVista;
    }

    public void setPossuiVista(boolean possuiVista) {
        this.possuiVista = possuiVista;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Identificador: " + getId());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Número de Quartos: " + getNumQuarto());
        System.out.println("Valor do Aluguel: " + getValorAluguel());
        System.out.println("Possui Vista: " + isPossuiVista());
    }
}
