package estruturaCondicional;

import java.util.Scanner;

// IMC: Calcule o IMC e classifique em: abaixo do peso, normal, sobrepeso, obeso.

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double peso = 0;
        double altura = 0;

        boolean dadosValidos = false;
        while (!dadosValidos) {
            try {
                System.out.print("Digite o peso (em Kg): ");
                peso = teclado.nextDouble();
                System.out.println("Digite a altura (em metros): ");
                altura = teclado.nextDouble();

                if (peso <= 0 || altura <= 0) {
                    System.out.println("Erro: Valores devem ser positivos! Tente novamente.\n");
                } else {
                    dadosValidos = true;
                }
            } catch (Exception e) {

                System.out.println("Erro : Digite apenas números válidos!\n");
                teclado.nextLine();
            }
        }

        double imc = peso / (altura * altura);

        System.out.printf("\nSeu IMC é: %.2f%n", imc);
        System.out.printf("Classificação: " + classificarIMC(imc));

        teclado.close();
    }

    public static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Magreza";
        } else if (imc < 25) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 40) {
            return "Obesidade";
        } else {
            return "Obesidade Grave";
        }
    }
}
















