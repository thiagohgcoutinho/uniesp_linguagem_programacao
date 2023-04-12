package entidades;

public class Circulo extends Forma{

    private double raio;

    public Circulo(Cores cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * (this.raio * this.raio);
    }
}
