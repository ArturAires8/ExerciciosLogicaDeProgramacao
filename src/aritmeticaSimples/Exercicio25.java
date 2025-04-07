package aritmeticaSimples;

// Desenvolva um programa que calcule o MDC (Máximo Divisor Comum) entre
//dois números.

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = teclado.nextInt();

        int mdc = calcularMDC(primeiroNumero, segundoNumero);

        System.out.println("O MDC entre " + primeiroNumero + " e " + segundoNumero + " é: " + mdc);

        teclado.close();

    }

    public static int calcularMDC(int primeiroNumero, int segundoNumero) {

        // Garante que trabalhamos com valores positivos

        primeiroNumero = Math.abs(primeiroNumero);
        segundoNumero = Math.abs(segundoNumero);

        // Algoritmo de Euclides
        while (segundoNumero != 0) {
            int temp = segundoNumero;
            segundoNumero = primeiroNumero % segundoNumero;
            primeiroNumero = temp;
        }
        return primeiroNumero;
    }
}