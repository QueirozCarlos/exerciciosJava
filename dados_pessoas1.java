package application;

import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        double mediaAlturaFem, alturaFemTotal;
        int qtdhomens, qtdmulheres;

        double[] alturas = new double[n];
        char[] generos = new char[n];

        double maiorAltura = alturas[0];
        double menorAltura = alturas[0];

        for (int i=0;i<n; i++) {
            System.out.printf("Altura da %d pessoa: ", i+1);
            alturas[i] = sc.nextDouble();
            System.out.printf("Genero da %d pessoa: ", i+1);
            generos[i] = sc.next().charAt(0);
        }

        for (int i=0;i<n; i++){
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
        }

        qtdhomens=0;
        qtdmulheres=0;
        alturaFemTotal=0;

        for (int i=0;i<n; i++) {
            if (generos[i] == 'M') {
                qtdhomens++;
            } else {
                qtdmulheres++;
                alturaFemTotal += alturas[i];
            }
        }
        mediaAlturaFem =  alturaFemTotal / qtdmulheres;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaAlturaFem);
        System.out.printf("Numero de homens = %d\n", qtdhomens);


    }
}
