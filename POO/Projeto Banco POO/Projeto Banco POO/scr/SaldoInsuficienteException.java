// Aluno: Paulo Cesar De Oliveira Mitsi | RA: 2410362
public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException() {}

    // Sobrecarga
    public SaldoInsuficienteException(String message) {
        System.out.println(message);
    }
}
