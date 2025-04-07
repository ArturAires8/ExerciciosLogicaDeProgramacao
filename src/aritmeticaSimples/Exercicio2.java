package aritmeticaSimples;


//  Crie um programa que subtraia dois números e mostre o resultado.

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();

        int subtracao = numero1 - numero2;
        System.out.println("Resultado: " + subtracao);

        teclado.close();


    }

}

