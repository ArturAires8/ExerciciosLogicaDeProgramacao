package aritmeticaSimples;

// .Crie um programa que determine se um número é primo.

import java.util.Scanner;

public class Exercicio24 {

    public static void ma20in(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = teclado.nextInt();

        if (ehPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo. ");
        }

        teclado.close();

    }

    public static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;

        }
        if (n == 2) {
            return true;

        }
        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
