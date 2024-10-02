import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int numTabuada = scanner.nextInt();

        System.out.println("Tabuada do " + numTabuada);

        for (int i = 1; i <= 10; i++){
            System.out.println(numTabuada + " X " + i + " = " + (numTabuada*i));
        }
    }
}
