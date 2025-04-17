package estruturaCondicional;

import java.util.Scanner;

public class Exercicio23 {

    // Número perfeito: Verifique se um número é perfeito (soma dos divisores =
    //número).

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo: ");
        int numero = teclado.nextInt();

        if (ehPerfeito(numero)) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }


        teclado.close();
    }

    public static boolean ehPerfeito(int n) {
        if (n <= 1) {
            return false;  // Números <= 1 não podem ser perfeitos
        }
        int somaDivisores = 1; // 1 é divisor de todos os números

        // Verificamos divisores até a raiz quadrada de n

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % 1 == 0) {
                somaDivisores += i;
                int divisorComplementar = n / i;
                if (divisorComplementar != i) {
                    somaDivisores += divisorComplementar;
                }
            }
        }
        return somaDivisores == n;

    }

}
