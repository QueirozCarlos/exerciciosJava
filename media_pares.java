package application;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] num = new int[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Digite um numero: ");
            num[i] = sc.nextInt();
        }

        double quant =0;
        double contador=0;
        double media =0;
        for (int i=0; i<n; i++) {
            if (num[i] % 2 == 0) {
                quant += num[i];
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            System.out.printf("MEDIA DOS PARES = %.1f", media = quant / contador);
        }

        sc.close();
        }
}
