package aritmeticaSimples;

// Faça um programa que calcule a soma dos primeiros N números naturais.

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = teclado.nextInt();

        int soma = 0;
        for (int i = 1; i < n; i++) {
            soma += i;
        }

        System.out.println("A soma dos primeiros " + n + " números naturais é: " + soma);

        teclado.close();


    }


}
