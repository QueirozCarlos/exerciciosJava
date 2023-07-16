package application;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double soma = 0;
        double[] vet = new double[n];
        for (int i =0;i < vet.length; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
            soma += vet[i];
        }

        System.out.printf("VALORES = ");
        for (int i =0;i < vet.length; i++) {
            System.out.printf("%.1f ", vet[i]);
        }
        System.out.printf("\nSOMA = %.2f", soma);

        double media = soma / n;
        System.out.printf("\nMEDIA = %.2f", media);
        sc.close();
    }
}
