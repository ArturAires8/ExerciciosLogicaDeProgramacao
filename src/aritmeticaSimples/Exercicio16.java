package aritmeticaSimples;


// Crie um programa que resolva uma equação do primeiro grau (ax + b = 0).

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = teclado.nextDouble();

        System.out.print("Digite o valor de b:");
        double b = teclado.nextDouble();

        resolverEquacao(a, b);


        teclado.close();
    }

    public static void resolverEquacao(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("A equação tem infinitas soluções (identitade).");
            } else {
                System.out.println("A equação não tem solução (impossível).");
            }
        } else {
            double x = -b / a;
            System.out.printf("A solução da equação é: x = %.2f%n", x);
        }
    }
}
