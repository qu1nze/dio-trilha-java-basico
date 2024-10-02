import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Quantidade de numeros: ");
        quantNumeros = scanner.nextInt();

        int count = 0;

        do {
            System.out.println("Numero: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impar: " + quantImpares);

    }
}
