package application;

import java.util.Locale;
import java.util.Scanner;

public class negativos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();


        int[] vet = new int[n];

        for (int i = 0; i < vet.length; i++){
            System.out.printf("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < 0) {
                System.out.printf("%d\n", vet[i]);
            }
        }
        sc.close();
    }
}
