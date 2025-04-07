package estruturaCondicional;

import java.util.Scanner;

// Divisibilidade: Verifique se um número é divisível por 3 e por 5 ao mesmo tempo.


public class Exercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = teclado.nextInt();

        if (ehDivisivelPor3e5(numero)) {
            System.out.printf("O %d é divisivel por 3 e 5 ao mesmo tempo. %n", numero);
        } else {
            System.out.printf("O %d não é divisivel por 3 e 5 ao mesmo tempo. %n", numero);
        }

        teclado.close();
    }
    public static boolean ehDivisivelPor3e5(int numero) {
        return numero % 3 == 0 && numero % 5 == 0;

    }
}
