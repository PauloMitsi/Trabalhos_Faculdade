package Modelo;

// Projeto Maximus Bank 
// Paulo Cesar De Oliveira Mitsi | RA: 2410362
// Guilherme Munhos Matos | RA: 2266385
// Apache NetBeans IDE 15 - JDK-18.0.2.1
public class SeguroDeVida extends Conta implements Tributavel {

    public SeguroDeVida(int agencia, int numero) {
        super(agencia, numero);
    }

    public SeguroDeVida(int agencia, int numero, Cliente c) {
        super(agencia, numero, c);
    }

    // Sobrescrita
    public void getAnuidade() {
        this.saldo -= 5;
        if (this.getSaldo() < 0) {
            this.setDivida(5);
        }
    }

    // Sobrescrita
    public void transferir(Conta c1, double qtd) throws SaldoInsuficienteException, QtdNegException {
        super.sacar(qtd);
        c1.depositar(qtd);
    }

}
