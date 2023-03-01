import javax.swing.*;
import java.util.Scanner;

public class TestadoraScanner {
    public static void main(String[] args) {

        // Instanciando um objeto do tipo Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = sc.nextLine();
        System.out.println("Prazer em conhecer " + nome + ". Qual a sua idade?");
        int idade = sc.nextInt();
        System.out.println("Então você tem " + idade + " anos.");
        String nome2 = JOptionPane.showInputDialog(null, "Digite seu nome:");
        JOptionPane.showMessageDialog(null, "Olá Mundo");

    }
}
