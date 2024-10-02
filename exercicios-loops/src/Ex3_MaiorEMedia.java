import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        int count = 0;
        int maior = 0;
        double media = 0;

        do {
            System.out.println("Numero: ");
            numero = scanner.nextInt();

            media = media + numero;

            if (numero > maior) maior = numero;

            count++;
        } while (count < 5);

        System.out.println("Maior Numero: " + maior);
        System.out.println("Media: " + media/5);

    }
}
