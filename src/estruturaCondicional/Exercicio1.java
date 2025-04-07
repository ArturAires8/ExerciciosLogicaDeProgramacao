package estruturaCondicional;

// Verificar positivo/negativo: Escreva um programa que verifique se um número é
//positivo ou negativo.

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        if (numero < 0) {
            System.out.println("O número e negativo");
        } else {
            System.out.println("O número e positivo");
        }


        teclado.close();
    }


}
