import java.util.Scanner;

public class lampadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] lampadas = {"Lampada A", "Lampada B", "Lampada C"};
        String[] status = new String[3];

        System.out.println("Você tem três interruptores: A, B e C.");
        System.out.println("Descreva a sequência de ações para descobrir qual interruptor controla qual lâmpada:");

        System.out.println("1. Ligue o interruptor A por 5 minutos.");
        System.out.println("2. Desligue o interruptor A e ligue o interruptor B.");
        System.out.println("3. Deixe o interruptor C desligado.");

        System.out.println("\nVocê agora pode ir até a sala das lâmpadas para verificar:");

        status[1] = "Acesa";

        status[0] = "Desligada e Quente";

        status[2] = "Desligada e Fria";

        for (int i = 0; i < lampadas.length;i++){
            System.out.println(lampadas[i] + ": " + status[i]);
        }
        System.out.println("\nIdentificação das lâmpadas:");
        System.out.println("Interruptor A controla a lâmpada que está " + status[0] + ".");
        System.out.println("Interruptor B controla a lâmpada que está " + status[1] + ".");
        System.out.println("Interruptor C controla a lâmpada que está " + status[2] + ".");

        sc.close();

    }
}
