// Nome: Paulo Cesar de Oliveira Mitsi RA: 2410362

import java.util.Scanner;

public class Exer_Matriz1 {
    public static int entDados(String txt) {

        System.out.println(txt);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public static void apresentaValores(int v[]) {
        for (int i = v.length - 1; i > -1; i--) {
            System.out.printf("v[%d] = %d\n", i, v[i]);
        }
    }

    public static void main(String[] args) {
        int tamanho = entDados("Digite o tamanho do vetor");

        int v[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            v[i] = entDados(String.format("Digite o valor na pos %d", i));
        }

        apresentaValores(v);
    }
}
