package aritmeticaSimples;

import java.util.Scanner;

//Escreva um programa que converta horas em minutos.


public class Exercicio18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas: ");
        double horas = teclado.nextDouble();

        double minutos = converterHorasParaMinutos(horas);

        System.out.printf("%.2f horas equivalem a %.2f minutos%n", horas, minutos);

        teclado.close();
    }

    public static double converterHorasParaMinutos(double hora) {
        return hora * 60;
    }
}
