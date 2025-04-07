package estruturaCondicional;


// Ano bissexto: Verifique se um ano é bissexto

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um ano: ");

        int ano = teclado.nextInt();

        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("Ano e bissexto");
        } else {
            System.out.println("Ano não é bissexto");
        }

    }
}


