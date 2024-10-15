import java.util.Scanner;

public class IndustriaDaMulta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();

        System.out.println(velocidadeAtual > 60 ? "Foi multado" : "Nao foi multado");

    }
}
