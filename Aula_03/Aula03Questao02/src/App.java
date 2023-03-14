public class App {

    public static void main(String[] args) {


        ContaCorrente cc1 = new ContaCorrente("Thiago", 567229);

        cc1.depositar(1000);
        cc1.sacar(245.65);
        cc1.depositar(290.51);

        System.out.println("Titular: " + cc1.getNome());
        System.out.println("Saldo: R$ " + cc1.getSaldo());

    }

}
