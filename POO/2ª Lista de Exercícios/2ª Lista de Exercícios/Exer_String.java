// Nome: Paulo Cesar de Oliveira Mitsi RA: 2410362

import java.util.Scanner;

public class Exer_String {

    public static String entDados(String txt) {

        System.out.println(txt);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public static void contaCaracteres(String txt, String letra) {
        int i = -1;
        txt = txt.toLowerCase();
        do {

            i = txt.indexOf(letra, i + 1);

            System.out.printf("'%s' na pos: %d\n", letra, i);

        } while (txt.indexOf(letra, i + 1) != -1);

    }

    public static void main(String[] args) {
        String palavra = entDados("Escreva a palavra:");
        String letra = entDados("Escreva a letra:");

        contaCaracteres(palavra, letra);
    }
}
