package aritmeticaSimples;

import java.util.Scanner;

public class Exercicio40 {

    // Crie um programa que calcule o valor da parcela de um financiamento (valor
    //total / número de parcelas + juros)

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor total do financiamento: ");
        double valorFinanciamento = teclado.nextDouble();

        System.out.print("Digite o número de parcelas do financiamento: ");
        double numeroParcelas = teclado.nextDouble();

        System.out.print("Digite a taxa de juros (%)");
        double taxaJuros = teclado.nextDouble();

        double parcela = (valorFinanciamento / numeroParcelas) * (1 + taxaJuros);

        System.out.printf("Valor da parcela: %.2f%n", parcela);


        teclado.close();


    }


}
