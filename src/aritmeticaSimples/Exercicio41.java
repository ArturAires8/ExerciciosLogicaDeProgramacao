package aritmeticaSimples;

import java.util.Scanner;

// Desenvolva um programa que calcule a média ponderada de três notas com
//pesos 2, 3 e 5.


public class Exercicio41 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = teclado.nextDouble();

        System.out.print("Digite a nota 3:");
        double nota3 = teclado.nextDouble();


        double media = calculoMediaPonderada(nota1, nota2, nota3);
        System.out.printf("Média ponderada: %.2f%n", media);

        teclado.close();
    }

    public static double calculoMediaPonderada(double nota1, double nota2, double nota3) {
        return (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
    }

}
