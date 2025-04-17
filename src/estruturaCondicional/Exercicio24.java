package estruturaCondicional;

import java.util.Scanner;

public class Exercicio24 {

    //  Ordenação simples: Ordene três números em ordem crescente.


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();

        int menor = Math.min(Math.min(a, b), c);
        int maior = Math.max(Math.max(a, b), c);
        int meio = (a + b + c) - menor - maior;

        System.out.println("Números ordenados: " + menor + ", " + meio + ", " + maior);


        teclado.close();

    }


}
