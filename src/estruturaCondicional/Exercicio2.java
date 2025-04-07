package estruturaCondicional;

// Maior entre dois: Crie um programa que determine o maior entre dois números.

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = teclado.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.println("Primeiro número e maior");
        } else if (segundoNumero > primeiroNumero) {
            System.out.println("Segundo número e maior");
        } else {
            System.out.println("Números são iguais");
        }


        teclado.close();
    }


}
