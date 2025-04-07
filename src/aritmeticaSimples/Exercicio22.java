package aritmeticaSimples;
//Escreva um programa que verifique se um número é par ou ímpar


import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        String resultado = verificarParOuImpar(numero);

        System.out.println(resultado);


        teclado.close();
    }

    public static String verificarParOuImpar(int numero) {
        if (numero % 2 == 0) {
            return numero + " é par ";
        } else {
            return numero + " é impar";
        }

    }
}









