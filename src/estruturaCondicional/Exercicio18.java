package estruturaCondicional;

// Notas válidas: Verifique se três notas estão entre 0 e 10.

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite as três notas:");

        System.out.print("Digite a nota 1: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = teclado.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = teclado.nextDouble();

        if (nota1 >= 0 && nota1 <= 10 &&
                nota2 >= 0 && nota2 <= 10 &&
                nota3 >= 0 && nota3 <= 10) {
            System.out.println("Notas válidas!");
        } else {
            System.out.println("pelo menos um nota é inválida (fora do intervalo 0-10).");
        }

    }


}
