package Modelo;
// Projeto Maximus Bank 
// Paulo Cesar De Oliveira Mitsi | RA: 2410362
// Guilherme Munhos Matos | RA: 2266385
// Apache NetBeans IDE 15 - JDK-18.0.2.1
public class DividaAltaException extends Exception {

    public DividaAltaException() {
    }

    // Sobrecarga
    public DividaAltaException(String message) {
        System.out.println(message);
    }
}
