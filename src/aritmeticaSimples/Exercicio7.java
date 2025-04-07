package aritmeticaSimples;

import java.util.Scanner;

// Faça um programa que converta graus Celsius para Fahrenheit


public class Exercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double grausCelsius = teclado.nextDouble();

        double fahrenheit = grausCelsius * 9 / 5 + 32;
        System.out.println("Resultdo em Fahrenheit: " + fahrenheit);


    }


}