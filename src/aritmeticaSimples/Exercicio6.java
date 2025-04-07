package aritmeticaSimples;

import java.util.Scanner;

// Escreva um programa que calcule a média de três números.


public class Exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();

        int media = (num1 + num2 + num3) / 3;
        System.out.println("A média dos números e: " + media);

        teclado.close();
    }


}
