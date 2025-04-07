package aritmeticaSimples;


// Desenvolva um programa que calcule o desconto de 10% sobre um produto.

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor original do produto: ");
        double valorProduto = teclado.nextDouble();

        System.out.print("Digite o percentual de desconto: ");
        double percentualDesconto = teclado.nextDouble();

        double valorFinal = calcularValorDesconto(valorProduto, percentualDesconto);
        double valorDesconto = valorProduto - valorFinal;


        System.out.println("\n ---Resultado --- ");
        System.out.printf("Valor original: R$ %.2f%n", valorProduto);
        System.out.printf("Desconto: %.1f%% -> R$ %.2f%n", percentualDesconto, valorDesconto);
        System.out.printf("Valor com desconto: R$ %.2f%n", valorFinal);

        teclado.close();


    }

    public static double calcularValorDesconto(double valorProduto, double percentualDesconto) {
        return valorProduto * (1 - percentualDesconto / 100);
    }

}


