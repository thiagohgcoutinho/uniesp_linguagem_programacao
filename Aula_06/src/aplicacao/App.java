package aplicacao;

import entidades.*;

public class App {
    public static void main(String[] args) {

        Quadrado q = new Quadrado(Cores.PRETO, 2.5, 2.5);
        Circulo c = new Circulo(Cores.VERMELHO, 5.0);
        Triangulo t = new Triangulo(Cores.AZUL, 2.5, 4.5, 6.0);

        // Polimorfismo
        Forma f = new Quadrado(Cores.AZUL, 9.0, 9.0);

        System.out.println("Área do Quadrado: " + q.calcularArea());
        System.out.println("Área do Círculo: " + c.calcularArea());
        System.out.println("Área do Triângulo: " + t.calcularArea());
        System.out.println(("Área da Forma: " + f.calcularArea()));
    }
}
