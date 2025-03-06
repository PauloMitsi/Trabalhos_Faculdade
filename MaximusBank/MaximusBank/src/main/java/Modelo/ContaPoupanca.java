package Modelo;

// Projeto Maximus Bank 
// Paulo Cesar De Oliveira Mitsi | RA: 2410362
// Guilherme Munhos Matos | RA: 2266385
// Apache NetBeans IDE 15 - JDK-18.0.2.1

import java.util.logging.Level;
import java.util.logging.Logger;

// Aluno: Paulo Cesar De Oliveira Mitsi | RA: 2410362
public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    // Sobrecarga
    public ContaPoupanca(int agencia, int numero, Cliente c) {
        super(agencia, numero, c);
    }

    // Sobrescrita
    public void transferir(Conta c1, double qtd) throws QtdNegException, SaldoInsuficienteException {
        this.sacar(qtd);
        c1.depositar(qtd);
    }

    public void setTaxaDeRentabilidade() {
        this.saldo += this.saldo * 0.05;
    }

}
