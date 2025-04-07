package estruturaCondicional;

import java.util.Scanner;

public class Exercicio20 {

    // Número por extenso: Escreva um programa que mostre de 1 a 5 por extenso
    //usando switch.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 5:");
        int numero = teclado.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            default:
                System.out.println("Número inválido! Digite um valor entre 1 a 5");
        }


    }

}
