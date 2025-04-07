package aritmeticaSimples;

// .Faça um programa que gere os N primeiros termos da sequência de Fibonacci

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite quantos termos da sequência de Fibonacci deseja gerar: ");
        int numero = teclado.nextInt();

        if (numero <= 0) {
            System.out.println("Digite um número positivo.");
        } else {
            gerarFibonacci(numero);
        }


        teclado.close();
    }

    public static void gerarFibonacci(int numero) {
        long a = 0, b = 1;
        System.out.println("Os primeiros " + numero + "termos da sequência de Fibonacci são:");

        for (int i = 0; i < numero; i++) {
            System.out.println(a + " ");

            long proximo = a + b;

            a = b;
            b = proximo;

        }


    }

}


