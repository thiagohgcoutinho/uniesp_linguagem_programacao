package entidade;

public class Carro {

    private int ano;
    private String modelo;
    private String fabricante;
    private double potenciaMotor;
    private Roda roda;
    
    public Carro(int ano, String modelo, Roda roda){
        this.ano = ano;
        this.modelo = modelo;
        this.roda = roda;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }
    
    public void acelerar(){
        System.out.println("O carro acelerou!");
    }

    public void freiar(){
        System.out.println("O carro freiou!");
    }
}
