package aritmeticaSimples;

// Faça um programa que calcule o custo total de uma viagem (combustível,
//pedágios, alimentação).


import java.util.Scanner;

public class Exercicio43 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor gasto em combustível: ");
        double valorCombustivel = teclado.nextDouble();

        System.out.print("Digite o valor gasto em pedágio: ");
        double valorPedagio = teclado.nextDouble();

        System.out.print("Digite o valor gasto com alimentação: ");
        double valorAlimentacao = teclado.nextDouble();

        double valorGasto = calcularValorGasto(valorCombustivel, valorPedagio, valorAlimentacao);

            System.out.printf("Custo total da viagem: %.2f%n", valorGasto);

        teclado.close();
    }

    public static double calcularValorGasto(double valorCombustivel, double valorPedagio, double valorAlimentacao) {
        return valorAlimentacao + valorCombustivel + valorPedagio;
    }

}
