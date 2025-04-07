package aritmeticaSimples;

import java.util.Scanner;


// Crie um programa que calcule o resto da divisão entre dois números.


public class Exercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();

        int resto = num1 % num2;

        System.out.println("Resto da divisão: " + resto);


        teclado.close();

    }


}



