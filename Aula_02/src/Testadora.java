public class Testadora {
    //Método main necessário para executar o programa Java
    public static void main(String[] args) {
        /*
        Comentário de bloco é feito desta maneira
         */
        // Comando para imprimir no terminal
        // System.out.println("Olá, mundo!");

        // Cadastro do Paciente
        String nome = "Thiago Henrique";
        int idade = 37;
        double altura = 1.67;
        double peso = 71.1;
        boolean fumante = false;

        // Respostas
        boolean praticaAtividade = true;
        int atividadeSemana = 4;
        boolean dorSentida = true;
        int intensidadeDor = 8;

        if (praticaAtividade == true) {
            System.out.println("O paciente pratica atividade física!");

            if (atividadeSemana > 3) {
                System.out.println("Parabéns! Boa quantidade de atividade física!");
            } else {
                System.out.println("Precisa praticar mais atividades!");
            }
        }

        if (dorSentida == true) {
            System.out.println("O paciente sente dor.");
            if (intensidadeDor > 5) {
                System.out.println("Sente uma dor muito forte.");
            } else {
                System.out.println("Vamos tratar com medicamentos.");
            }
        }
    }
}
