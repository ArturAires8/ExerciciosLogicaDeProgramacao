package aritmeticaSimples;

// .Escreva um programa que calcule o novo salário com aumento de 10% para
//salários até R$1000 e 5% para os demais.


import java.util.Scanner;

public class Exercicio42 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do salário: ");
        double valorSalario = teclado.nextDouble();

        double novoSalario;

        if (valorSalario <= 1000) {
            novoSalario = valorSalario * 1.10;
            System.out.println("Aumento aplicado: 10%");
        } else {
            novoSalario = valorSalario * 1.05;
            System.out.println("Aumento aplicado 5%");
        }
        System.out.printf("Novo salário: R$ %.2f%n", novoSalario);

        teclado.close();


    }


}
