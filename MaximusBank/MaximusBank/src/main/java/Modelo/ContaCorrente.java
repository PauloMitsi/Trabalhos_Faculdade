package Modelo;

// Projeto Maximus Bank 
// Paulo Cesar De Oliveira Mitsi | RA: 2410362
// Guilherme Munhos Matos | RA: 2266385
// Apache NetBeans IDE 15 - JDK-18.0.2.1
public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    // Sobrecarga
    public ContaCorrente(int agencia, int numero, Cliente c) {
        super(agencia, numero, c);
    }

    // Sobrescrita
    public void transferir(Conta c1, double qtd) throws QtdNegException, SaldoInsuficienteException {
        this.sacar(qtd);
        c1.depositar(qtd);

    }

    // Sobrescrita
    public void getAnuidade() {
        this.saldo -= 10;
        if (this.getSaldo() < 0) {
            this.setDivida(10);
        }
    }

}
