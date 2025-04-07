package aritmeticaSimples;

//.Desenvolva um programa que calcule a soma dos dígitos de um número.

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = teclado.nextInt();

        if (numero < 0) {
            System.out.println("Digite um número positivo.");
            return;
        }

        int soma = 0;
        int numeroOriginal = numero;

        while (numero > 0) {
            int digito = numero % 10;
            soma += digito;
            numero = numero / 10;
        }
        System.out.println("A soma dos dígitos de " + numeroOriginal + " e: " + soma);
        teclado.close();


    }


}
