// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Usuario {
    public static void main(String[] args) {

        SmatTv smatTv = new SmatTv();

        System.out.println("Tv Ligada? " + smatTv.ligada);
        System.out.println("Canal Atual? " + smatTv.canal);
        System.out.println("Volume Atual? " + smatTv.volume);

        smatTv.ligar();
        System.out.println("Novo Status -- Tv Ligada? " + smatTv.ligada);

        smatTv.desligar();
        System.out.println("Novo Status -- Tv Ligada? " + smatTv.ligada);

        smatTv.diminuirVolume();
        smatTv.diminuirVolume();
        smatTv.diminuirVolume();
        smatTv.aumentarVolume();

        smatTv.aumentarCanal();
        System.out.println("Canal Atual: " + smatTv.canal);

        smatTv.diminuirCanal();
        System.out.println("Canal Atual: " + smatTv.canal);

        smatTv.mudarCanal(15);
        System.out.println("Canal Atual: " + smatTv.canal);
    }
}