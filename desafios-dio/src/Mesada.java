import java.util.Scanner;

public class Mesada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int mesada = 50;

        System.out.println("Digite a quantidade de meses que polpou o dinheiro: ");
        int entrada = leitor.nextInt();

        System.out.println("Em " + entrada + " meses voce tera: " + entrada * mesada + " reais");
    }
}