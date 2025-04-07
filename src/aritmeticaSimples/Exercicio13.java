package aritmeticaSimples;

//Desenvolva um programa que calcule o volume de uma caixa retangular
// (volume = comprimento × largura × altura).


import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        System.out.println();
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o comprimento da caixa retangular: ");
        double comprimento = teclado.nextDouble();

        System.out.print("Digite a largura da caixa retangular: ");
        double largura = teclado.nextDouble();

        System.out.print("Digite a altura da caixa retangular: ");
        double altura = teclado.nextDouble();

        double volume = multiplicar(comprimento, largura, altura);

        System.out.printf("O volume da caixa retangular é : %.2f%n ", volume);

        teclado.close();

    }

    public static double multiplicar(double comprimento, double largura, double altura) {
        return comprimento * largura * altura;
    }

}
