package aritmeticaSimples;

// Crie um programa que calcule a potência de um número (sem usar Math.pow()).

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = teclado.nextInt();

        System.out.print("digite o expoente: ");
        int expoente = teclado.nextInt();

        int resultado = calculoPotenciaNumero(base, expoente);

        System.out.println("\nResultado: " + base + " ^ " + expoente + " = " + resultado);

        teclado.close();
    }

    public static int calculoPotenciaNumero(int base, int expoente) {
        if (expoente == 0) {
            return -1;
        }

        int resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

}
