package estruturaCondicional;

import java.util.Scanner;

public class Exercicio21 {

    // .Equação 1º grau: Resolva a equação ax + b = 0, tratando todos os casos
    //possíveis.

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = teclado.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = teclado.nextDouble();

        resolverAEquacao(a, b);

        teclado.close();
    }


    public static void resolverAEquacao(double a, double b) {

        if (a != 0) {
            // Caso 1 : solução única

            double x = -b / a;
            System.out.printf("Solução única: x =  %.2f%n", x);

        } else {
            if (b == 0) {
                // Caso 2 : infinitas soluções
                System.out.println("Equação  tem infinitas soluções(Qualquer x é solução)");
            } else {
                // Caso 3 : sem solução
                System.out.println("Equação não tem solução(impossível");
            }
        }
    }

}



