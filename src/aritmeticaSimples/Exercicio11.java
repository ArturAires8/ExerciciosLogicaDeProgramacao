package aritmeticaSimples;

//  Faça um programa que calcule o aumento de 15% sobre um salário informado.

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do salário:");
        double salario = teclado.nextDouble();

        System.out.println("Digite o valor da porcentagem:");
        double porcentagem = teclado.nextDouble();

        double aumento = salario * (porcentagem / 100);
        double novoSalario = salario + aumento;

        System.out.println("\n--- Resultado ---");
        System.out.printf("Salário original: R$ %.2f%n", salario);
        System.out.printf("Aumento de %.1f%%: R$ %.2f%n", porcentagem, aumento);
        System.out.printf("Novo salário: R$ %.2f%n", novoSalario);


        teclado.close();

    }


}
