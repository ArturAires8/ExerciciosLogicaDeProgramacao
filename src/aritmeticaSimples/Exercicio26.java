package aritmeticaSimples;

// .Escreva um programa que calcule o MMC (Mínimo Múltiplo Comum) entre dois
//números.

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = teclado.nextInt();

        int mmc = calcularMmc(primeiroNumero, segundoNumero);

        System.out.println("O MMC entre " + primeiroNumero + " e " + segundoNumero + " e " + mmc);

        teclado.close();

    }

    public static int calcularMmc(int primeiroNumero, int segundoNumero) {
        // Trata o caso onde um dos números é zero
        if (primeiroNumero == 0 || segundoNumero == 0) {
            return 0;
        }
        // Usa valores absolutos
        primeiroNumero = Math.abs(primeiroNumero);
        segundoNumero = Math.abs(segundoNumero);

        int maior = Math.max(primeiroNumero, segundoNumero);
        int mmc = maior;

        while (true) {
            if (mmc % primeiroNumero == 0 && mmc % segundoNumero == 0) {
                return mmc;
            }
            mmc += maior;
        }
    }
}