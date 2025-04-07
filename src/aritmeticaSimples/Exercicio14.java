package aritmeticaSimples;

//Escreva um programa que calcule o IMC (Índice de Massa Corporal: peso /
// altura²).

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do peso: ");
        double peso = teclado.nextDouble();

        System.out.print("Digite o valor da altura: ");
        double altura = teclado.nextDouble();

        double imc = calcularImc(peso, altura);
        System.out.printf("O índice de massa corporal é: %.2f%n", imc);

        teclado.close();

    }

    public static double calcularImc(double peso, double altura) {
        return peso / Math.pow(altura, 2);
    }

}
