package aritmeticaSimples;


// Desenvolva um programa que converta um valor em reais para dólares, euros e
//libras.


import java.util.Scanner;

public class Exercicio44 {

    public static final double VALOR_DOLAR = 5.68;
    public static final double VALOR_EURO = 6.14;
    public static final double VALOR_LIBRA = 7.34;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor em reais: R$ ");
        double valorReais = teclado.nextDouble();

        double valorEmDolares = valorReais / VALOR_DOLAR;
        double valorEmEuro = valorReais / VALOR_EURO;
        double valorEmLibra = valorReais / VALOR_LIBRA;

        System.out.printf("Valor em dólares: US$ %.2f%n", valorEmDolares);
        System.out.printf("Valor em euro: € %.2f%n", valorEmEuro);
        System.out.printf("Valor em libra: £ %.2f%n", valorEmLibra);

        teclado.close();
    }


}

