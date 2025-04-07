package aritmeticaSimples;

//Faça um programa que multiplique dois números e exiba o produto.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();

        int resultado = multiplicar(numero1, numero2);

        System.out.println("O produto dos números é: " + resultado);

        teclado.close();


    }

    public static int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }


}


