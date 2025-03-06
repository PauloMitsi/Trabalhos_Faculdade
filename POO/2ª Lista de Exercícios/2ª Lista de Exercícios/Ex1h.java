// Nome: Paulo Cesar De Oliveira Mitsi RA: 2410362


import java.util.Scanner;

public class Ex1h {

    public static int entDados(String txt) {
        System.out.println(txt);

        Scanner s = new Scanner(System.in);

        return s.nextInt();
    }

    public static void imparOuPar(int a) {
        if (a % 2 == 0) {
            System.out.printf("%d e par\n", a);
        } else {
            System.out.printf("%d e impar\n", a);
        }
    }

    public static void main(String[] args) {
        int n = entDados("Insira o numero: ");
        imparOuPar(n);
    }

}
