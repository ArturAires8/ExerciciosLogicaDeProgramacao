package aritmeticaSimples;

import java.util.Scanner;

// Escreva um programa que calcule o perímetro de um quadrado (perímetro = 4 ×
// lado).

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do lado do quadrado: ");
        double ladoQuadrado = teclado.nextDouble();

        double perimetro = ladoQuadrado * 4;
        System.out.printf("O perímetro do quadrado é : %.2f%n ", perimetro);


        teclado.close();
    }


}
