package aritmeticaSimples;

import java.util.Scanner;

//  Desenvolva um programa que calcule a área de um círculo (área = π × raio²).

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        double raio = teclado.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A área do círculo é : %.2f  m²%n ", area);


        teclado.close();
    }


}
