package estruturaCondicional;

import java.util.Scanner;

public class Exercicio19 {

    // Categoria nadador: Classifique um nadador por idade (5-7: infantil A, 8-10:
    //infantil B, etc.).

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        double idade = teclado.nextDouble();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Infantil B ");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Juvenil B");
        } else if (idade >= 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idade não corresponde a nenhuma categoria");
        }


        teclado.close();

    }


}
