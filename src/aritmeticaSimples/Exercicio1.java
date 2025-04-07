package aritmeticaSimples;


// Escreva um programa que some dois números inteiros e exiba o resultado.

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();

        int soma = numero1 + numero2;

        System.out.println("Resultado: " + soma);


        teclado.close();


    }
}
