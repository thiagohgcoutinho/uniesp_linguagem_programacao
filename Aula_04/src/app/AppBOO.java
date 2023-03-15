package app;

import entidades.TrianguloB;

public class AppBOO {

    public static void main(String[] args) {

        TrianguloB t1 = new TrianguloB();
        TrianguloB t2 = new TrianguloB();

        t1.a = 3.0;
        t1.b = 4.0;
        t1.c = 5.0;

        t2.a = 7.5;
        t2.b = 4.5;
        t2.c = 4.02;

        double pt1 = (t1.a + t1.b + t1.c) / 2;
        double pt2 = (t2.a + t2.b + t2.c) / 2;

        double areat1 = Math.sqrt(pt1 * (pt1 - t1.a) * (pt1 - t1.b) * (pt1 - t1.c));
        double areat2 = Math.sqrt(pt2 * (pt2 - t2.a) * (pt2 - t2.b) * (pt2 - t2.c));

        System.out.println("Área T1: " + areat1);
        System.out.println("Área T2: " + areat2);

        if (areat1 > areat2) {
            System.out.println("A área de T1 é maior do que T2");
        } else {
            System.out.println("A área de T2 é maior do que T1");
        }

    }
}
