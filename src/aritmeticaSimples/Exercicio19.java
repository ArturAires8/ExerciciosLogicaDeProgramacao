package aritmeticaSimples;

//Faça um programa que calcule o dobro de um número e some com o triplo de
//outro número.


import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = teclado.nextInt();

        int resultado = calculoDosNumeros(primeiroNumero, segundoNumero);

        System.out.println("O resultado do cálculo (dobro do primeiro + triplo do segundo)" + resultado);

        teclado.close();
    }

    public static int calculoDosNumeros(int primeiroNumero, int segundoNumero) {
        return (primeiroNumero * 2) + (segundoNumero * 3);
    }

}
