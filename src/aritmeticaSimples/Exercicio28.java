package aritmeticaSimples;

// Crie um programa que resolva uma equação do segundo grau (ax² + bx + c = 0).

import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o coeficiente a: ");
        double a = teclado.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double b = teclado.nextDouble();

        System.out.print("Digite o coeficiente c: ");
        double c = teclado.nextDouble();

        resolverEquacao(a, b, c);


        teclado.close();


    }

    public static void resolverEquacao(double a, double b, double c) {
// caso seja equação do primeiro grau (a = 0)

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Equação indeterminada(0 = 0");
                } else {
                    System.out.println("Equação impossível(" + c + " = ");
                }
            } else {
                double raiz = -c / b;
                System.out.println("Equção do primeiro grau - Raiz real: " + raiz);
            }
            return;

        }

        // calcula o discriminante
        double delta = b * b - 4 * a * c;


        // Analise o discriminante
        if (delta > 0) {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Duas raízes distintas: %n" + "x1 = %.2f%nx2 = %.2f%n", raiz1, raiz2);
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.printf("Uma raiz real dupla:%nx = %.2f%n", raiz);
        } else {
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-delta) / (2 * a);
            System.out.printf("Raízes complexas conjugadas:%n" +
                            "x1 = %.2f + %.2fi%n" +
                            "x2 = %.2f - %.2fi%n",
                    parteReal, parteImaginaria,
                    parteReal, parteImaginaria);


        }
    }

}
