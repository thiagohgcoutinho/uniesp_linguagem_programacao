package entidades;

public abstract class Propriedade {

    private int id;
    private String endereco;
    private int numQuarto;
    private double valorAluguel;

    public Propriedade(int id, String endereco, int numQuarto, double valorAluguel) {
        this.id = id;
        this.endereco = endereco;
        this.numQuarto = numQuarto;
        this.valorAluguel = valorAluguel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    public abstract void mostrarDetalhes();

}
