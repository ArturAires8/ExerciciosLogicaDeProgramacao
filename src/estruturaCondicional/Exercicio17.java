package estruturaCondicional;

// .Aumento salarial: Dado um salário, aplique aumento de 15% se salário ≤
//R$1000 ou 10% caso contrário.


import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do salário: ");
        double salario = teclado.nextDouble();

        if (salario <= 1000) {
            System.out.printf("Aumento salarial aplicado: %.2f%n", salario * 1.15);
        } else {
            System.out.printf("Aumento salarial aplicado: %.2f%n", salario * 1.10);
        }


    }


}
