package entidades;

public class Quadrado extends Forma{

    private double largura, altura;

    public Quadrado(Cores cor, double largura, double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return this.largura * this.altura;
    }
}
