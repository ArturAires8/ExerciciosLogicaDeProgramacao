package estruturaCondicional;

// Calculadora simples: Crie uma calculadora com as 4 operações básicas
//usando switch-case.

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = teclado.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = teclado.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /): ");
        char operacao = teclado.next().charAt(0);

        double resultado;

        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;

            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            default:
                System.out.println("Operação inválida!");

        }
        teclado.close();
    }
}


