// Aluno: Paulo Cesar De Oliveira Mitsi | RA: 2410362
public class ContaCorrente extends Conta {
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    // Sobrecarga
    public ContaCorrente(int agencia, int numero, Cliente c) {
        super(agencia, numero, c);
    }


    // Sobrescrita
    public void transferir(Conta c1, double qtd) {
        try {
            super.sacar(qtd * 1.05);
            c1.depositar(qtd);
        } catch (QtdNegException e) {
            transferir(c1, Double.parseDouble(Leitura.entDados("insira uma quantia correta: ")));
        } catch (SaldoInsuficienteException e) {
            transferir(c1, Double.parseDouble(Leitura.entDados("Insira uma nova quantia: ")));
        }
    }

    // Sobrescrita
    public void getAnuidade() {
        this.saldo -= 10;
        if (this.getSaldo() < 0) {
            this.setDivida(10);;
        }
    }

}
