package estruturaCondicional;

// Dia da semana: Dado um número de 1 a 7, exiba o dia da semana
//correspondente.

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int numero = teclado.nextInt();

        if (numero == 1) {
            System.out.println("Domingo");
        } else if (numero == 2) {
            System.out.println("Segunda");
        } else if (numero == 3) {
            System.out.println("Terça");
        } else if (numero == 4) {
            System.out.println("Quarta");
        } else if (numero == 5) {
            System.out.println("Quinta");
        } else if (numero == 6) {
            System.out.println("Sexta");
        } else if (numero == 7) {
            System.out.println("Sabádo");
        }else {
        System.out.println("Número inválido! Digite um valor entre 1 e 7");


        }
        teclado.close();


    }


}


