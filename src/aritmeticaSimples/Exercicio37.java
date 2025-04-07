package aritmeticaSimples;

// Desenvolva um programa que calcule o tempo de download de um arquivo
//(tamanho / velocidade).

import java.util.Scanner;

public class Exercicio37 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo ( em MB):  ");
        double tamanhoArquivo = teclado.nextDouble();

        System.out.print("Digite a velocidade de download (em Mbps); ");
        double velocidadeDownload = teclado.nextDouble();

        double resultadoSegundos = calculoTempoDownload(tamanhoArquivo, velocidadeDownload);
        String tempoFormatado = formatarTempo(resultadoSegundos);

        System.out.printf("Tempo estimado de download: %s%n", tempoFormatado);


        teclado.close();
    }

    public static double calculoTempoDownload(double tamanhoArquivo, double velocidadeDownload) {

        // Convertendo MBps para MB/s (1 byte = 8bits)

        double velocidadeMBps = velocidadeDownload / 8;
        return tamanhoArquivo / velocidadeMBps;


    }

    public static String formatarTempo(double segundos) {
        int minutos = (int) segundos / 60;
        int segundosRestantes = (int) segundos % 60;

        if (minutos > 0) {
            return String.format("%d minutos(s) e %d segundos(s)", minutos, segundosRestantes);

        }
        return String.format("%.2f segundos(s)", segundos);
    }


}


