// Aluno: Paulo Cesar De Oliveira Mitsi | RA: 2410362
import java.util.Scanner;

public class Leitura {

    public static String entDados(String txt) {
        Scanner s = new Scanner(System.in);
        System.out.printf(txt);

        return s.nextLine();
    }
}
