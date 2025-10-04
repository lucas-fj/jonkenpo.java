import java.util.Random;
import java.util.Scanner;

public class testeJogo {

    //randomizando escolha da maquina
    public static String escolhaPC(){
        Random random = new Random();

        String possibilidades[] = {"pedra" , "papel" , "tesoura"}; 

        int indiceRandom = random.nextInt(possibilidades.length);
        String escolhaMaquina = possibilidades[indiceRandom];
        return escolhaMaquina;
    }

    //comparações
    public static void comparacoes(String escolhaMaquina, String escolha){
       if (escolha.equals("pedra") && escolhaMaquina.equals("papel")) {
            System.out.println("O computador venceu!!");
        } else if (escolha.equals("papel") && escolhaMaquina.equals("pedra")) {
            System.out.println("Você venceu!!");
        } else if (escolha.equals("tesoura") && escolhaMaquina.equals("papel")) {
            System.out.println("Você venceu!!");
        } else if (escolha.equals("papel") && escolhaMaquina.equals("tesoura")) {
            System.out.println("O computador venceu!!");
        } else if (escolha.equals("pedra") && escolhaMaquina.equals("tesoura")) {
            System.out.println("Você venceu!!");
        } else if (escolha.equals("tesoura") && escolhaMaquina.equals("pedra")) {
            System.out.println("O computador venceu!!");
        } else if (escolha.equals(escolhaMaquina)) {
            System.out.println("Empate!!");
        }
    }

    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

        String escolha = "";
        String jogar = "S";

        while (jogar.equals("S") || jogar.equals("s")) {
        System.out.println("...:::: pedra papel tesoura ::::...");
        //recebendo a escolha do usuario
        System.out.print("Digite sua escolha: ");
        escolha = scanner.next();

        //loop para escolha do usuario
        while (!escolha.equals("pedra") && !escolha.equals("papel") && !escolha.equals("tesoura")) {
            System.out.print("Escolha inválida. Digite apenas pedra, papel ou tesoura: ");
            escolha = scanner.next();
        }

        //resultado e escolhas
        String escolhaMquina = escolhaPC();
        System.out.println("O computador escolheu: " + escolhaMquina);
        System.out.println("Você escolheu: " + escolha);

        comparacoes(escolhaMquina, escolha);

         System.out.println("Jogar novamente (S/N) ? ");
         jogar = scanner.next();
        }

     scanner.close();
    }
}