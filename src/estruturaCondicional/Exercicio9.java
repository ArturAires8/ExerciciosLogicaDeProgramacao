package estruturaCondicional;

// Maioridade: Verifique se uma pessoa é maior de idade (idade ≥ 18).

import java.util.Scanner;

public class Exercicio9 {

    public final static int MAIOR_IDADE = 18;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa: ");
        int idade = teclado.nextInt();

        if (idade >= MAIOR_IDADE) {
            System.out.println("Pessoa é maior de idade");
        } else {
            System.out.println("Pessoa é menor de idade");
        }


        teclado.close();

    }


}
