public class App {

    public static void main(String[] args) {

        ContaLogin cl1 = new ContaLogin("thiago@gmail.com", "a1b2c3d4");
        ContaLogin cl2 = new ContaLogin("thgc@hotmail.com", "abcd12356");
        ContaLogin cl3 = new ContaLogin("th12@gmail.com", "ABCdef123344");

        cl1.setNome("Thiago Henrique", 10);
        cl2.setNome("Fellype Rocha", 20);
        cl3.setNome("Luiz Carlos", 30);

        System.out.println("CL1: " + cl1.getNome());
        System.out.println("CL2: " + cl2.getNome());
        System.out.println("CL3: " + cl3.getNome());
    }
}
