import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        System.out.println("Entre com uma nota..");

        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scanner.nextInt();

        while (nota < 0 || nota > 10){
            System.out.println("Nota Inválida! Digite novamente: ");
            nota = scanner.nextInt();

        }
    }
}
