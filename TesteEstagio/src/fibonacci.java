import java.util.Scanner;
import java.util.HashSet;

public class fibonacci {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para verificar se pertence à sequência de Fibonacci:");
        int numero = sc.nextInt();

        HashSet<Integer> fibonacciSet = new HashSet<>();
        int a = 0, b = 1;

        // Adiciona os primeiros dois números da sequência
        fibonacciSet.add(a);
        fibonacciSet.add(b);

        // Calcula a sequência de Fibonacci e adiciona os valores ao conjunto
        while (b <= numero) {
            int next = a + b;
            fibonacciSet.add(next);
            a = b;
            b = next;
        }

        // Verifica se o número informado pertence à sequência
        if (fibonacciSet.contains(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }
}
