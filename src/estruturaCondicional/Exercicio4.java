package estruturaCondicional;

import java.util.Scanner;


//  Aprovação escolar: Desenvolva um programa que verifique se um aluno foi
//        aprovado (nota ≥ 7).


public class Exercicio4 {

    public final static double NOTA_MINIMA_APROVACAO = 7.0;
    public final static double NOTA_MAXIMA = 10.0;
    public final static double NOTA_MINIMA = 0.0;


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Digite a nota do aluno (0 a 10):");
            double nota = teclado.nextDouble();

            if (nota < NOTA_MINIMA || nota > NOTA_MAXIMA) {
                System.out.println("Erro: Nota inválida. Digite um valor entre 0 e 10.");
                return;
            }
            if (estaAprovado(nota)) {
                System.out.println("Aluno aprovado!");
            } else {
                System.out.println("Aluno reprovado");
            }
        } catch (Exception e) {
            System.out.println("Erro: Digite um número valido.");
        } finally {
            teclado.close();
        }

    }

    public static boolean estaAprovado(double nota) {
        return nota >= NOTA_MINIMA_APROVACAO;
    }
}
