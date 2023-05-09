package aplicacao;

import java.util.Scanner;

public class App4 {

    public static void main(String[] args) {

        metodoFinal();

    }

    public static void metodoFinal() {

        metodo();

    }

    public static void metodo() {

        Scanner sc = new Scanner(System.in);
        try {
            String[] nome = sc.nextLine().split(" ");
            System.out.println("O nome é: " + nome[10]);
        } catch (Exception e) {
            e.printStackTrace();
            sc.next();
        }

    }

}
