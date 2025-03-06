package Modelo;

// Projeto Maximus Bank 
// Paulo Cesar De Oliveira Mitsi | RA: 2410362
// Guilherme Munhos Matos | RA: 2266385
// Apache NetBeans IDE 15 - JDK-18.0.2.1
import java.util.Scanner;

public class Leitura {

    public static String entDados(String txt) {
        Scanner s = new Scanner(System.in);
        System.out.printf(txt);

        return s.nextLine();
    }
}
