package aritmeticaSimples;

// Escreva um programa que gere uma tabuada completa de um número.

import java.util.Scanner;

public class Exercicio45 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o numero: ");
        int numero = teclado.nextInt();

        System.out.println("\nTabuada do " + numero + ":");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }


        teclado.close();
    }


}
