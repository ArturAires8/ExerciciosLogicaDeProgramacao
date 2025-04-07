package estruturaCondicional;

// Desconto simples: Aplique 10% de desconto se o valor da compra for maior que
//R$100.

import java.util.Scanner;

public class Exercicio10 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor da compra R$: ");
        double valorCompra = teclado.nextDouble();

        double valorFinal;

        if (valorCompra > 100.0) {
            double desconto = valorCompra * 0.10; // 10% de desconto
            valorFinal = valorCompra - desconto;
            System.out.printf("Desconto aplicado: R$ %.2f%n", desconto);

        } else {
            valorFinal = valorCompra;
            System.out.println("Sem desconto (valor menor ou igual a R$ 100");
        }

        System.out.printf("Valor a pagar: R$ %.2f%n", valorFinal);
    }


}
