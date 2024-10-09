import java.util.Scanner;

public class letra_maiuscula {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma string para verificar a letra 'a': ");
        String letra = sc.nextLine();

        int contador =0;

        for(char c: letra.toCharArray()){
            if (c == 'a'|| c == 'A'){
                contador++;
            }
        }
        if (contador > 0){
            System.out.println("A letra 'a' (maiúscula ou minúscula) ocorre " + contador + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }
        sc.close();
    }
}
