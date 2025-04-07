package aritmeticaSimples;

// Faça um programa que calcule a hipotenusa de um triângulo retângulo
//(hipotenusa = √(cateto1² + cateto2²)).

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do cateto 1:  ");
        double cateto1 = teclado.nextDouble();

        System.out.print("Digite o valor do cateto 2: ");
        double cateto2 = teclado.nextDouble();

        double hipotenusa = calcularHipotenusa(cateto1, cateto2);
        System.out.printf("O valor da hipotenusa de um triângulo e: %.2f%n", hipotenusa);

        teclado.close();
    }

    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

    }
}