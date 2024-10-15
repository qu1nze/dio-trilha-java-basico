import java.util.Scanner;

public class DownloadDePacotes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();

        if(tamanho > 0 && tamanho <=10){
            for (int i = 0; i< tamanho; i++){
                System.out.print("/");
            }
        }else{
            System.out.println("Valor inválido. Digite entre 1-10");
        }
    }
}
