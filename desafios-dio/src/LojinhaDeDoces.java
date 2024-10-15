import java.util.Scanner;

public class LojinhaDeDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();
        int docesObtidos = dinheiro * 2;

        System.out.println("O cliente obteve " + docesObtidos + " doces");
    }
}
