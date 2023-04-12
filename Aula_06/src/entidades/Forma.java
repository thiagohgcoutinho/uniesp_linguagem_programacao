package entidades;

public abstract class Forma {
    // Declaração do atributo
    private Cores cor;

    // Método construtor
    public Forma(Cores cor){
        this.cor = cor;
    }

    // Método Calcular Área
    public abstract double calcularArea();
}
