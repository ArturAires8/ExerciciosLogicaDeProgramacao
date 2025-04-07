package estruturaCondicional;

import java.util.Scanner;


// Média escolar: Calcule a média e informe se o aluno está aprovado (≥7), em
//recuperação (≥5) ou reprovado.

public class Exercicio11 {

    public static final double NOTA_MINIMA_APROVACAO = 7.0;
    public static final double NOTA_MINIMA_RECUPERACAO = 5.0;



    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = teclado.nextDouble();


        if (nota >= NOTA_MINIMA_APROVACAO) {
            System.out.println("Aluno está aprovado");
        } else if (nota >= NOTA_MINIMA_RECUPERACAO) {
            System.out.println("Aluno está de recuperação");
        } else {
            System.out.println("Aluno está reprovado");
        }


    }


}
