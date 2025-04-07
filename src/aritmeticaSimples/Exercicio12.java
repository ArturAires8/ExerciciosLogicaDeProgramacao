package aritmeticaSimples;

import java.util.Scanner;

// Crie um programa que converta metros para centímetros.


public class Exercicio12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor em metros: ");
        double metros = teclado.nextDouble();

        double centimetros = metros * 100;
        System.out.printf("%.2f metros equivalem a %.2f centimetros%n ",metros,centimetros);


        teclado.close();
    }


}
