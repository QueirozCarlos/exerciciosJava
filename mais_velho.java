package application;

import java.util.Locale;
import java.util.Scanner;

public class mais_velho {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        String[] nome = new String[n];
        int[] idade = new int[n];
        int valorMaior = idade[0];


        int contador=0;


        for (int i=0; i<n; i++) {
            System.out.printf("Dados da %dº pessoa: \n", i+1);
            System.out.printf("Nome: ");
            nome[i] = sc.next();
            System.out.printf("Idade: ");
            idade[i] = sc.nextInt();
        }
        for (int i=0; i< idade.length; i++) {
            if (idade[i] > valorMaior) {
                   valorMaior = idade[i];
                   contador++;
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s \n", nome[contador]);
    }
}
