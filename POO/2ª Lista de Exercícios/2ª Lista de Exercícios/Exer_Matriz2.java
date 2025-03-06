// Nome: Paulo Cesar de Oliveira Mitsi RA: 2410362

import java.util.Scanner;

public class Exer_Matriz2 {
    public static int entDados(String txt) {

        System.out.println(txt);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public static void apresentaValores(int v[][], int linhas, int colunas) {
        for (int i = linhas - 1; i > -1; i--) {
            for (int j = colunas - 1; j > -1; j--) {
                System.out.printf("v[%d][%d] = %d ", i, j, v[i][j]);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int linhas = entDados("Digite a quantidade de linhas do vetor");
        int colunas = entDados("Digite a quantidade de colunas do vetor");

        int v[][] = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                v[i][j] = entDados(String.format("v[%d][%d] =", i, j));
            }
        }
        apresentaValores(v, linhas, colunas);
    }
}
