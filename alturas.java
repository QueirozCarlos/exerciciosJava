package application;

import java.util.Locale;
import java.util.Scanner;

public class alturas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantas pessoas serao digitadas? ");
        int n, nmenores;
        double percentualMenores;
        n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        double somaAltura = 0;
        for (int i =0;i <n; i++ ){
            System.out.printf("Dados da %dº pessoa: \n", i +1 );
            System.out.printf("Nome: ");
            nome[i] = sc.next();
            System.out.printf("Idade: ");
            idade[i] = sc.nextInt();
            System.out.printf("Altura: ");
            altura[i] = sc.nextDouble();
            somaAltura += altura[i];
        }
        nmenores=0;
        for(int i=0; i<n; i++) {
            if(idade[i] < 16) {
                nmenores++;
            }
        }
        double alt_media = somaAltura / n;
        percentualMenores = ((double)nmenores / n) * 100.0;
        System.out.printf("\nAltura média: %.2f\n", alt_media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i=0;i<n; i++) {
            if (idade[i] < 16){
                System.out.printf("%s\n", nome[i]);
            }
        }
        sc.close();
    }
}
