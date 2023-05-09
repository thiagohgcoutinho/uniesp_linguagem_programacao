package aplicacao;

import entidades.*;

public class App {

    public static void main(String[] args) {

        Propriedade p1 = new Apartamento(1, "Rua José, 400", 3, 450.00, 5);
        Propriedade p2 = new Casa(2, "Rua Carlos Silva, 200", 3, 500.00, 87.50);
        Propriedade p3 = new QuartoDeHotel(3, "Rua Marco Paulo, 30", 2, 290.00, true);

        Usuarios u1 = new Proprietarios("Thiago", "thiagohgcoutinho@gmail.com", "99144-5979");
        u1.adicionarPropriedade(p1);
        u1.adicionarPropriedade(p2);
        u1.adicionarPropriedade(p3);

        Usuarios u2 = new Hospedes("Luiz", "luiz@gmail.com", "99124-7263");
        u2.adicionarPropriedade(p1);

        u1.mostrarDetalhes();
        u2.mostrarDetalhes();
    }

}
