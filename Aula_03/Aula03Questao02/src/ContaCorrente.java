public class ContaCorrente {

    private String nome;
    private int cpf;
    private double saldo;

    public void depositar(double x) {

        this.saldo = this.saldo + x;
        System.out.println("Você depositou R$ " + x);
        System.out.println("Seu novo saldo é R$ " + this.saldo);

    }

    public void sacar(double y) {

        if (y <= this.saldo) {

            this.saldo = this.saldo - y;
            System.out.println("Você sacou R$ " + y);
            System.out.println("Seu novo saldo é R$ " + this.saldo);

        } else {

            System.out.println("Saldo Insuficiente.");

        }

    }

    public ContaCorrente(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return this.saldo;
    }
}