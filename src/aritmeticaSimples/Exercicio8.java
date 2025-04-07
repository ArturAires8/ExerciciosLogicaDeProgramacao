package aritmeticaSimples;

import java.util.Scanner;


// Crie um programa que calcule a área de um retângulo (área = base × altura).

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da base do retângulo: ");
        double baseRetangulo = teclado.nextDouble();

        System.out.println("Digite o valor da altura do retângulo: ");
        double alturaRetangulo = teclado.nextDouble();

        double area = multiplicar(baseRetangulo, alturaRetangulo);

        System.out.println("A área de um retângulo e : " + area);

        teclado.close();
    }

    public static double multiplicar(double baseRetangulo, double alturaRetangulo) {
        return baseRetangulo * alturaRetangulo;

    }

}
