package estruturaCondicional;

// Par ou ímpar: Faça um programa que verifique se um número é par ou ímpar.


import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.printf(" O número %d é par. %n", numero);
        } else {
            System.out.printf("O número %d é ímpar .%n", numero);
        }


        teclado.close();


    }


}
