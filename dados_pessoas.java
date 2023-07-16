package application;

import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qtdhomens, qtdmulheres;

        System.out.printf("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        double menorAltura = alturas[0];
        double maiorAltura = alturas[0];

        double menoraltura, maioraltura, alturafemMedia, alturafemtotal;

        for (int i=0; i<n; i++) {
            System.out.printf("Altura da %d pessoa: ", i+1);
            alturas[i] = sc.nextDouble();
            System.out.printf("Genero da %d pessoa: ", i+1);
            generos[i] = sc.next().charAt(0);
        }
        for (int i=0; i<alturas.length; i++) {
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            } if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
        }

        qtdhomens=0;
        qtdmulheres=0;
        alturafemtotal=0;
        for (int i=0; i<alturas.length; i++) {
            if (generos[i] == 'M') {
                qtdhomens++;
            } else {
                qtdmulheres++;
                alturafemtotal += alturas[i];
            }
        }

        alturafemMedia =alturafemtotal / qtdmulheres;
        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", alturafemMedia);
        System.out.printf("Numero de homens = %d\n", qtdhomens);

        sc.close();
    }
}
