package estruturaCondicional;

import java.util.Scanner;

public class Exercicio22 {

    // Dias no mês: Dado um mês (1-12), informe quantos dias ele tem (considerar
    //fevereiro com 28).

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número do mês (1-12): ");
        int mes = teclado.nextInt();

        int dias = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> {
                System.out.println("Mês inválido!");
                yield -1;
            }
        };

        if (dias != -1) {
            System.out.println("O mês " + mes + " tem " + dias + " dias.");
        }

        teclado.close();


    }


}
