package estruturaCondicional;

// Plano cartesiano: Dadas coordenadas (x,y), determine em qual quadrante está.

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a coordenada x: ");
        double x = teclado.nextDouble();

        System.out.println("Digite a coordenada y: ");
        double y = teclado.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("O ponto está na ORIGEM (Centro).");
        } else if (x == 0) {
            System.out.println("O ponto está sobre o EIXO Y.");
        } else if (y == 0) {
            System.out.println("O ponto está sobre o EIXO X.");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrante 1 (Q1)");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante 2 (Q2)");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3 (Q3)");
        } else {
            System.out.println("Quadrante 4 (Q4)");

        }

        teclado.close();

    }
}
