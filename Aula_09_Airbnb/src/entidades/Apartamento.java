package entidades;

public class Apartamento extends Propriedade {

    private int andar;

    public Apartamento(int id, String endereco, int numQuartos, double valorAlguel, int andar){
        super(id, endereco, numQuartos, valorAlguel);
        this.andar = andar;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }


    @Override
    public void mostrarDetalhes() {
        System.out.println("Identificador: "+ getId());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Número de Quartos: " + getNumQuarto());
        System.out.println("Valor do Aluguel: " + getValorAluguel());
        System.out.println("Andar: " + getAndar());
    }
}
