package entidades;

public class Casa extends Propriedade{

    private double area;

    public Casa(int id, String endereco, int numQuarto, double valorAluguel, double area) {
        super(id, endereco, numQuarto, valorAluguel);
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Identificador: " + getId());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Número de Quartos: " + getNumQuarto());
        System.out.println("Valor do Aluguel: " + getValorAluguel());
        System.out.println("Área: " + getArea());
    }
}
