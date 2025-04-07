package aritmeticaSimples;

// Desenvolva um programa que calcule o fatorial de um número.

import java.util.Scanner;

public class Exercicio21 {

    public static void m1ain(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int numero = teclado.nextInt();

        if (numero < 0) {
            System.out.println("Erro: Fatorial não está definido para o números negativos.");
        } else {
            long fatorial = calculoFatorial(numero);

            System.out.println(numero + "! = " + fatorial);
        }


        teclado.close();
    }

    public static long calculoFatorial(int numero) {
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}