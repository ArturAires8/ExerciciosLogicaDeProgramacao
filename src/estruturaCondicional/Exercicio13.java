package estruturaCondicional;

import java.util.Scanner;

// Triângulo válido: Dados 3 lados, verifique se podem formar um triângulo

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro lado do triângulo: ");
        double lado1 = teclado.nextDouble();

        System.out.print("Digite o segundo lado do triângulo: ");
        double lado2 = teclado.nextDouble();

        System.out.print("Digite o terceiro lado do triângulo: ");
        double lado3 = teclado.nextDouble();

        boolean trianguloValido = (lado1 + lado2 > lado3) &&
                (lado1 + lado3 > lado1) &&
                (lado2 + lado3 > lado1);

        if (trianguloValido) {
            System.out.println("Triângulo é válido");
        } else {
            System.out.println("Triângulo não é válido");
        }


        teclado.close();
    }


}

