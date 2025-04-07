package estruturaCondicional;

// Vogal ou consoante: Identifique se um caractere é uma vogal ou consoante.


import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = teclado.next().charAt(0);

        // Converte para minuscula para simplificar a comparação
        letra = Character.toLowerCase(letra);

        // Verifica se é uma vogal

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("É uma vogal!");
        }

        // Verifica se é uma letra do alfabeto (consoante)
        else if (letra >= 'a' && letra <= 'z') {
            System.out.println("é uma consoante!");
        } else {
            System.out.println("Não é uma letra válida!");
        }


        teclado.close();


    }


}
