package aritmeticaSimples;

//  Desenvolva um programa que divida dois números e mostre o quociente.

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        int resultado = dividir(num1, num2);

        System.out.println("O quociente dos números e : " + resultado);


        teclado.close();

    }

    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }
}
