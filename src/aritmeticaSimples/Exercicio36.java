package aritmeticaSimples;

// Crie um programa que calcule o valor final de um produto com desconto e
//acréscimo de imposto.

import java.util.Scanner;

public class Exercicio36 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = teclado.nextDouble();

        System.out.print("Digite o percentual de desconto (%): ");
        double percentualDesconto = teclado.nextDouble();

        System.out.print("Digite o percentual de acréscimo de imposto (%): ");
        double acrescimoImposto = teclado.nextDouble();

        double descontoDecimal = percentualDesconto / 100;
        double impostoDecimal = acrescimoImposto / 100;

        double valorComDesconto = valorProduto * (1 - descontoDecimal);
        double valorFinal = valorComDesconto * (1 + impostoDecimal);


        System.out.printf("Valor original: R$ %.2f%n", valorProduto);
        System.out.printf("Desconto aplicado: %.1f%% -> R$ %.2f%n", percentualDesconto, (valorProduto - valorComDesconto));
        System.out.printf("Valor com desconto: R$ %.2f%n", valorComDesconto);
        System.out.printf("Imposto adicionado: %.1f%% -> R$ %.2f%n", acrescimoImposto, (valorFinal - valorComDesconto));
        System.out.printf("VALOR FINAL: R$ %.2f%n", valorFinal);

        teclado.close();
    }


}
