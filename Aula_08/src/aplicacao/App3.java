package aplicacao;

import java.util.ArrayList;

public class App3 {

    public static void main(String[] args) {
        try {
            ArrayList<String> linguagens = new ArrayList<String>();
            linguagens.add("Python");
            linguagens.add("Java");
            linguagens.add("Rust");

            System.out.println("A melhor linguagem é : " + linguagens.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("O erro apresentado foi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro!!!");
        }
    }

}
