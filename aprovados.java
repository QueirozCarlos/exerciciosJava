package application;

import java.util.Locale;
import java.util.Scanner;

public class aprovados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        double media=0;
        String[] nomes = new String[n];
        double[] notaA = new double[n];
        double[] notaB = new double[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %dº aluno: \n", i+1);
            nomes[i] = sc.next();
            notaA[i] = sc.nextDouble();
            notaB[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados: ");
        for (int i=0; i<n; i++) {
            media = (notaA[i] + notaB[i] / 2);
            if (media >= 6.0) {
                System.out.printf("%s\n", nomes[i]);
            }
        }

        sc.close();
    }
}
