package aritmeticaSimples;

// Faça um programa que calcule o consumo médio de combustível (km/l) de um
//veículo.


import java.util.Scanner;

public class Exercicio39 {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            double kmPercorrido;
            double quantidadeLitrosGasto;

            // Validação para kmPercorrido
            System.out.println("Digite a distância percorrida (Km): ");
            while (true) {
                if (teclado.hasNextDouble()) {
                    kmPercorrido = teclado.nextDouble();
                    if (kmPercorrido > 0) break; // sai do loop se for válido
                    System.out.println("Digite um valor maior que zero!");
                } else {
                    System.out.println("Erro: Digite um número válido!");
                    teclado.next(); // descarta entrada inválida
                }
            }

            // Validação para litros gastos
            System.out.println("Digite a quantidadede litros de combustível gastos: ");
            while (true) {
                if (teclado.hasNextDouble()) {
                    quantidadeLitrosGasto = teclado.nextDouble();
                    if (quantidadeLitrosGasto > 0) break; // evita divisão por zero
                    System.out.println("Digite um valor maior que zero!");
                } else {
                    System.out.println("Erro: Digite um número válido!");
                    teclado.next(); // Descarta entrada inválida
                }
            }

            double resultado = calculoConsumoMedio(kmPercorrido, quantidadeLitrosGasto);
            System.out.printf("Consumo médio: %.2f km/1%n", resultado);
        }
    }

    public static double calculoConsumoMedio(double kmPercorrido, double quantidadeLitrosGasto) {
        return kmPercorrido / quantidadeLitrosGasto;
    }
}