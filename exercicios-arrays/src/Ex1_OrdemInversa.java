public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {1, -15, 8, 9, 3, 0};

        System.out.print("Vetor: ");
        int count = 0;
        while (count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor: ");
        for (int i = (vetor.length -1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }

    }
}
