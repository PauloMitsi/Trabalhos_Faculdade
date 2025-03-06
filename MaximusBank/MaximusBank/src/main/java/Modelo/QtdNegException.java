package Modelo;

// Projeto Maximus Bank 
// Paulo Cesar De Oliveira Mitsi | RA: 2410362
// Guilherme Munhos Matos | RA: 2266385
// Apache NetBeans IDE 15 - JDK-18.0.2.1
public class QtdNegException extends Exception {

    public QtdNegException() {
    }

    // Sobrecarga
    public QtdNegException(String message) {
        System.out.println(message);
    }

}
