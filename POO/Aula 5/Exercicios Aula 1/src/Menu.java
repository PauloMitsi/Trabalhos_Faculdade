// Nome: Paulo Cesar De Oliveira Mitsi RA: 2410362

import java.util.Scanner;

public class Menu {

    public static int opcoes() {
        System.out.println("\nOpcoes");
        System.out.println("1 - Somar");
        System.out.println("2 - multiplicar");
        System.out.println("3 - subtrair");
        System.out.println("4 - dividir");
        int opt = entDados("Digite a opcao: ");
        return opt;
    }

    public static int entDados(String txt) {

        System.out.println(txt);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public static void operacoes(int opt, int a, int b) {
        double a2 = a;
        switch (opt) {
            case 1:
                System.out.printf("%d + %d = %d\n", a, b, a + b);
                break;
            case 2:
                System.out.printf("%d * %d = %d\n", a, b, a * b);
                break;
            case 3:
                System.out.printf("%d - %d = %d\n", a, b, a - b);
                break;
            case 4:
                System.out.printf("%d / %d = %f\n", a, b, a2 / b);
                break;
            default:
                System.out.println("ERRO DE OPCAO");
                break;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b;
        int opt;

        a = entDados("insira o primeiro valor: ");

        b = entDados("insira o segundo valor: ");

        opt = opcoes();

        operacoes(opt, a, b);

    }
}
