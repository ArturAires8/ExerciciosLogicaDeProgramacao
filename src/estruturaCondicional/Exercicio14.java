package estruturaCondicional;

// Tipo de triângulo: Classifique um triângulo em equilátero, isósceles ou
//escaleno.

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro lado do triângulo: ");
        double lado1 = teclado.nextDouble();

        System.out.print("Digite o segundo lado do triângulo: ");
        double lado2 = teclado.nextDouble();

        System.out.print("Digite o terceiro lado do triângulo: ");
        double lado3 = teclado.nextDouble();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triângulo isósceles");
        } else {
            System.out.println("Triângulo escaleno");
        }


        teclado.close();
    }


}
