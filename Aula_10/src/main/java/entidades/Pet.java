package entidades;

public class Pet {
    private String nome;
    private int anoNascimento;
    private double peso;

    public Pet (){}

    public Pet(String nome, int anoNascimento, double peso){
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
