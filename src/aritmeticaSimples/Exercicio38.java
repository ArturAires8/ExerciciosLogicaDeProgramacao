package aritmeticaSimples;

// Escreva um programa que converta velocidade de km/h para m/s.


import java.util.Scanner;

public class Exercicio38 {
    private static final double FATOR_KMH_PARA_MS = 3.6;

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Digite a velocidade em (Km/h): ");

            while (!teclado.hasNextDouble()) {
                System.out.println("Digite um número válido!");
                teclado.next(); // Descarta entrada inválida
            }
            double velocidade = teclado.nextDouble();

            double resultado = calculoConverterVelocidade(velocidade);
            System.out.printf("Velocidade em (m/s) %.2f%n", resultado);
        }

    }

    public static double calculoConverterVelocidade(double velocidade) {
        return velocidade / FATOR_KMH_PARA_MS;
    }

}
