package app;

import entidade.Carro;
import entidade.Roda;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Solicitando dados do usuário
        Scanner sc = new Scanner(System.in);
        int ano = sc.nextInt();
        String modelo = sc.nextLine();
        String fabricante = sc.nextLine();
        int aro = sc.nextInt();

        // Instanciando um carro
        Roda roda1 = new Roda(fabricante, aro);
        Carro carro1 = new Carro(ano, modelo, roda1);

        System.out.println("O aro da roda é: " + carro1.getRoda().getAro());
    }
}