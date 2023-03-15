package app;

import entidades.Triangulo;

public class App {

    public static void main(String[] args) {

        Triangulo tri = new Triangulo(3.0, 4.0, 5.0);

        System.out.println("O valor de P: " + tri.calcularP());
        System.out.println("O valor da área: " + tri.calcularArea());

        Triangulo tri2 = new Triangulo(7.5, 4.5, 4.02);

        System.out.println("O valor de P: " + tri2.calcularP());
        System.out.println("O valor da área: " + tri2.calcularArea());

        if (tri.calcularArea() > tri2.calcularArea()) {
            System.out.println("A área do tri1 é maior do que tri2");
        } else {
            System.out.println("A área tri2 é maior do que tri1");
        }

    }
}
